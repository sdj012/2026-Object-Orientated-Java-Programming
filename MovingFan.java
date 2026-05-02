import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Path;
import javafx.scene.shape.ArcTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.LineTo;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class MovingFan extends Application {

	// Creates fixed variables for the blade construction
	
    private static final int NUM_BLADES = 4;
    private static final double RADIUS = 200;
    private static final double BLADE_OUTER = RADIUS * 0.92;
    private static final double BLADE_SWEEP = 45;

    private Group WheelGroup; // Instantiate a Group to apprehend blades
    private RotateTransition rotateTransition;// Instantiate a Rotation Transition to customize blade movement
    
    // Creates wheel with 8 blue blades
    
    private Group createWheel() {
        Group group = new Group();
        double angleStep = 360.0 / NUM_BLADES;

        for (int i = 0; i < NUM_BLADES; i++) {
            double startAngle = i * angleStep;
            Path blade = createBlade(startAngle, BLADE_SWEEP, BLADE_OUTER);
            blade.setFill(Color.BLUE);
            blade.setStroke(null);
            group.getChildren().add(blade);
        }
        return group;
    }
    

    // Constructs a single blade using Path
    
    private Path createBlade(double startDeg, double width, double outerR) {
    	
        Path path = new Path();
    	
        // Set blade starting and ending radiuses
        
        double startRad = Math.toRadians(startDeg);
        double endRad   = Math.toRadians(startDeg + width);

        double x1 = outerR * Math.cos(startRad);
        double y1 = outerR * Math.sin(startRad);
        double x2 = outerR * Math.cos(endRad);
        double y2 = outerR * Math.sin(endRad);

        // Centers elements
        
        path.getElements().add(new MoveTo(0, 0));
        path.getElements().add(new LineTo(x1, y1));

        // Draws arc utilizing variables
        
        ArcTo arc = new ArcTo();
        arc.setX(x2);
        arc.setY(y2);
        arc.setRadiusX(outerR);
        arc.setRadiusY(outerR);
        arc.setSweepFlag(true); 
        arc.setLargeArcFlag(width > 180);
        path.getElements().add(arc);

        // Centers elements 
        path.getElements().add(new LineTo(0, 0));

        return path;
    }

    @Override
    
    public void start(Stage primaryStage) {
    	
    	// Calls function createWheel to build the wheel
    	
        WheelGroup = createWheel(); 

        // Creates circular background to attach wheel
        
        Circle background = new Circle(RADIUS);
        background.setFill(Color.WHITE);
        background.setStroke(Color.BLACK);
        background.setStrokeWidth(1.5);

        StackPane wheelPane = new StackPane(background, WheelGroup);
        wheelPane.setPadding(new Insets(20));

        // Creates buttons to rotate blades
        
        Button clockwiseButton = new Button("Rotate Clockwise");
        Button cclockwiseButton = new Button("Rotate Counter Clockwise");
        
        // Rotates one unit, 45 degrees, at a time in either directions by calling the function rotateTo

        clockwiseButton.setOnAction(e -> rotateTo(45));
        cclockwiseButton.setOnAction(e -> rotateTo(-45));

        // Boxes buttons accordingly
        
        HBox buttons = new HBox(10, clockwiseButton, cclockwiseButton);
        buttons.setAlignment(Pos.CENTER);
        buttons.setPadding(new Insets(10, 0, 20, 0));
        
        // Places buttons and wheel in pane

        BorderPane root = new BorderPane();
        root.setCenter(wheelPane);
        root.setBottom(buttons);
        root.setStyle("-fx-background-color: #e0e0e0;");
        
        // Creates scene and displays all elements inside root

        Scene scene = new Scene(root, 560, 620);
        primaryStage.setTitle("Wheel");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    // Rotates blades according to angles provided by button events
    
    private void rotateTo(double byAngle) {
        if (rotateTransition != null) {
            rotateTransition.stop();
        }
        rotateTransition = new RotateTransition(Duration.seconds(0.1), WheelGroup); // Sets Speed
        rotateTransition.setByAngle(byAngle);
        rotateTransition.setCycleCount(1);
        rotateTransition.play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}