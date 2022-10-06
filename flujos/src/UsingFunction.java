import java.util.function.Function;

public class UsingFunction {
    private static Function <String,String>convMayuscula = x -> x.toString().toUpperCase();
    private static Function <Integer, Integer>getProducto = x -> x * x;

    public static void main(String[] args) {
        System.out.println("Funcion convMayuscula: " + convMayuscula.apply("hola"));
        System.out.println("Funcion getProducto: " + getProducto.apply(5));

    }
}
