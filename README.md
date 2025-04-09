S1.07. Annotations

📄 Descripción:
Nivel 1
- Ejercicio 1
Crea una jerarquía de objetos con tres clases: Trabajador, TrabajadorOnline y TrabajadorPresencial.

La clase Trabajador tiene los atributos nombre, apellido, precio/hora, y el método calcularSou() que recibe por parámetro el número de horas trabajadas y lo multiplica por el precio/hora. Las clases hijas deben sobreescribirla, empleando @Override.

Desde el main() de la clase Principal, haz las invocaciones necesarias para demostrar el funcionamiento de la anotación @Override.

En los trabajadores presenciales, el método para calcular su sueldo, recibirá por parámetro el número de horas trabajadas al mes. A la hora de calcular el sueldo se multiplicará el número de horas trabajadas por el precio/hora, más el valor de un atributo static llamado gasolina que añadiremos en esta clase.

En los trabajadores online, el método para calcular su sueldo recibirá por parámetro el número de horas trabajadas al mes. A la hora de calcular el sueldo se multiplicará el número de horas trabajadas por el precio/hora y se le sumará el precio de la tarifa plana de Internet, que será una constante de la clase TrabajadorOnline.

- Ejercicio 2
Añade a las clases hijas algunos métodos obsoletos (deprecated), y utiliza la anotación correspondiente. Invoca desde una clase externa los métodos obsoletos, suprimiendo mediante la anotación correspondiente los "warnings" para ser obsoletos.

💻 Tecnologías Utilizadas
Java 

📋 Requisitos

IDE eclipse o intellj 

🛠️ Instalación

Clona este repositorio: -> git clone https://github.com/rioacosta/S1.07.Annotations
cd S1.07.Annotations

▶️ Ejecución

Instala las dependencias.

🌐 Despliegue

Sube los archivos del proyecto al IDE.

🤝 Contribuciones

Las contribuciones son bienvenidas! Por favor, sigue los siguientes pasos para contribuir:
Has un fork del repositorio Crea una nueva rama git checkout -b feature/*NovaFuncionalitat has tus cambios y commiteja'*ls: git commit -m 'Añade Nueva Funcionalidad' Sube los cambios a tu rama: git push origin feature/*NovaFuncionalitat has un pull request About S1.07. Annotations