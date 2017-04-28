package AbstractFactory;

public class PurchaseProduct implements CommandInterface        //concrete command that implements the command interface 
{	
		   public CommandProduct product;               //concrete commands 

		   public PurchaseProduct(CommandProduct product)
		   {
		      this.product = product;
		   }

		   public void play()                            //concrete method that implements the command interface
		   {
		      product.purchaseProduct();
		   }		
}
