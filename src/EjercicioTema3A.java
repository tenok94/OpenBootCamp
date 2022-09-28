public class EjercicioTema3A {
    public static void main(String[] args) {
        int valor1 = 20;
        int valor2 = 30;
        int valor3 = 40;

        var valorTotal = suma(valor1, valor2, valor3);

        System.out.println(valorTotal);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;

    }
}

