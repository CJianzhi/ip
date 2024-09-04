package bimo.command;

import bimo.Storage;
import bimo.TaskList;
import bimo.Ui;

/**
 * Creates a command to unmark tasks.
 */
public class UnmarkCommand extends Command {
    private int index;
    /**
     * Instantiates object to set task as uncompleted.
     *
     * @param index Index of task inside list.
     */
    public UnmarkCommand(int index) {
        this.index = index;
    }

    /**
     * Sets status of task as uncompleted.
     *
     * @param tasks List of user tasks.
     * @param ui User interface that interacts with users.
     * @param storage Storage that writes and load files.
     */
    @Override
    public String execute(TaskList tasks, Ui ui, Storage storage) {
        if (index >= tasks.getLength() || index < 0) {
            return ui.showTaskNotFoundError();
        }
        tasks.getTask(index).markUncompleted();
        storage.overwriteFile(tasks);
        String response = "        Noted. I've removed this task:"
                + "       " + tasks.getTask(index).toString();
        return response;
    }
}
