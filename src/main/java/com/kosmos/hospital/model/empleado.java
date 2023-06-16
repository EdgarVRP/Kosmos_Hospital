package com.kosmos.hospital.model;

public class empleado {
    /*
     * La aplicación debe tener registrada la siguiente información:
     * • Doctores (3 a 5 para el ejercicio, se pueden insertar manualmente)
     * • Nombre
     * • Apellido Paterno
     * • Apellido Materno
     * • Especialidad
     */
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String especialidad;

    public empleado(String nombre, String apellidoPaterno, String apellidoMaterno, String especialidad) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.especialidad = especialidad;
    }

    public empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
