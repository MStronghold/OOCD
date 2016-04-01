import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application implements EventHandler<ActionEvent> {
    Button btn, btn2;
    StackPane root;
    @Override
    public void start(Stage primaryStage) {
        btn = new Button("Say, Hello World");
        btn.setOnAction(this);
        btn2 = new Button("Nay, Hello World");
        btn2.setOnAction(this);

        root = new StackPane(btn, btn2);

        Scene scene = new Scene(root,300, 200);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setOnCloseRequest(event -> {
            Platform.exit();
            System.exit(0);
        });
    }

    public void handle(ActionEvent event) {
        System.out.println("Hello World");
        root.getChildren().get(0).toFront();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
