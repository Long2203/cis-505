/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, L. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

//Create a class named NguyenFutureValueApp which extends Application class
public class NguyenFutureValueApp extends Application {
    //Creating TextFields, TextArea, Labels, ComboBox, and Buttons
    private TextField tfMonthyPayment = new TextField();
    private TextField tfInterestRate = new TextField();
    private TextArea taFutureValue = new TextArea();
    private Label lblMonthyPayment = new Label("Monthy Payment:");
    private Label lblInterestRate = new Label("Interest Rate:");
    private Label lblYears = new Label("Years:");
    private Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
    private ComboBox<Integer> cbYears = new ComboBox<>();
    private Button btnCalculate = new Button("Calculate");
    private Button btnClear = new Button("Clear");

    @Override
    //Overriding start() method of Application class to create GUI layout
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        //Setting alignment for TextFields, ComboBox, and Label
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));// sets the padding of "pane" to 11.5, 12.5, 13.5, and 14.5 respectively
        pane.setHgap(5.5); // sets the horizontal gap between elements in "pane" to 5.5
        pane.setVgap(5.5);// sets the vertical gap between elements in "pane" to 5.5
        GridPane.setHalignment(tfMonthyPayment, javafx.geometry.HPos.RIGHT);// sets the horizontal alignment of "tfMonthlyPayment" to right
        GridPane.setHalignment(tfInterestRate, javafx.geometry.HPos.RIGHT);// sets the horizontal alignment of "tfInterestRate" to right
        GridPane.setHalignment(cbYears, javafx.geometry.HPos.RIGHT);// sets the horizontal alignment of "cbYears" to right
        GridPane.setHalignment(lblInterestRateFormat, javafx.geometry.HPos.RIGHT);// sets the horizontal alignment of "lblInterestRateFormat" to right
        pane.add(lblMonthyPayment, 0, 0);// adds "lblMonthlyPayment" to "pane" at position (0,0)
        pane.add(tfMonthyPayment, 1, 0);// adds "tfMonthlyPayment" to "pane" at position (1,0)
        pane.add(lblInterestRate, 0, 1); // adds "lblInterestRate" to "pane" at position (0,1)
        pane.add(tfInterestRate, 1, 1);// adds "tfInterestRate" to "pane" at position (1,1)
        cbYears.setMaxWidth(Double.MAX_VALUE); // sets the maximum width of "cbYears" to the maximum value of a double
        cbYears.getItems().addAll(10,15,30); // get an items that addAll of "pane" to (10,15,30) respectively
        pane.add(lblInterestRateFormat, 1, 2);// adds "lblInterestRateFormat" to "pane" at position (1,2)
        pane.add(lblYears, 0, 3);// adds "lblYears to "pane" at position (0,3)
        pane.add(cbYears, 1, 3);// adds "cbYears" to "pane" at position (1,3)
        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setAlignment(Pos.CENTER_RIGHT);// sets the Center alignment of "tfInterestRate" to right
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30)); // sets Padding that insets to (15,0,15,30) of the "pane"
        actionBtnContainer.setSpacing(10); //sets space to 10 
        actionBtnContainer.getChildren().addAll(btnClear, btnCalculate);
        pane.add(actionBtnContainer,1,4);        
        lblInterestRateFormat.setTextFill(Color.RED);//Setting color of the Label lblInterestRateFormat to Red
        GridPane.setColumnSpan(taFutureValue, 2);//Setting column span of TextArea taFutureValue and adding it to the GridPane layout
        pane.add(taFutureValue, 0, 8); // add "FutureVale" to "pane" at at position (0,8)
        primaryStage.setTitle("Nguyen Future Value App"); // set the title message "Nguyen Future value App"
        primaryStage.setScene(new Scene(pane, 400, 500)); //set screen to "pane" at size(400,500)
        primaryStage.show();
    }

    // The main() method launches the application
    public static void main(String[] args) {
        launch(args);
    } //end main
} // end NguyenFutureValueApp
