# Vera_Nahuel_tpFinal

Aplicacion Web en cual se pueden hacer alta bajas y modificaciones de reservas

## Wamp 
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

## TENER EN CUENTA 	:loudspeaker:

nota IMPORTANTE, tenia problemas al compilar el Ppersistence.xml,
tuve que cambiar  el value del driver a este:
"com.mysql.cj.jdbc.Driver"

############ en el Documento de supuestos se encuentran cosas a tener en cuenta en cuanto a su funcionamiento.
