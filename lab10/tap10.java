package lab10;

public class tap10 {
}
public class Task10 extends JFrame {
    JCheckBox r = new JCheckBox("Red"), g1 = new JCheckBox("Green"), b = new JCheckBox("Blue");
    public Task10() {
        setLayout(new FlowLayout());
        add(r); add(g1); add(b);

        ActionListener l = e -> repaint();
        r.addActionListener(l); g1.addActionListener(l); b.addActionListener(l);

        setSize(300, 300);
        setVisible(true);
    }
    public void paint(Graphics g) {
        super.paint(g);
        if (r.isSelected()) g.setColor(Color.RED);
        else if (g1.isSelected()) g.setColor(Color.GREEN);
        else if (b.isSelected()) g.setColor(Color.BLUE);
        g.fillRect(100, 100, 100, 100);
    }
    public static void main(String[] args) { new Task10(); }
}