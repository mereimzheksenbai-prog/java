package lab10;

public class tap1 {
}

public class Task1 extends JFrame {
    public Task1() {
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        // Тіктөртбұрыш
        g.drawRect(50, 60, 100, 50);
        g.drawString("Тіктөртбұрыш", 50, 55);
        // Шеңбер
        g.drawOval(200, 60, 50, 50);
        g.drawString("Шеңбер", 200, 55);
        // Сызық
        g.drawLine(50, 180, 250, 180);
        g.drawString("Сызық", 50, 175);
    }
    public static void main(String[] args) { new Task1(); }
}