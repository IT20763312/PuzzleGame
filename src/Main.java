import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JButton btnLogin;
    private JButton btnRegister;
    private JPanel MainInterface;

    public Main(){
        setContentPane(MainInterface);
        setTitle("MainInterface");
        setSize(600, 450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(450,10);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                LoginForm loginForm = new LoginForm();
                dispose();
                loginForm.show();

            }
        });

        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                RegistrationForm registrationForm = new RegistrationForm();
                dispose();
                registrationForm.show();


            }
        });
    }

    public static void main(String[] args){

        Main main = new Main();

    }
}
