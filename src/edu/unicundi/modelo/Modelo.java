/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.modelo;
import edu.unicundi.ejeciciomvc.Main;
import edu.unicundi.vista.Vista;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santiago Gomez
 */
/*
clase modelo sólo recibo un nombre
*/
public class Modelo {
    /*
    variable nombre que se agregará a la lista
    */

    private String nombre;
    /*
    Obtengo el nombre
    */
    public String getNombre() {
        return nombre;
    }
    /*
    le doy valor al nombre
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   


    

}
