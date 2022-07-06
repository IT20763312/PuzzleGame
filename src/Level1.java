import javax.swing.*;
import javax.swing.JButton;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Level1 extends JFrame {
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JPanel Mainlevel1;
    private JLabel lblNoOfClicks;
    private JButton solutionButton;
    private JButton resetButton;
    private JLabel lblTimer;
    private JButton homeButton;

    int counter;
    int time;

    public Level1(){
        setContentPane(Mainlevel1);
        setTitle("Level1");
        setSize(600,450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Shuffle();
        Timer();
        setVisible(true);
        setLocation( 450,10);

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SolutionChecker();
                EmptySpotChecker(a1Button,a2Button);
                EmptySpotChecker(a1Button,a4Button);

            }
        });


        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SolutionChecker();
                EmptySpotChecker(a2Button,a1Button);
                EmptySpotChecker(a2Button,a3Button);
                EmptySpotChecker(a2Button,a5Button);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SolutionChecker();
                EmptySpotChecker(a3Button,a2Button);
                EmptySpotChecker(a3Button,a6Button);
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SolutionChecker();
                EmptySpotChecker(a4Button,a1Button);
                EmptySpotChecker(a4Button,a5Button);
                EmptySpotChecker(a4Button,a7Button);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SolutionChecker();
                EmptySpotChecker(a5Button,a2Button);
                EmptySpotChecker(a5Button,a4Button);
                EmptySpotChecker(a5Button,a6Button);
                EmptySpotChecker(a5Button,a8Button);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SolutionChecker();
                EmptySpotChecker(a6Button,a3Button);
                EmptySpotChecker(a6Button,a5Button);
                EmptySpotChecker(a6Button,a9Button);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SolutionChecker();
                EmptySpotChecker(a7Button,a4Button);
                EmptySpotChecker(a7Button,a8Button);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SolutionChecker();
                EmptySpotChecker(a8Button,a5Button);
                EmptySpotChecker(a8Button,a7Button);
                EmptySpotChecker(a8Button,a9Button);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SolutionChecker();
                EmptySpotChecker(a9Button,a6Button);
                EmptySpotChecker(a9Button,a8Button);
            }
        });


        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter = 0;
                time = 0;
                Shuffle();
            }
        });

        solutionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a1Button.setText("1");
                a2Button.setText("2");
                a3Button.setText("3");
                a4Button.setText("4");
                a5Button.setText("5");
                a6Button.setText("6");
                a7Button.setText("7");
                a8Button.setText("8");
                a9Button.setText("");

            }
        });
        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LevelChooser levelChooser = new LevelChooser();
                levelChooser.show();
                dispose();
            }
        });
    }

    void EmptySpotChecker(JButton Butt1,JButton Butt2)
    {
        String ShuffleNumber = Butt2.getText();

        if(ShuffleNumber == "")
        {
            Butt2.setText(Butt1.getText());
            Butt1.setText("");
        }

    }

    public void Shuffle()
    {
        Integer[] intArray = {1,2,3,4,5,6,7,8};
        List<Integer> intList = Arrays.asList(intArray);
        Collections.shuffle(intList);
        intList.toArray(intArray);

        a1Button.setText(Integer.toString(intArray[0]));
        a2Button.setText(Integer.toString(intArray[1]));
        a3Button.setText(Integer.toString(intArray[2]));
        a4Button.setText(Integer.toString(intArray[3]));
        a5Button.setText(Integer.toString(intArray[4]));
        a6Button.setText(Integer.toString(intArray[5]));
        a7Button.setText(Integer.toString(intArray[6]));
        a8Button.setText(Integer.toString(intArray[7]));
        a9Button.setText("");

    }

    public void SolutionChecker()
    {
        String b1 = a1Button.getText();
        String b2 = a2Button.getText();
        String b3 = a3Button.getText();
        String b4 = a4Button.getText();
        String b5 = a5Button.getText();
        String b6 = a6Button.getText();
        String b7 = a7Button.getText();
        String b8 = a8Button.getText();

        if(b1 == "1" && b2 == "2" && b3 == "3" && b4 == "4" && b5 == "5" && b6 == "6" && b7 == "7" && b8 == "8")
        {
            Database(User.userid,time,counter);
            JOptionPane.showMessageDialog(this,"You win the Level 1","Puzzle Game",JOptionPane.INFORMATION_MESSAGE);
            Level2 level2 = new Level2();
            dispose();
            level2.show();
        }
        counter = counter + 1;
        lblNoOfClicks.setText(Integer.toString(counter));

    }

    public void Timer(){
        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {
                lblTimer.setText(Integer.toString(time));
                time++;

            }
        },0,1000);
    }

    public Level level;
    public void Database(int id,int time,int clicks){
        Level level = null;
        String status = "Completed";
        final String DB_URL = "jdbc:mysql://localhost/puzzlegamedb";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try{
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...

            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO level1details (userID, time, clicks, status) " +
                    "VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.setInt(2, time);
            preparedStatement.setInt(3, clicks);
            preparedStatement.setString(4, status);

           // Insert row into the table
           int addedRows = preparedStatement.executeUpdate();
           if (addedRows > 0) {
               level = new Level();
               level.id = id;
             level.time = time;
                level.clicks = clicks;
                level.status = status;
           }

            stmt.close();
            conn.close();
            dispose();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){

        Level1 one = new Level1();

    }
}
