package command.basicExample;

public class Invoker {

	Command command;

	public void setCommand(Command command) {this.command = command;}

	public void invoke(){command.operate();}
}