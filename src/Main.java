import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame ventana = new JFrame();

        ventana.setBounds(250,70,1600,900);
        ventana.setTitle("Liga (GRUPO B)");
        ventana.setResizable(false); // Impedimos que pueda ser redimensionada

        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setLayout(null);
        // EJERCICIO 1 (1/2)
        GridBagLayout gridBag = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        ventana.setLayout(gridBag);

        // Etiqueta superior
        JLabel etiqueta1 = new JLabel();
        gbc.gridx = 0;
        gbc.gridy = 0;
        ventana.add(etiqueta1, gbc);
        etiqueta1.setText("Probando la librería Swing en Java");

        // Menú + Menús

        JMenuBar barraMenus = new JMenuBar();
        gbc.gridx = 0;
        gbc.gridy = 1;
        ventana.add(barraMenus, gbc);

        JMenu menuArchivo = new JMenu("Archivo");
        JMenu menuAcciones = new JMenu("Acciones");
        JMenu menuAyuda = new JMenu("Ayuda");

        // Agregamos los menús a la barra de menús
        barraMenus.add(menuArchivo);
        barraMenus.add(menuAcciones);
        barraMenus.add(menuAyuda);

        // Botones

        Button botonNuevaLiga = new Button();
        botonNuevaLiga.setLabel("Nueva Liga");
        gbc.gridx = 0;
        gbc.gridy = 2;
        ventana.add(botonNuevaLiga, gbc);

        Button botonJugarLiga = new Button();
        botonJugarLiga.setLabel("Jugar Liga");
        gbc.gridx = 0;
        gbc.gridy = 3;
        ventana.add(botonJugarLiga, gbc);

        Button botonSiguienteJornada = new Button();
        botonSiguienteJornada.setEnabled(false);
        botonSiguienteJornada.setLabel("Siguiente jornada");
        gbc.gridx = 0;
        gbc.gridy = 4;
        ventana.add(botonSiguienteJornada, gbc);

        Button botonSimulacionCompleta = new Button();
        botonSimulacionCompleta.setEnabled(false);
        botonSimulacionCompleta.setLabel("Simulación completa");
        gbc.gridx = 0;
        gbc.gridy = 5;
        ventana.add(botonSimulacionCompleta, gbc);

        Button botonSalir = new Button();
        botonSalir.setLabel("Salir");
        gbc.gridx = 0;
        gbc.gridy = 6;
        ventana.add(botonSalir, gbc);

        // Tabla

        String[] campos = {"Nombre", "Partidos Jugados", "Ganados", "Empates", "Derrotas", "Puntos"};

        Object[][] registros = {
                {"Dark", "5", "5", "0", "0", "15"},
                {"Serral", "5", "4", "0", "1", "12"},
                {"INnoVation", "5", "3", "0", "2", "9"},
                {"TIME", "5", "2", "0", "3", "6"},
                {"Bunny", "5", "1", "0", "4", "3"},
                {"SpeCial", "5", "0", "0", "5", "0"}};

        JTable tabla = new JTable(registros, campos); // Instanciamos la tabla e introducirmos los datos
        gbc.gridx = 0;
        gbc.gridy = 8;
        ventana.add(tabla, gbc);

        JTableHeader cabecera = tabla.getTableHeader(); // Instanciamos la cabecera
        gbc.gridx = 0;
        gbc.gridy = 7;
        ventana.add(tabla.getTableHeader(), gbc);

        tabla.setTableHeader(cabecera); // Añadimos la cabecera a la tabla


        // Diseñamos el Layout EJERCICIO 1 (2/2)






        ventana.setVisible(true); // Hacemos visible la ventana





















    }
}
