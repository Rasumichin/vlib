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
        List<Book> result = new ArrayList<Book>();
        
        return result;
    }
}
