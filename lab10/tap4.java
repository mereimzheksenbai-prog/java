package lab10;

public class tap4 {
}
public class Task4 extends JFrame {
    Color color = Color.BLACK;
    public Task4() {
        JButton b1 = new JButton("Red");
        JButton b2 = new JButton("Green");
        JButton b3 = new JButton("Blue");

        b1.addActionListener(e -> { color = Color.RED; repaint(); });
        b2.addActionListener(e -> { color = Color.GREEN; repaint(); });
        b3.addActionListener(e -> { color = Color.BLUE; repaint(); });

        setLayout(new FlowLayout());
        add(b1); add(b2); add(b3);
        setSize(400, 400);
        setVisible(true);
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(color);
        g.fillOval(150, 150, 100, 100);
    }
    public static void main(String[] args) { new Task4(); }
}