/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcairlines;

/**
 *
 * @author JRios15_17
 */
public class TCAirplaneFull extends Exception {
    public TCAirplaneFull(String errorMessage){
        super("The Airplane is Full!");
    }
}
