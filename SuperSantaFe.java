import java.util.Scanner;
import java.lang.Math;
/**
 * Programa de resultado de ventas y comisiones trabajador en un supermercado
 * 
 * @author Jose Sotelo - Juan León 
 */
public class SuperSantaFe

{
    public static void main(String args[])
    {
       int precioVenta;
       int metodoPago;
       int salir = 1;
       int preguntaVenta = 1;
       int contador = 1;
       int totalVentas = 0;
       
       int ventaEfectivo=0;
       double porcentajeEfectivo=0;
       double PorcentajeTotalEfectivo=0;
       int contadorEfectivo = 0;
       
       int ventaTarjeta=0;
       double porcentajeTarjeta=0;
       double PorcentajeTotalTarjeta=0;
       int contadorTarjeta = 0;
       
       int ventaCuotas=0;
       double porcentajeCuotas=0;
       double PorcentajeTotalCuotas=0;
       int contadorCuotas = 0;
       
       Scanner lector=new Scanner(System.in);
              
       System.out.println("Supermercado Santa Fe --- Facturación ---Contabilidad"); 
       
       
       do{
        
       System.out.println("Seleccione valor de la venta " + contador + " :"); 
       precioVenta = lector.nextInt();
       totalVentas = totalVentas + precioVenta; 
              
       do {
           System.out.println("Seleccione el medio de pago: ");
           System.out.println("1. Efectivo");
           System.out.println("2. Tarjeta");
           System.out.println("3. Plan Cuotas");
           System.out.println("Ingrese su opción: ");
           metodoPago = lector.nextInt();
           if (metodoPago == 1)
               {
               System.out.println("opción de pago seleccionado es efectivo");
               
               ventaEfectivo = ventaEfectivo + precioVenta;
               porcentajeEfectivo = precioVenta * 5 / 100;
               PorcentajeTotalEfectivo = PorcentajeTotalEfectivo + porcentajeEfectivo;
               contadorEfectivo++; 
               
               break;
               }
            else if(metodoPago == 2)
               {
               System.out.println("opción de pago seleccionado es tarjeta");
               
               ventaTarjeta = ventaTarjeta + precioVenta;
               porcentajeTarjeta = precioVenta * 3 / 100;
               PorcentajeTotalTarjeta = PorcentajeTotalTarjeta + porcentajeTarjeta;
               contadorTarjeta++; 
               
               break; 
               }
           else if(metodoPago == 3)
               {
               System.out.println("opcion de pago seleccionado escuotas");
               
               ventaCuotas = ventaCuotas + precioVenta;
               porcentajeCuotas = precioVenta * 2 / 100;
               PorcentajeTotalCuotas = PorcentajeTotalCuotas + porcentajeCuotas;
               contadorCuotas++; 
               
               break;    
               }
           else
               {
                System.out.println("Esta opción no es valida");
                
               }           
           }
           
       while (salir == 1);
           contador++;
           System.out.println("Venta registrada");
           System.out.println("--------------------------------------------" );
           System.out.println("continuar con el registro de otra venta?");
           System.out.println("1. Si");
           System.out.println("2. No");
           preguntaVenta = lector.nextInt();
           
           
        }
        while (preguntaVenta==1);
        
        System.out.println("ventas Totales: " + (contador - 1) + " ventas");
        System.out.println("Valor total Ventas: $" + totalVentas + " pesos");
        System.out.println("total Ventas en Efectivo: $" + ventaEfectivo + " pesos");
        System.out.println("Cantidad de ventas en Efectivo: " + contadorEfectivo + " ventas");
        System.out.println("Valor total Ventas con Tarjeta: $" + ventaTarjeta + " pesos");
        System.out.println("Cantidad de ventas con Tarjeta: " + contadorTarjeta + " ventas");
        System.out.println("Ventas a Cuotas costo total: $" + ventaCuotas + " pesos");
        System.out.println("Cantidad de ventas a Cuotas: " + contadorCuotas + " ventas");
        System.out.println("--------------------------------------------" );
        System.out.println("la venta realizada por el vendedor fue de $" + PorcentajeTotalEfectivo + " ventas en efectivo en pesos $" + 
        PorcentajeTotalTarjeta + " pesos por ventas con tarjetas $" + PorcentajeTotalCuotas + " pesos por ventas a cuotas");
        
    }
}

