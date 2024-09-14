package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		
		
	}
	
	public class loginPage extends Application {
		@Override
		public void start(Stage primaryStage) {
			
			//  CREATING LOGIN STAGE
			 TextField username = new TextField();
			 TextField password = new TextField();
			   password.setPrefColumnCount(10);
			   username.setPrefColumnCount(10);
			   
			   Button btsignIn = new Button("SIGN IN");
			   Text username1 = new Text("USERNAME: ");
			   Text password1 = new Text("PASSWORD: ");
			   Text login = new Text("LOGIN INFO");
			   Pane root = new Pane();
			    
			     login.relocate(200, 20);
			     root.getChildren().addAll(login);
			     username1.relocate(100, 100);
			     username.relocate(200, 100);
			     root.getChildren().addAll(username1, username);
			      
			      
			      password1.relocate(100, 180);
				  password.relocate(200, 180);
				  root.getChildren().addAll(password1, password);
				  root.getChildren().addAll(btsignIn);
				  btsignIn.relocate(200, 250);
				     
			    
			    
				Text text = new Text("");
			    Scene scene = new Scene(root, 500, 500);
			    primaryStage.setTitle("Login Panel"); 
			    primaryStage.setScene(scene); 
			    primaryStage.show(); 
			    root.getChildren().addAll(text);
			    text.relocate(200, 350);
			    
			    
			    btsignIn.setOnAction(e -> {
			         
			         String name = username.getText();
			         String password2 = password.getText();		        
			         if(password2.equals("here will be the extracted name") && name.equals("here will be the extracted password")) {
			        	 
			        	 text.setText("Hi " + name );
			         } else {
			            text.setText("Wrong Password, Try Again");
			         }
			    
			    });
	}
		
	public static void main(String[] args) {
		launch(args);
	}
	}
}