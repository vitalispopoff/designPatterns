package command.basicExample;

import bridge._implementation_01.AnotherConcreteCommand;
import bridge._implementation_01.AnotherReceiver;

public class Client {

	public static Command setAnswer(){return new ConcreteCommand(new Receiver());}
	public static Command setShout(){return new AnotherConcreteCommand(new AnotherReceiver());}

	public static void deliverCommand(Command command, Invoker invoker){invoker.setCommand(command);}

	public static void main(String[] args) {

		Command
				command_01 = setShout(),
				command_02 = setAnswer();
		Invoker
				invoker_01 = new Invoker(),
				invoker_02 = new Invoker();

		deliverCommand(command_01, invoker_01);
		deliverCommand(command_02, invoker_02);

		invoker_01.invoke();
		invoker_02.invoke();
	}
}