/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Santiago Gomez
 */
/*
Clase que se encarga de la parte visual del programa
*/
public class Vista extends JFrame {
    
    /*
    boton que agrega los nombres a la lista
    */
    public JButton agregar;
    /*
    panel 1 y 2 donde se muestran los demás componentes
    */
    private JPanel panelB, panelR;
    /**
     * label de nombres
     */
    public JLabel lResultado;
    /*
    donde recibo los nombres
    */
    public JTextField campoTexto;
    /*
    donde muestro los nombres
    */
    public JList campoNombres;
    
    /**
     * Contructor que no recibe nada, donde creamos el jpanel y los componentes de la vista
     */

    public Vista() {
        getContentPane().setLayout(new BorderLayout());

        panelB = new JPanel();
        panelB.setLayout(new GridLayout(10, 10));

        panelR = new JPanel();
        panelR.setLayout(new GridLayout(50, 500));

        agregar = new JButton("Agregar");

        lResultado = new JLabel("Nombres: ");
        campoTexto = new JTextField(30);
        campoNombres = new JList();

        panelR.add(lResultado);

        add(agregar, BorderLayout.EAST);
        add(campoTexto, BorderLayout.NORTH);
        add(campoNombres, BorderLayout.WEST);
        add(panelB, BorderLayout.SOUTH);
        add(panelR, BorderLayout.CENTER);

    }

}
