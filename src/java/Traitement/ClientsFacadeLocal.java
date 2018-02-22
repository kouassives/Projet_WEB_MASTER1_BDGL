/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Traitement;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP CORE I5
 */
@Local
public interface ClientsFacadeLocal {

    void create(Clients clients);

    void edit(Clients clients);

    void remove(Clients clients);

    Clients find(Object id);

    List<Clients> findAll();

    List<Clients> findRange(int[] range);

    int count();
    
}
