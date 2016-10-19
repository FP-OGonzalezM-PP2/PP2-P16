/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p16;
import java.util.*;
/**
 *
 * @author Osvaldo
 */
public class PP2P16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c,d;
        //Con un solo metodo puedo obtener las 3 variables
        a = pedirNumero();    
        b = pedirNumero();
        c = pedirNumero();
        d = calcular(a,b,c);
        //Me es más facil usar variables con letras en orden de abecedario
        Mostrar(d);
    }
    public static int pedirNumero(){
        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba una cantidad");
        return n = entrada.nextInt();
    }
    public static int calcular (int a, int b, int c){
        int d=0;
        //Para que a sea la mayor tiene que ser mayor que las otras 2 variables
        if(a>b && a>c){
            d = a;
        }else if(b>a && b>c){
            d = b;
        }else if(c>a && c>b)
            d = c;
        //Si se cumple alguna de las condiciones se guarda en una cuarta variable para regresarla al main
        return d;
    }
    public static void Mostrar(int d){
        System.out.println("El número más alto de los 3 es " +d);
    }
}
