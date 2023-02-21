import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepositoryTest {
    @Test
    public void testRemoveByID() {
        ProdRepository repository = new ProdRepository();
        Book book1 = new Book(1, "BookName1", 100, "author1");
        Book book2 = new Book(2, "BookName2", 100, "author2");
        Book book3 = new Book(3, "BookName3", 100, "author3");
        Smartphone smartphone1 = new Smartphone(4, "galaxy", 200, "S10", "Samsung");

        repository.add(book1);
        repository.add(book2);
        repository.add(book3);
        repository.add(smartphone1);
        repository.removeById(2);

        Product[] actual = repository.findAll();
        Product[] expected = {book1, book3, smartphone1};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addAll() {
        ProdRepository repository = new ProdRepository();
        Book book1 = new Book(1, "BookName1", 100, "author1");
        Smartphone smartphone1 = new Smartphone(4, "galaxy", 200, "S10", "Samsung");

        repository.add(book1);
        repository.add(smartphone1);


        Product[] actual = repository.findAll();
        Product[] expected = {book1, smartphone1};

        Assertions.assertArrayEquals(expected, actual);

    }

}
