
// Ryan: Please include usefull comments in each file.
public abstract class AbstractFactory
{
	// Ryan: What is the purpose of gadget/furniture here? The Abstract
	// Factory should create families of related factories that can 
	// create concrete products.
    abstract MarketplaceCustomerLogin getCustomerPage(String gadget);
    abstract MarketplaceAdministratorLogin getAdminPage(String furniture) ;
}
