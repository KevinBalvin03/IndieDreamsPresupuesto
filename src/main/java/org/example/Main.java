package org.example;


import java.text.DecimalFormat;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fechaPresupuesto = localDateTime.format(formatter);

        DecimalFormat decimalFormat = new DecimalFormat("0.000");
        //Entradas

        String nombreVideojuego, jefeProyecto, plataformaVJ,motorDesarrollo;
        int horasProyecto;
        double costoPorHora, valorLicencias, gastosAdicionales,
                costoTotalHoras, subtotalInicial, costoImprevistos,
                costoAdministracion, costoTotalProyecto;

        System.out.println("\n\u001B[34mVamos a planificar el presupuesto de un nuevo video juego.");
        System.out.println("\nse calculara los costos totales del desarrollo, contemplando, no solo los gastos fijos, " +
                "\nsino tambien algunos porcentajes adicionales que afectan el presupuesto");

        System.out.println("\nPara realizar el presupuesto necesitamos ingresar la siguiente informacion: ");

        System.out.print("\nNombre del videojuego: ");
        nombreVideojuego = scanner.nextLine();
        System.out.print("Nombre del jefe del proyecto: ");
        jefeProyecto = scanner.nextLine();
        System.out.print("Plataforma de desarrollo (PC, Consola, Móvil, etc.): ");
        plataformaVJ = scanner.nextLine();
        System.out.print("Motor de desarrollo: (Unity, Unreal, Godot, etc.): ");
        motorDesarrollo = scanner.nextLine();

        System.out.print("Cantidad de horas estimadas para el proyecto: ");
        horasProyecto = scanner.nextInt();
        System.out.print("Costo por hora de desarrollo: ");
        costoPorHora = scanner.nextDouble();
        System.out.print("Valor total de las licencias de software necesarias: ");
        valorLicencias = scanner.nextDouble();
        System.out.print("Gastos adicionales (publicidad, música, diseño gráfico, etc.): ");
        gastosAdicionales = scanner.nextDouble();

        // Cálculos
        costoTotalHoras = horasProyecto * costoPorHora;
        subtotalInicial = costoTotalHoras + valorLicencias + gastosAdicionales;
        costoAdministracion = subtotalInicial * 0.05F;
        costoImprevistos = subtotalInicial * 0.10F;
        costoTotalProyecto = subtotalInicial + costoAdministracion + costoImprevistos;

        // Salidas
        System.out.println("\n-----------------------------");
        System.out.println("\n\u001B[97mResumen del Presupuesto:");
        System.out.println("\n-Nombre del videojuego: " + nombreVideojuego);
        System.out.println("-Jefe de Proyecto: " + jefeProyecto);
        System.out.println("Fecha de generación del presupuesto: " + fechaPresupuesto);
        System.out.println("-Plataforma: " + plataformaVJ);
        System.out.println("-Motor de desarrollo: " + motorDesarrollo);
        System.out.println("-Costo por horas de desarrollo: $" + decimalFormat.format(costoPorHora));
        System.out.println("(teniendo en cuenta que seran " + horasProyecto + " a un valor de " + costoPorHora + ")");
        System.out.println("-Subtotal inicial: " + decimalFormat.format(subtotalInicial));
        System.out.println("(lo anterior teniendo en cuenta el valor total de las horas, las licencias del software y los gastos iniciales.)");
        System.out.println("-Valor de honorarios administrativos: " + decimalFormat.format(costoAdministracion));
        System.out.println("-Valor por imprevistos: " + decimalFormat.format(costoImprevistos));
        System.out.println("-----------------------------");
        System.out.println("Costo total estimado del proyecto: $" + decimalFormat.format(costoTotalProyecto));

    }
}
