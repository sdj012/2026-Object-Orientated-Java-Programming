import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class HappyFace extends Application {

    @Override
    public void start(Stage stage) {

            Pane pane = new Pane();

            // Create Face
            Circle face = new Circle(250, 250, 200);
            face.setFill(Color.WHITE);
            face.setStroke(Color.GRAY);
            face.setStrokeWidth(2);

            // Create Left Eye
            Ellipse leftEyeOuter = new Ellipse(175, 200, 45, 35);
            leftEyeOuter.setFill(Color.WHITE);
            leftEyeOuter.setStroke(Color.GRAY);
            leftEyeOuter.setStrokeWidth(2);

            // Create Left EyePupil
            Circle leftEyePupil = new Circle(175, 205, 20);
            leftEyePupil.setFill(Color.BLACK);

            // Create Right Eye
            Ellipse rightEyeOuter = new Ellipse(320, 200, 45, 35);
            rightEyeOuter.setFill(Color.WHITE);
            rightEyeOuter.setStroke(Color.GRAY);
            rightEyeOuter.setStrokeWidth(2);

            // Create Right EyePupil
            Circle rightEyePupil = new Circle(320, 205, 20);
            rightEyePupil.setFill(Color.BLACK);

            // Create Nose
            Polygon nose = new Polygon();
            nose.getPoints().addAll(
                250.0, 260.0,   // bottom center
                210.0, 320.0,   // bottom left  -- NOTE: Y increases downward in JavaFX
                290.0, 320.0    // bottom right
            );
            nose.setFill(Color.WHITE);
            nose.setStroke(Color.GRAY);
            nose.setStrokeWidth(2);

            // Create Smile
            Arc smile = new Arc(250, 340, 80, 40, 200, 140);
            smile.setFill(Color.TRANSPARENT);
            smile.setStroke(Color.GRAY);
            smile.setStrokeWidth(2);
            smile.setType(ArcType.OPEN);

            // Add shapes to pane
            pane.getChildren().addAll(face, leftEyeOuter, leftEyePupil, rightEyeOuter, rightEyePupil, nose, smile);

            // Create Scene with pane
            Scene scene = new Scene(pane, 500, 500);
            stage.setTitle("Happy Face");
            stage.setScene(scene);
            stage.show();
        }

    public static void main(String[] args) {
        launch(args);
    }
}