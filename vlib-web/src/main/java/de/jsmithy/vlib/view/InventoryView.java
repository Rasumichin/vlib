package de.jsmithy.vlib.view;

import de.jsmithy.vlib.service.Book;
import de.jsmithy.vlib.service.BookServiceLocal;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

/**
 *
 * @author Erik Lotz
 */
@ManagedBean
@ViewScoped
public class InventoryView implements Serializable {
    @Inject
    BookServiceLocal bookService;

    public List<Book> getBooks() {
        System.out.println("### View: getBooks");
        return bookService.findAllBooks();
    }
}
