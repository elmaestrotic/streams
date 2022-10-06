import java.util.Arrays;
import java.util.stream.IntStream;

public class UsingIntStreamFilter {
    public static void main(String[] args) {
        int fuente[] = {3, 7, 4, 1, 5, 9};
        int array[] = {4,8,9,10,11,12,13,14,15,16,17,18,19,20};
        //mostramos cada uno de los elementos pare de la fuente en pantalla
        // valores pares mostrados en orden
        System.out.printf("%nValores impares mostrados en orden: ");
        IntStream.of(fuente).filter(x -> x % 2 != 0).sorted().forEach(x -> System.out.printf("%d |", x));

        System.out.println("");
        System.out.println("------------------------------------------------");

        //mostramos los elementos de la fuente mayores o iguales a 4
        System.out.println("Mayores o iguales a 4: ");
        IntStream.of(fuente).filter(x -> x >= 4).sorted().forEach(x -> System.out.printf(" %d  | ", x));
        System.out.println("");
        System.out.println("------------------------------------------------");


        //mostramos la suma de los elementos de la fuente que cumplan con el filtro de estar entre 1 y 5
        System.out.printf("Sumar rango entre 1  a 5, usando filter y una lambda de expresion %d%n",IntStream.of(fuente).filter(x -> x >= 1 && x<=5).sum());
        System.out.println("");
        System.out.println("------------------------------------------------");
        IntStream.range(0,fuente.length)
                .forEach(index -> System.out.println("Valor de la fuente en la posición "+ index+" -> " + fuente[index]));
        System.out.println("");
        System.out.println("-------------!--------- -----------------------");

        //mostramos la suma de los elementos de la fuente que cumplan con el filtro de estar entre 1 y 5
        System.out.printf("Sumar valores entre  posiciones  pos 2  a 5 %d%n",IntStream.of(fuente).filter(x -> x >= 1 && x<=5).sum());


        System.out.println("");
        System.out.println("-------------!--------- -----------------------");

        /*System.out.printf("Sumar valores entre  posiciones  pos 2  a 5, usando filter y una lambda de expresion %d%n",
                IntStream.range(2, 5).map((a,b) -> fuente[a],fuente[b]).sum());

        System.out.println("");*/


        //lo anterior pero usando la función range
        // suma el rango de enteros del 1 al 10, exclusivo
        System.out.printf("%nSuma de enteros del 1 al 5, inclusivo usando range: %d%n",
                IntStream.rangeClosed(0, fuente.length).sum());
        System.out.println("");
        System.out.println("------------------------------------------------");



        //mostramos la suma de los elementos de la fuente en pantalla, usando el método sum de IntStream
        System.out.printf("La suma de los elementos de la fuente es: %d%n", IntStream.of(fuente).sum());
        System.out.println("");
        System.out.println("------------------------------------------------");
        //mostramos la suma de los elementos de la fuente usando la operación terminal reduce y
        //Una lambda que implementa la interfaz funcional IntBinaryOperator
        System.out.printf("%nSuma mediante el metodo reduce: %d%n", IntStream.of(fuente).reduce(0, (a, b) -> a + b));


    }
}
