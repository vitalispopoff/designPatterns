package bridge._implementation_01;


import command.basicExample.Command;

public class AnotherConcreteCommand extends Command {

	AnotherReceiver receiver;

	public AnotherConcreteCommand(AnotherReceiver receiver){this.receiver = receiver;}

	public void operate(){receiver.action();}

}
