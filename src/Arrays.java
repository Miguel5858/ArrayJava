
import java.util.Scanner;



/**
 *
 * @author I N T R I A G O
 */
public class Arrays {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        
        int precios [] = new int [3];
        
        for(int i=0; i<precios.length; i++){
            System.out.println("Dame el precio: ");
            precios [i] = sc.nextInt();
            
            
        }
        System.out.println("----------------------------- ");
        System.out.println("Resultado números ingresados ");
        System.out.println("----------------------------- ");
        
        for(int i=0; i<precios.length; i++){
            System.out.println(precios[i]);
            
        }
  
    }
    
}
