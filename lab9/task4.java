package lab9;

public class task4 {
}

class Counter {
    static int count = 0;

    static void increment() {
        count++;
    }
}

public class Main {
    public static void main(String[] args) {
        Counter.increment();
        Counter.increment();
        System.out.println("Count: " + Counter.count);
    }
}
