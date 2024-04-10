import Command.Command;
import Command.CommandImpl.NoCommand;

public class Remote {
    Command[] onCommand;
    Command[] offCommand;
    Command undoCommand;

    public Remote() {
        onCommand = new Command[7];
        offCommand = new Command[7];

        Command noCommand = new NoCommand();
        for(int i  = 0; i<7; i++){
            onCommand[i] = noCommand;
            offCommand[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int step,Command onCommand, Command offCommand){
        this.onCommand[step] = onCommand;
        this.offCommand[step] = offCommand;
    }
    public void onButtonWasPushed(int slot) {
        onCommand[slot].execute();
        undoCommand = onCommand[slot];
    }
    public void offButtonWasPushed(int slot) {
        offCommand[slot].execute();
        undoCommand = onCommand[slot];
    }
    public void undoButtonWasPushed(int slot) {
        undoCommand.undo();
    }
}
