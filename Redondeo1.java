import java.text.DecimalFormat;               // Se importa esta libreriá para usar el método DecimalFormat

public class Redondeo1 {
    public static void main(String arg[]) throws Exception {

        /*Ejemplos usando printf 
        Si queremos mostrar el número 12.369856 de tipo double con dos decimales:

        System.out.printf("%.2f %n", 12.369856);

        El primer % indica que en esa posición se va a escribir un valor. El valor a escribir se encuentra a continuación
        de las comillas.
        .2 indica el número de decimales.
        La f indica que el número es de tipo float o double.
        %n indica un salto de línea. Equivale a \n. Con printf podemos usar ambos para hacer un salto de línea.*/
        
        System.out.println(12.369856);              // imprime el número sin redondear
        System.out.printf("%.1f%n",12.369856);      // imprime el número con 1 cifra decimal
        System.out.printf("%.2f%n",12.369856);      // imprime el número con 2 cifras decimales
        System.out.printf("%.3f%n",12.369856);      // imprime el número con 3 cifras decimales 
        System.out.printf("%.4f%n",12.369856);      // imprime el número con 4 cifras decimales  
        
        System.out.println();                       // Deja una línea
    
        float num1 = (float) (17.36678), num2 = 12.45679f;            // Se convierte a float los números
        
        System.out.println(num1);
        System.out.println(num2);
        System.out.printf("%.2f%n",num1);
        System.out.printf("%.2f%n",num2);
        System.out.println(num1 + num2);
        System.out.printf("%.2f%n",num1 + num2);
        System.out.println(num1 - num2);
        System.out.printf("%.2f%n", num1 - num2);
        System.out.printf("%.3f%n", num1*num2);
        System.out.printf("%.3f%n", num1/num2); 

        System.out.print("La raíz cuadrada de " + num1 + " es " + Math.sqrt(num1));    // Raíz cuadrada de num1  
        System.out.println(Math.sqrt(num1));
        System.out.printf("%.2f%n", Math.sqrt(num1));
        //float a = (float) (Math.sqrt(num1));    
        //System.out.println();
        //System.out.printf("%.2f%n", a);  
        
        /*******************************************************************************************
        *******************************************************************************************/    
        
        // Imprimir usando el método Decimal.Format
        // Hay que importar la libreria: import java.text.DecimalFormat

        System.out.println("\nImprimir usando el método Decimal.Format: \n");
        
        DecimalFormat redondeo = new DecimalFormat("#.00"); // Se crea el objeto redondeo, se hará con 2 cifras decimales
                                                            // también se puede escribir "0.00"
        System.out.println(redondeo.format(num1));
        System.out.println(redondeo.format(num2));
        System.out.println(redondeo.format(num1 + num2));
        System.out.println(redondeo.format(num1 - num2));
        System.out.println(redondeo.format(num1*num2));
        System.out.println(redondeo.format(num1/num2));
        System.out.println(redondeo.format(Math.sqrt(num1)));  // Imprime la raíz cuadrada de num1 con dos decimales
    }
}