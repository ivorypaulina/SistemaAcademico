# Tarea Interfaces Java

## Descripción

Proyecto desarrollado en Java aplicando el uso de interfaces.

El proyecto contiene tres ejercicios:

1. Sistema académico de documentos
2. Sistema bancario de pagos
3. Sistema de roles empresariales

---

# Ejercicio 1: Sistema académico de documentos

## Objetivo

Aplicar una interfaz con diferentes clases que implementan métodos personalizados.

## Interfaz utilizada

```java
public interface Imprimible {
    void imprimir();
}
```

## Clases desarrolladas

* Certificado
* ActaNotas
* HorarioAcademico
* MainAcademico

## Funcionalidades

* Implementación de interfaces
* Uso de @Override
* Mensajes personalizados
* Atributos propios para cada documento

---

# Ejercicio 2: Sistema bancario de pagos

## Objetivo

Aplicar interfaces y validación de montos en distintos métodos de pago.

## Interfaz utilizada

```java
public interface Pagable {
    void procesarPago(double monto);
}
```

## Clases desarrolladas

* PagoEfectivo
* PagoTarjeta
* Transferencia
* MainPagos

## Funcionalidades

* Validación de monto mayor a cero
* Procesamiento de pagos
* Diferentes mensajes según el tipo de pago
* Aplicación de comisiones

---

# Ejercicio 3: Sistema de roles empresariales

## Objetivo

Diferenciar responsabilidades mediante múltiples interfaces.

## Interfaces utilizadas

```java
Autenticable
Reportable
Gestionable
```

## Clases desarrolladas

* Cajero
* Administrador
* Supervisor
* MainRoles

## Funcionalidades

* Inicio de sesión
* Gestión de datos
* Generación de reportes
* Menú interactivo
* Validación de usuario y contraseña

---

# Tecnologías utilizadas

* Java
* IntelliJ IDEA
* Git
* GitHub

---

# Autor

Proyecto realizado por Ivory Cando
