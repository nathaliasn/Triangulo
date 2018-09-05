import java.util.Scanner;

public class triangulo
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        
        int a,
            b,
            c; 

        System.out.print("Informe o valor do lado a?"); 
        a = input.nextInt();

        System.out.print("Informe o valor do lado b?"); 
        b= input.nextInt();

        System.out.print("Informe o valor do lado c?"); 
        c= input.nextInt();
        
        if(a < (b + c) && b < (a + c) && c < (a + b)){
            
            if(a != b && a != c){
            System.out.print("\n\t \u00c9 um tri\u00e2ngulo escaleno\n\t");
            }
            if(a == b && a == c) {
            System.out.print ("\n\t \u00c9 um tri\u00e2ngulo equil\u00e1tero\n\t");
            }
            if((a == b && a != c) || (a != b && a == c) || (b != c && b == a)) {
            System.out.print("\n\t \u00c9 um tri\u00e2ngulo is\u00f3sceles\n\t");
            }
        }else {
        System.out.print("Os valores s\u00e3o inv\u00e1lidos para formar um tri\u00e2ngulo");
        }
    }
}
    
 