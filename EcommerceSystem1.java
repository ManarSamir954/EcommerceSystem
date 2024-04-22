
package ecommercesystem1;
import java.util.Scanner;
public class EcommerceSystem1 {
    public static void main(String[] args) {
        System .out .println("Welcome to the Ecommerce_System");
      Electronicproduct P1=new Electronicproduct("Samsung",1,1,"Smart phone",599.9f);
      ClothingProduct C =new ClothingProduct("medium","cotton",2,"t shirt",19.99f);
      BookProduct B =new BookProduct("O Reilly","X Publication",3,"OOP",39.99f);
      Scanner scanner =new Scanner(System.in);
      System.out.println("Please enter your Id:");
      int costumerId=scanner.nextInt();
      System.out.println("Please enter your name:");
      String name =scanner.next();
      System.out.println("Please enter your address:");
      String address=scanner.next();
       Costumer cos =new  Costumer(costumerId,name,address);
       System.out.println("Enter the number of products :");
       int nProducts=scanner.nextInt();
       Cart cart=new Cart(costumerId,nProducts);
      for(int i=0;i<nProducts;i++){
          System.out.println("which product would you like to add? 1-smartphone 2- T-shirt 3-oop");
          int n =scanner.nextInt();
         switch(n){
             case 1:
               cart.addproduct(P1);

             break;
             case 2:
                 cart.addproduct(B);
                   break;
             case 3:
                 cart.addproduct(C);
                   break;
             default:
                  System.out.println("Invalid input.");
         }
          }
            System.out.println("Your total is     :  "+cart.calculatePrice() ); 
            System.out.println("Would you like to place the order ? 1-yes 2-No");
            int x=scanner.nextInt();
            switch(x){
                case 1:
                    System.out.println("Here is your summary  :");
                    Order order=new Order( costumerId,1,cart.calculatePrice(),cart.getProducts());
                     order.printOrderInfo(); 
                     break;
                case 2:
                    System.out.println("Thank you.");
                    break;
                default:
                     System.out.println("invalid value");
            }
            }
           }
//############################################################################################################################################################################3
 class Product {
    
    protected int productId;
    protected String name;
    protected float price ;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Product() {
    }

    public Product(int productId, String name, float price) {
        this.productId = Math.abs(productId);
        this.name = name;
        this.price = Math .abs(price);
    }
    
    
    
    
}

//############################################################################################################################################################################
class Electronicproduct extends Product{
   private String brand;
   private int warrantyPeriod;



    public Electronicproduct(String brand, int warrantyPeriod, int productId, String name, float price) {
        super(productId, name, price);
        this.brand = brand;
        this.warrantyPeriod =Math .abs( warrantyPeriod);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyPeriod() {
        return Math .abs(warrantyPeriod);
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod =Math .abs( warrantyPeriod);
    }
    

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return  Math .abs(price);
    }

    public void setPrice(float price) {
        this.price =Math .abs( price);
    }
    
    
}
//###########################################################################################################################################################################
class ClothingProduct  extends Product{
    
   private String size;
   private String fabric;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public ClothingProduct() {
    }

    public ClothingProduct(String size, String fabric) {
        this.size = size;
        this.fabric = fabric;
    }

    public ClothingProduct(String size, String fabric, int productId, String name, float price) {
        super(productId, name, price);
        this.size = size;
        this.fabric = fabric;
    }
    
    
}
//#######################################################################################################################################################################

class BookProduct extends Product{
    
  private  String author ;
  private String publisher;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public BookProduct() {
    }

    public BookProduct(String author, String publisher) {
        this.author = author;
        this.publisher = publisher;
    }

    public BookProduct(String author, String publisher, int productId, String name, float price) {
        super(productId, name, price);
        this.author = author;
        this.publisher = publisher;
    }
    
    
}
//#################################################################################################################################################################3
class Costumer {
     
    int costumerId;
    String name ;
    String address;
    public int getCostumerId() {
        return costumerId;
    }
    public void setCostumerId(int costumerId) {
        this.costumerId = costumerId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Costumer() {
    }
    public Costumer(int costumerId , String name, String address) {
        this.costumerId =Math .abs(costumerId) ;
        this.name = name;
        this.address = address;
    }
}
//###########################################################################################################################################################################
class Cart{
    private int customerid;
    private int nProducts;
    private Product Products[];

    public Cart() {
    }

    public Cart(int customerid, int nProducts) {
        this.customerid = customerid;
        this.nProducts = nProducts;
        this.Products= new Product[this.nProducts];
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public int getnProducts() {
        return nProducts;
    }

    public void setnProducts(int nProducts) {
        this.nProducts = nProducts;
    }

    public Product[] getProducts() {
        return Products;
    }

    public void setProducts(Product[] Products) {
        this.Products = Products;
    }   
    public void addproduct(Product products)
    {
        for (int i = 0; i <this.nProducts; i++) {
            if(this.Products[i]==null){
            this.Products[i]=products;
            break;
            }
        }
    }
        public void removeproduct(Product products){
            for (int i = 0; i <this.nProducts; i++) {
                if(this.Products[i]==products){
                this.Products[i]=null;
                break;
                }
            }
      }
public double calculatePrice(){
    double totalPrice=0;
    for(int i=0;i<nProducts;i++){
        if(Products[i]!= null){
totalPrice +=Products[i].price;
}
        }
    return totalPrice;
}
public void placeOrder(){
}
}
//#############################################################################################################################################################################
class Order{
      private int customerId;
    private int orderId;
    private Product [] Products ;
    private double totalPrice;

    public Order() {
    }

    public Order(int customerId, int orderId, double totalPrice, Product[] Products) {
        this.customerId = customerId;
        this.orderId = orderId;
        this.Products = Products;
        this.totalPrice = totalPrice;
    }

    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public Product[] getProducts() {
        return Products;
    }
    public void setProducts(Product[] Products) {
        this.Products = Products;
    }
    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
public void printOrderInfo(){
    System .out.println("your ID is    : "+customerId);
    System .out.println("your order is :"+orderId);
        System .out.println("products");

    System .out.println(Products); 
for (int i =0;i<Products.length;i++){
     if(Products[i]!= null){
    System.out.println(Products[i].getName()+"-"+Products[i].getPrice());
}
   System.out.println(" The total price is :"+ totalPrice);
}
   }

    }
    

