public class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book() {
        this.title = "";
        this.author = "";
        this.ISBN = "";
    }

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public String toString() {
        return String.format("Titel: %s\nAuteur: %s\nISBN: %s", getTitle(), getAuthor(), getISBN()).toString();
    }


}
