package de.jsmithy.vlib.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Erik Lotz
 */
@ManagedBean
@ViewScoped
public class InventoryView implements Serializable {

    public List<Book> getBooks() {
        System.out.println("### getBooks");
        return new ArrayList<Book>();
    }
}
