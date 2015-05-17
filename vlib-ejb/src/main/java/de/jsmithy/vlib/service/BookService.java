package de.jsmithy.vlib.service;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Erik Lotz
 */
@Stateless
public class BookService implements BookServiceLocal {

    @Override
    public List<Book> findAllBooks() {
        System.out.println("### Service: getBooks");
        
        return createTestData();
    }
    
    private List<Book> createTestData() {
        List<Book> result = new ArrayList<Book>();
        
        Book book = new Book();
        book.setTitle("Design Patterns");
        book.setAuthors("Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides");
        book.setOwner("Erik Lotz");
        book.setHolder("Erik Lotz");
        result.add(book);
        
        book = new Book();
        book.setTitle("Object Thinking");
        book.setAuthors("David West");
        book.setOwner("Erik Lotz");
        book.setHolder("Erik Lotz");
        result.add(book);
        
        book = new Book();
        book.setTitle("Clean Code");
        book.setAuthors("Robert E. Martin");
        book.setOwner("Christian Schmoll");
        book.setHolder("Christian Schmoll");
        result.add(book);
        
        return result;
    }
}
