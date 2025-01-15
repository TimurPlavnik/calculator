import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import javax.swing.*;

public class App extends JFrame{
    private JTextField textField1;
    private JButton seven;
    private JButton m_plus;
    private JButton m_recall;
    private JButton eight;
    private JButton m_clear;
    private JButton nine;
    private JButton del;
    private JButton clear_screen;
    private JButton four;
    private JButton one;
    private JButton zero;
    private JButton plus;
    private JButton factorial;
    private JButton point;
    private JButton result;
    private JButton divide;
    private JButton square;
    private JButton minus;
    private JButton logariphm;
    private JButton cube;
    private JButton six;
    private JButton five;
    private JButton two;
    private JButton three;
    private JButton root;
    private JButton power;
    private JButton multiplie;
    private JPanel panel;
    private double memory = 0;
    private double number_1;
    private double number_2;
    private double answer;
    private String action;

    public App(){
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText() + one.getText();
                textField1.setText(number);
            }
        });

        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText() + two.getText();
                textField1.setText(number);
            }
        });

        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText() + three.getText();
                textField1.setText(number);
            }
        });

        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText() + four.getText();
                textField1.setText(number);
            }
        });

        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText() + five.getText();
                textField1.setText(number);
            }
        });

        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText() + six.getText();
                textField1.setText(number);
            }
        });

        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText() + seven.getText();
                textField1.setText(number);
            }
        });

        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText() + eight.getText();
                textField1.setText(number);
            }
        });

        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText() + nine.getText();
                textField1.setText(number);
            }
        });

        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText() + zero.getText();
                textField1.setText(number);
            }
        });

        point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText() + point.getText();
                textField1.setText(number);
            }
        });
        del.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder str_b = new StringBuilder(textField1.getText());
                if (textField1.getText().length()>0) {
                    str_b.deleteCharAt(textField1.getText().length() - 1);
                    String str = str_b.toString();
                    textField1.setText(str);
                }
            }
        });
        m_plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                memory += Double.parseDouble(textField1.getText());
            }
        });

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number_1 = Double.parseDouble(textField1.getText());
                textField1.setText("");
                action = "+";
            }
        });
        m_recall.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(Double.toString(memory));
            }
        });
        m_clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                memory = 0;
            }
        });
        clear_screen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number_1 = Double.parseDouble(textField1.getText());
                textField1.setText("");
                action = "-";
            }
        });
        multiplie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number_1 = Double.parseDouble(textField1.getText());
                textField1.setText("");
                action = "*";
            }
        });
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number_1 = Double.parseDouble(textField1.getText());
                textField1.setText("");
                action = "/";
            }
        });
        square.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number_1 = Double.parseDouble(textField1.getText());
                answer = Math.pow(number_1, 2);
                textField1.setText(Double.toString(answer));
            }
        });
        cube.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number_1 = Double.parseDouble(textField1.getText());
                answer = Math.pow(number_1, 3);
                textField1.setText(Double.toString(answer));
            }
        });
        power.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number_1 = Double.parseDouble(textField1.getText());
                textField1.setText("");
                number_2 = Double.parseDouble(textField1.getText());
                answer = Math.pow(number_1, number_2);
                textField1.setText(Double.toString(answer));
            }
        });
        root.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number_1 = Double.parseDouble(textField1.getText());
                answer = Math.sqrt(number_1);
                textField1.setText(Double.toString(answer));
            }
        });
        factorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number_1 = Double.parseDouble(textField1.getText());
                answer = 1;
                for (int i = 1; i <= number_1; i++) {
                    answer *= i;
                }
                textField1.setText(Double.toString(answer));
            }
        });


        logariphm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number_1 = Double.parseDouble(textField1.getText());
                answer = Math.log(number_1);
                textField1.setText(Double.toString(answer));
            }
        });


        result.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Objects.equals(textField1.getText(), "")) {
                    number_2 = 0;
                } else {
                    number_2 = Double.parseDouble(textField1.getText());
                }
                switch (action) {
                    case "+" -> {
                        answer = number_1 + number_2;
                        textField1.setText(Double.toString(answer));
                    }
                    case "-" -> {
                        answer = number_1 - number_2;
                        textField1.setText(Double.toString(answer));
                    }
                    case "*" -> {
                        answer = number_1 * number_2;
                        textField1.setText(Double.toString(answer));
                    }
                    case "/" -> {
                        if (number_2 == 0) {
                            textField1.setText("Can not divide by 0");
                        } else {
                            answer = number_1 / number_2;
                            textField1.setText(Double.toString(answer));
                        }
                    }

                }
            }
        });
    }


    public static void main(String[] args) throws Exception {
        new App();
    }
}
