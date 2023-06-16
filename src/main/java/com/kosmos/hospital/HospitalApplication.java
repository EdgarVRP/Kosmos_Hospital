package com.kosmos.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kosmos.hospital.model.citas;
import com.kosmos.hospital.model.consultorio;
import com.kosmos.hospital.model.empleado;

@SpringBootApplication
public class HospitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalApplication.class, args);
		// Se crean 3 empleados
		empleado empleado1 = new empleado("Juan", "Perez", "Gomez", "Medicina General");
		empleado empleado2 = new empleado("Maria", "Gonzalez", "Lopez", "Medicina General");
		empleado empleado3 = new empleado("Pedro", "Garcia", "Hernandez", "Medicina General");
		// Se crean 3 consultorios
		consultorio consultorio1 = new consultorio(1, 1);
		consultorio consultorio2 = new consultorio(2, 1);
		consultorio consultorio3 = new consultorio(3, 1);

		// Se crean citas
		citas cita1 = new citas(consultorio1, empleado1, "10:00", "Juan Perez");
		citas cita2 = new citas(consultorio2, empleado2, "11:00", "Maria Gonzalez");

	}

}
