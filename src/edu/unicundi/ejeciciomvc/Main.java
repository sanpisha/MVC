/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.ejeciciomvc;

import edu.unicundi.controlador.Controlador;
import edu.unicundi.modelo.Modelo;
import edu.unicundi.vista.Vista;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Santiago Gomez
 */
/**
 * 
 *Clase principal donde instancio las demás clases
 */
public class Main {

    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
        controlador.iniciarVista();
    }

}
