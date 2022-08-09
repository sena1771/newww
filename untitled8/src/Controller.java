import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

import javax.swing.*;
public class Controller {
    @FXML
    private Circle circle;
    private double x;
    private double y;

    public void down(javafx.event.ActionEvent actionEvent) {
        //System.out.println("DOWN BUTTON");
        circle.setCenterY(y-=1); //for moving the circle through the y axis
    }
    public void enter(ActionEvent actionEvent) {
        //System.out.println("ENTER BUTTON");
        circle.setCenterX(x+=1);
    }
}
