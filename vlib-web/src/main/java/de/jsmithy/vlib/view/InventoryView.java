package de.jsmithy.vlib.view;

import de.jsmithy.vlib.service.Book;
import de.jsmithy.vlib.service.BookServiceLocal;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
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
    private BookServiceLocal bookService;
    
    private List<Book> inventory;

    public List<Book> getBooks() {
        System.out.println("### View: getBooks");
        return inventory;
    }
    
    @PostConstruct
    void initInventory() {
        inventory = bookService.findAllBooks();
    }
}
