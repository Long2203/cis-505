/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, L. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
import javafx.application.Application;
import java.text.SimpleDateFormat;
import java.util.Date;
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
//Create a class NguyenEnhancedFutureValueApp which extends Application class
    public class NguyenEnhancedFutureValueApp extends Application {
      //Creating TextFields, TextArea, Labels, ComboBox, and Buttons
      private TextField txtMonthlyPayment = new TextField();
      private TextField txtInterestRate = new TextField();
      private TextArea txtResults = new TextArea();
      private Label lblMonthyPayment = new Label("Monthy Payment:");
      private Label lblInterestRate = new Label("Interest Rate:");
      private Label lblYears = new Label("Years:");
      private Label lblFutureValueDate =new Label();
      private Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
      private ComboBox<Integer> cbYears = new ComboBox<>();
      private Button btnCalculate = new Button("Calculate");
      private Button btnClear = new Button("Clear");

      private void clearFormFields() {
		txtMonthlyPayment.setText(""); // sets the text of txtMonthlyPayment
	    txtInterestRate.setText("");//sets the text of txtInterestRate 
	    cbYears.setValue(0); // sets the value of cbYears to 0
	    lblFutureValueDate.setText(""); // sets the text of lblFutureValueDate
	    txtResults.setText(""); // sets the text of txtResults
	  }
	private String getTodaysDate() {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); // creates a new SimpleDateFormat as mm/dd/yyyy
	    String todaysDate = dateFormat.format(new Date()); // gets the current date
	    return todaysDate;
	}
	private void calculateResults() {
	    String todaysDate = getTodaysDate();
	    lblFutureValueDate.setText("Calculation as of " + todaysDate); //sets the text of lblFutureValueDate
	    double monthlyPayment = Double.parseDouble(txtMonthlyPayment.getText()); //parses the text of txtMonthlyPayment
	    double interestRate = Double.parseDouble(txtInterestRate.getText()); //parses the text of txtInterestRate
	    int years = cbYears.getValue(); //gets the value of cbYears
	    double futureValue = FinanceCalculator.calculateFutureValue(monthlyPayment,interestRate,years); //sets the text of txtResults to a formatted
	    txtResults.setText(String.format("The future value is:  $%,6.2f\n",futureValue)); //calculates the future value using the FinanceCalculator
	    
	}
      @Override
      //Overriding start() method of Application class to create GUI layout
      public void start(Stage primaryStage) {
          GridPane pane = new GridPane();
          //Setting alignment for TextFields, ComboBox, and Label
          pane.setAlignment(Pos.CENTER);
          pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));// sets the padding of "pane" to 11.5, 12.5, 13.5, and 14.5 respectively
          pane.setHgap(5.5); // sets the horizontal gap between elements in "pane" to 5.5
          pane.setVgap(5.5);// sets the vertical gap between elements in "pane" to 5.5
          cbYears.getItems().addAll(2, 4, 6, 8, 10, 15, 30);
          GridPane.setHalignment(txtMonthlyPayment, javafx.geometry.HPos.RIGHT);// sets the horizontal alignment of "txtMonthlyPayment" to right
          GridPane.setHalignment(txtInterestRate, javafx.geometry.HPos.RIGHT);// sets the horizontal alignment of "txtInterestRate" to right
          GridPane.setHalignment(cbYears, javafx.geometry.HPos.RIGHT);// sets the horizontal alignment of "cbYears" to right
          GridPane.setHalignment(lblInterestRateFormat, javafx.geometry.HPos.RIGHT);// sets the horizontal alignment of "lblInterestRateFormat" to right
          pane.add(lblMonthyPayment, 0, 0);// adds "lblMonthlyPayment" to "pane" at position (0,0)
          pane.add(txtMonthlyPayment, 1, 0);// adds "txtMonthlyPayment" to "pane" at position (1,0)
          pane.add(lblInterestRate, 0, 1); // adds "lblInterestRate" to "pane" at position (0,1)
          pane.add(txtInterestRate, 1, 1);// adds "txtInterestRate" to "pane" at position (1,1)
          cbYears.setMaxWidth(Double.MAX_VALUE); // sets the maximum width of "cbYears" to the maximum value of a double
          pane.add(lblInterestRateFormat, 1, 2);// adds "lblInterestRateFormat" to "pane" at position (1,2)
          pane.add(lblYears, 0, 3);// adds "lblYears to "pane" at position (0,3)
          pane.add(cbYears, 1, 3);// adds "cbYears" to "pane" at position (1,3)
          HBox actionBtnContainer = new HBox();
          actionBtnContainer.setAlignment(Pos.CENTER_RIGHT);// sets the Center alignment of "txtInterestRate" to right
          actionBtnContainer.setPadding(new Insets(15, 0, 15, 30)); // sets Padding that insets to (15,0,15,30) of the "pane"
          actionBtnContainer.setSpacing(10); //sets space to 10 
          Button btnClear = new Button("Clear");
          btnClear.setOnAction(e -> clearFormFields());
          Button btnCalculate = new Button("Calculate");
          btnCalculate.setOnAction(e -> calculateResults());
          lblInterestRateFormat.setTextFill(Color.RED);//Setting color of the Label lblInterestRateFormat to Red
          GridPane.setColumnSpan(txtResults, 2);//Setting column span of TextArea txtResults and adding it to the GridPane layout
          actionBtnContainer.getChildren().add(btnClear);
	  actionBtnContainer.getChildren().add(btnCalculate);
	  GridPane.setColumnSpan(lblFutureValueDate, 2);
          pane.add(actionBtnContainer,1,4);
	  pane.add(lblFutureValueDate,0,5);
          pane.add(txtResults, 0, 8); // add "FutureVale" to "pane" at at position (0,8)
          primaryStage.setTitle("Nguyen Enhanced Future Value App"); // set the title message "Nguyen Enhanced Future value App"
          primaryStage.setScene(new Scene(pane, 400, 500)); //set screen to "pane" at size(400,500)
          primaryStage.show();
      }
  
      // The main() method launches the application
      public static void main(String[] args) {
          launch(args);
      } //end main
  } // end NguyenEnhancedFutureValueApp
  
