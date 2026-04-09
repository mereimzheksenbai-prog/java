package lab10;

public class  tap2 {
}
public class Task2 extends JFrame {
    public Task2() {
        JButton btn = new JButton("Бас мені");
        JLabel label = new JLabel("");

        btn.addActionListener(e -> label.setText("Hello Java"));

        setLayout(new FlowLayout());
        add(btn); add(label);
        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String[] args) { new Task2(); }
}