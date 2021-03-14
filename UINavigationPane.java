package com.cassandra.TrialWithIText;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * \defgroup NavBar Navigation Pane
 * 
 * @{
 *
 */
/// Ref: User_Story 1
/// Ref: task 1.1
/// This class provides the functionality for the navigation pane while 
/// accessing the PDF. 
public class UINavigationPane extends Application {
	

	public static void main(String[] args) { 
		// TODO Auto-generated method stub

	}
/// Ref: task 1.1
/// Ref: task 1.2 
/// 
	@Override
	public void start(Stage primaryStage) throws Exception {
	}
	/// Ref: task 1.1
	public VBox getNavigationPane() {
		VBox navBar =  new VBox();
		return navBar;
	}
	
/// Ref: task 1.3 
///	This method is called only after the [drag and drop event](Ref: task 1.2).	
	public void PdfReorder() {
		
	}
}
		

/**@}*/
