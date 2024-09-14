package application;

public class product {
   String name;
   String price;
   int quantity;
   int  q_user;
   String type;
   double p;
   String property;
   String exp_date;
   String S_No;
   String image;
   
   public String getImage() {
	return image;
}

public void setImage(String image) {
	this.image = image;
}

public String getS_No() {
	return S_No;
}

public void setS_No(String s_No) {
	S_No = s_No;
}

public product() {
	   this.name = null;
	   this.price= null;
	   this.quantity = 0;
	   this.type = null;
	   this.exp_date = null;
	   this.property= null;
	   this.S_No= null;
	   
   }
   
   public String getProperty() {
	return property;
}

public void setProperty(String property) {
	this.property = property;
}

public String getExp_date() {
	return exp_date;
}

public void setExp_date(String exp_date) {
	this.exp_date = exp_date;
}

public product(String name, double price,  int quantity, String type ) {
	   this.name = name;
	   this.p = price;
	   this.quantity = quantity;
	  this.type = type;
	   
   }

   public product(String name,  int q_user ,double price ,String type ) {
	   this.name = name;
	   this.p= price;
	  this.q_user= q_user;
       this.type = type;
   }
   

   
 
public double getP() {
	return p;
}

public void setP(double p) {
	this.p = p;
}

public product(String name, String price, String type) {
	this.name =name;
	this.price = price;
	this.type = type;
	
}

public product(String name, String price, String type, String property, String exp_date,String sno, String image) {
	this.price = price;
	this.name = name;
	this.type = type;
	this.property = property;
	this.exp_date = exp_date;
	this.S_No = sno;
	this.image = image;
	
}
public product(String name, String type, double price) {
	this.name =name;
	this.p = price;
	this.type = type;
}


public int getQ_user() {
	return q_user;
}

public void setQ_user(int q_user) {
	this.q_user = q_user;
}

public String getName() {
	return name;
}

public void setType(String type) {
	this.type = type;
}

public String getType() {
	return type;
}

public void setName(String name) {
	this.name = name;
}

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}
}
