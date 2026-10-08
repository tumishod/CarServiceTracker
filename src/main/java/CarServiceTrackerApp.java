import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CarServiceTrackerApp extends Application {

    @Override
    public void start(Stage stage) {

        // Application title
        Label title = new Label("CAR SERVICE TRACKER");

        title.setStyle(
                "-fx-font-size: 24px;" +
                "-fx-font-weight: bold;"
        );

        // Navigation buttons
        Button dashboardButton = new Button("Dashboard");
        Button vehiclesButton = new Button("Vehicles");
        Button servicesButton = new Button("Services");
        Button historyButton = new Button("Service History");
        Button costsButton = new Button("Costs");

        // Make buttons wider
        dashboardButton.setMaxWidth(Double.MAX_VALUE);
        vehiclesButton.setMaxWidth(Double.MAX_VALUE);
        servicesButton.setMaxWidth(Double.MAX_VALUE);
        historyButton.setMaxWidth(Double.MAX_VALUE);
        costsButton.setMaxWidth(Double.MAX_VALUE);

        // Sidebar
        VBox sidebar = new VBox(
                10,
                dashboardButton,
                vehiclesButton,
                servicesButton,
                historyButton,
                costsButton
        );

        sidebar.setPadding(new Insets(20));
        sidebar.setPrefWidth(180);

        // Main content
        Label welcome = new Label("Welcome to your Car Service Tracker");

        welcome.setStyle(
                "-fx-font-size: 20px;" +
                "-fx-font-weight: bold;"
        );

        VBox content = new VBox(welcome);

        content.setAlignment(Pos.CENTER);
        content.setPadding(new Insets(20));

        // Main layout
        BorderPane layout = new BorderPane();

        layout.setTop(title);
        layout.setLeft(sidebar);
        layout.setCenter(content);

        BorderPane.setMargin(title, new Insets(20));

        // Scene
        Scene scene = new Scene(layout, 1000, 600);

        stage.setTitle("Car Service Tracker");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();
    }
}