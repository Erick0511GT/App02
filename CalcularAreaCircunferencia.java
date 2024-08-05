import java.util.Scanner; 
 
/** 
 * Esta clase llamada CalcularAreaCircunferencia tiene como objetivo calcular el area de una circunferencia ya sea por Diametro o por Radio
 * @since 2024-07-30
 * @author Erick Hernandez
 * @version 1.0
*/
public class CalcularAreaCircunferencia {
    /**
     * El método principal que ejecuta el analisis con condicional de Diametro o Radio, para asi realizar el calculo con la formula de multiplicacion
     * o division * 3.1416 que es el valor de PI
     * 
     * @param args los argumentos no se ultlizaron en este caso 
     * */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Si desea calcular por Radio ingrese R si desea por Diametro ingrese D");
        String DoR =  scan.nextLine(); //Aqui se ingresa la letra que define si sera por diametro o Radio
        System.out.println("Ingrese el valor");
        float ValorDoR = scan.nextFloat(); // aqui se ingresa el valor DoR
        scan.close();
        float Area = 0;
        if (DoR.equalsIgnoreCase("D"))   {
            Area =  (ValorDoR /2) * (ValorDoR/2) * 3.1416f; //se utilizó "f" al final del valor de pi para definir los valores tipo float
            //esta formula sirve para calcular si la medida es Diametro
        }
        else if (DoR.equalsIgnoreCase("R"))  {
            Area = ValorDoR * ValorDoR * 3.1416f; // Esta formula sirve para calcular si el valor es Radio
        }
        else {
            System.out.println("Tipo de medida no válido. Usa 'D' para diámetro o 'R' para radio.");
            return; 
            }
        System.out.println("El area del circulo es: " + Area); // aqui imprimimos el resultado del area de la circunferencia
    }
}