package hansung.designpatterns.command.party;

import java.util.Stack;

//
// This is the invoker
//
public class RemoteControl {
	private Stack<Command> mCommandStack = new Stack<Command>();
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
 
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
 
		Command noCommand = new NoCommand();
		for(int i=0;i<7;i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}
  
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
 
	public void onButtonWasPushed(int slot) {

		undoCommand = onCommands[slot];
		onCommands[slot].execute();
		mCommandStack.push(undoCommand);
	}
 
	public void offButtonWasPushed(int slot) {

		undoCommand = offCommands[slot];
		offCommands[slot].execute();
		mCommandStack.push(undoCommand);
	}

	public void undoButtonWasPushed() {
		if(mCommandStack.size()>0)
		{
			mCommandStack.pop().undo();
		}
	}
 
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control -------\n");
		int i=0;
		for (i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot"+i+"]"+"( " + 2*i + ") " + onCommands[i].getClass().getName()
				+ "      \t" + "( " + (2*i+1) + ") "+offCommands[i].getClass().getName() + "\n");
		}
		stringBuff.append("[undo] ("+2*i+") " + undoCommand.getClass().getName() + "\n");
		return stringBuff.toString();
	}
}
