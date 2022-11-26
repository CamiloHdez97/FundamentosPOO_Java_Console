import java.util.Scanner;
public class Taller_Punto2{
    //Elaborado por: Camilo Hernandez - Grupo: E192  Fundamentos de POO
     public static void main(String []args){
        int X,Y;
        double M,N;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un valor entero para X:");
        X=entrada.nextInt();
        System.out.println("Ingrese un valor entero para Y:");
        Y=entrada.nextInt();
        System.out.println("Ingrese un valor entero o decimal separado por (,) coma, para M:");
        M=entrada.nextDouble();
        System.out.println("Ingrese un valor entero o decimal separado por (,) coma, para N:");
		N=entrada.nextDouble();
        System.out.println("Variable X = "+X+"\nVariable Y = "+Y+"\nVariable M = "+M+"\nVariable N = "+N);
        //La suma X + Y
        int Suma=X+Y; System.out.println(X+" + "+Y+" = "+Suma);      
        //La diferencia X – Y
        int Diferencia=X-Y; System.out.println(X+" - "+Y+" = "+Diferencia);      
        //El producto X * Y
        int Producto=X*Y; System.out.println(X+" * "+Y+" = "+Producto);      
        //El cociente X / Y
        System.out.println(X+" / "+Y+" = "+(double)(X/Y));       
        //El resto X % Y
        int Resto=X%Y; System.out.println(X+" % "+Y+" = "+Resto);  
        //La suma N + M
        double Suma2=N+M; System.out.println(N+" + "+M+" = "+Suma2);       
        //La diferencia N – M
        double Diferencia2=N-M; System.out.println(N+" - "+M+" = "+Diferencia2);       
        //El producto N * M
        double Producto2=N*M; System.out.println(N+" * "+M+" = "+Producto2);       
        //El cociente N / M
        double Cociente2=N/M; System.out.println(N+" / "+M+" = "+Cociente2);      
        //El resto N % M
        double Resto2=N%M; System.out.println(N+" % "+M+" = "+Resto2);      
        //La suma X + N
        System.out.println(X+" + "+N+" = "+(double)(X+N));    
        //El cociente Y / M
        System.out.println(Y+" / "+M+" = "+(double)(Y/M));      
        //El resto Y % M
        System.out.println(Y+" % "+M+" = "+(double)(Y%M));
        //El doble de cada variable
        System.out.println("Variable X = "+X+" El doble es "+2*X);System.out.println("Variable Y = "+Y+" El doble es "+2*Y);
        System.out.println("Variable M = "+M+" El doble es "+2*M);System.out.println("Variable N = "+N+" El doble es "+2*N);       
        //La suma de todas las variables
        System.out.println(X+" + "+Y+" + "+M+" + "+N+" = "+(double)(X+Y+M+N));        
       //El producto de todas las variables
        System.out.println(X+" + "+Y+" + "+M+" + "+N+" = "+(double)(X*Y*M*N));
     }    
}
