Step1: To execute the code we need to take 

Step 2: we will start the rmiregistry.

step2: one machine is taken as the server machine(in-csci-rrpc01.cs.iupui.edu)

Step:3 Other four machine is taken as the client machine (in-csci-rrpc02.cs.iupui.edu)(rrpc02,03,04,05).

step4: Then we will start the server we use command : $java -Djava.security.policy=policy Serve.RMIServer

step5: The machines are given in the RMIServer class and the remote object is binded.

step 6: Client is started in the other four machnes using command $java -Djava.security.policy=policy Client.LoginView

 