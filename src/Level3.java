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

public class Level3 extends JFrame {
    private JPanel Mainlevel3;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a1Button;
    private JLabel lblNoOfClicks;
    private JButton resetButton;
    private JButton solutionButton;
    private JLabel lblTimer;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a10Button;
    private JButton a11Button;
    private JButton a12Button;
    private JButton a13Button;
    private JButton a14Button;
    private JButton a15Button;
    private JButton a16Button;
    private JButton a17Button;
    private JButton a18Button;
    private JButton a19Button;
    private JButton a20Button;
    private JButton a21Button;
    private JButton a22Button;
    private JButton a23Button;
    private JButton a24Button;
    private JButton a25Button;
    private JButton homeButton;

    int counter;
    int time;

    public Level3(){
        setContentPane(Mainlevel3);
        setTitle("Level3");
        setSize(700,550);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Shuffle();
        Timer();
        setVisible(true);
        setLocation( 450,10);


        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a1Button,a2Button);
                EmptySpotChecker(a1Button,a6Button);
                SolutionChecker();
            }
        });


        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a2Button,a1Button);
                EmptySpotChecker(a2Button,a3Button);
                EmptySpotChecker(a2Button,a7Button);
                SolutionChecker();
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a3Button,a2Button);
                EmptySpotChecker(a3Button,a4Button);
                EmptySpotChecker(a3Button,a8Button);
                SolutionChecker();
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a4Button,a3Button);
                EmptySpotChecker(a4Button,a5Button);
                EmptySpotChecker(a4Button,a9Button);
                SolutionChecker();
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a5Button,a4Button);
                EmptySpotChecker(a5Button,a10Button);
                SolutionChecker();
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a6Button,a1Button);
                EmptySpotChecker(a6Button,a7Button);
                EmptySpotChecker(a6Button,a11Button);
                SolutionChecker();
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a7Button,a2Button);
                EmptySpotChecker(a7Button,a6Button);
                EmptySpotChecker(a7Button,a8Button);
                EmptySpotChecker(a7Button,a12Button);
                SolutionChecker();
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a8Button,a3Button);
                EmptySpotChecker(a8Button,a7Button);
                EmptySpotChecker(a8Button,a9Button);
                EmptySpotChecker(a8Button,a13Button);
                SolutionChecker();
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a9Button,a4Button);
                EmptySpotChecker(a9Button,a8Button);
                EmptySpotChecker(a9Button,a10Button);
                EmptySpotChecker(a9Button,a14Button);
                SolutionChecker();
            }
        });

        a10Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a10Button,a5Button);
                EmptySpotChecker(a10Button,a9Button);
                EmptySpotChecker(a10Button,a15Button);
                SolutionChecker();
            }
        });
        a11Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a11Button,a6Button);
                EmptySpotChecker(a11Button,a12Button);
                EmptySpotChecker(a11Button,a16Button);
                SolutionChecker();
            }
        });
        a12Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a12Button,a7Button);
                EmptySpotChecker(a12Button,a11Button);
                EmptySpotChecker(a12Button,a13Button);
                EmptySpotChecker(a12Button,a17Button);
                SolutionChecker();
            }
        });
        a13Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a13Button,a8Button);
                EmptySpotChecker(a13Button,a12Button);
                EmptySpotChecker(a13Button,a14Button);
                EmptySpotChecker(a13Button,a18Button);
                SolutionChecker();
            }
        });
        a14Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a14Button,a9Button);
                EmptySpotChecker(a14Button,a13Button);
                EmptySpotChecker(a14Button,a15Button);
                EmptySpotChecker(a14Button,a19Button);
                SolutionChecker();
            }
        });
        a15Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a15Button,a10Button);
                EmptySpotChecker(a15Button,a14Button);
                EmptySpotChecker(a15Button,a20Button);
                SolutionChecker();
            }
        });
        a16Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a16Button,a11Button);
                EmptySpotChecker(a16Button,a17Button);
                EmptySpotChecker(a16Button,a21Button);
                SolutionChecker();
            }
        });

        a17Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a17Button,a12Button);
                EmptySpotChecker(a17Button,a16Button);
                EmptySpotChecker(a17Button,a18Button);
                EmptySpotChecker(a17Button,a22Button);
                SolutionChecker();
            }
        });
        a18Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a18Button,a13Button);
                EmptySpotChecker(a18Button,a17Button);
                EmptySpotChecker(a18Button,a19Button);
                EmptySpotChecker(a18Button,a23Button);
                SolutionChecker();
            }
        });
        a19Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a19Button,a14Button);
                EmptySpotChecker(a19Button,a18Button);
                EmptySpotChecker(a19Button,a20Button);
                EmptySpotChecker(a19Button,a24Button);
                SolutionChecker();
            }
        });
        a20Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a20Button,a15Button);
                EmptySpotChecker(a20Button,a19Button);
                EmptySpotChecker(a20Button,a25Button);
                SolutionChecker();
            }
        });
        a21Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a21Button,a16Button);
                EmptySpotChecker(a21Button,a22Button);
                SolutionChecker();
            }
        });
        a22Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a22Button,a17Button);
                EmptySpotChecker(a22Button,a21Button);
                EmptySpotChecker(a22Button,a23Button);
                SolutionChecker();
            }
        });
        a23Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a23Button,a18Button);
                EmptySpotChecker(a23Button,a22Button);
                EmptySpotChecker(a23Button,a24Button);
                SolutionChecker();
            }
        });
        a24Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a24Button,a19Button);
                EmptySpotChecker(a24Button,a23Button);
                EmptySpotChecker(a24Button,a25Button);
                SolutionChecker();
            }
        });
        a25Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a25Button,a20Button);
                EmptySpotChecker(a25Button,a24Button);
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
                a16Button.setText("16");
                a17Button.setText("17");
                a18Button.setText("18");
                a19Button.setText("19");
                a20Button.setText("20");
                a21Button.setText("21");
                a22Button.setText("22");
                a23Button.setText("23");
                a24Button.setText("24");
                a25Button.setText("");

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
        Integer[] intArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
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
        a16Button.setText(Integer.toString(intArray[15]));
        a17Button.setText(Integer.toString(intArray[16]));
        a18Button.setText(Integer.toString(intArray[17]));
        a19Button.setText(Integer.toString(intArray[18]));
        a20Button.setText(Integer.toString(intArray[19]));
        a21Button.setText(Integer.toString(intArray[20]));
        a22Button.setText(Integer.toString(intArray[21]));
        a23Button.setText(Integer.toString(intArray[22]));
        a24Button.setText(Integer.toString(intArray[23]));
        a25Button.setText("");

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
        String b16 = a16Button.getText();
        String b17 = a17Button.getText();
        String b18 = a18Button.getText();
        String b19 = a19Button.getText();
        String b20 = a20Button.getText();
        String b21 = a21Button.getText();
        String b22 = a22Button.getText();
        String b23 = a23Button.getText();
        String b24 = a24Button.getText();

        if(b1 == "1" && b2 == "2" && b3 == "3" && b4 == "4" && b5 == "5" && b6 == "6" && b7 == "7" && b8 == "8" && b9 == "9" && b10 == "10" && b11 == "11" && b12 == "12" && b13 == "13" && b14 == "14" && b15 == "15" && b16 == "16" && b17 == "17" && b18 == "18" && b19 == "19" && b20 == "20" && b21 == "21" && b22 == "22" && b23 == "23" && b24 == "24")
        {
            Database(User.userid,time,counter);
            JOptionPane.showMessageDialog(this,"You win the Level 3","Puzzle Game",JOptionPane.INFORMATION_MESSAGE);
            Level4 level4 = new Level4();
            dispose();
            level4.show();
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
            String sql = "INSERT INTO level3details (userID, time, clicks, status) " +
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

        Level3 three = new Level3();
    }
}
