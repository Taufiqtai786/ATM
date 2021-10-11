//Taufiq Tai
//Final Project

package ATMjavaFX; //import the package

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
 
 
public class atmFXtest extends Application  { //the class and extends the Application 
    public static void main(String args[]){          
         launch(args);     
    } 
         
    @Override    
    public void start(Stage primaryStage) throws Exception { 
    	
    	//The setting of the window
        VBox mainPage = new VBox();
        VBox account_selection = new VBox();
        VBox checkings = new VBox();
        VBox savings = new VBox();
        mainPage.setAlignment(Pos.CENTER);
        account_selection.setAlignment(Pos.CENTER);
        checkings.setAlignment(Pos.CENTER);
        savings.setAlignment(Pos.CENTER);
     
        Scene sceneMainpage = new Scene(mainPage, 300, 300);
        Scene sceneAccount_Selection = new Scene(account_selection, 300, 300);
        Scene sceneCheckings = new Scene(checkings, 300,300);
        Scene sceneSavings = new Scene(savings, 300,300);
         
        
        //MAINPAGE COMPONENTS
		Label lblCustomerID = new Label("Customer ID:");
		
		Label lblPin = new Label("Pin #:");
		TextField txtCID = new TextField();
		TextField txtP = new TextField();
		Button btnLogin = new Button("Login");
         
        btnLogin.setOnAction(e -> primaryStage.setScene(sceneAccount_Selection));
        mainPage.getChildren().addAll(lblCustomerID, txtCID, lblPin, txtP, btnLogin);
        
        //ACCOUNT SELECTION COMPONENTS
        Label lblSelect = new Label("Select Account");
        Button btnCheckings = new Button("Checkings Account");
        Label between = new Label("-------------------------");
        Label between2 = new Label("-------------------------");
        Button btnSavings = new Button("Savings Account");
        Button btnLogout = new Button("Logout");
        btnCheckings.setOnAction(e -> primaryStage.setScene(sceneCheckings));
        btnSavings.setOnAction(e -> primaryStage.setScene(sceneSavings));
        btnLogout.setOnAction(e -> primaryStage.setScene(sceneMainpage));
        account_selection.getChildren().addAll(lblSelect, btnCheckings, between, btnSavings, between2, btnLogout);
  
        //CHECKINGS ACCOUNT COMPONENTS
        Label lblBalanceC = new Label("Balance");
        TextField txtBalanceC = new TextField("0");
        Label lblDepositC = new Label("Deposit");
        TextField txtDepositC = new TextField();
        Button btnDepositC = new Button("Select");
        Label lblWithdrawC = new Label("Withdraw");
        TextField txtWithdrawC = new TextField();
        Button btnWithdrawC = new Button("Select");
        Button backC = new Button("Go Back");
        Label spacingC = new Label("----------------");
        Label spacingC2 = new Label("----------------");
        Button btnLogout2 = new Button("Logout");
        checkings.getChildren().addAll(lblBalanceC, txtBalanceC, lblDepositC, txtDepositC, btnDepositC, lblWithdrawC, txtWithdrawC, btnWithdrawC, spacingC, backC,spacingC2, btnLogout2);
        backC.setOnAction(e -> primaryStage.setScene(sceneAccount_Selection));
        btnLogout2.setOnAction(e -> primaryStage.setScene(sceneMainpage));
        
        
        /*DEPOSIT BUTTON*/
        EventHandler<ActionEvent> eventDepositC = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String getDepositc = txtDepositC.getText();
				Double depositc = Double.parseDouble(getDepositc);
				String getBalancec = txtBalanceC.getText();
				Double balancec = Double.parseDouble(getBalancec);
				
				Double newBalance = balancec + depositc;
				txtBalanceC.setText(String.valueOf(newBalance));
			}
        	
        };
        btnDepositC.setOnAction(eventDepositC);
        
        /*WITHDRAW BUTTON*/
        EventHandler<ActionEvent> eventWithdrawC = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(Double.parseDouble(txtWithdrawC.getText())<=Double.parseDouble(txtBalanceC.getText())) {
				String getWithdrawC = txtWithdrawC.getText();
				Double withdrawc = Double.parseDouble(getWithdrawC);
				double balancec2 = Double.parseDouble(txtBalanceC.getText());
				double newTotal2 = balancec2 - withdrawc;
				txtBalanceC.setText(String.valueOf(newTotal2));
				
				
				
				}
			}
        	
        };
        btnWithdrawC.setOnAction(eventWithdrawC);
        

        
        //SAVINGS ACCOUNT COMPONENTS
        Label lblBalanceS = new Label("Balance");
        TextField txtBalanceS = new TextField("0");
        Label lblDepositS = new Label("Deposit");
        TextField txtDepositS = new TextField();
        Button btnDepositS = new Button("Select");
        Label lblWithdrawS = new Label("Withdraw");
        TextField txtWithdrawS = new TextField();
        Button btnWithdrawS = new Button("Select");
        Button backS = new Button("Go Back");
        Label spacingS = new Label("----------------");
        Label spacingS2 = new Label("----------------");
        Button btnLogout3 = new Button("Logout");
        savings.getChildren().addAll(lblBalanceS, txtBalanceS, lblDepositS, txtDepositS, btnDepositS, lblWithdrawS, txtWithdrawS, btnWithdrawS, spacingS, backS, spacingS2, btnLogout3);
        backS.setOnAction(e -> primaryStage.setScene(sceneAccount_Selection));
        btnLogout3.setOnAction(e -> primaryStage.setScene(sceneMainpage));
       

        
        /*DEPOSIT BUTTON*/
        EventHandler<ActionEvent> eventDepositS = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String getDeposits = txtDepositS.getText();
				Double deposits = Double.parseDouble(getDeposits);
				String getBalances = txtBalanceS.getText();
				Double balances = Double.parseDouble(getBalances);
				
				Double newBalances = balances + deposits;
				txtBalanceS.setText(String.valueOf(newBalances));
			}
        	
        };
        btnDepositS.setOnAction(eventDepositS);
        
        /*WITHDRAW BUTTON*/
        EventHandler<ActionEvent> eventWithdrawS = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(Double.parseDouble(txtWithdrawS.getText())<=Double.parseDouble(txtBalanceS.getText())) {
				String getWithdrawS = txtWithdrawS.getText();
				Double withdraws = Double.parseDouble(getWithdrawS);
				double balances2 = Double.parseDouble(txtBalanceS.getText());
				double newTotals2 = balances2 - withdraws;
				txtBalanceS.setText(String.valueOf(newTotals2));
				
				
				}
			}
        	
        };
        btnWithdrawS.setOnAction(eventWithdrawS);
 
        primaryStage.setTitle("ATM MACHINE");
        primaryStage.setScene(sceneMainpage);   
        primaryStage.show();
    }
}
