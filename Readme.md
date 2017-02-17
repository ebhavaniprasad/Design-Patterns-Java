
README File:

The Code can be executed in three ways
   ### Command line Exceution:
     * First save all the constructed java class in a folder
     * next select the directory path copy it (C:\Users\ebhavaniprasad\Desktop\MarketplaceFrontController)
     * open the command prompt( Cltr+Run)--> cmd
     * type cd command
     * then type cd path ($cd C:\Users\ebhavaniprasad\Desktop\MarketplaceFrontController) 
     Compile the all the class files
      $javac *.java ( Compilation command)
     * start the rmiregistry ($start rmiregistry)
     Execute the server side ( Run command)
     $java -Djava.security.policy=policy -cp C:\Users\ebhavaniprasad\Desktop\MarketplaceFrontController MarketplaceFrontServer
     open the another command prompt and do similarly to run the client side
     Execution of Client 
     $java -Djava.security.policy=policy -cp C:\Users\ebhavaniprasad\Desktop\MarketplaceFrontController MarketplaceFrontClient
*** Terminate rmiregistry
    $ cltr + C 
### Tesla Editor 

* First need to open Putty visit http://www.putty.org/
* After installing putty it ask for host name : tesla.cs.iupui.edu and enter port number 22(default) select open button.
* It will take to a command crompt bejanthk@tesla:~
* It will ask for 
  login as: 
  password :

   After Successful login It takes to a Home Directory
  -----> [bejanthk@tesla ~]$ (file location) cd
  
  Commands :
  To compile :  javac filename.java
  To run     : java filename    (Execute Code)

### IDE (ECLIPSE editor)
     Enable rmiregistry (Run as Java Application)
     Debugg(compile) : Alt+Shift+D
     Run   (Excute) : Alt+shift+X
      * Compile (debugg) : 


