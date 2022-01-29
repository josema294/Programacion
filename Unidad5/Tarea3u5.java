public class Tarea3u5 {

    // Sumar los números números naturales hasta N (se lo damos nosotros) de forma
    // recursiva.

    static int recursivesum(int n) {

        if (n > 0) {

            return n + recursivesum(n - 1);
        }

        return 0;

    }

    public static void main(String[] args) {

        System.out.println(recursivesum(6));

    }

}