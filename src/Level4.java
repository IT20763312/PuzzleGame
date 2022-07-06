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

public class Level4 extends JFrame{
    private JPanel Mainlevel4;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a1Button;
    private JLabel lblNoOfClicks;
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
    private JButton resetButton;
    private JButton a26Button;
    private JButton a27Button;
    private JButton a28Button;
    private JButton a29Button;
    private JButton a30Button;
    private JButton a31Button;
    private JButton a32Button;
    private JButton a33Button;
    private JButton a34Button;
    private JButton a35Button;
    private JButton a36Button;
    private JButton homeButton;

    int counter;
    int time;

    public Level4(){
        setContentPane(Mainlevel4);
        setTitle("Level4");
        setSize(800,650);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Shuffle();
        Timer();
        setVisible(true);
        setLocation( 450,10);


        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a1Button,a2Button);
                EmptySpotChecker(a1Button,a7Button);
                SolutionChecker();
            }
        });


        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a2Button,a1Button);
                EmptySpotChecker(a2Button,a3Button);
                EmptySpotChecker(a2Button,a8Button);
                SolutionChecker();
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a3Button,a2Button);
                EmptySpotChecker(a3Button,a4Button);
                EmptySpotChecker(a3Button,a9Button);
                SolutionChecker();
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a4Button,a3Button);
                EmptySpotChecker(a4Button,a5Button);
                EmptySpotChecker(a4Button,a10Button);
                SolutionChecker();
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a5Button,a4Button);
                EmptySpotChecker(a5Button,a6Button);
                EmptySpotChecker(a5Button,a11Button);
                SolutionChecker();
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a6Button,a5Button);
                EmptySpotChecker(a6Button,a12Button);
                SolutionChecker();
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a7Button,a1Button);
                EmptySpotChecker(a7Button,a8Button);
                EmptySpotChecker(a7Button,a13Button);
                SolutionChecker();
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a8Button,a2Button);
                EmptySpotChecker(a8Button,a7Button);
                EmptySpotChecker(a8Button,a9Button);
                EmptySpotChecker(a8Button,a14Button);
                SolutionChecker();
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a9Button,a3Button);
                EmptySpotChecker(a9Button,a8Button);
                EmptySpotChecker(a9Button,a10Button);
                EmptySpotChecker(a9Button,a15Button);
                SolutionChecker();
            }
        });

        a10Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a10Button,a4Button);
                EmptySpotChecker(a10Button,a9Button);
                EmptySpotChecker(a10Button,a11Button);
                EmptySpotChecker(a10Button,a16Button);
                SolutionChecker();
            }
        });
        a11Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a11Button,a5Button);
                EmptySpotChecker(a11Button,a10Button);
                EmptySpotChecker(a11Button,a12Button);
                EmptySpotChecker(a11Button,a17Button);
                SolutionChecker();
            }
        });
        a12Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a12Button,a6Button);
                EmptySpotChecker(a12Button,a11Button);
                EmptySpotChecker(a12Button,a18Button);
                SolutionChecker();
            }
        });
        a13Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a13Button,a7Button);
                EmptySpotChecker(a13Button,a14Button);
                EmptySpotChecker(a13Button,a19Button);
                SolutionChecker();
            }
        });
        a14Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a14Button,a8Button);
                EmptySpotChecker(a14Button,a13Button);
                EmptySpotChecker(a14Button,a15Button);
                EmptySpotChecker(a14Button,a20Button);
                SolutionChecker();
            }
        });
        a15Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a15Button,a9Button);
                EmptySpotChecker(a15Button,a14Button);
                EmptySpotChecker(a15Button,a16Button);
                EmptySpotChecker(a15Button,a21Button);
                SolutionChecker();
            }
        });
        a16Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a16Button,a10Button);
                EmptySpotChecker(a16Button,a15Button);
                EmptySpotChecker(a16Button,a17Button);
                EmptySpotChecker(a16Button,a22Button);
                SolutionChecker();
            }
        });

        a17Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a17Button,a11Button);
                EmptySpotChecker(a17Button,a16Button);
                EmptySpotChecker(a17Button,a18Button);
                EmptySpotChecker(a17Button,a23Button);
                SolutionChecker();
            }
        });
        a18Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a18Button,a12Button);
                EmptySpotChecker(a18Button,a17Button);
                EmptySpotChecker(a18Button,a24Button);
                SolutionChecker();
            }
        });
        a19Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a19Button,a13Button);
                EmptySpotChecker(a19Button,a20Button);
                EmptySpotChecker(a19Button,a25Button);
                SolutionChecker();
            }
        });
        a20Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a20Button,a14Button);
                EmptySpotChecker(a20Button,a19Button);
                EmptySpotChecker(a20Button,a21Button);
                EmptySpotChecker(a20Button,a26Button);
                SolutionChecker();
            }
        });
        a21Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a21Button,a15Button);
                EmptySpotChecker(a21Button,a20Button);
                EmptySpotChecker(a21Button,a22Button);
                EmptySpotChecker(a21Button,a27Button);
                SolutionChecker();
            }
        });
        a22Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a22Button,a16Button);
                EmptySpotChecker(a22Button,a21Button);
                EmptySpotChecker(a22Button,a23Button);
                EmptySpotChecker(a22Button,a28Button);
                SolutionChecker();
            }
        });
        a23Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a23Button,a17Button);
                EmptySpotChecker(a23Button,a22Button);
                EmptySpotChecker(a23Button,a24Button);
                EmptySpotChecker(a23Button,a29Button);
                SolutionChecker();
            }
        });
        a24Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a24Button,a18Button);
                EmptySpotChecker(a24Button,a23Button);
                EmptySpotChecker(a24Button,a30Button);
                SolutionChecker();
            }
        });
        a25Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a25Button,a19Button);
                EmptySpotChecker(a25Button,a26Button);
                EmptySpotChecker(a25Button,a31Button);
                SolutionChecker();
            }
        });

        a26Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a26Button,a20Button);
                EmptySpotChecker(a26Button,a25Button);
                EmptySpotChecker(a26Button,a27Button);
                EmptySpotChecker(a26Button,a32Button);
                SolutionChecker();
            }
        });
        a27Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a27Button,a21Button);
                EmptySpotChecker(a27Button,a26Button);
                EmptySpotChecker(a27Button,a28Button);
                EmptySpotChecker(a27Button,a33Button);
                SolutionChecker();
            }
        });
        a28Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a28Button,a22Button);
                EmptySpotChecker(a28Button,a27Button);
                EmptySpotChecker(a28Button,a29Button);
                EmptySpotChecker(a28Button,a34Button);
                SolutionChecker();
            }
        });
        a29Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a29Button,a23Button);
                EmptySpotChecker(a29Button,a28Button);
                EmptySpotChecker(a29Button,a30Button);
                EmptySpotChecker(a29Button,a35Button);
                SolutionChecker();
            }
        });
        a30Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a30Button,a24Button);
                EmptySpotChecker(a30Button,a29Button);
                EmptySpotChecker(a30Button,a36Button);
                SolutionChecker();
            }
        });
        a31Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a31Button,a25Button);
                EmptySpotChecker(a31Button,a32Button);
                SolutionChecker();
            }
        });
        a32Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a32Button,a26Button);
                EmptySpotChecker(a32Button,a31Button);
                EmptySpotChecker(a32Button,a33Button);
                SolutionChecker();
            }
        });
        a33Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a33Button,a27Button);
                EmptySpotChecker(a33Button,a32Button);
                EmptySpotChecker(a33Button,a34Button);
                SolutionChecker();
            }
        });
        a34Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a34Button,a28Button);
                EmptySpotChecker(a34Button,a33Button);
                EmptySpotChecker(a34Button,a35Button);
                SolutionChecker();
            }
        });
        a35Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a35Button,a29Button);
                EmptySpotChecker(a35Button,a34Button);
                EmptySpotChecker(a35Button,a36Button);
                SolutionChecker();
            }
        });
        a36Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a36Button,a30Button);
                EmptySpotChecker(a36Button,a35Button);
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
                a25Button.setText("25");
                a26Button.setText("26");
                a27Button.setText("27");
                a28Button.setText("28");
                a29Button.setText("29");
                a30Button.setText("30");
                a31Button.setText("31");
                a32Button.setText("32");
                a33Button.setText("33");
                a34Button.setText("34");
                a35Button.setText("35");
                a36Button.setText("");

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
        Integer[] intArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35};
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
        a25Button.setText(Integer.toString(intArray[24]));
        a26Button.setText(Integer.toString(intArray[25]));
        a27Button.setText(Integer.toString(intArray[26]));
        a28Button.setText(Integer.toString(intArray[27]));
        a29Button.setText(Integer.toString(intArray[28]));
        a30Button.setText(Integer.toString(intArray[29]));
        a31Button.setText(Integer.toString(intArray[30]));
        a32Button.setText(Integer.toString(intArray[31]));
        a33Button.setText(Integer.toString(intArray[32]));
        a34Button.setText(Integer.toString(intArray[33]));
        a35Button.setText(Integer.toString(intArray[34]));
        a36Button.setText("");

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
        String b25 = a25Button.getText();
        String b26 = a26Button.getText();
        String b27 = a27Button.getText();
        String b28 = a28Button.getText();
        String b29 = a29Button.getText();
        String b30 = a30Button.getText();
        String b31 = a31Button.getText();
        String b32 = a32Button.getText();
        String b33 = a33Button.getText();
        String b34 = a34Button.getText();
        String b35 = a35Button.getText();

        if(b1 == "1" && b2 == "2" && b3 == "3" && b4 == "4" && b5 == "5" && b6 == "6" && b7 == "7" && b8 == "8" && b9 == "9" && b10 == "10" && b11 == "11" && b12 == "12" && b13 == "13" && b14 == "14" && b15 == "15" && b16 == "16" && b17 == "17" && b18 == "18" && b19 == "19" && b20 == "20" && b21 == "21" && b22 == "22" && b23 == "23" && b24 == "24" && b25 == "25" && b26 == "26" && b27 == "27" && b28 == "28" && b29 == "29" && b30 == "30" && b31 == "31" && b32 == "32" && b33 == "33" && b34 == "34" && b35 == "35")
        {
            Database(User.userid,time,counter);
            JOptionPane.showMessageDialog(this,"You win the Level 4","Puzzle Game",JOptionPane.INFORMATION_MESSAGE);
            Level5 level5 = new Level5();
            dispose();
            level5.show();
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
            String sql = "INSERT INTO level4details (userID, time, clicks, status) " +
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

        Level4 four = new Level4();
    }
}
