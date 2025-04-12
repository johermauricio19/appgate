# 📊 Distinct Subsequences Counter

Este proyecto en Java cuenta cuántas **subsecuencias distintas** de una cadena `s` coinciden con otra cadena `t`. Utiliza programación dinámica y está diseñado para ser **modular, extensible y listo para producción**.

---

## 🚀 Contexto de ejecución

Este componente está pensado como una **librería de negocio** reutilizable, ideal para integrarse en sistemas más grandes:

- Sistemas de análisis de texto o procesamiento de datos.
- APIs RESTful como microservicio con Spring Boot.

> Actualmente implementado como app de consola con pruebas unitarias. Preparado para migración a microservicio si se desea.

---

## 📐 Arquitectura del proyecto

El proyecto sigue una estructura basada en **capas de responsabilidad**, lo que facilita su mantenimiento y extensión.

### 🧱 Diagrama de capas

┌───────────────────────┐ │ App │ │ (Interfaz CLI / Main) │ │ ↳ PruebaApplication.java │ 
└──────────▲────────────┘ │ ┌──────────┴────────────┐ │ Service Layer │ │ ↳ SubsequenceService │ 
└──────────▲────────────┘ │ ┌──────────┴────────────┐ │ Domain (Business) │ │ ↳ SubsequenceCounter │ 
└───────────────────────┘


---

## 📁 Estructura del proyecto

src/ ├── main/ │ └── java/com/appgate/prueba/ │ ├── app/ │ │ └── PruebaApplication.java 

# Punto de entrada 

(CLI) │ ├── domain/ │ │ └── SubsequenceCounter.java 

# Algoritmo principal 

(negocio) │ └── service/ │ └── SubsequenceService.java 

# Lógica de orquestación 

(caso de uso) └── test/ └── java/com/appgate/prueba/ └── service/ └── SubsequenceServiceTest.java

## ⚙️ Requisitos

- Java 17
- Maven 3.6+
- (Opcional) IDE: IntelliJ IDEA / Eclipse

---

## ▶️ Cómo ejecutar

### 1. Clonar el repositorio
```bash
git clone https://github.com/johermauricio19/appgate.git

### 2. Compilar proyecto 
mvn clean compile

### 3. Ejecutar pruebas
mvn test


