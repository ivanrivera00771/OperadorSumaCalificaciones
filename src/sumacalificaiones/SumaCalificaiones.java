
package sumacalificaiones;

import java.awt.BorderLayout;
import java.util.Scanner;


public class SumaCalificaiones {

    
    public static void main(String[] args) {
        
        double primero,segundo, part, Exfinal, total;
        
        Scanner entrada = new Scanner(System.in);
       
        
        System.out.println("INTRODUCE LA NOTA DE LA PARTICIPACION SOBRE 10pts");
        part = entrada.nextDouble();
        
        System.out.println("INTRODUCE LA NOTA DEL PRIMER PARCIAL SOBRE 25 pts");
        primero = entrada.nextDouble();
        
        System.out.println("INTRODUCE LA NOTA DEL SEGUNDO PARCIAL SOBRE 25 pts");
        segundo = entrada.nextDouble();
        
        
        System.out.println("INTRODUCE LA NOTA DEL EXAMEN FINAL SOBRE 40 pts");
        Exfinal = entrada.nextDouble();
        
        part= 0.10* part;
        primero=0.25* primero;
        segundo = 0.25* segundo;
        Exfinal = 0.40*Exfinal;
              
        
        total = part+primero+segundo+Exfinal;
        
        System.out.println("LA CALIFICACION TOTAL DEL ALUMNO ES  " +total);
        
        
        
        
        
       
    }
    
}
