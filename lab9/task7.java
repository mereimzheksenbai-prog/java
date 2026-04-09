package lab9;

public class task7 {
}

class Outer {
    class Inner {
        void showMessage() {
            System.out.println("Бұл ішкі класс мысалы!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.showMessage();
    }
}
