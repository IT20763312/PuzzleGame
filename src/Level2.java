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

public class Level2 extends JFrame {
    private JPanel Mainlevel2;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a1Button;
    private JLabel lblNoOfClicks;
    private JButton resetButton;
    private JButton solutionButton;
    private JLabel lblTimer;
    private JButton a4Button;
    private JButton a10Button;
    private JButton a11Button;
    private JButton a12Button;
    private JButton a13Button;
    private JButton a14Button;
    private JButton a15Button;
    private JButton a16Button;
    private JButton homeButton;

    int counter;
    int time;

    public Level2(){
        setContentPane(Mainlevel2);
        setTitle("Level2");
        setSize(600,450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Shuffle();
        Timer();
        setVisible(true);
        setLocation( 450,10);


        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a1Button,a2Button);
                EmptySpotChecker(a1Button,a5Button);
                SolutionChecker();
            }
        });


        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a2Button,a1Button);
                EmptySpotChecker(a2Button,a3Button);
                EmptySpotChecker(a2Button,a6Button);
                SolutionChecker();
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a3Button,a2Button);
                EmptySpotChecker(a3Button,a4Button);
                EmptySpotChecker(a3Button,a7Button);
                SolutionChecker();
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a4Button,a3Button);
                EmptySpotChecker(a4Button,a8Button);
                SolutionChecker();
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a5Button,a1Button);
                EmptySpotChecker(a5Button,a6Button);
                EmptySpotChecker(a5Button,a9Button);
                SolutionChecker();
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a6Button,a2Button);
                EmptySpotChecker(a6Button,a5Button);
                EmptySpotChecker(a6Button,a7Button);
                EmptySpotChecker(a6Button,a10Button);
                SolutionChecker();
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a7Button,a3Button);
                EmptySpotChecker(a7Button,a6Button);
                EmptySpotChecker(a7Button,a8Button);
                EmptySpotChecker(a7Button,a11Button);
                SolutionChecker();
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a8Button,a4Button);
                EmptySpotChecker(a8Button,a7Button);
                EmptySpotChecker(a8Button,a12Button);
                SolutionChecker();
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a9Button,a5Button);
                EmptySpotChecker(a9Button,a10Button);
                EmptySpotChecker(a9Button,a13Button);
                SolutionChecker();
            }
        });

        a10Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a10Button,a6Button);
                EmptySpotChecker(a10Button,a9Button);
                EmptySpotChecker(a10Button,a11Button);
                EmptySpotChecker(a10Button,a14Button);
                SolutionChecker();
            }
        });
        a11Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a11Button,a7Button);
                EmptySpotChecker(a11Button,a10Button);
                EmptySpotChecker(a11Button,a12Button);
                EmptySpotChecker(a11Button,a15Button);
                SolutionChecker();
            }
        });
        a12Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a12Button,a8Button);
                EmptySpotChecker(a12Button,a11Button);
                EmptySpotChecker(a12Button,a16Button);
                SolutionChecker();
            }
        });
        a13Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a13Button,a9Button);
                EmptySpotChecker(a13Button,a14Button);
                SolutionChecker();
            }
        });
        a14Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a14Button,a10Button);
                EmptySpotChecker(a14Button,a13Button);
                EmptySpotChecker(a14Button,a15Button);
                SolutionChecker();
            }
        });
        a15Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a15Button,a11Button);
                EmptySpotChecker(a15Button,a14Button);
                EmptySpotChecker(a15Button,a16Button);
                SolutionChecker();
            }
        });
        a16Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a16Button,a12Button);
                EmptySpotChecker(a16Button,a15Button);
                SolutionChecker();
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
                a9Button.setText("9");
                a10Button.setText("10");
                a11Button.setText("11");
                a12Button.setText("12");
                a13Button.setText("13");
                a14Button.setText("14");
                a15Button.setText("15");
                a16Button.setText("");

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
        Integer[] intArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
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
        a9Button.setText(Integer.toString(intArray[8]));
        a10Button.setText(Integer.toString(intArray[9]));
        a11Button.setText(Integer.toString(intArray[10]));
        a12Button.setText(Integer.toString(intArray[11]));
        a13Button.setText(Integer.toString(intArray[12]));
        a14Button.setText(Integer.toString(intArray[13]));
        a15Button.setText(Integer.toString(intArray[14]));
        a16Button.setText("");

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
        String b9 = a9Button.getText();
        String b10 = a10Button.getText();
        String b11 = a11Button.getText();
        String b12 = a12Button.getText();
        String b13 = a13Button.getText();
        String b14 = a14Button.getText();
        String b15 = a15Button.getText();

        if(b1 == "1" && b2 == "2" && b3 == "3" && b4 == "4" && b5 == "5" && b6 == "6" && b7 == "7" && b8 == "8" && b9 == "9" && b10 == "10" && b11 == "11" && b12 == "12" && b13 == "13" && b14 == "14" && b15 == "15")
        {
            Database(User.userid,time,counter);
            JOptionPane.showMessageDialog(this,"You win the Level 2","Puzzle Game",JOptionPane.INFORMATION_MESSAGE);
            Level3 level3 = new Level3();
            dispose();
            level3.show();
        }
        counter = counter + 1;
        lblNoOfClicks.setText(Integer.toString(counter));

    }

    public void Timer(){
        java.util.Timer timer = new Timer();

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
            String sql = "INSERT INTO level2details (userID, time, clicks, status) " +
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

        Level2 two = new Level2();
    }
}
