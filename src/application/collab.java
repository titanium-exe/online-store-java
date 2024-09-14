package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class collab  extends Application{

	@Override
	public void start(Stage primaryStage)  {
		
		
	
	
			   TextField username = new TextField();
			   TextField password = new TextField();
			   password.setPrefColumnCount(10);
			   username.setPrefColumnCount(10);
			   
			   Button btLogin = new Button("Login");
			   Text username1 = new Text("USERNAME: ");
			   Text password1 = new Text("PASSWORD: ");
			   
			   Text login = new Text("SIGN UP OR LOGIN");
			   Pane root = new Pane();
			    
			     login.relocate(200, 20);
			     root.getChildren().addAll(login);
			     username1.relocate(100, 100);
			     username.relocate(200, 100);
			     root.getChildren().addAll(username1, username);
			      
			      
			      password1.relocate(100, 180);
				  password.relocate(200, 180);
				  root.getChildren().addAll(password1, password);
				  root.getChildren().addAll(btLogin);
				  btLogin.relocate(200, 260);
				     
			    
			    
				Text text = new Text("");
			    Scene scene = new Scene(root,500, 500 );
			    root.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, null, null)));
			    
			    primaryStage.setTitle("PANEL"); 
			    primaryStage.setScene(scene); 
			    primaryStage.show(); 
			    root.getChildren().addAll(text);
			    text.relocate(200, 350);
			    
			    Button btSignUp = new Button("Sign Up");
				 btSignUp.relocate(200, 230);
				
				 
				 root.getChildren().add(btSignUp);
				
				 primaryStage.setScene(scene);
				 primaryStage.show();
				 Alert alert = new Alert(AlertType.INFORMATION);
				 Alert alert1 = new Alert(AlertType.INFORMATION);
				 Alert alert2 = new Alert(AlertType.ERROR);
				 Alert alert3 = new Alert(AlertType.INFORMATION);
				 Alert alert4 = new Alert(AlertType.ERROR);
				 Alert alert5 = new Alert(AlertType.WARNING);
				 
				 alert.setTitle("WELCOME");
				 alert.setHeaderText(null);
				 alert.setContentText("REGISTRATION COMPLETED : )");
				 
				 alert1.setTitle("PASSWORD");
				 alert1.setHeaderText(null);
				 alert1.setContentText("HI USER!!");
				 
				 alert2.setTitle("SORRY");
				 alert2.setHeaderText(null);
				 alert2.setContentText("INCORRECT PASSWORD :( ");
				
				 alert3.setTitle("ADMIN");
				 alert3.setHeaderText(null);
				 alert3.setContentText("THIS IS ADMIN");
				
				 alert4.setTitle("OOPS!");
				 alert4.setHeaderText(null);
				 alert4.setContentText("THIS USER ALREADY EXISTS");
				 
				 alert5.setTitle("OOPS!");
				 alert5.setHeaderText(null);
				 alert5.setContentText("PLEASE ENTER YOUR USERNAME AND PASSWORD");
				
				 btSignUp.setOnAction(e ->{
					 String info;
					 String u = username.getText().toString() ;
					 String passw = password.getText().toString();
					 
					 if(u.equals("") || passw.equals("")) {
						 alert5.showAndWait();
						
						
					 }
					
					 else {
					 
					 
					 File f = new File("./src/logininfo.txt");
					 try {
						
						 Scanner input =   new Scanner(f);
							while(input.hasNext()) {
								
								 info = input.nextLine();
								 
								
								 if(info.equals(u+" "+passw)) {
									
								    	alert4.showAndWait();
										 break;
									 }
							}
						 
						FileWriter fw = new FileWriter(f, true);
						fw.write(username.getText() + " " + password.getText() + "\n");
					    
						fw.close();
						alert.showAndWait();
					
					} catch (IOException e1) {
						e1.getMessage();
						
					}
					 }
					 
				 });
				 
				
					
					scene1 s1 = new scene1();

					

					
				
					    
				 
					
				 btLogin.setOnAction(e ->{
					 
				
					 String user  = username.getText().toString();
					 String pass =  password.getText().toString();
					 String info_user;
					 boolean match = false;
					 
					 if(user.equals("admin") && pass.equals("admin@123")) {
						 alert3.showAndWait();
						
			
						 

						primaryStage.show();
						 
						 
						 }else {
					
					try {
						 File f = new File("./src/logininfo.txt");
						 Scanner input =   new Scanner(f);
					
						while(input.hasNext()) {
							
							 info_user = input.nextLine();
							 
							
							 if(info_user.equals(user + " " + pass)) {
								 match = true;
							    	alert1.showAndWait(); 
									 break;
								 }
							 
							}
						if(match == false) {
							alert2.showAndWait();
						}
						
					
						 
						
					} catch (FileNotFoundException e1) {
						
						e1.getMessage();
					}
						 }
				
						 
						 }); 
			    
			
		}
		
	
	
	
	  public static void main(String[] args) {
		    launch(args);
		  }

}
