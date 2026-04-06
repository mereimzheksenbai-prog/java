package lab10;

public class tap7 {
}
public class Task7 extends JFrame {
    String msg = "";
    public Task7() {
        addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                msg = "Басылған символ: " + e.getKeyChar();
                repaint();
            }
        });
        setSize(300, 200);
        setVisible(true);
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(msg, 100, 100);
    }
    public static void main(String[] args) { new Task7(); }
}