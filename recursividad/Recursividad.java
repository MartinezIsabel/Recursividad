package recursividad;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Recursividad {
   
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
         int op;
         System.out.println("\nQue deseas hacer?");
         System.out.println("1.serie Fibonacci (21)");
         System.out.println("2.Numeros del 1 al 10");
         System.out.println("3.Factorial de un numero");
         System.out.println("4.Desaparece numeros");
         System.out.println("5.polindromo");
         System.out.println("6.-Salir");
         op=leer.nextInt();
         
          switch (op) {
            case 1:
              fibonacci(0,1,0);
       
            break;
            //
            case 2:
               numeros(1);     
            break;
            //
            case 3:
               factorial(12,0,0); 
       
            break;
            //
            case 4:
               desaparecer(11,0);     
            break;
            //
            case 5:
               polindromo(0,0,0);     
            break;
            //
            case 6:
                System.out.println("Seleccionaste Salir");   
            break;
            //
            default:
                    
           break;
          }
    }
    private static void fibonacci(int a,int b, int c){
        for(int i=0;i<=6;i++){
        c=a+b;
        a=b;
        b=c;
        System.out.println(""+c);
        }
    }
    private static void numeros(int a){
        if (a<=10) {
            System.out.print(a+",");
        numeros(a+1);
        }
   
    }
    private static void factorial(int a,int b,int c){

                
        if (b==0) {
            c=a-1;
            b=a*c;
            a--;
        }
        if (b!=0&&a<c&&a>0) {
           b=a*b;
        }
        if (a>0) {
            factorial(a-1,b,c);
        }else{
            System.out.println("resultado del factorial es "+b);
        }
   
    }
    private static void desaparecer(int a,int b){
        if (a>0) {
              System.out.print(b+" ");
        b++;  
        }
    
        if (b<a) {
            desaparecer(a,b);
        }
        if (a==b) {
            System.out.println("");
            desaparecer(a-1,b=0);  
  
        }
    }
    private static void polindromo(int b,int c,int con){
    String a="Hola";
    boolean v=true;
        if (c==0) {
                  c=a.length()-1; 
                  con=a.length()-1; 
        }
        if (a.charAt(b)!=a.charAt(c)) {
            System.out.println("La palabra no es polindroma");
            v=false;
        }
        if (con==b) {
            if (v==true) {
                System.out.println("La palabra es polindroma");
            }else{
                System.out.println("La palabra no polindroma");
            }
        }
        if(v==true){
            b++;
            c--;
             polindromo(b,c,con);
        }
    }
}
