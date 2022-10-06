import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

interface suma {
    int sum(int x[]);
}

public class UsingIntStream {
    public static void main(String[] args) {
        int fuente[] = {3, 1, 4, 1, 5, 9};
        //mostramos cada uno de los elemntos de la fuente en pantalla
        IntStream.of(fuente).forEach(i -> System.out.print("|" + i));
        System.out.println("");
        System.out.println("------------------------------------------------");

        //mostramos la suma de los elemntos de la fuente en pantalla, usando el método sum de IntStream
        System.out.printf("La cantidad de los elementos que hay la fuente son: %d", IntStream.of(fuente).count());
        System.out.println("");
        System.out.println("------------------------------------------------");


        //mostramos la suma de los elementos de la fuente usando una lambda de cuerpo que implmenta nuestr
        //interfaz funcional suma
        suma s = (x) -> {
            int acum = 0;
            for (int i = 0; i < fuente.length; i++) {
                acum += fuente[i];
            }
            return acum;
        };
        System.out.print("Suma de los elementos de la fuente mediante lambda de cuerpo: " + s.sum(fuente));

        System.out.println("");
        System.out.println("------------------------------------------------");
        //mostramos la suma de los elementos de la fuente en pantalla, usando el método sum de IntStream
        System.out.printf("La suma de los elementos de la fuente es: %d%n", IntStream.of(fuente).sum());
        System.out.println("");
        System.out.println("------------------------------------------------");
        //mostramos la suma de los elementos de la fuente usando la operación terminal reduce y
        //Una lambda que implementa la interfaz funcional IntBinaryOperator
        System.out.printf("%nSuma mediante el método reduce: %d%n", IntStream.of(fuente).reduce( 0,(a, b) -> a + b));

        System.out.printf("%nSuma  indices 2 y 5  con reduce: %d%n",
                IntStream.of(fuente).reduce(0, (a, b) -> fuente[2] + fuente[5]));

        System.out.println("******************************");

        //control de indeOfBoundException
        System.out.printf("La suma indices 3 y 1: %d%n" , IntStream.range(1,3+1).reduce(0,(a,b) -> b < fuente.length?(a + fuente[b]):0));
        System.out.println("****************************");
        System.out.printf("Sumar entre indices 2 y 5 con Arrays: %d%n",
                Arrays.stream(fuente,2,5).sum());






        //control de indeOfBoundException
        int indices[] = {0, 2};
        System.out.printf("Sumar entre indices 2 y 5 con Arrays: %d%n",Arrays.stream(fuente, indices[0], indices[1]).sum() + fuente[indices[1]]);


        // {3, 1, 4, 1, 5, 9}
        //  0  1  2  3  4  5  <-- indices
    }
}