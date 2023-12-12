import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class LibraryTest {
    @Test
    @DisplayName("Check of je boek in kan leveren")
    public void testReturn() {
        String num = "123";
        Library library = new Library();
        CirculatingBook book = new CirculatingBook("Henk eet jan", "Kian", "29323", "123");
        library.addBook(book);
        book.setDueDate("20");
        System.out.println(book.getDueDate());
        library.returned(num);

        assertNull(book.getDueDate());
    }
}
