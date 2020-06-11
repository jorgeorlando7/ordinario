/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controller.Controlador;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author JOHDLS
 */
public class WorkPanel extends JPanel {
    private JTable tableAlumnos;
    private AlumnosModel modeloTabla;
    public WorkPanel(Controlador controlador) {
        super.setBackground(Color.GREEN);
        super.setLayout(new BorderLayout());

        modeloTabla = new AlumnosModel(controlador);
        tableAlumnos = new JTable(modeloTabla);

        super.add(new JScrollPane(tableAlumnos), BorderLayout.CENTER);
    }

    public JTable getTableAlumnos() {
        return tableAlumnos;
    }
}
