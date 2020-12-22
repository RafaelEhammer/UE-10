package Main;

import Model.Model;
import javafx.application.Application;
import javafx.stage.Stage;

/************************************
 * @author Ehammer Rafael
 * @version 1.0
 ***********************************/

public class Main extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception
    {
        Model.show(stage);
    }
}