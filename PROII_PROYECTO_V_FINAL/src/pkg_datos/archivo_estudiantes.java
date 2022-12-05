package pkg_datos;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import pkg_matricula.Estudiantes;

public class archivo_estudiantes {
    
    public ArrayList<Estudiantes> leer() {
            
        try {
            
            FileReader archivo = new FileReader("estudiantesMatriculados.txt");
            BufferedReader leer = new BufferedReader (archivo);
            String linea = "";
            String cadena = "";
            String[] cadenaSeparada;
            
            ArrayList<Estudiantes> listaEstudiantes = new ArrayList<>();
            Estudiantes estudiantes = new Estudiantes();
            while ((linea = leer.readLine ())!= null){
                cadena = linea;
                cadenaSeparada = cadena.split("/");
                estudiantes = new Estudiantes (cadenaSeparada[0], cadenaSeparada[1], Integer.parseInt(cadenaSeparada[2]), cadenaSeparada[3], cadenaSeparada[4], cadenaSeparada[5], cadenaSeparada[6], cadenaSeparada[7], cadenaSeparada[8], Integer.parseInt(cadenaSeparada[9]), Integer.parseInt(cadenaSeparada[10]));
                listaEstudiantes.add(estudiantes);
            }
            
            leer.close();
            archivo.close();
            return listaEstudiantes;
            
        }catch (IOException error) {
            JOptionPane.showMessageDialog(null, error);
            return null;
        }
    }
        
    public void escribir(String nombreArchivo, String datos){
        try {
            FileWriter archivo = new FileWriter(nombreArchivo);
            BufferedWriter informacion = new BufferedWriter (archivo);
            informacion.write(datos);
            informacion.close();
            archivo.close();
            
        }catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
