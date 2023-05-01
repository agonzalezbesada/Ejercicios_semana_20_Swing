import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame ventana = new JFrame();

        ventana.setBounds(250,70,1600,900);
        ventana.setTitle("Liga (GRUPO B)");
        ventana.setResizable(false); // Impedimos que pueda ser redimensionada

        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setLayout(null);
        // EJERCICIO 1
        GridBagLayout gridBag = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        ventana.setLayout(gridBag);

        // Etiqueta superior
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setText("Probando la librería Swing en Java");
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weighty = 0;
        gbc.weightx = 4;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.WEST;
        ventana.add(etiqueta1, gbc);


        // Menú + Menús

        JMenuBar barraMenus = new JMenuBar();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weighty = 4;
        gbc.weightx = 0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        ventana.add(barraMenus, gbc);

        JMenu menuArchivo = new JMenu("Archivo");
        JMenu menuAcciones = new JMenu("Acciones");
        JMenu menuAyuda = new JMenu("Ayuda");

        // Agregamos los menús a la barra de menús
        barraMenus.add(menuArchivo);
        barraMenus.add(menuAcciones);
        barraMenus.add(menuAyuda);

        // Botones

        ManejadorNuevaLiga botonLiga = new ManejadorNuevaLiga();
        ManejadorJugarLiga botonJugar = new ManejadorJugarLiga();

        Button botonNuevaLiga = new Button();
        botonNuevaLiga.setLabel("Nueva Liga");
        // EJERCICIO 3
        botonNuevaLiga.addActionListener(botonLiga);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weighty = 1;
        gbc.weightx = 3;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.NORTH;
        ventana.add(botonNuevaLiga, gbc);

        Button botonJugarLiga = new Button();
        botonJugarLiga.setLabel("Jugar Liga");
        // EJERCICIO 4
        botonJugarLiga.addMouseListener(botonJugar);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.weighty = 1;
        gbc.weightx = 3;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.NORTH;
        ventana.add(botonJugarLiga, gbc);

        Button botonSiguienteJornada = new Button();
        botonSiguienteJornada.setEnabled(false);
        botonSiguienteJornada.setLabel("Siguiente jornada");
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.weighty = 1;
        gbc.weightx = 3;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.NORTH;
        ventana.add(botonSiguienteJornada, gbc);

        Button botonSimulacionCompleta = new Button();
        botonSimulacionCompleta.setEnabled(false);
        botonSimulacionCompleta.setLabel("Simulación completa");
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.weighty = 1;
        gbc.weightx = 3;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.NORTH;
        ventana.add(botonSimulacionCompleta, gbc);

        Button botonSalir = new Button();
        botonSalir.setLabel("Salir");
        // EJERCICIO 2
        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.weighty = 1;
        gbc.weightx = 3;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.NORTH;
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
        tabla.setRowHeight(70);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 5;
        gbc.weighty = 0;
        gbc.weightx = 4;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        ventana.add(tabla, gbc);

        JTableHeader cabecera = tabla.getTableHeader(); // Instanciamos la cabecera
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weighty = 2;
        gbc.weightx = 4;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        ventana.add(tabla.getTableHeader(), gbc);

        tabla.setTableHeader(cabecera); // Añadimos la cabecera a la tabla

        ventana.setVisible(true); // Hacemos visible la ventana

    }
}
