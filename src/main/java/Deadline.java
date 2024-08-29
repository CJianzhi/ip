public class Deadline extends Task{
    private String dueDate;

    public Deadline(String details, String dueDate) {
        super(details);
        this.dueDate = dueDate;
    }

    /**
     * Format end date to write into file
     * @return Returns start and end time as text
     */
    public String getDateAsText() {
        return "|" + dueDate;
    }

    @Override
    public String toString() {
        return String.format("[D]%s (by: %s)", super.toString(), dueDate);
    }
}
