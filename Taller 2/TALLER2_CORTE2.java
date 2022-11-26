//Elaborado por Camilo Hernandez, Grupo E192, TALLER 2 - CORTE 2
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class TALLER2_CORTE2 {
    public static void main (String[]args)
    {int Menu;
        DecimalFormat formato = new DecimalFormat("#.0000");
        do{Menu=Integer.parseInt(JOptionPane.showInputDialog("TALLER_2 Seleccione el ejercicio:\n\n1. Ejercicio; Convertir Km/h ->m/s.\n2. Ejercicio; Volumen de la esfera.\n3. Ejercicio; Míltiplo de 10.\n4. Ejercicio; División.(No permite 0)\n5. Ejercicio; Días del mes.\n6. Ejercicio; Numeros del 100 al 1, con do-while. (Consola)\n7. Ejercicio con 3 versiones(submenu)\n0. Para finalizar",0));
            switch(Menu){
// Ejercicio 1
                case 1:    //Declarar varables.
                double Km,Metros;
                Km=Double.parseDouble(JOptionPane.showInputDialog("Escriba la velocidad en Km/h"));
                //Simplificando la expresión: 1000(m)/3600(s) = 5/18
                Metros=(Km*5/18);
                JOptionPane.showMessageDialog(null, "Velocidad: "+formato.format(Metros)+" m/s", "Convertidor: ", JOptionPane.INFORMATION_MESSAGE);
                break;

//Ejercicio 2               
                case 2:  //Declarar varables.
                double r,v; 
                //Aplico un Formato.
                r=Double.parseDouble(JOptionPane.showInputDialog("Escriba el radio de la esfera en m (metros)"));
                v = (4*Math.PI*Math.pow(r,3))/3;
                JOptionPane.showMessageDialog(null, "Volumen de la Esfera : "+formato.format(v)+" m^3", "Calculador: ", JOptionPane.INFORMATION_MESSAGE);
                break;

//Ejercicio 3      
                case 3:  //Declarar varables.
                int N;String M; 
                N=Integer.parseInt(JOptionPane.showInputDialog("Introduzca primer número: ",0));
                    if(N%10==0)
                        M="Es Múltiplo de 10";
                        else{
                            M="No es Múltiplo de 10";
                        }
                    JOptionPane.showMessageDialog(null, "Valor Entero : "+N+"\n "+M,"Ejercicio3", JOptionPane.INFORMATION_MESSAGE);
                break;

//Ejercicio 4      
                case 4: //Declarar varables.
                //No se hace restricción de decimales, para mostrar el resultado total.
                int N1, N2;
                N1=0;N2=0;
                 while(N1==0){
                 N1=Integer.parseInt(JOptionPane.showInputDialog("Digite el Primer valor",0));
                 }    
                 while(N2==0){
                 N2=Integer.parseInt(JOptionPane.showInputDialog("Digite el Segundo Valor",0));    
                 }
                 JOptionPane.showMessageDialog(null,"División: "+N1+" / "+N2+" = "+(double)N1/N2+"\n"+N1+" / "+N2+" = "+N1/N2+"  Residuo = "+N1%N2,"Ejercicio4",JOptionPane.INFORMATION_MESSAGE);  
                break;

//Ejercicio 5      
                case 5:
                int M1;String MES;MES=null;
                M1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de Mes: (1-12)",0));
                while(M1<1||M1>12){
                JOptionPane.showMessageDialog(null,"Mes incorrecto, fuera de rango.\n Rango permitido : 1 - 12 ","Ejercicio5",JOptionPane.ERROR_MESSAGE);
                M1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de valido Mes",M1));
                }
                switch(M1){
                    case 1:MES="Enero";JOptionPane.showMessageDialog(null,"Mes seleccionado : "+MES,"Ejercicio 5",JOptionPane.INFORMATION_MESSAGE);break;
                    case 2:MES="Febrero";JOptionPane.showMessageDialog(null,"Mes seleccionado : "+MES,"Ejecicio 5",JOptionPane.INFORMATION_MESSAGE);break;
                    case 3:MES="Marzo";JOptionPane.showMessageDialog(null,"Mes seleccionado : "+MES,"Ejercicio 5",JOptionPane.INFORMATION_MESSAGE);break;
                    case 4:MES="Abril";JOptionPane.showMessageDialog(null,"Mes seleccionado : "+MES,"Ejercicio 5",JOptionPane.INFORMATION_MESSAGE);break;
                    case 5:MES="Mayo";JOptionPane.showMessageDialog(null,"Mes seleccionado : "+MES,"Ejercicio 5",JOptionPane.INFORMATION_MESSAGE);break;
                    case 6:MES="Junio";JOptionPane.showMessageDialog(null,"Mes seleccionado : "+MES,"Ejercicio 5",JOptionPane.INFORMATION_MESSAGE);break;
                    case 7:MES="Julio";JOptionPane.showMessageDialog(null,"Mes seleccionado : "+MES,"Ejercicio 5",JOptionPane.INFORMATION_MESSAGE);break;
                    case 8:MES="Agosto";JOptionPane.showMessageDialog(null,"Mes seleccionado : "+MES,"Ejercicio 5",JOptionPane.INFORMATION_MESSAGE);break;
                    case 9:MES="Septiembre";JOptionPane.showMessageDialog(null,"Mes seleccionado : "+MES,"Ejercicio 5",JOptionPane.INFORMATION_MESSAGE);break;        
                    case 10:MES="Octubre";JOptionPane.showMessageDialog(null,"Mes seleccionado : "+MES,"Ejercicio 5",JOptionPane.INFORMATION_MESSAGE);break;
                    case 11:MES="Noviembre";JOptionPane.showMessageDialog(null,"Mes seleccionado : "+MES,"Ejercicio 5",JOptionPane.INFORMATION_MESSAGE);break;
                    case 12:MES="Diciembre";JOptionPane.showMessageDialog(null,"Mes seleccionado : "+MES,"Ejercicio 5",JOptionPane.INFORMATION_MESSAGE);break;
                }
                if(M1==4||M1==6|| M1==9|| M1==11)
                    JOptionPane.showMessageDialog(null,MES+", es un con de 30 días.","Ejercicio 5",JOptionPane.INFORMATION_MESSAGE);
                else 
                    if(M1==2)
                    JOptionPane.showMessageDialog(null,MES+", es un mes con 28 días.","Ejercicio 5",JOptionPane.INFORMATION_MESSAGE);
                        else
                        JOptionPane.showMessageDialog(null,MES+", es un mes con 31 días.","Ejercicio 5",JOptionPane.INFORMATION_MESSAGE);
                break;
    
//Ejercicio 6                      
                case 6:
                int i;i=100;
                while(i>0){
                    System.out.println(i--);}
                break;

//Ejercicio 7
                case 7:
                int D, R, N3;String R1, Positivo_Negativo, Par_Impar;
                D=Integer.parseInt(JOptionPane.showInputDialog("Punto 7 digite la version :\n1. Version While\n2. Version do-while 0/1\n3. Version do-while S/N."));
                switch(D){
                    case 1:
                        R=1;
                        //While
                        while(R!=0){
                        N3=Integer.parseInt(JOptionPane.showInputDialog("Digite un número :",0));
                        if(N3>0)
                            Positivo_Negativo=" es positivo y";
                                else
                                 Positivo_Negativo=" es  negativo y";
                        if(N3%2==0)
                            Par_Impar=" es par.";
                                else
                                Par_Impar=" es impar.";
                        JOptionPane.showMessageDialog(null,"El numero : "+N3+Positivo_Negativo+Par_Impar,"Ejercicio 7 While",JOptionPane.INFORMATION_MESSAGE);
                        R=Integer.parseInt(JOptionPane.showInputDialog("Digite cualquier número para reintentar(1-10) \n0. (cero) para finalizar.",0));
                    }
                    break;
                    case 2:
                        //Do-While
                        do {N3=Integer.parseInt(JOptionPane.showInputDialog("Digite un número : ",0));
                        if(N3>0)
                        Positivo_Negativo=" es positivo y";
                            else
                             Positivo_Negativo=" es  negativo y";
                        if(N3%2==0)
                            Par_Impar=" es par.";
                                else
                                Par_Impar=" es impar.";
                        JOptionPane.showMessageDialog(null,"El numero : "+N3+Positivo_Negativo+Par_Impar,"Ejercicio 7 do-While",JOptionPane.INFORMATION_MESSAGE);
                        R=Integer.parseInt(JOptionPane.showInputDialog("Digite cualquier número para reintentar(1-10) \n0. (cero) para finalizar.",0));
                    } while (R!=0);
                    break;
                    case 3:
                        do{N3=Integer.parseInt(JOptionPane.showInputDialog("Digite un número : ",0));
                        if(N3>0)
                        Positivo_Negativo=" es positivo y";
                            else
                             Positivo_Negativo=" es  negativo y";
                        if(N3%2==0)
                            Par_Impar=" es par.";
                                else
                                Par_Impar=" es impar.";
                        JOptionPane.showMessageDialog(null,"El numero : "+N3+Positivo_Negativo+Par_Impar,"Ejercicio 7 do-While S/N.",JOptionPane.INFORMATION_MESSAGE);
                        R1=JOptionPane.showInputDialog("Desea reintentar S/N - s/n.","N");
                        }while(R1.equals("S") || R1.equals("s"));
                    break;
                }
                break;
            }
        }while(Menu!=0);
    }
}
