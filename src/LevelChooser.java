import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class LevelChooser extends JFrame {
    private JButton level1Button;
    private JButton level2Button;
    private JButton level3Button;
    private JButton level4Button;
    private JButton level5Button;
    private JButton level6Button;
    private JButton scoreboardButton;
    private JPanel LevelChooser;
    private JButton switchToAnotherAccountButton;

    public LevelChooser(){
        setContentPane(LevelChooser);
        setTitle("Level Chooser");
        setSize(600,450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation( 450,10);

        level1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Level1 level1 = new Level1();
                dispose();
                level1.show();
            }
        });
        level2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                status = level1StatusChecker();

                if (status != null) {
                    Level2 level2 = new Level2();
                    dispose();
                    level2.show();

                }
                else {
                    JOptionPane.showMessageDialog(LevelChooser.this,
                            "Please complete Level 1",
                            "Please Complete",
                            JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        level3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                status = level2StatusChecker();

                if (status != null) {
                    Level3 level3 = new Level3();
                    dispose();
                    level3.show();

                }
                else {
                    JOptionPane.showMessageDialog(LevelChooser.this,
                            "Please complete Level 2",
                            "Please Complete",
                            JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        level4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                status = level3StatusChecker();

                if (status != null) {
                    Level4 level4 = new Level4();
                    dispose();
                    level4.show();

                }
                else {
                    JOptionPane.showMessageDialog(LevelChooser.this,
                            "Please complete Level 3",
                            "Please Complete",
                            JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        level5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                status = level4StatusChecker();

                if (status != null) {
                    Level5 level5 = new Level5();
                    dispose();
                    level5.show();

                }
                else {
                    JOptionPane.showMessageDialog(LevelChooser.this,
                            "Please complete Level 4",
                            "Please Complete",
                            JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        level6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                status = level5StatusChecker();

                if (status != null) {
                    Level6 level6 = new Level6();
                    dispose();
                    level6.show();

                }
                else {
                    JOptionPane.showMessageDialog(LevelChooser.this,
                            "Please complete Level 5",
                            "Please Complete",
                            JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        scoreboardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Scoreboard scoreboard = new Scoreboard();
                dispose();
                scoreboard.show();
            }
        });
        switchToAnotherAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginForm loginForm = new LoginForm();
                dispose();
                loginForm.show();
            }
        });
    }

    public Status status;

    private Status level1StatusChecker(){
        Status status = null;

        int userID = User.userid;
        String levelstatus = "Completed";

        final String DB_URL = "jdbc:mysql://localhost/puzzlegamedb";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try{
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...

            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM level1details WHERE userID=? AND status=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, userID);
            preparedStatement.setString(2, levelstatus);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                status = new Status();
                status.userID = resultSet.getInt("userID");
                status.status = resultSet.getString("status");
            }

            stmt.close();
            conn.close();

        }catch(Exception e){
            e.printStackTrace();
        }


        return status;
    }

    private Status level2StatusChecker(){
        Status status = null;

        int userID = User.userid;
        String levelstatus = "Completed";

        final String DB_URL = "jdbc:mysql://localhost/puzzlegamedb";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try{
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...

            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM level2details WHERE userID=? AND status=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, userID);
            preparedStatement.setString(2, levelstatus);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                status = new Status();
                status.userID = resultSet.getInt("userID");
                status.status = resultSet.getString("status");
            }

            stmt.close();
            conn.close();

        }catch(Exception e){
            e.printStackTrace();
        }


        return status;
    }

    private Status level3StatusChecker(){
        Status status = null;

        int userID = User.userid;
        String levelstatus = "Completed";

        final String DB_URL = "jdbc:mysql://localhost/puzzlegamedb";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try{
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...

            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM level3details WHERE userID=? AND status=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, userID);
            preparedStatement.setString(2, levelstatus);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                status = new Status();
                status.userID = resultSet.getInt("userID");
                status.status = resultSet.getString("status");
            }

            stmt.close();
            conn.close();

        }catch(Exception e){
            e.printStackTrace();
        }


        return status;
    }

    private Status level4StatusChecker(){
        Status status = null;

        int userID = User.userid;
        String levelstatus = "Completed";

        final String DB_URL = "jdbc:mysql://localhost/puzzlegamedb";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try{
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...

            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM level4details WHERE userID=? AND status=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, userID);
            preparedStatement.setString(2, levelstatus);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                status = new Status();
                status.userID = resultSet.getInt("userID");
                status.status = resultSet.getString("status");
            }

            stmt.close();
            conn.close();

        }catch(Exception e){
            e.printStackTrace();
        }


        return status;
    }

    private Status level5StatusChecker(){
        Status status = null;

        int userID = User.userid;
        String levelstatus = "Completed";

        final String DB_URL = "jdbc:mysql://localhost/puzzlegamedb";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try{
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...

            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM level5details WHERE userID=? AND status=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, userID);
            preparedStatement.setString(2, levelstatus);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                status = new Status();
                status.userID = resultSet.getInt("userID");
                status.status = resultSet.getString("status");
            }

            stmt.close();
            conn.close();

        }catch(Exception e){
            e.printStackTrace();
        }


        return status;
    }

    public static void main(String[] args){
        LevelChooser levelchooser = new LevelChooser();
    }
}
