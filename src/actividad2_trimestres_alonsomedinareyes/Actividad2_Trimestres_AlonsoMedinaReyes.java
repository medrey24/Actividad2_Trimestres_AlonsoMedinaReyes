/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2_trimestres_alonsomedinareyes;
import java.util.Scanner;
/**
 *
 * @author acs
 */
public class Actividad2_Trimestres_AlonsoMedinaReyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner numMes = new Scanner(System.in);
    int num = 0;

    System.out.println("Ingrese un número del 1 al 12, considerando cada uno como un mes del año: ");
    num = numMes.nextInt();
        
     if (num >0 && num <=12) {
         
         switch (num){
            case 1,2,3:
            System.out.println("Nos encontramos en el Primer trimestre");
            break;   
            case 4,5,6:
            System.out.println("Nos encontramos en el Segundo trimestre");
            break;
            case 7,8,9:
            System.out.println("Nos encontramos en el Tercer trimestre");
            break;   
            case 10,11,12:
            System.out.println("Nos encontramos en el Cuarto trimestre");
            break;
        }
    
    }else{
        System.out.println("¡Error!");    
        System.out.println("Favor de ingresar un número del 1 al 12");
    }
    }
}
