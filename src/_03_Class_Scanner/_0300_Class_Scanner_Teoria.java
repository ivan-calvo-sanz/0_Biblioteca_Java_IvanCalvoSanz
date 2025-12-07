package _03_Class_Scanner;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0300_Class_Scanner_Teoria {

    // 
    // CONCEPTOS BASICOS CLASE Scanner
    // 
    public static void main(String[] args) {

       
        Scanner sn = new Scanner(System.in); // creamos el objeto   scanner.
        sn.useLocale(Locale.US); //recomendado para cuando se piden valores decimales
        sn.useDelimiter("\n"); // recomendao cuando se piden cadenas con espacios
        

        // METODOS CLASE Scanner
        // .next()                                  (return String)
        System.out.println("Introduce una cadena: ");
        String cadena=sn.next();
        System.out.println("La cadena introducida es: "+cadena);
        
        // .nextInt()                               (return char)       Introducimos un valor entero.
        System.out.println("Introduce un valor entero: ");
        int num = sn .nextInt();

        // .nextDouble()                            (return double)     Scans the next token of the input as a double
        System.out.println("Introduce un valor decimal: ");
        double decimal=sn.nextDouble();
        
        // .nextFloat()                             (return float)      Scans the next token of the input as a float
        
        // .useDelimiter(Pattern pattern)           (return)            Sets this scanner's delimiting pattern to the specified pattern
    }

}
