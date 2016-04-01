import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.time.LocalDate;

public class Main extends Application implements EventHandler<ActionEvent> {
    //  Create attributes
    private Hotel       hotel =                 new Hotel("Avondrust");
    private FlowPane    flowPane =              new FlowPane();
    private HBox        buttonBox =             new HBox(10);
    private Label       infoLabel =             new Label(),
            naamLabel =             new Label("naam:"),
            adresLabel =            new Label("adres:"),
            aankomstTijdLabel =     new Label("aankomstdatum:"),
            vertrekTijdLabel =      new Label("vertrekdatum:"),
            kamerLabel =            new Label("kamertype:");
    private TextField   naamTextField =         new TextField(),
            adresTextField =        new TextField();
    private DatePicker  aankomstTijdPicker =    new DatePicker(),
            vertrekTijdPicker =     new DatePicker();
    private ComboBox<KamerType> kamerComboBox = new ComboBox<>();
    private Button      reset =                 new Button("reset"),
            boekKamer =             new Button("boek");
    @Override
    public void start(Stage primaryStage) {
//      Add content ComboBox
        kamerComboBox.getItems().addAll(hotel.getKamerTypen());
//      Setup & add children HBox
        buttonBox.getChildren().addAll(reset, boekKamer);
        buttonBox.alignmentProperty().set(Pos.CENTER_RIGHT);
//      Setup & add children FlowPane
        flowPane.getChildren().addAll(infoLabel,
                naamLabel,         naamTextField,
                adresLabel,        adresTextField,
                aankomstTijdLabel, aankomstTijdPicker,
                vertrekTijdLabel,  vertrekTijdPicker,
                kamerLabel,        kamerComboBox,
                buttonBox);
        flowPane.setPadding(new Insets(10, 10, 10, 10));
        flowPane.setHgap(10);
        flowPane.setVgap(10);
//      Setup elements
        for(Node n:flowPane.getChildren()) {
            if (n instanceof Label)
                ((Label) n).setPrefWidth(120);
            if (n instanceof TextField)
                ((TextField) n).setPrefWidth(200);
            if (n instanceof DatePicker)
                ((DatePicker) n).setPrefWidth(200);
            if (n instanceof ComboBox)
                ((ComboBox) n).setPrefWidth(200);
            if (n instanceof HBox) {
                ((HBox) n).setPrefWidth(330);
                ((HBox) n).getChildren().stream().filter(n1 -> n1 instanceof Button).forEach(n1 -> {
                    ((Button) n1).setPrefWidth(75);
                    ((Button) n1).setOnAction(this);
                });
            }
        }
        infoLabel.setPrefWidth(330);
//      Set default value elements
        reset();
//      Add FlowPane to Scene
        Scene scene = new Scene(flowPane, 350, 275);
//      Setup Stage
        primaryStage.setTitle("BoekingenApp");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setOnCloseRequest(event -> {
            Platform.exit();
            System.exit(0);
        });
    }

    public void handle(ActionEvent e) {
        if(e.getSource() == reset) {
            reset();
        }
        if(e.getSource() == boekKamer) {
            if(validation(naamTextField, adresTextField, aankomstTijdPicker, vertrekTijdPicker, kamerComboBox)) {
                if(hotel.voegBoekingToe(aankomstTijdPicker.getValue(), vertrekTijdPicker.getValue(),
                        naamTextField.getText(), adresTextField.getText(), kamerComboBox.getValue()) == -1) {
                    infoLabel.setText("Geen kamers beschikbaar!");
                } else {
                    reset();
                    infoLabel.setText("Boeking succesvol!");
                    System.out.println(hotel);
                }
            }
        }
    }

    //  Set elements default value
    public void reset() {
        flowPane.getChildren().stream().filter(n -> n instanceof TextField).forEach(n -> ((TextField) n).setText(""));
        aankomstTijdPicker.setValue(LocalDate.now());
        vertrekTijdPicker.setValue(LocalDate.now().plusDays(1));
        infoLabel.setText("U kunt een boeking invullen.");
        kamerComboBox.setValue(null);

    }

    public boolean validation(TextField tf1, TextField tf2, DatePicker dp1, DatePicker dp2, ComboBox<KamerType> c) {
        return validateTextField(tf1) && validateTextField(tf2) && validateDateFields(dp1, dp2) && validateComboBox(c);
    }

    public boolean validateTextField(TextField tf) {
        if(tf.getText().isEmpty())
            infoLabel.setText("Vul naam en adres in!");
        return !tf.getText().isEmpty();
    }

    public boolean validateComboBox(ComboBox<KamerType> c) {
        if(c.getValue() == null)
            infoLabel.setText("Kies een kamertype!");
        return (c.getValue() != null);
    }

    public boolean validateDateFields(DatePicker dp1, DatePicker dp2) {
        LocalDate d1 = dp1.getValue(), d2 = dp2.getValue();
        if(!d2.isAfter(d1))
            infoLabel.setText("Vertrekdatum mag niet voor de aankomstdatum liggen!");
        if(d1.isBefore(LocalDate.now()))
            infoLabel.setText("Aankomstdatum mag niet in het verleden liggen!");
        if(d2.isBefore(LocalDate.now()))
            infoLabel.setText("Vertrekdatum mag niet in het verleden liggen!");
        return !d1.isBefore(LocalDate.now()) && !d2.isBefore(LocalDate.now()) && d2.isAfter(d1);
    }
}
