public class UnmarkCommand extends Command {
    private int index;

    public UnmarkCommand(int index) {
        this.index = index;
    }

    @Override
    public void execute(TaskList tasks,Ui ui, Storage storage) {
        if (index >= tasks.getLength() || index < 0) {
            ui.showMarkingError();
            return;
        }
        tasks.getTask(index).markUncompleted();
        storage.overwriteFile(tasks);
        System.out.println("    Good job! I've marked this task as done:");
        System.out.println("       " + tasks.getTask(index).toString());
    }
}
