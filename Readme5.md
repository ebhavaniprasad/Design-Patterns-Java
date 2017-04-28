Step1: To execute the code we need to run the on the server machine. 

Step 2: Run the makefile using the make.

Step 3: we will start the rmiregistry.

step4: one machine is taken as the server machine(in-csci-rrpc01.cs.iupui.edu)

Step:5 Other four machine is taken as the client machine (in-csci-rrpc02.cs.iupui.edu)(rrpc02,03,04,05).

step6: Then we will start the server we use command : java -cp ".:./mysql-connector-java-5.1.41-bin.jar" -Djava.security.policy=policy Server.RMIServer


step7: The machines are given in the RMIServer class and the remote object is binded.

step 8: Client is started in the other four machnes using command $java -Djava.security.policy=policy Client.ClientView
