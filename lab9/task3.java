

class MathUtils {
    static int square(int n) {
        return n * n;
    }

    static int cube(int n) {
        return n * n * n;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Square: " + MathUtils.square(4));
        System.out.println("Cube: " + MathUtils.cube(3));
    }
}
