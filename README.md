# University Management System 🎓

Sistema de gestión universitaria desarrollado en Java que permite administrar profesores, estudiantes y clases de manera interactiva.

## 📋 Descripción

Este proyecto implementa un sistema de gestión para una universidad que permite:
- Gestionar profesores de tiempo completo y medio tiempo con cálculo automático de salarios
- Administrar estudiantes con sus datos personales
- Crear y gestionar clases con asignación de profesores y estudiantes
- Consultar información de manera interactiva mediante un menú de consola

## 🚀 Características

- **Gestión de Profesores**
  - Profesores de tiempo completo: salario base × 110% × años de experiencia
  - Profesores de medio tiempo: salario base × 105% × horas activas por semana

- **Gestión de Estudiantes**
  - Registro con nombre, ID único y edad
  - Búsqueda de estudiantes por ID

- **Gestión de Clases**
  - Asignación de aulas
  - Vinculación de profesores y estudiantes
  - Consulta de información detallada

## 🏗️ Estructura del Proyecto

```
java-final-project/
├── src/
│   ├── models/
│   │   ├── Teacher.java
│   │   ├── FullTimeTeacher.java
│   │   ├── PartTimeTeacher.java
│   │   ├── Student.java
│   │   └── Class.java
│   ├── services/
│   │   └── UniversityManager.java
│   └── Main.java
├── docs/
│   └── UML_Diagram.png
└── README.md
```

## 💻 Instalación y Uso

### Requisitos Previos
- Java JDK 8
- IntelliJ IDEA

### Clonar el Repositorio
```bash
git clone https://github.com/tu-usuario/java-final-project.git
cd java-final-project
```

### Compilar y Ejecutar
```bash
# Compilar
javac src/Main.java

# Ejecutar
java -cp src Main
```

O simplemente ejecuta el proyecto desde tu IDE.

## 📖 Uso del Sistema

Al ejecutar el programa, se mostrará un menú interactivo con las siguientes opciones:

```
=== SISTEMA DE GESTIÓN UNIVERSITARIA ===
a. Ver todos los profesores
b. Ver todas las clases
c. Agregar nuevo estudiante a una clase
d. Crear nueva clase
e. Buscar clases de un estudiante
f. Salir
```

### Ejemplos de Uso

**Ver profesores:**
- Selecciona opción `a` para ver la lista completa de profesores con sus datos y salarios calculados

**Consultar clases:**
- Selecciona opción `b` para ver todas las clases
- Luego selecciona una clase específica para ver detalles completos

**Agregar estudiante:**
- Selecciona opción `c`
- Ingresa los datos del nuevo estudiante
- Selecciona la clase a la que deseas agregarlo

## 🎯 Conceptos de POO Implementados

- ✅ **Herencia**: Jerarquía de clases Teacher → FullTimeTeacher/PartTimeTeacher
- ✅ **Polimorfismo**: Cálculo de salarios según tipo de profesor
- ✅ **Encapsulación**: Atributos privados con getters/setters
- ✅ **Abstracción**: Clases abstractas y métodos abstractos
- ✅ **Constructores**: Inicialización de objetos
- ✅ **Modificadores de acceso**: public, private, protected

## 📊 Diagrama UML

El diagrama de clases UML se encuentra en la carpeta `docs/UML_Diagram.png`

## 🛠️ Tecnologías Utilizadas

- **Lenguaje**: Java 8
- **IDE**: IntelliJ IDEA
- **Control de versiones**: Git & GitHub

## 👨‍💻 Autor

**Luis Ochoa**
Proyecto Final - Java Basics Module
TAE Academy - 2025

## 📅 Información del Proyecto

- **Curso**: Java Basics Module
- **Institución**: TAE Academy
- **Fecha de entrega**: 13 de Marzo, 2025

## 📝 Licencia

Este proyecto es parte de un ejercicio académico para TAE Academy.
