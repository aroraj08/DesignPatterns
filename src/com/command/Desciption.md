Command is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request.

use Command to convert any operation into an object. The operation’s parameters become fields of that object. The conversion lets you defer execution of the operation, queue it, store the history of commands, send commands to remote services, etc.

PROS-
 Single Responsibility Principle. You can decouple classes that invoke operations from classes that perform these operations.
 Open/Closed Principle. You can introduce new commands into the app without breaking existing client code.
 You can implement deferred execution of operations.