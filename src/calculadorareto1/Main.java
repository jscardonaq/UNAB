
package calculadorareto1;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner Captura = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();

        System.out.println("Inicio del programa \n");
        System.out.print("Ingresar el primer numero = ");
        int numero1=Captura.nextInt();
        System.out.print("Ingresar el Segundo numero = ");
        int numero2=Captura.nextInt();
        System.out.println("Suma... "+numero1+"+"+numero2 +"="+operaciones.suma(numero1,numero2));
        
        
    }
    
}
