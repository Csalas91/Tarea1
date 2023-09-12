/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglobuscarmasgrande;
import java.util.Scanner;
/**
 *
 * @author Cesar Salas
 */
public class Arreglobuscarmasgrande {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Recibe un arreglo de double y muestre el numero mas grande");
        int cantidad;
        Scanner scan=new Scanner(System.in);
        System.out.println("Digite la cantidad de numeros");
        cantidad=Integer.parseInt(scan.nextLine());
        double[]numeros=new double[cantidad];
        for(int i=0;i<numeros.length;i++){
            System.out.println("Digite el numero: ");
            numeros[i]=Double.parseDouble(scan.nextLine());
        }
        //double masgrande=Double.NEGATIVE_INFINITY;
       // double maspequeño=Double.POSITIVE_INFINITY;
        double masgrande=0;
        double maspequeño=10000000;
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]>masgrande){
                masgrande=numeros[i];
            }
            if(numeros[i]<maspequeño){
                maspequeño=numeros[i];
            }
        }
        System.out.println("El numero mas grande es: "+masgrande);
        System.out.println("El numero mas pequeño es: "+maspequeño);
        System.out.println("Digite el numero a buscar: ");
        double numerobuscar=Double.parseDouble(scan.nextLine());
        int posicion=1;
        for( int i=0;i<numeros.length;i++){
            if(numeros[i]==numerobuscar){
                posicion=i;
            }
           
        }
        if(posicion==-1){
            System.out.println("El numero no esta.");
    }
        else{
            System.out.println("El numero que busco esta en la casilla "+posicion);
            System.out.println("El valor de la casilla es "+numeros[posicion]);
        }
    
}
    
    
}
