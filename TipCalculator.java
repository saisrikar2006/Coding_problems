import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class TipCalculator extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label titleLabel = new Label("Tip Calculator");
        titleLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        Label billLabel = new Label("Bill Amount:");
        Label tipLabel = new Label("Tip Percentage:");
        Label tipAmountLabel = new Label("Tip Amount:");
        Label totalAmountLabel = new Label("Total Amount:");

        TextField billField = new TextField();
        billField.setPromptText("Enter bill amount");

        TextField tipField = new TextField();
        tipField.setPromptText("Enter tip %");

        Label tipResult = new Label("₹ 0.00");
        Label totalResult = new Label("₹ 0.00");

        Button calculateBtn = new Button("Calculate");
        Button clearBtn = new Button("Clear");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(20));

        grid.add(titleLabel, 0, 0, 2, 1);
        grid.add(billLabel, 0, 1);
        grid.add(billField, 1, 1);
        grid.add(tipLabel, 0, 2);
        grid.add(tipField, 1, 2);
        grid.add(calculateBtn, 0, 3);
        grid.add(clearBtn, 1, 3);
        grid.add(tipAmountLabel, 0, 4);
        grid.add(tipResult, 1, 4);
        grid.add(totalAmountLabel, 0, 5);
        grid.add(totalResult, 1, 5);

        calculateBtn.setOnAction(e -> {
            try {
                double bill = Double.parseDouble(billField.getText());
                double tipPercent = Double.parseDouble(tipField.getText());
                double tip = bill * tipPercent / 100;
                double total = bill + tip;
                tipResult.setText(String.format("₹ %.2f", tip));
                totalResult.setText(String.format("₹ %.2f", total));
            } catch (NumberFormatException ex) {
                tipResult.setText("Invalid input");
                totalResult.setText("");
            }
        });

        clearBtn.setOnAction(e -> {
            billField.clear();
            tipField.clear();
            tipResult.setText("₹ 0.00");
            totalResult.setText("₹ 0.00");
        });

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setTitle("Tip Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
