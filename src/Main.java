import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame ventana = new JFrame();

        ventana.setBounds(250,70,1600,900);
        ventana.setResizable(false); // Impedimos que pueda ser redimensionada

        // Etiqueta superior
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setText("Probando la librería Swing en Java");
        etiqueta1.setBounds(700,-40,300,100);

        // Menú + Menús

        JMenuBar barraMenus = new JMenuBar();

        JMenu menuArchivo = new JMenu("Archivo");
        JMenu menuAcciones = new JMenu("Acciones");
        JMenu menuAyuda = new JMenu("Ayuda");
        barraMenus.setBounds(0,20,170,40);

        // Agregamos los menús a la barra de menús
        barraMenus.add(menuArchivo);
        barraMenus.add(menuAcciones);
        barraMenus.add(menuAyuda);

        // Botones

        Button botonNuevaLiga = new Button();
        botonNuevaLiga.setLabel("Nueva Liga");
        botonNuevaLiga.setBounds(20,120,180,50);

        Button botonJugarLiga = new Button();
        botonJugarLiga.setLabel("Jugar Liga");
        botonJugarLiga.setBounds(20,220,180,50);

        Button botonSiguienteJornada = new Button();
        botonSiguienteJornada.setEnabled(false);
        botonSiguienteJornada.setLabel("Siguiente jornada");
        botonSiguienteJornada.setBounds(20,320,180,50);

        Button botonSimulacionCompleta = new Button();
        botonSimulacionCompleta.setEnabled(false);
        botonSimulacionCompleta.setLabel("Simulación completa");
        botonSimulacionCompleta.setBounds(20,420,180,50);

        Button botonSalir = new Button();
        botonSalir.setLabel("Salir");
        botonSalir.setBounds(20,560,180,50);








        ventana.setLayout(null); // Eliminamos el layout por defecto

        // Añadimos elementos a la ventana
        ventana.add(etiqueta1);

        ventana.add(barraMenus);

        ventana.add(botonNuevaLiga);
        ventana.add(botonJugarLiga);
        ventana.add(botonSiguienteJornada);
        ventana.add(botonSimulacionCompleta);
        ventana.add(botonSalir);

        ventana.setVisible(true); // Hacemos visible la ventana



    }
}
