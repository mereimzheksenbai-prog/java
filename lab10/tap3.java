package lab10;

public class tap3 {
}
public class Task3 extends JFrame {
    public Task3() {
        JTextField nameField = new JTextField(15);
        JButton btn = new JButton("Сәлемдесу");
        JLabel res = new JLabel("Атыңызды жазыңыз");

        btn.addActionListener(e -> res.setText("Сәлем, " + nameField.getText()));

        setLayout(new FlowLayout());
        add(nameField); add(btn); add(res);
        setSize(350, 150);
        setVisible(true);
    }
    public static void main(String[] args) { new Task3(); }
}