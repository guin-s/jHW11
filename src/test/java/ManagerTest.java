import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void SearchByNameWithSomeResults() {
        ProdRepository repository = new ProdRepository();
        Manager manager = new Manager(repository);
        Book book1 = new Book(1, "BookName1", 100, "author1");
        Book book2 = new Book(2, "BookName2", 100, "author2");
        Book book3 = new Book(3, "BookName3", 100, "author3");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = manager.searchBy("ame1");
        Product[] expected = {book1};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void SearchByNameWithAllResults() {
        ProdRepository repository = new ProdRepository();
        Manager manager = new Manager(repository);
        Book book1 = new Book(1, "BookName1", 100, "author1");
        Book book2 = new Book(2, "BookName2", 100, "author2");
        Book book3 = new Book(3, "BookName3", 100, "author3");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = manager.searchBy("ame");
        Product[] expected = {book1, book2, book3};

        Assertions.assertArrayEquals(expected, actual);

    }


}
