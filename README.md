PRESUPUESTO PARA EL DESARROLLO DE UN NUEVO VIDEO JUEGO INDIEDREAMS

Este proyecto en Java permite calcular el presupuesto total estimado para el desarrollo de un videojuego, teniendo en cuenta costos fijos y porcentajes adicionales por imprevistos y administración.

El programa solicita al usuario ingresar información básica del proyecto y varios valores económicos. Luego, calcula el subtotal inicial, aplica los porcentajes correspondientes a honorarios administrativos (5%) e imprevistos (10%), y entrega un resumen detallado del costo total del proyecto.


PAQUETES NECESARIOS:

import java.text.DecimalFormat;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


ENTRADAS SOLICITADAS: 

Nombre del videojuego: nombre descriptivo del proyecto.

Jefe del proyecto: persona responsable del desarrollo.

Plataforma: plataforma objetivo (PC, consola, móvil, etc.).

Motor de desarrollo: motor utilizado (Unity, Unreal, Godot...).

Cantidad de horas estimadas: tiempo proyectado de desarrollo.

Costo por hora: tarifa por hora de trabajo.

Licencias de software: costo total de licencias necesarias.

Gastos adicionales: diseño gráfico, música, publicidad, etc.


CALCULOS 
Costo total por horas        = horasProyecto * costoPorHora
Subtotal inicial             = costoTotalHoras + licencias + gastos
Honorarios administración    = subtotalInicial * 0.05
Costo por imprevistos        = subtotalInicial * 0.10
Costo total estimado         = subtotalInicial + honorarios + imprevistos

VARIABLES Y TIPOS
nombreVideojuego	String		Texto libre ingresado por el usuario.
jefeProyecto		String		Nombre del encargado del proyecto.
plataformaVJ		String		Puede ser cualquier texto (PC, consola, etc.).
motorDesarrollo	 	String		Nombre del motor de desarrollo usado.
horasProyecto		int		Valor entero. Las horas no requieren decimales.
costoPorHora		double		Puede contener centavos o valores fraccionarios.
valorLicencias		double		Costos monetarios con decimales.
gastosAdicionales	double		Costos variables, pueden incluir decimales.
costoTotalHoras		double		Resultado del producto entre enteros y decimales.
subtotalInicial		double		Suma de costos, debe admitir decimales.
costoAdministracion	double		Porcentaje aplicado, produce decimales.
costoImprevistos	double		Otro porcentaje aplicado.
costoTotalProyecto	double		Resultado final que incluye todo lo anterior.

Las variable horasProyecto se ligio como int debido a la posible escalabilidad y continuidad del proyecto.
Se utilizó double en lugar de float por mayor precisión en cálculos financieros.
Se aplicó DecimalFormat("0.000") para asegurar que todos los valores monetarios se muestren con tres decimales exactos, uniformemente.
