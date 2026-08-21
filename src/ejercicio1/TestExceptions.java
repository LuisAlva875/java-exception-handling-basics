package ejercicio1;

public class TestExceptions {

    public static void main(String[] args) {
        boolean huboError = false;

        try {
            // Evaluamos si el arreglo está vacío antes de recorrer
            if (args.length == 0) {
                throw new IllegalArgumentException("No se pasaron argumentos.");
            }

            // Bucle controlado por el tamaño del arreglo
            for (int i = 0; i < args.length; i++) {
                System.out.println("args[" + i + "] is '" + args[i] + "'");
            }
        } catch (Exception e) {
            huboError = true;
        } finally {
            if (huboError) {
                System.out.println("Termino anormal");
            } else {
                System.out.println("Termino normal");
            }
        }
    }
}