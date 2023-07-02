
import java.util.Scanner;

public class CalculadoraIVA {

    public static void main(String args[]) {
        
        Scanner entrada = new Scanner( System.in);
        float monto_sin_iva;
        float monto_con_iva;
        
        // Atajo: sout + tabulador
        System.out.print("\n\t Escribe un monto sin IVA: $");
        monto_sin_iva = entrada.nextFloat();
        entrada.nextLine(); // Cierre de línea
        
        monto_con_iva = monto_sin_iva*1.16f;
        
        // %f es un código de formato para presenta float
        System.out.printf("\n\t El monto con IVA es: $%.2f",monto_con_iva);
        
        entrada.close();
        
    }
}
