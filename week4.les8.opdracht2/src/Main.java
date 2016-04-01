import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application implements EventHandler<ActionEvent> {
    Button btn, btn2;
    Label lab;
    StackPane stackPane;
    HBox hBox;
    VBox vBox;
    FlowPane flowPane;
    Scene scene;
    @Override
    public void start(Stage primaryStage) {
        btn = new Button("Say Yay");
        btn.setOnAction(this);
        btn2 = new Button("Say Nay");
        btn2.setOnAction(this);
        lab = new Label();

//        stackPane = new StackPane();
//        stackPane.getChildren().addAll(btn, btn2, lab);

//        hBox = new HBox(10);
//        hBox.getChildren().addAll(btn, btn2, lab);

//        flowPane = new FlowPane();
//        flowPane.getChildren().addAll(btn, btn2, lab);

        vBox = new VBox(10);
        vBox.setPadding(new Insets(10, 75, 10, 75));
        vBox.getChildren().addAll(btn, btn2, lab);
        for(Node n:vBox.getChildren()) {
            if (n instanceof Button)
                ((Button) n).setPrefWidth(150);
            if (n instanceof Label)
                ((Label) n).setPrefWidth(150);
        }
        scene = new Scene(vBox, 300, 200);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setOnCloseRequest(event -> {
            Platform.exit();
            System.exit(0);
        });
    }

    public void handle(ActionEvent event) {
//        vBox.getChildren().get(1).toFront();
        if(event.getSource() == btn)
            lab.setText("Yay sayer!");
        if(event.getSource() == btn2)
            lab.setText("Nay sayer!");
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
