import java.util.stream.IntStream;

public class Comparación {
    /*Crear un vecto de tipo int para 10 valores
    Mostra la sumatoria, la cantidad, los que mayores o iguales a 4
mostrr promedio
     */

    public static void main(String[] args) {
        int fuente[] = {4, 5, 74, 52, 14, 95, 8};
        int sum = 0;
        for (int i = 0; i < fuente.length; i++) {
            sum += fuente[i];
        }
        System.out.println("La sumatoria es: " + sum);
        System.out.println("La cantidad de elementos en la fuente es: " + fuente.length);
        double prom=sum/fuente.length;
        System.out.println("El promedio es: " + prom);

        System.out.printf("La sumatoria es: %d%n", IntStream.of(fuente).sum());
        System.out.println("");
        System.out.printf("La cantidad de elementos en la fuente es %d", IntStream.of(fuente).count());
        System.out.println("");
        System.out.printf("El promedio es: %.2f%n", IntStream.of(fuente).average().getAsDouble());


    }
}
