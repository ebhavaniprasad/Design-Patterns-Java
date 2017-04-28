package AbstractFactory;

public class CommandProduct 
{ 	
	   public String product_type = "Stationery";
	   public int quantityProduct = 20;
       public int productId=1001;
	   public void purchaseProduct()
	   {
	      System.out.println("ProductName: "+product_type+", TotalQuantity: " + quantityProduct);
	     // return null;
	   }
	   public void sellProduct()
	   {
	      System.out.println("ProductName: "+product_type+", TotalQuantity: " + quantityProduct);
	      //return null;
	   }
}
