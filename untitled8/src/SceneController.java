import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.imageio.IIOException;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class SceneController {
private Stage stage;
private Scene scene;
private Parent root;
public void switchingScene(ActionEvent event) throws IOException {

    Parent root= FXMLLoader.load(getClass().getResource("scene.fxml"));
    stage=(Stage)((Node)event.getSource()).getScene().getWindow();
    scene=new Scene(root);
    stage.setScene(scene);
    stage.show();
}

    public void switchingScene(javafx.event.ActionEvent actionEvent) throws IIOException{
        Parent root= FXMLLoader.load(getClass().getResource("scene.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
