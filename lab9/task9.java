
class Computer {
    class Processor {
        void showSpeed() {
            System.out.println("Процессор жиілігі: 3.5 GHz");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer();
        Computer.Processor p = comp.new Processor();
        p.showSpeed();
    }
}
