package application;




import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class scene1  extends Application{

	
	@SuppressWarnings("unchecked")
	public void start(Stage stage) {
		Pane root = new Pane();
		Scene scene = new Scene(root);
	    Text text = new Text("THESE ARE THE CURRENT STOCKS IN THE STORE");
	    text.relocate(260, 10);
	    
	
	    root.setBackground(new Background(new BackgroundFill(Color.LIGHTGREY, null, null)));
	    
		
		TableView<product> table ;
	
		
		TableColumn<product, String> nameC = new TableColumn<>("NAME");
		nameC.setMinWidth(200);
		nameC.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		TableColumn<product, Double> priceC = new TableColumn<>("PRICE($)");
		priceC.setMinWidth(200);
		priceC.setCellValueFactory(new PropertyValueFactory<>("p"));
		
		
		TableColumn<product, Integer> quantityC = new TableColumn<>("QUANTITY");
		quantityC.setMinWidth(200);
		quantityC.setCellValueFactory(new PropertyValueFactory<>("quantity"));
		
		TableColumn<product, String> typeC = new TableColumn<>("UNITS");
		typeC.setMinWidth(200);
		typeC.setCellValueFactory(new PropertyValueFactory<>("type"));
		
		table = new TableView<>();
		table.setItems(getproducts(null, 0  , 0 , null));
		table.getColumns().addAll(nameC,priceC, quantityC,typeC);
		
		TextField tf_name = new TextField();
		TextField tf_price = new TextField();
		TextField tf_quantity = new TextField();
		TextField tf_type = new TextField();
		TextField tf_info = new TextField();
		
		TextField tf_code = new TextField();
		TextField image = new TextField();
		
		
		tf_name.relocate(100, 500);
		tf_price.relocate(100, 550);
		tf_quantity.relocate(100,600);
		tf_type.relocate(100, 650);
		tf_info.relocate(600, 500);
		
		image.relocate(600, 600);
		table.relocate(0, 50);
		tf_code.relocate(600, 650);
		
		Text t_name = new Text("NAME");
		Text t_price = new Text("PRICE");
		Text t_quantity = new Text("QUANTITY");
		Text t_units = new Text("UNITS");
		Text t_info = new Text("INFO");
		Text t_Exp = new Text("EXPIERY DATE");
		Text t_image = new Text("IMAGE");
		Text t_code = new Text("PRODUCT ID");
		
		t_info.relocate(450, 500);
		t_Exp.relocate(450, 550);
		t_image.relocate(450, 600);
		t_code.relocate(450, 650);
		t_name.relocate(20, 500);
		t_price.relocate(20, 550);
		t_quantity.relocate(20,600);
		t_units.relocate(20, 650);
		
		
		
		 DatePicker datePicker = new DatePicker(); 
		 
		 datePicker.relocate(600, 550);
		
		
		table.setItems(getproducts());
		
	    Button add = new Button("ADD NEW PRODUCT");
	    add.relocate(300, 500);

		root.getChildren().addAll(table, tf_name, tf_price, tf_quantity, tf_type , t_name, t_price, t_quantity, t_units, add,text);
		root.getChildren().addAll(tf_info,tf_code,image,t_info, t_Exp, t_image, t_code ,datePicker);
		
      
		
		
		
		add.setOnAction(e->{
        	String name = tf_name.getText();
        	String price1 = tf_price.getText();
        	String q = tf_quantity.getText();
        	String type = tf_type.getText();
        	String i = image.getText();
        	int quantity = Integer.parseInt(q);
        	double price = Double.parseDouble(price1);
        	
            table.getItems().addAll(getproducts(name, price, quantity, type));
         
			try {

	            File f = new File("./src/GROCERIES.csv");
	        	FileWriter fw = new FileWriter(f, true);
				fw.write(tf_name.getText()  + "," + tf_price.getText()+ 
						","+tf_type.getText()  + "," + tf_info.getText() +  "," + datePicker.getValue()+"," + tf_code.getText()+"," + i + ","+ tf_quantity.getText());
				fw.close();
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
		    
	 });
        

        stage.setTitle("ADMIN'S INVENTORY");
        stage.setScene(scene);
		stage.show();
		
	}
	

	 
	  
	  public ObservableList<product> getproducts(){
		  
	      ObservableList<product> products = FXCollections.observableArrayList();
	      products.add(new product("MILK" , 5.5 , 1500, "BOTTLES"));
	      products.add(new product("EGGS" , 6.0 , 1200, "TRAYS"));
	      products.add(new product("BANANA" ,4.0 ,  500, "PACKS"));
	      products.add(new product("BREAD" ,2.99,  600, "PACKS"));
	      products.add(new product("BUTTER", 8.0 ,  200, "BOXES"));
	      products.add(new product("BEEF" , 7.99 ,  150, "POUNDS"));
	      products.add(new product("COFFEE" , 7.5 , 157, "JARS"));
	      products.add(new product("SUGAR" , 11.99 , 200, "BAGS"));
	      products.add(new product("APPLE" , 6.50,  250, "KILOGRAMS"));
	      products.add(new product("CREAM" ,5.50,  300, "BOTTLES"));
	      products.add(new product("FISH", 9.50,  100, "POUNDS"));
	      products.add(new product("RICE" , 6.99 , 200, "KILOGRAMS"));
	      products.add(new product("JUICE" , 7.0, 100, "BOTTLES"));
	      
	    return products;
	  }
	  
	  
	  public ObservableList<product> getproducts(String name, double  price, int  quantity, String type){
	      ObservableList<product> products = FXCollections.observableArrayList();
	      
	      products.add(new product(name, price, quantity, type));
	      
	      return products;
	      
	  }
	  
	  
	 
	  public static void main(String[] args) {
		    launch(args);
		  }
}