# Vera Nahuel tpFinal

#### Aplicacion Web
Con sistema de Login.
En cual se pueden hacer alta bajas y modificaciones de reservas de huespedes, chekear si tienen una habitacion asignada y a nombre de quien esta.

## Wamp
pagina de descarga de [WAMP](https://www.wampserver.com/en/#download-wrapper).

Correr el Wamp configurando el puerto correctamentamente de MySql y la config en la aplicaion Java
WAMP actúa como un servidor virtual en tu computadora (WampServer). Permite probar todas las funciones de WordPress sin ninguna consecuencia, ya que está ubicado en tu máquina y no está conectado a la web.

Este mismo pondra ON la Base de datos MySql de phpMyAdmin, a la cual se accede entrando en localhost.
(Puede tambien levantarse con Xampp pero no lo configure para eso).

## BD
#### Config de la BASE DE DATOS

- Usuario: hotel
- Contraseña: 123
- bd: hotel_tp
- Url: jdbc:mysql://localhost:3308/tpo2int?serverTimezone=UTC
- puerto:3308

(Tener en cuenta que El Timezone dependera de donde usted viva, en mi Caso Argentina)

## XML
#### Conexion entre la BD y la aplicacion

[.XML](https://github.com/Nahuel-Vera/Vera_Nahuel_tpFinal/blob/main/src/conf/persistence.xml)

Este archivo contiene las configuraciones de la BD para la buena conexion de la aplicacion con la BD.

Aqui se ingresaran el usuario de la Base de datos

- el password de la Base de datos
- el driver que se este utilizando
- la zona horaria
- entre otras cosas que la aplicacion necesita para la buena comunicacion con la BD.

## TENER EN CUENTA 	:loudspeaker:

nota IMPORTANTE, tenia problemas al compilar el Ppersistence.xml,
tuve que cambiar  el value del driver a este:
"com.mysql.cj.jdbc.Driver"

##### en el Documento de [Supuestos.txt](https://github.com/Nahuel-Vera/Vera_Nahuel_tpFinal/blob/main/Supuestos.txt) se encuentran cosas a tener en cuenta en cuanto a su funcionamiento.


[Diagrama UML de como deberia quedar la BDA](https://github.com/Nahuel-Vera/Vera_Nahuel_tpFinal/blob/main/DiagramaFinalUml(VeraNahuel).PNG)

