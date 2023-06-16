create database hospital;
use hospital;
create table empleado(
    id_empleado int not null auto_increment,
    nombre varchar(50) not null,
    apellidoPaterno varchar(50) not null,
    apellidoMaterno varchar(50) not null,
    especialidad varchar(50) not null,
    primary key(id_empleado)
);

create table consultorio(
    id_consultorio int not null auto_increment,
    numeroConsultorio int not null,
    piso int not null,
    primary key(id_consultorio)
);

create table citas(
    id_cita int not null auto_increment,
    id_empleado int not null,
    id_consultorio int not null,
    nombrePaciente varchar(50) not null,
    horario varchar(50) not null,
    primary key(id_cita),
    foreign key(id_empleado) references empleado(id_empleado),
    foreign key(id_consultorio) references consultorio(id_consultorio)
);