package AbstractFactory;



import java.util.List;
import java.util.ArrayList;

public class CommandRoleInvoker 
{
		   private List<CommandInterface> commandList = new ArrayList<CommandInterface>(); // invoker will take the requests from the client and encapsulates it and places in a queue for execution

		   public void takeProduct(CommandInterface commandinterface) // Invoker requests the command to execute the commands
		   {
		      commandList.add(commandinterface);		
		   }

		   public void placeProduct()                    
		   {
		   
		      for(CommandInterface commandinterface : commandList)
		      {
		         commandinterface.play();
		      }
		      commandList.clear();   // clears queue after performing the command executions
		   }
}
