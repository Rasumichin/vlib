/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.jsmithy.vlib.service;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author erik
 */
@Local
public interface BookServiceLocal {

    List<Book> findAllBooks();
}
