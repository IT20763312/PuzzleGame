import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Scoreboard extends JFrame {

    private JPanel scoreboard;
    private JLabel level1clicks;
    private JLabel level2clicks;
    private JLabel level3clicks;
    private JLabel level4clicks;
    private JLabel level5clicks;
    private JLabel level6clicks;
    private JLabel level1time;
    private JLabel level2time;
    private JLabel level3time;
    private JLabel level4time;
    private JLabel level5time;
    private JLabel level6time;
    private JButton sendScoresToMailButton;
    private JButton backButton;
    private JButton showInAChartButton;

    int l1clicks;
    int l2clicks;
    int l3clicks;
    int l4clicks;
    int l5clicks;
    int l6clicks;
    int l1time;
    int l2time;
    int l3time;
    int l4time;
    int l5time;
    int l6time;

    public Scoreboard(){
        setContentPane(scoreboard);
        setTitle("Scoreboard");
        setSize(600,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation( 450,10);

        Level1Scores();
        Level2Scores();
        Level3Scores();
        Level4Scores();
        Level5Scores();
        Level6Scores();

        sendScoresToMailButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String[] to = {User.email};
                String from = "gamepuzzle38";
                String pass = "PuzzleGame12345,.";
                String subject = "Scores Of Your Puzzle Game";

                SendingMails mail = new SendingMails();

                mail.email(to,from,pass,subject,l1clicks,l1time,l2clicks,l2time,l3clicks,l3time,l4clicks,l4time,l5clicks,l5time,l6clicks,l6time);

                JOptionPane.showMessageDialog(Scoreboard.this,"E mail sent Successfully !!");

            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LevelChooser levelChooser = new LevelChooser();
                dispose();
                levelChooser.show();
            }
        });

        showInAChartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Chart chart = new Chart(l1clicks,l2clicks,l3clicks,l4clicks,l5clicks,l6clicks,l1time,l2time,l3time,l4time,l5time,l6time);
                dispose();
                chart.show();

            }
        });
    }

    public Level level;
    public void Level1Scores(){

        Level level = null;
        int userID = User.userid;

        final String DB_URL = "jdbc:mysql://localhost/puzzlegamedb";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try{
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...

            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM level1details WHERE userID=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, userID);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                level = new Level();
                level.id = resultSet.getInt("userID");
                level.status = resultSet.getString("status");
                level.clicks = resultSet.getInt("clicks");
                level.time = resultSet.getInt("time");

                level1clicks.setText(String.valueOf(Level.clicks));
                level1time.setText(String.valueOf(Level.time));

                l1clicks = resultSet.getInt("clicks");
                l1time = resultSet.getInt("time");

            }

            stmt.close();
            conn.close();

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public void Level2Scores(){

        Level level = null;
        int userID = User.userid;

        final String DB_URL = "jdbc:mysql://localhost/puzzlegamedb";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try{
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...

            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM level2details WHERE userID=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, userID);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                level = new Level();
                level.id = resultSet.getInt("userID");
                level.status = resultSet.getString("status");
                level.clicks = resultSet.getInt("clicks");
                level.time = resultSet.getInt("time");

                level2clicks.setText(String.valueOf(Level.clicks));
                level2time.setText(String.valueOf(Level.time));

                l2clicks = resultSet.getInt("clicks");
                l2time = resultSet.getInt("time");

            }

            stmt.close();
            conn.close();

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public void Level3Scores(){

        Level level = null;
        int userID = User.userid;

        final String DB_URL = "jdbc:mysql://localhost/puzzlegamedb";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try{
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...

            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM level3details WHERE userID=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, userID);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                level = new Level();
                level.id = resultSet.getInt("userID");
                level.status = resultSet.getString("status");
                level.clicks = resultSet.getInt("clicks");
                level.time = resultSet.getInt("time");

                level3clicks.setText(String.valueOf(Level.clicks));
                level3time.setText(String.valueOf(Level.time));

                l3clicks = resultSet.getInt("clicks");
                l3time = resultSet.getInt("time");

            }

            stmt.close();
            conn.close();

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public void Level4Scores(){

        Level level = null;
        int userID = User.userid;

        final String DB_URL = "jdbc:mysql://localhost/puzzlegamedb";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try{
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...

            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM level4details WHERE userID=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, userID);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                level = new Level();
                level.id = resultSet.getInt("userID");
                level.status = resultSet.getString("status");
                level.clicks = resultSet.getInt("clicks");
                level.time = resultSet.getInt("time");

                level4clicks.setText(String.valueOf(Level.clicks));
                level4time.setText(String.valueOf(Level.time));

                l4clicks = resultSet.getInt("clicks");
                l4time = resultSet.getInt("time");

            }

            stmt.close();
            conn.close();

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public void Level5Scores(){

        Level level = null;
        int userID = User.userid;

        final String DB_URL = "jdbc:mysql://localhost/puzzlegamedb";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try{
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...

            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM level5details WHERE userID=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, userID);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                level = new Level();
                level.id = resultSet.getInt("userID");
                level.status = resultSet.getString("status");
                level.clicks = resultSet.getInt("clicks");
                level.time = resultSet.getInt("time");

                level5clicks.setText(String.valueOf(Level.clicks));
                level5time.setText(String.valueOf(Level.time));

                l5clicks = resultSet.getInt("clicks");
                l5time = resultSet.getInt("time");

            }

            stmt.close();
            conn.close();

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public void Level6Scores(){

        Level level = null;
        int userID = User.userid;

        final String DB_URL = "jdbc:mysql://localhost/puzzlegamedb";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try{
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...

            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM level6details WHERE userID=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, userID);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                level = new Level();
                level.id = resultSet.getInt("userID");
                level.status = resultSet.getString("status");
                level.clicks = resultSet.getInt("clicks");
                level.time = resultSet.getInt("time");

                level6clicks.setText(String.valueOf(Level.clicks));
                level6time.setText(String.valueOf(Level.time));

                l6clicks = resultSet.getInt("clicks");
                l6time = resultSet.getInt("time");

            }

            stmt.close();
            conn.close();

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args){
        Scoreboard scoreboard = new Scoreboard();
    }
}
