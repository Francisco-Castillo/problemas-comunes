package src.main.java.com.fcastillo.demo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Venta> ventas = new ArrayList<Venta>();

        ventas.add(new Venta("Enero", 1500.55, 2021));
        ventas.add(new Venta("Febrero", 2000.55, 2021));
        ventas.add(new Venta("Marzo", 3000.55, 2021));

        // Forma 1 usando reduce
        Double totalDeVentasF1 = ventas.stream().map(Venta::getTotal).reduce(0d, (x, y) -> x + y);

        // Forma 2 usando sum
        double totalDeVentasF2 = ventas.stream().mapToDouble(Venta::getTotal).sum();
        
        System.out.println("Total de ventas: " + totalDeVentasF1);
        System.out.println("Total de ventas: " + totalDeVentasF2);
    }
}
