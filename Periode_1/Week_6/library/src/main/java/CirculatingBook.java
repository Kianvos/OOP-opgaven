public class CirculatingBook extends LibraryBook {
    private String currentHolder;
    private String dueDate;

    public CirculatingBook(String title, String author, String ISBN, String numCode) {
        super(title, author, ISBN, numCode);
        this.currentHolder = null;
        this.dueDate = null;
    }


    public void setCurrentHolder(String currentHolder) {
        this.currentHolder = currentHolder;
    }

    public String getCurrentHolder() {
        return currentHolder;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void checkout(String patron, String dueDate) {
        this.currentHolder = patron;
        this.dueDate = dueDate;
    }

    public void returned() {
        this.currentHolder = null;
        this.dueDate = null;
    }

    public String circulationStatus() {
        if (dueDate == null) {
            return "boek beschikbaar op de planken";
        } else {
            return "Naam: " + currentHolder + " Beschikbaar:" + dueDate;
        }
    }

    public String toString() {
        return super.toString() + "\nHuidige bezitter: " + this.currentHolder + "\nTeruggave: " + this.dueDate;
    }
}
