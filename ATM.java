//Information of the customer can be found in OptionMenu.java class. 

package ATM;

import java.awt.Button;
import java.awt.Insets;
import java.awt.Label;
import java.awt.TextField;
import java.io.IOException;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.application.Application;

public class ATM extends OptionMenu { //make a class that extends OptionMenu
	
	
	
	public static void main(String[] args) throws IOException{
		OptionMenu optionMenu = new OptionMenu();
		
		optionMenu.getLogin();
	
		
	}
}
