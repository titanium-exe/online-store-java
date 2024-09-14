package application;



import java.io.File;

import java.util.Scanner;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Scene2 extends Application  {

	@SuppressWarnings({ "unchecked" })
	@Override
	public void start(Stage stage ) throws Exception  {
		 
                                  
		
		
		Pane root = new Pane();
	    Scene scene = new Scene(root);
		Text t = new Text();
		
		int N = counter();
		 product[] p;
	        
			
			p = product_info(N);
			ChoiceBox<Object> c = choiceb(p,N);
		
	
		
	    TableView<product> table;
	    
	    
	    Button next = new Button("NEXT");
	    next.relocate(50, 400);
	
		
		TableColumn<product, String> nameC = new TableColumn<>("NAME");
		nameC.setMinWidth(100);
		nameC.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		TableColumn<product, Double> priceC = new TableColumn<>("PRICE($)");
		priceC.setMinWidth(100);
		priceC.setCellValueFactory(new PropertyValueFactory<>("p"));
		
		
		TableColumn<product, Integer> quantityC = new TableColumn<>("QUANTITY");
		quantityC.setMinWidth(100);
		quantityC.setCellValueFactory(new PropertyValueFactory<>("q_user"));
		
		TableColumn<product, String> typeC = new TableColumn<>("UNITS");
		typeC.setMinWidth(100);
	   typeC.setCellValueFactory(new PropertyValueFactory<>("type"));
		
		table = new TableView<>();
		
		table.getColumns().addAll(nameC,quantityC, typeC, priceC);
		
		
		TextField tf_1 = new TextField();
		Button add = new Button("ADD");
		Button bt2 = new Button("SEE PRODUCT");
        ListView<String> list = new ListView<String>(); 
        TextField tf = new TextField();
		Text t2 = new Text("QUANTITY");
		t2.relocate(420, 100);
		bt2.relocate(300, 100);
		
		tf_1.relocate(490, 100);
		
       
		
		
		add.setOnAction(e -> {
			
			String name = (String) c.getValue();
			int n = c.getSelectionModel().getSelectedIndex();
			String qu = tf_1.getText();
			int quantity = Integer.parseInt(qu);
		    String price = p[n].getPrice();
            String units = p[n].getType();
            double price2 = Double.parseDouble(price);
            double finalPrice = quantity * price2;
           
            

			table.getItems().addAll(getproducts(name,quantity,finalPrice,units));
			
			
		});
		
		bt2.setOnAction(e -> {
			
			 Button bt3 = new Button("GO BACK");
	            bt3.relocate(200, 300 );
			
			String name = (String) c.getValue();
			int n = c.getSelectionModel().getSelectedIndex();
		    String price = p[n].getPrice();
		    String units = p[n].getType();
			String property = p[n].getProperty();
			String exp_date = p[n].getExp_date();
			String code = p[n].getS_No();
			String image_adress = p[n].getImage();
			
			
			Text t3 = new Text("PRODUCT NAME: " + name + "\n" +"PRODUCT PRICE PER UNIT: " + price + "\n" +"PRODUCT INFO: " + property +"\n" + 
					"PRODUCT EXPIERY DATE: " + exp_date + "\n" + "PRODUCT ID: " + code + "\n" + "PRODUCT UNITS: " + units );
			
			
			Pane pane = new HBox(50);
			pane.setPadding(new Insets(5, 5, 5, 5));
			Image image = new Image(image_adress);
			pane.getChildren().add(new ImageView(image));
			
			ImageView imageView2 =new ImageView(image);
			imageView2.setFitHeight(50);
			imageView2.setFitWidth(50);
			
			pane.getChildren().add(imageView2); 
		   
		   root.getChildren().add(new ImageView(image));
			 
			t3.relocate(200, 200);
			root.getChildren().addAll(t3,bt3);
			
		  
			bt3.setOnAction(e1 -> {
		       root.getChildren().remove(t3);
		       root.getChildren().remove(bt3);
		       root.getChildren().remove(new ImageView(image));
		    });
			
		});
		
	
	
		tf.relocate(300, 100);
		
		add.relocate(200, 180);
		list.relocate(200, 200);
	    c.relocate(10, 100);
	   table.relocate(500, 200);
	
		t.relocate(200,100);
		
		root.getChildren().addAll(t,add,c,bt2,tf_1,table,t2,next);
		stage.setScene(scene);
		stage.show();
		
	}
	public static void main(String[] args) {
	    launch(args);
	  }	
	
	
	public ObservableList<product> getproducts(String name,int quantity , double price, String units){
	     
		
		ObservableList<product> products = FXCollections.observableArrayList();
		     
	         products.add(new product(name , quantity, price,units));
	       
	         
	        return products;
	     }
	
	

	
	 public static product[] product_info(int N) throws Exception{
			int x =0;
			
			product Products[] = new product[N];
		try {
			 
			File f = new File("./src/GROCERIES.csv");
			Scanner input = new Scanner(f);
			
				
		while(input.hasNext()) {
		      String info = input.nextLine();
		
		      String[] s = info.split(",");

		     product pro = new product(s[0],s[1],s[2],s[3],s[4],s[5],s[6]);
		 
		    Products[x] = pro;
		    x++;
		  
		} 
		
		input.close();
		}catch(Exception e){
	     			
				System.out.println(e.getMessage());
			}
		    return Products;
	    	
		}
	 
	 
		public  int counter() {
			int N = 0;
			
		try {

				File f = new File("./src/GROCERIES.csv");
				
				Scanner input = new Scanner(f);
				
		    while(input.hasNext()) {
		    	 input.nextLine();
		    	N++;
		      
		   }
		    
		input.close();
	   	}catch(Exception e){
	     			
				System.out.println(e.getMessage());
			}
				
			 return N;   
	 
		}
		
		public ChoiceBox<Object> choiceb( product[] p, int N){
			
			
		String[] array = new String[N];
		
		for(int i =0 ; i  < N; i++) {
			array[i] = p[i].getName();
		}
		
		ChoiceBox<Object> c = new ChoiceBox<Object>(FXCollections.observableArrayList( array));
		
		return c;
			
			
			
		}
	
}


