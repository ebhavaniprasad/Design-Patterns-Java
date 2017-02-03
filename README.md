ReadMe File: 

* First need to open Putty visit http://www.putty.org/
* After installing putty it ask for host name : tesla.cs.iupui.edu and enter port number 22(default) select open button.
* It will take to a command crompt bejanthk@tesla:~
* I will ask for 
  login as: 
  password :

   After Successful login It takes to a Home Directory
  -----> [bejanthk@tesla ~]$ (file location) cd
  
  Commands :
  To compile :  javac filename.java
  To run     : java filename    (Execute Code)


To start RMI Registry:
1. Open Command prompt run+cmd
2. Enter source code location:  cd C:\Users\ebhavaniprasad\Desktop\Marketplace
3. now to start rmi registry typr command: start rmiregistry
4. now need to compile the server side source code: javac *.java
5. To run (execute)Server side : "java -Djava.security.policy=policy -cp C:\Users\ebhavaniprasad\Desktop\Marketplace MarketplaceServer" and now the server is created.
6.  To run (execute) Client side: "java -Djava.security.policy=policy -cp C:\Users\ebhavaniprasad\Desktop\Marketplace MarketplaceClient" and now client is active.   
7. After the code is executed. To terminate the RMI Registry press Cltr+C and type command "fg" to terminate.
