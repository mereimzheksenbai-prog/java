package lab10;

public class tap6 {
}
public class Task6 extends JFrame {
    int x, y;
    public Task6() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                x = e.getX(); y = e.getY();
                repaint();
            }
        });
        setSize(400, 400);
        setVisible(true);
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x-2, y-2, 5, 5);
        g.drawString("(" + x + "," + y + ")", x, y);
    }
    public static void main(String[] args) { new Task6(); }
}