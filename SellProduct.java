package AbstractFactory;

public class SellProduct implements CommandInterface        //concrete command that implements the command interface
{	
		   public CommandProduct product;                //uses the product class for the creation of the commands

		   public SellProduct(CommandProduct product)
		   {
		      this.product = product;
		   }

		   public void play()                                      //concrete method that implements the command interface
		   {
		      product.sellProduct();
		   }
}
