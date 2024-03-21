

package com.institucionlistaestudiantes;

import javax.swing.WindowConstants;


public class InstitucionListaEstudiantes {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Frame app = new Frame();
        app.setResizable(false);
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setTitle("PRUEBA BASE DE DATOS");
        app.setVisible(true);
    }
}
