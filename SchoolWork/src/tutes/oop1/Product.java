package tutes.oop1;

public class Product {
    private String name;
    private double price;
    private double discount;

    public Product(String name, double price, double discount){
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    
    public void setName(String newname) {
    	this.name =  newname;
    }
    public void setPrice(double newprice) {
    	this.price =  newprice;
    }
    public void setDiscount(double newdiscount) {
    	this.discount =  newdiscount;
    }
    
    private double getImportTax(){
        return price/10;
    }
    
    public String getName() {
    	return name;
    }
    
    public double getPrice() {
    	return price;
    }
    
    public double getDiscount() {
    	return discount;
    }

    public void display(){
        System.out.println("The product name is "+name);
        System.out.println("It's price is: "+ price);
        System.out.println("It's import tax is: " + getImportTax());
        System.out.println("It's discount rate is: " + discount);
    }

    public static void main(String[] args) {
        Product pc = new Product("Gaming",10000,10);
        System.out.println(pc.getName());
        System.out.println();
        Product ac = new Product("Air Conditioner",20000);
        ac.display();

    }
}
