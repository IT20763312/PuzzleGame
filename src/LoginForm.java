import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class LoginForm extends JFrame {
    private JTextField tfEmail;
    private JPasswordField pfPassword;
    private JButton btnOK;
    private JButton btnCancel;
    private JPanel loginPanel;
    private JButton donTHaveAnButton;

    public LoginForm() {

        setTitle("Login");
        setContentPane(loginPanel);
        setMinimumSize(new Dimension(600, 474));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setLocation( 450,10);


        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = tfEmail.getText();
                String password = String.valueOf(pfPassword.getPassword());

                user = getAuthenticatedUser(email, password);

                if (user != null) {
                    LevelChooser levelchooser = new LevelChooser();
                    dispose();
                    levelchooser.show();

                }
                else {
                    JOptionPane.showMessageDialog(LoginForm.this,
                            "Email or Password Invalid",
                            "Try again",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        donTHaveAnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistrationForm registrationForm = new RegistrationForm();
                dispose();
                registrationForm.show();
            }
        });
    }

    public User user;


    private User getAuthenticatedUser(String email, String password) {
        User user = null;

        final String DB_URL = "jdbc:mysql://localhost/puzzlegamedb";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try{
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...

            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM users WHERE email=? AND PASSWORD=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                user = new User();
                user.userid = resultSet.getInt("userID");
                user.name = resultSet.getString("name");
                user.email = resultSet.getString("email");
                user.password = resultSet.getString("PASSWORD");
            }

            stmt.close();
            conn.close();

        }catch(Exception e){
            e.printStackTrace();
        }


        return user;
    }

    public static void main(String[] args) {
        LoginForm loginForm = new LoginForm();
        User user = loginForm.user;
        if (user != null) {
            System.out.println("Successful Authentication of: " + user.name);
            System.out.println("          Email: " + user.email);

        }
        else {
            System.out.println("Authentication canceled");
        }
    }
}
