JFLAGS = -g
JC = javac -cp ".:./mysql-connector-java-5.1.41-bin.jar"
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
Interface/AddInterface.java\
Interface/BrowseInterface.java\
Interface/LoginInterface.java\
Interface/RequiresRole.java\
Server/AddItem.java\
Server/AuthorizationException.java\
Server/AuthorizationInvocationHandler.java\
Server/BrowseItem.java\
Server/Database.java\
Server/Login.java\
Server/RMIServer.java\
Server/Session.java\
Server/User.java\
controller/Dispatcher.java\
controller/FrontController.java\
Client/AdminView.java\
Client/ClientView.java\
Client/LoginView.java\


classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
