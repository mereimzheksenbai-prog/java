package lab10;

public class tap9 {
}
public class Task9 extends JFrame {
    int x = 0;
    public Task9() {
        Timer t = new Timer(20, e -> {
            x += 3;
            if (x > getWidth()) x = 0;
            repaint();
        });
        t.start();
        setSize(500, 300);
        setVisible(true);
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, 100, 40, 40);
    }
    public static void main(String[] args) { new Task9(); }
}