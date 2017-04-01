package AbstractFactory;
// Ryan: Please include useful comments in each file.
public class AbstractCommand
{ 
	public void abstractView()
	{
	CommandProduct cp= new CommandProduct();
	PurchaseProduct pp = new PurchaseProduct(cp);
    SellProduct sp = new SellProduct(cp);

    CommandRoleInvoker cri = new CommandRoleInvoker();
    cri.takeProduct(pp);
    cri.takeProduct(sp);
    cri.placeProduct();    

	}

}
