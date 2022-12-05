package pkg_matricula;

import pkg_datos.archivo_estudiantes;
import java.util.ArrayList;

public class Estudiantes {
    
    String nombre_estudiantes;
    String numero_cedula;
    int edad;
    String nombre_encargado;
    String numero_telefono;
    String direccion;
    String grado_cursar;
    String forma_pago;
    int pago_pendientes;
    int meses_pendientes;
    int pago_total;
    String cursos_adicionales;

    public Estudiantes() {
    }

    public Estudiantes(String nombre_estudiantes, String numero_cedula, int edad, String nombre_encargado, String numero_telefono, String direccion, String grado_cursar, String forma_pago, String cursos_adicionales, int pago_total, int meses_pendientes) {
        this.nombre_estudiantes = nombre_estudiantes;
        this.numero_cedula = numero_cedula;
        this.edad = edad;
        this.nombre_encargado = nombre_encargado;
        this.numero_telefono = numero_telefono;
        this.direccion = direccion;
        this.grado_cursar = grado_cursar;
        this.forma_pago = forma_pago;
        this.pago_total = pago_total;
        this.meses_pendientes = meses_pendientes;
        this.cursos_adicionales = cursos_adicionales;
    }

    public String getNombre_estudiantes() {
        return nombre_estudiantes;
    }

    public void setNombre_estudiantes(String nombre_estudiantes) {
        this.nombre_estudiantes = nombre_estudiantes;
    }

    public String getNumero_cedula() {
        return numero_cedula;
    }

    public void setNumero_cedula(String numero_cedula) {
        this.numero_cedula = numero_cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre_encargado() {
        return nombre_encargado;
    }

    public void setNombre_encargado(String nombre_encargado) {
        this.nombre_encargado = nombre_encargado;
    }

    public String getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(String numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGrado_cursar() {
        return grado_cursar;
    }

    public void setGrado_cursar(String grado_cursar) {
        this.grado_cursar = grado_cursar;
    }

    public String getForma_pago() {
        return forma_pago;
    }

    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
    }

    public int getPago_pendientes() {
        return pago_pendientes;
    }

    public void setPago_pendientes(int pago_pendientes) {
        this.pago_pendientes = pago_pendientes;
    }

    public int getMeses_pendientes() {
        return meses_pendientes;
    }

    public void setMeses_pendientes(int meses_pendientes) {
        this.meses_pendientes = meses_pendientes;
    }
    
        public int getPago_total() {
        return pago_total;
    }

    public void setPago_total(int pago_total) {
        this.pago_total = pago_total;
    }


    public String getCursos_adicionales() {
        return cursos_adicionales;
    }

    public void setCursos_adicionales(String cursos_adicionales) {
        this.cursos_adicionales = cursos_adicionales;
    }

    @Override
    public String toString() {
        return "Nombre del Estudiante: " + nombre_estudiantes + "\n" + 
               "Numero de Cedula: " + numero_cedula + "\n" +
               "Edad: " + edad + "\n" +
               "Nombre del Encargado: " + nombre_encargado + "\n" +
               "Numero de telefono: " + numero_telefono + "\n" + 
               "Direccion: " + direccion + "\n" + 
               "Grado a Cursar: " + grado_cursar + "\n" + 
               "Forma de pago: " + forma_pago + "\n" + 
               "Pago Pendientes: " + pago_pendientes + "\n" +
               "Cursos Adicionales: " + cursos_adicionales + "\n" +
               "Pago Total: " + pago_total;
    }
    
    public void guardarArchivo(String informacion) {
        archivo_estudiantes archivoEstudiantes = new archivo_estudiantes();
        archivoEstudiantes.escribir("estudiantesMatriculados.txt", informacion);
    }
    
    public ArrayList<Estudiantes> leerArchivo() {
        archivo_estudiantes archivoEstudiantes = new archivo_estudiantes();
        return archivoEstudiantes.leer();
    }
    
}
