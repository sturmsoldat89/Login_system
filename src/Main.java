import Database.Db;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    public void start(Stage primaryStage) throws  Exception{
        Db db = new Db();
        db.connect();
        Parent root = FXMLLoader.load(getClass().getResource("Design/registration_page.fxml"));
        primaryStage.setTitle("Registration page");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}