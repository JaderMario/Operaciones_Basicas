public class Operaciones {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Imprimiendo operaciones básicas por consola
        System.out.println("\nImprimiendo operaciones básicas por consola:");
        System.out.println(2.67 + 4.23);
        System.out.println(6.34/2.72);
        System.out.println(6.34*2.72);
        System.out.println(Math.pow(6, 2));     // Potenciación 6 ^ 2
        System.out.println(Math.pow(6.35, 2.4));
        System.out.println(Math.sqrt(64));      // Raíz cuadrada
        System.out.println(27 % 4);             //  a % b es la operción modulo, devuelve el residuo de diviir a entre b
        
        //Operadores de incremento y decremento
        /*
        System.out.println(\nOperadores de incremento y decremento:);
        int a = 4;
        System.out.println(a);    // Imprime el valor de a
        a++;                      // Incrementa en 1 el valor de a
        System.out.println(a);    // Imprime el valor de a+1, es decir 4 + 1 = 5
        System.out.println(++a);  // Imprime el valor de a+1, es decir 5 + 1 = 6
        System.out.println(a++);  // Imprime el valor actual de a, es decir, 6
        System.out.println(a);    // Imprime el valor de a+1, es decir 6 + 1 = 7
        a--;                      //  Decrementa en 1 el valor de a
        System.out.println(a);    // Imprime el valor actual de a, es decir, 6
        System.out.println(--a);  // Imprime el valor de a-1, es decir 6 - 1 = 5
        */
        
        // Operdores de comparación
        System.out.println("\nOperdores de comparación: ");
        // Ejemplo 1
        int b = 8, c = 19;
        if (b > c){
            System.out.println("Verdadero");
        } else{
            System.out.println("Falso");
        } 

        //Ejemplo 2 : Operador condicional
        System.out.println("\nOperdor condicional: ");
        int m = 8;
        int n = m == 4 ? m + 5: 6 - m;   // Pregunta si m = 4, si sí imprime 13 8 (8+5); si no, imprime -2 (6-8)
        int p = 5 <= m ? m/2: 2*m;      
        System.out.println(m);
        System.out.println(n);
        System.out.println(p);

        




    }
}
