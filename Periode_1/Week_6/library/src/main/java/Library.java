import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Library {
    List<LibraryBook> books;

    public Library() {
        books = new ArrayList<LibraryBook>();
    }

    /**
     * Adds the given book to the library
     *
     * @param book
     */
    public void addBook(LibraryBook book) {
        books.add(book);
    }

    /**
     * Prints all books in the library
     */
    public void printLibrary() {
        System.out.println("\nListing of books in the library\n");
        for (LibraryBook book : books) {
            System.out.println(book);
        }
        System.out.println("End of book listing\n");
    }

    /**
     * Locates a book in the library
     *
     * @param book book being search in the library
     * @return book object if book is found null otherwise
     */
    public LibraryBook findBook(LibraryBook book) {
        int index = Collections.binarySearch(books, book);

        if (index >= 0) {
            return books.get(index);
        } else {
            return null;
        }
    }

    /**
     * Sort books in the library by call number
     */
    public void sortLibrary() {
        Collections.sort(books);
    }

    /**
     * performs processing for checking a book out of the library
     *
     * @param patron  person checking out book
     * @param dueDate date book is due to be returned
     * @param callNum call number of book
     */
    public void checkout(String patron, String dueDate, String callNum) {
        LibraryBook searchItem = new CirculatingBook("", "", "", callNum);
        LibraryBook book = findBook(searchItem);
        if (book == null) {
            System.out.println("Book " + callNum + " not found -- checkout impossible\n");
        } else {
            book.checkout(patron, dueDate);
        }
    }

    /**
     * Processes checked-out book that is being returned
     *
     * @param callNum call number of book being returned
     */
    public void returned(String callNum) {
        LibraryBook searchItem = new CirculatingBook("", "", "", callNum);
        LibraryBook book = findBook(searchItem);
        if (book == null) {
            System.out.println("Book " + callNum + " not found -- return impossible\n");
        } else {
            book.returned();
        }
    }

    public static void main(String[] args) {
        String num = "123";
        Library library = new Library();

        CirculatingBook book = new CirculatingBook("Henk eet jan", "Kian", "29323", "123");
        library.addBook(book);
        book.setDueDate("20");
        System.out.println(book.getDueDate());
        library.returned(num);
        System.out.println(book.getDueDate());

        //TEST VOOR SORTEREN
        Library library2 = new Library();
        CirculatingBook bookSort1 = new CirculatingBook("Henk eet jan", "Kian", "29323", "2");
        CirculatingBook bookSort2 = new CirculatingBook("Henk eet jan", "Kian", "29323", "1");
        library2.addBook(bookSort1);
        library2.addBook(bookSort2);
        library2.printLibrary();
        library2.sortLibrary();
        library2.printLibrary();

        //TEST VOOR CHECKOUT
        Library library3 = new Library();
        CirculatingBook bookCheckout = new CirculatingBook("Henk eet jan", "Kian", "29323", "1");
        library3.addBook(bookCheckout);
        library3.checkout("Kian", "30-10-2022", "1");
        library3.checkout("test", "30-10-2022", "1");
        library3.checkout("Kian", "30-10-2022", "2");
        System.out.println(bookCheckout.getCurrentHolder());
    }
}
