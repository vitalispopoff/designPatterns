package command.basicExample;

public class ConcreteCommand extends Command {

	Receiver receiver;

	public ConcreteCommand(Receiver receiver){this.receiver = receiver;}

	public void operate(){receiver.action();}


}