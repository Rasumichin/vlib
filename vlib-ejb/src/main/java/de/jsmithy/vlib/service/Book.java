package de.jsmithy.vlib.service;

/**
 *
 * @author Erik Lotz
 */
public class Book {
    private String title;
    private String authors;
    private String owner;
    private String holder;

    public String getTitle() {
        return title;
    }

    public String getAuthors() {
        return authors;
    }

    public String getOwner() {
        return owner;
    }

    public String getHolder() {
        return holder;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }
}
