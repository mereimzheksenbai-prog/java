package lab10;

public class tap8 {
}
public class Task8 extends JFrame {
    public Task8() {
        JTextField n1 = new JTextField(5);
        JTextField n2 = new JTextField(5);
        JButton plus = new JButton("+");
        JLabel res = new JLabel("Result");

        plus.addActionListener(e -> {
            double sum = Double.parseDouble(n1.getText()) + Double.parseDouble(n2.getText());
            res.setText("Нәтиже: " + sum);
        });

        setLayout(new FlowLayout());
        add(n1); add(n2); add(plus); add(res);
        setSize(300, 150);
        setVisible(true);
    }
    public static void main(String[] args) { new Task8(); }
}