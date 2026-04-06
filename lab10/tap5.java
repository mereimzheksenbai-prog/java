package lab10;

public class tap5 {
}
public class Task5 extends JFrame {
    int x = 100, y = 100;
    public Task5() {
        JTextField tx = new JTextField(5);
        JTextField ty = new JTextField(5);
        JButton btn = new JButton("Орналастыру");

        btn.addActionListener(e -> {
            x = Integer.parseInt(tx.getText());
            y = Integer.parseInt(ty.getText());
            repaint();
        });

        setLayout(new FlowLayout());
        add(new JLabel("X:")); add(tx);
        add(new JLabel("Y:")); add(ty); add(btn);
        setSize(500, 500);
        setVisible(true);
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(x, y, 50, 50);
    }
    public static void main(String[] args) { new Task5(); }
}