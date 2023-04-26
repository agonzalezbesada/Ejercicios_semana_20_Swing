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
        tabla.setBounds(500, 120, 600, 600);
        tabla.setRowHeight(100);

        JTableHeader cabecera = tabla.getTableHeader(); // Instanciamos la cabecera
        cabecera.setBounds(500,80,600,40); // la ponemos encima de la tabla
        tabla.setTableHeader(cabecera); // Añadimos la cabecera a la tabla

        ventana.setLayout(null); // Eliminamos el layout por defecto

        // Añadimos elementos a la ventana
        ventana.add(etiqueta1);

        ventana.add(barraMenus);

        ventana.add(botonNuevaLiga);
        ventana.add(botonJugarLiga);
        ventana.add(botonSiguienteJornada);
        ventana.add(botonSimulacionCompleta);
        ventana.add(botonSalir);

        ventana.add(tabla.getTableHeader()); // Añadimos primero el header
        ventana.add(tabla); // Añadimos la tabla

        ventana.setVisible(true); // Hacemos visible la ventana

    }
}
