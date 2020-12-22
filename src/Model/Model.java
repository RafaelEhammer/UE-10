package Model;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
/************************************
 * @author Ehammer Rafael
 * @version 1.0
 ***********************************/

public class Model
{
    public static void show(Stage stage)
    {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(Model.class.getResource("/FXML/sample.fxml"));
            Parent root = fxmlLoader.load();

            stage.setTitle("Welcome");
            stage.setScene(new Scene(root, 700, 500));
            stage.show();
        }
        catch (IOException ex)
        {
            System.err.println("Something wrong with welcome.fxml!");
            ex.printStackTrace(System.err);
        }
    }
}
