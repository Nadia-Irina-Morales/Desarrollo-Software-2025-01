# Desarrollo-Software-2025-01
Entregables para la unidad de estudio Desarrollo de Software - Nadia Irina M Morales López


# ------------------------------- Guía 1 --------------------------------

# 1️⃣ Descripción del Proyecto
El Sistema de Gestión de Feria Empresarial es una aplicación en Java que permite administrar empresas, stands, visitantes y visitas dentro de una feria.

El sistema proporciona funcionalidades CRUD (Crear, Leer, Actualizar y Eliminar) para cada entidad y permite registrar visitas de los visitantes a los stands, incluyendo comentarios y calificaciones.


# 🔹 Funcionalidades principales:
✅ Gestión de Empresas: Agregar, actualizar, listar y eliminar empresas.

✅ Gestión de Stands: Agregar, actualizar, listar y eliminar stands asociados a una empresa.

✅ Gestión de Visitantes: Registrar, actualizar, listar y eliminar visitantes.

✅ Registro de Visitas: Permite a los visitantes registrar sus visitas a los stands, con comentarios y calificaciones.

✅ Generación de Reportes: Muestra la información de empresas, stands, visitantes y visitas en consola.


# 2️⃣ Estructura del Proyecto
El código está organizado en paquetes dentro del entorno de desarrollo NetBeans.

📂 Guía 1

┗ 📂 Actividad 2 Feria

┃ ┗📂 feria

┃ ┣ 📂 src/main/java/com/feria/model/ (Contiene las clases del modelo de datos)

┃ ┃ ┣ 📄 Empresa.java

┃ ┃ ┣ 📄 Stand.java

┃ ┃ ┣ 📄 Visitante.java

┃ ┃ ┗ 📄 Visita.java

┃ ┣ 📂 src/main/java/com/feria/manager/ (Contiene la lógica del negocio y gestión de datos)

┃ ┃ ┗ 📄 FeriaManager.java

┃ ┣ 📂 src/main/java/com/feria/main/ (Contiene la clase principal para ejecutar el programa)

┃ ┃ ┗ 📄 Main.java

┃ ┣ 📂 src/test/java/ (Contiene las pruebas unitarias con JUnit)

┃ ┃ ┗ 📄 FeriaManagerTest.java


# 🔹 Requisitos Previos
✔ Tener instalado Java (JDK 11 o superior)
✔ Tener instalado NetBeans IDE
✔ Tener JUnit 5 para las pruebas unitarias

# 3️⃣ Instrucciones para Ejecutar el Proyecto
1.Clona el repositorio: git clone https://github.com/Nadia-Irina-Morales/Desarrollo-Software-2025-01 
2. Abre el proyecto en tu IDE
3. Corre el programa 
Para correr el programa en NetBeans, sigue estos pasos:

# 🔹 Pasos para Ejecutar en NetBeans

1️. Abrir el Proyecto en NetBeans.
Desde NetBeans, selecciona Archivo > Abrir Proyecto y elige la carpeta del proyecto.

2. Compilar el Proyecto.
Haz clic en Ejecutar > Limpiar y Construir Proyecto o presiona Shift + F11.

3️. Ejecutar la Aplicación.
En NetBeans, haz clic en Ejecutar > Ejecutar Archivo (Main.java) o presiona Shift + F6.

4️. Ver los Resultados.
Se mostrarán los datos en la consola, incluyendo las empresas, stands, visitantes y visitas registradas.


# 4️⃣ Pruebas Unitarias con JUnit
Para ejecutar los tests:

1️. Asegúrate de tener JUnit 5 agregado al proyecto.
2️. Abre la clase de pruebas en test/com/feria/tests/FeriaManagerTest.java.
3️. Ejecuta los tests con Alt + Shift + F6 en NetBeans

# 5️⃣ Ejemplo de Salida en Consola
Al ejecutar el programa, se mostrará una salida similar a esta:

✅ Empresa agregada: Empresa {ID=1, Nombre='UmbrellaCorp', Sector='Tecnología', Email='contacto@techcorp.com'}
✅ Empresa agregada: Empresa {ID=2, Nombre='HealthCare', Sector='Salud', Email='info@healthplus.com'}
✅ Stand agregado: Stand {ID=1, Número=101, Ubicación='Pabellón A', Tamaño='Grande', Empresa ID=1}
✅ Visitante agregado: Visitante {ID=1, Nombre='Juan Pérez', Identificación='12345678', Email='juanperez@email.com'}
✅ Visita registrada: Juan Pérez visitó el Stand 101 el 2025-02-14
✅ Comentario: "Muy buen stand" ⭐⭐⭐⭐⭐

📌 Empresas Registradas:
1 - UmbrellaCorp (Tecnología)
2 - HealthPlus (Salud)

📌 Stands Registrados:
101 - Pabellón A (Grande) - Empresa: TechCorp

📌 Visitantes Registrados:
1 - Juan Pérez (12345678)

# --------------------------------- . . . ---------------------------------
