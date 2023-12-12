public class ReferenceBook extends LibraryBook {
    private String collection;

    public ReferenceBook(String title, String author, String ISBN, String numCode, String collection) {
        super(title, author, ISBN, numCode);
        this.collection = collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public String getCollection() {
        return collection;
    }

    public void checkout(String patron, String dueDate) {

    }

    public void returned() {

    }

    public String circulationStatus() {
        return "niet-uitleenbaar naslagwerk";
    }


    public String toString() {
        return super.toString() + "\nCollection: " + this.collection;
    }

    @Override
    public int compareTo(LibraryBook book2){
        return this.getNumCode().compareTo(book2.getNumCode());
    }

    public static void main(String[] args) {
        ReferenceBook book = new ReferenceBook("Jan de boer", "Kian", "SDAD32", "125", "as");
        System.out.println(book);
        ReferenceBook test = new ReferenceBook("Jan de boer", "Kian", "SDAD32", "123", "as");
        System.out.println(book.compareTo(test));
    }
}
