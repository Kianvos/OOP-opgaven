abstract public class LibraryBook extends Book implements Comparable<LibraryBook> {
    private String numCode;

    public LibraryBook(String title, String author, String ISBN, String numCode) {
        super(title, author, ISBN);
        this.numCode = numCode;
    }

    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    public String getNumCode() {
        return this.numCode;
    }

    abstract public void checkout(String patron, String dueDate);
 
    abstract public void returned();

    abstract public String circulationStatus();

    public int compareTo(LibraryBook book2){
        return this.getNumCode().compareTo(book2.getNumCode());
    }

    public String toString() {
        return String.format("Titel: %s\nAuteur: %s\nISBN: %s\nNummercode: %s", getTitle(), getAuthor(), getISBN(), getNumCode()).toString();
    }
}
