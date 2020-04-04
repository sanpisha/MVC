/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.controlador;

import edu.unicundi.ejeciciomvc.Main;
import edu.unicundi.vista.Vista;
import edu.unicundi.modelo.Modelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

import javax.swing.JFrame;

/**
 *
 * @author Santiago Gomez
 */
/**
 *
 * Clase que se encarga de controlar las acciones de los componentes de la vista
 */
public class Controlador implements ActionListener {

    /**
     * Variable de tipo modelo
     */
    private Modelo modelo;
    /*
     variable de tipo vista
     */
    private Vista vista;
    /*
     variable nombre que agrego a la lista
     */
    private String nombre;
    /*
     Lista donde se almacenan los nombres
     */
    DefaultListModel lista;
    /*
     constructor recibo modelo y vista
     */

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;

        this.vista.agregar.addActionListener(this);

    }
    /*
     método para inciar la vista
     */

    public void iniciarVista() {
        vista.setTitle("Lista Personas");
        vista.pack();
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        lista = new DefaultListModel();
        vista.campoNombres.setModel(lista);

    }
    /*
     método que controla la acción del botón agregar
     */

    public void actionPerformed(ActionEvent evento) {
        //if (vista.agregar == evento.getSource()) {
        //if (!"".equals(vista.campoTexto.getText())) {

        nombre = (vista.campoTexto.getText());

        lista.addElement(nombre);

            //}
        //}
    }
}
