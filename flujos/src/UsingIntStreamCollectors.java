import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UsingIntStreamCollectors {
    public static void main(String[] args) {
        String fuente[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        //mostramos cada uno de los elementos de la fuente en pantalla
        // valores pares mostrados en orden
        // muestra los valores originales
        System.out.printf("Valores originales: %s%n", Arrays.asList(fuente));

        System.out.println("");
        System.out.println("------------------------------------------------");

        // ordena los valores en forma ascendente con flujos. Notar que Collector trabaja con Integer más no con int
        System.out.printf("Valores ordenados: %s%n", Arrays.stream(fuente).sorted().collect(Collectors.toList()));

        System.out.println("");
        System.out.println("------------------------------------------------");
// cadenas en mayúscula
        System.out.printf("Cadenas en mayuscula usando map: %s%n",
                Arrays.stream(fuente)
                        .map(String::toUpperCase)
                        .collect(Collectors.toList()));


    }
}
