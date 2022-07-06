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

public class Level6 extends JFrame {
    private JPanel Mainlevel6;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a1Button;
    private JLabel lblTimer;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JLabel lblNoOfClicks;
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
    private JButton a37Button;
    private JButton a38Button;
    private JButton a39Button;
    private JButton a40Button;
    private JButton a41Button;
    private JButton a42Button;
    private JButton a43Button;
    private JButton a44Button;
    private JButton a45Button;
    private JButton a46Button;
    private JButton a47Button;
    private JButton a48Button;
    private JButton a49Button;
    private JButton solutionButton;
    private JButton resetButton;
    private JButton a50Button;
    private JButton a51Button;
    private JButton a52Button;
    private JButton a53Button;
    private JButton a54Button;
    private JButton a55Button;
    private JButton a56Button;
    private JButton a57Button;
    private JButton a58Button;
    private JButton a59Button;
    private JButton a60Button;
    private JButton a61Button;
    private JButton a62Button;
    private JButton a63Button;
    private JButton a64Button;
    private JButton homeButton;

    int counter;
    int time;

    public Level6(){
        setContentPane(Mainlevel6);
        setTitle("Level6");
        setSize(950,800);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Shuffle();
        Timer();
        setVisible(true);
        setLocation( 50,50);

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a1Button,a2Button);
                EmptySpotChecker(a1Button,a9Button);
                SolutionChecker();
            }
        });


        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a2Button,a1Button);
                EmptySpotChecker(a2Button,a3Button);
                EmptySpotChecker(a2Button,a10Button);
                SolutionChecker();
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a3Button,a2Button);
                EmptySpotChecker(a3Button,a4Button);
                EmptySpotChecker(a3Button,a11Button);
                SolutionChecker();
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a4Button,a3Button);
                EmptySpotChecker(a4Button,a5Button);
                EmptySpotChecker(a4Button,a12Button);
                SolutionChecker();
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a5Button,a4Button);
                EmptySpotChecker(a5Button,a6Button);
                EmptySpotChecker(a5Button,a13Button);
                SolutionChecker();
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a6Button,a5Button);
                EmptySpotChecker(a6Button,a7Button);
                EmptySpotChecker(a6Button,a14Button);
                SolutionChecker();
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a7Button,a6Button);
                EmptySpotChecker(a7Button,a8Button);
                EmptySpotChecker(a7Button,a15Button);
                SolutionChecker();
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a8Button,a7Button);
                EmptySpotChecker(a8Button,a16Button);
                SolutionChecker();
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a9Button,a1Button);
                EmptySpotChecker(a9Button,a10Button);
                EmptySpotChecker(a9Button,a17Button);
                SolutionChecker();
            }
        });

        a10Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a10Button,a2Button);
                EmptySpotChecker(a10Button,a9Button);
                EmptySpotChecker(a10Button,a11Button);
                EmptySpotChecker(a10Button,a18Button);
                SolutionChecker();
            }
        });
        a11Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a11Button,a3Button);
                EmptySpotChecker(a11Button,a10Button);
                EmptySpotChecker(a11Button,a12Button);
                EmptySpotChecker(a11Button,a19Button);
                SolutionChecker();
            }
        });
        a12Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a12Button,a4Button);
                EmptySpotChecker(a12Button,a11Button);
                EmptySpotChecker(a12Button,a13Button);
                EmptySpotChecker(a12Button,a20Button);
                SolutionChecker();
            }
        });
        a13Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a13Button,a5Button);
                EmptySpotChecker(a13Button,a12Button);
                EmptySpotChecker(a13Button,a14Button);
                EmptySpotChecker(a13Button,a21Button);
                SolutionChecker();
            }
        });
        a14Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a14Button,a6Button);
                EmptySpotChecker(a14Button,a13Button);
                EmptySpotChecker(a14Button,a15Button);
                EmptySpotChecker(a14Button,a22Button);
                SolutionChecker();
            }
        });
        a15Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a15Button,a7Button);
                EmptySpotChecker(a15Button,a14Button);
                EmptySpotChecker(a15Button,a16Button);
                EmptySpotChecker(a15Button,a23Button);
                SolutionChecker();
            }
        });
        a16Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a16Button,a8Button);
                EmptySpotChecker(a16Button,a15Button);
                EmptySpotChecker(a16Button,a24Button);
                SolutionChecker();
            }
        });

        a17Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a17Button,a9Button);
                EmptySpotChecker(a17Button,a18Button);
                EmptySpotChecker(a17Button,a25Button);
                SolutionChecker();
            }
        });
        a18Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a18Button,a10Button);
                EmptySpotChecker(a18Button,a17Button);
                EmptySpotChecker(a18Button,a19Button);
                EmptySpotChecker(a18Button,a26Button);
                SolutionChecker();
            }
        });
        a19Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a19Button,a11Button);
                EmptySpotChecker(a19Button,a18Button);
                EmptySpotChecker(a19Button,a20Button);
                EmptySpotChecker(a19Button,a27Button);
                SolutionChecker();
            }
        });
        a20Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a20Button,a12Button);
                EmptySpotChecker(a20Button,a19Button);
                EmptySpotChecker(a20Button,a21Button);
                EmptySpotChecker(a20Button,a28Button);
                SolutionChecker();
            }
        });
        a21Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a21Button,a13Button);
                EmptySpotChecker(a21Button,a20Button);
                EmptySpotChecker(a21Button,a22Button);
                EmptySpotChecker(a21Button,a29Button);
                SolutionChecker();
            }
        });
        a22Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a22Button,a14Button);
                EmptySpotChecker(a22Button,a21Button);
                EmptySpotChecker(a22Button,a23Button);
                EmptySpotChecker(a22Button,a30Button);
                SolutionChecker();
            }
        });
        a23Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a23Button,a15Button);
                EmptySpotChecker(a23Button,a22Button);
                EmptySpotChecker(a23Button,a24Button);
                EmptySpotChecker(a23Button,a31Button);
                SolutionChecker();
            }
        });
        a24Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a24Button,a16Button);
                EmptySpotChecker(a24Button,a23Button);
                EmptySpotChecker(a24Button,a32Button);
                SolutionChecker();
            }
        });
        a25Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a25Button,a17Button);
                EmptySpotChecker(a25Button,a26Button);
                EmptySpotChecker(a25Button,a33Button);
                SolutionChecker();
            }
        });

        a26Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a26Button,a18Button);
                EmptySpotChecker(a26Button,a25Button);
                EmptySpotChecker(a26Button,a27Button);
                EmptySpotChecker(a26Button,a34Button);
                SolutionChecker();
            }
        });
        a27Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a27Button,a19Button);
                EmptySpotChecker(a27Button,a26Button);
                EmptySpotChecker(a27Button,a28Button);
                EmptySpotChecker(a27Button,a35Button);
                SolutionChecker();
            }
        });
        a28Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a28Button,a20Button);
                EmptySpotChecker(a28Button,a27Button);
                EmptySpotChecker(a28Button,a29Button);
                EmptySpotChecker(a28Button,a36Button);
                SolutionChecker();
            }
        });
        a29Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a29Button,a21Button);
                EmptySpotChecker(a29Button,a28Button);
                EmptySpotChecker(a29Button,a30Button);
                EmptySpotChecker(a29Button,a37Button);
                SolutionChecker();
            }
        });
        a30Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a30Button,a22Button);
                EmptySpotChecker(a30Button,a29Button);
                EmptySpotChecker(a30Button,a31Button);
                EmptySpotChecker(a30Button,a38Button);
                SolutionChecker();
            }
        });
        a31Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a31Button,a23Button);
                EmptySpotChecker(a31Button,a30Button);
                EmptySpotChecker(a31Button,a32Button);
                EmptySpotChecker(a31Button,a39Button);
                SolutionChecker();
            }
        });
        a32Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a32Button,a24Button);
                EmptySpotChecker(a32Button,a31Button);
                EmptySpotChecker(a32Button,a40Button);
                SolutionChecker();
            }
        });
        a33Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a33Button,a25Button);
                EmptySpotChecker(a33Button,a34Button);
                EmptySpotChecker(a33Button,a41Button);
                SolutionChecker();
            }
        });
        a34Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a34Button,a26Button);
                EmptySpotChecker(a34Button,a33Button);
                EmptySpotChecker(a34Button,a35Button);
                EmptySpotChecker(a34Button,a42Button);
                SolutionChecker();
            }
        });
        a35Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a35Button,a27Button);
                EmptySpotChecker(a35Button,a34Button);
                EmptySpotChecker(a35Button,a36Button);
                EmptySpotChecker(a35Button,a43Button);
                SolutionChecker();
            }
        });
        a36Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a36Button,a28Button);
                EmptySpotChecker(a36Button,a34Button);
                EmptySpotChecker(a36Button,a38Button);
                EmptySpotChecker(a36Button,a44Button);
                SolutionChecker();
            }
        });

        a37Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a37Button,a29Button);
                EmptySpotChecker(a37Button,a36Button);
                EmptySpotChecker(a37Button,a38Button);
                EmptySpotChecker(a37Button,a45Button);
                SolutionChecker();
            }
        });
        a38Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a38Button,a30Button);
                EmptySpotChecker(a38Button,a37Button);
                EmptySpotChecker(a38Button,a39Button);
                EmptySpotChecker(a38Button,a46Button);
                SolutionChecker();
            }
        });
        a39Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a39Button,a31Button);
                EmptySpotChecker(a39Button,a38Button);
                EmptySpotChecker(a39Button,a40Button);
                EmptySpotChecker(a39Button,a47Button);
                SolutionChecker();
            }
        });
        a40Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a40Button,a32Button);
                EmptySpotChecker(a40Button,a39Button);
                EmptySpotChecker(a40Button,a48Button);
                SolutionChecker();
            }
        });
        a41Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a41Button,a33Button);
                EmptySpotChecker(a41Button,a42Button);
                EmptySpotChecker(a41Button,a49Button);
                SolutionChecker();
            }
        });
        a42Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a42Button,a34Button);
                EmptySpotChecker(a42Button,a41Button);
                EmptySpotChecker(a42Button,a43Button);
                EmptySpotChecker(a42Button,a50Button);
                SolutionChecker();
            }
        });
        a43Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a43Button,a35Button);
                EmptySpotChecker(a42Button,a44Button);
                EmptySpotChecker(a43Button,a44Button);
                EmptySpotChecker(a43Button,a51Button);
                SolutionChecker();
            }
        });
        a44Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a44Button,a36Button);
                EmptySpotChecker(a44Button,a43Button);
                EmptySpotChecker(a44Button,a45Button);
                EmptySpotChecker(a44Button,a52Button);
                SolutionChecker();
            }
        });
        a45Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a45Button,a37Button);
                EmptySpotChecker(a45Button,a44Button);
                EmptySpotChecker(a45Button,a46Button);
                EmptySpotChecker(a45Button,a53Button);
                SolutionChecker();
            }
        });
        a46Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a46Button,a38Button);
                EmptySpotChecker(a46Button,a45Button);
                EmptySpotChecker(a46Button,a47Button);
                EmptySpotChecker(a46Button,a54Button);
                SolutionChecker();
            }
        });
        a47Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a47Button,a39Button);
                EmptySpotChecker(a47Button,a46Button);
                EmptySpotChecker(a47Button,a48Button);
                EmptySpotChecker(a47Button,a55Button);
                SolutionChecker();
            }
        });
        a48Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a48Button,a40Button);
                EmptySpotChecker(a48Button,a47Button);
                EmptySpotChecker(a48Button,a56Button);
                SolutionChecker();
            }
        });
        a49Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a49Button,a41Button);
                EmptySpotChecker(a49Button,a50Button);
                EmptySpotChecker(a49Button,a57Button);
                SolutionChecker();
            }
        });

        a50Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a50Button,a42Button);
                EmptySpotChecker(a50Button,a49Button);
                EmptySpotChecker(a50Button,a51Button);
                EmptySpotChecker(a50Button,a58Button);
                SolutionChecker();
            }
        });
        a51Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a51Button,a43Button);
                EmptySpotChecker(a51Button,a50Button);
                EmptySpotChecker(a51Button,a52Button);
                EmptySpotChecker(a51Button,a59Button);
                SolutionChecker();
            }
        });
        a52Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a52Button,a44Button);
                EmptySpotChecker(a52Button,a51Button);
                EmptySpotChecker(a52Button,a53Button);
                EmptySpotChecker(a52Button,a60Button);
                SolutionChecker();
            }
        });
        a53Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a53Button,a45Button);
                EmptySpotChecker(a53Button,a52Button);
                EmptySpotChecker(a53Button,a54Button);
                EmptySpotChecker(a53Button,a61Button);
                SolutionChecker();
            }
        });
        a54Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a54Button,a46Button);
                EmptySpotChecker(a54Button,a53Button);
                EmptySpotChecker(a54Button,a55Button);
                EmptySpotChecker(a54Button,a62Button);
                SolutionChecker();
            }
        });
        a55Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a55Button,a47Button);
                EmptySpotChecker(a55Button,a54Button);
                EmptySpotChecker(a55Button,a56Button);
                EmptySpotChecker(a55Button,a63Button);
                SolutionChecker();
            }
        });
        a56Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a56Button,a48Button);
                EmptySpotChecker(a56Button,a55Button);
                EmptySpotChecker(a56Button,a64Button);
                SolutionChecker();
            }
        });
        a57Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a57Button,a49Button);
                EmptySpotChecker(a57Button,a58Button);
                SolutionChecker();
            }
        });
        a58Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a58Button,a50Button);
                EmptySpotChecker(a58Button,a57Button);
                EmptySpotChecker(a58Button,a59Button);
                SolutionChecker();
            }
        });
        a59Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a59Button,a51Button);
                EmptySpotChecker(a59Button,a58Button);
                EmptySpotChecker(a59Button,a60Button);
                SolutionChecker();
            }
        });
        a60Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a60Button,a52Button);
                EmptySpotChecker(a60Button,a59Button);
                EmptySpotChecker(a60Button,a61Button);
                SolutionChecker();
            }
        });
        a61Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a61Button,a53Button);
                EmptySpotChecker(a61Button,a60Button);
                EmptySpotChecker(a61Button,a62Button);
                SolutionChecker();
            }
        });
        a62Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a62Button,a54Button);
                EmptySpotChecker(a62Button,a61Button);
                EmptySpotChecker(a62Button,a63Button);
                SolutionChecker();
            }
        });
        a63Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a63Button,a55Button);
                EmptySpotChecker(a63Button,a62Button);
                EmptySpotChecker(a63Button,a64Button);
                SolutionChecker();
            }
        });
        a64Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmptySpotChecker(a64Button,a56Button);
                EmptySpotChecker(a64Button,a63Button);
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
                a36Button.setText("36");
                a37Button.setText("37");
                a38Button.setText("38");
                a39Button.setText("39");
                a40Button.setText("40");
                a41Button.setText("41");
                a42Button.setText("42");
                a43Button.setText("43");
                a44Button.setText("44");
                a45Button.setText("45");
                a46Button.setText("46");
                a47Button.setText("47");
                a48Button.setText("48");
                a49Button.setText("49");
                a50Button.setText("50");
                a51Button.setText("51");
                a52Button.setText("52");
                a53Button.setText("53");
                a54Button.setText("54");
                a55Button.setText("55");
                a56Button.setText("56");
                a57Button.setText("57");
                a58Button.setText("58");
                a59Button.setText("59");
                a60Button.setText("60");
                a61Button.setText("61");
                a62Button.setText("62");
                a63Button.setText("63");
                a64Button.setText("");

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
        Integer[] intArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63};
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
        a36Button.setText(Integer.toString(intArray[35]));
        a37Button.setText(Integer.toString(intArray[36]));
        a38Button.setText(Integer.toString(intArray[37]));
        a39Button.setText(Integer.toString(intArray[38]));
        a40Button.setText(Integer.toString(intArray[39]));
        a41Button.setText(Integer.toString(intArray[40]));
        a42Button.setText(Integer.toString(intArray[41]));
        a43Button.setText(Integer.toString(intArray[42]));
        a44Button.setText(Integer.toString(intArray[43]));
        a45Button.setText(Integer.toString(intArray[44]));
        a46Button.setText(Integer.toString(intArray[45]));
        a47Button.setText(Integer.toString(intArray[46]));
        a48Button.setText(Integer.toString(intArray[47]));
        a49Button.setText(Integer.toString(intArray[48]));
        a50Button.setText(Integer.toString(intArray[49]));
        a51Button.setText(Integer.toString(intArray[50]));
        a52Button.setText(Integer.toString(intArray[51]));
        a53Button.setText(Integer.toString(intArray[52]));
        a54Button.setText(Integer.toString(intArray[53]));
        a55Button.setText(Integer.toString(intArray[54]));
        a56Button.setText(Integer.toString(intArray[55]));
        a57Button.setText(Integer.toString(intArray[56]));
        a58Button.setText(Integer.toString(intArray[57]));
        a59Button.setText(Integer.toString(intArray[58]));
        a60Button.setText(Integer.toString(intArray[59]));
        a61Button.setText(Integer.toString(intArray[60]));
        a62Button.setText(Integer.toString(intArray[61]));
        a63Button.setText(Integer.toString(intArray[62]));
        a64Button.setText("");

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
        String b36 = a36Button.getText();
        String b37 = a37Button.getText();
        String b38 = a38Button.getText();
        String b39 = a39Button.getText();
        String b40 = a40Button.getText();
        String b41 = a41Button.getText();
        String b42 = a42Button.getText();
        String b43 = a43Button.getText();
        String b44 = a44Button.getText();
        String b45 = a45Button.getText();
        String b46 = a46Button.getText();
        String b47 = a47Button.getText();
        String b48 = a48Button.getText();
        String b49 = a49Button.getText();
        String b50 = a50Button.getText();
        String b51 = a51Button.getText();
        String b52 = a52Button.getText();
        String b53 = a53Button.getText();
        String b54 = a54Button.getText();
        String b55 = a55Button.getText();
        String b56 = a56Button.getText();
        String b57 = a57Button.getText();
        String b58 = a58Button.getText();
        String b59 = a59Button.getText();
        String b60 = a60Button.getText();
        String b61 = a61Button.getText();
        String b62 = a62Button.getText();
        String b63 = a63Button.getText();

        if(b1 == "1" && b2 == "2" && b3 == "3" && b4 == "4" && b5 == "5" && b6 == "6" && b7 == "7" && b8 == "8" && b9 == "9" && b10 == "10" && b11 == "11" && b12 == "12" && b13 == "13" && b14 == "14" && b15 == "15" && b16 == "16" && b17 == "17" && b18 == "18" && b19 == "19" && b20 == "20" && b21 == "21" && b22 == "22" && b23 == "23" && b24 == "24" && b25 == "25" && b26 == "26" && b27 == "27" && b28 == "28" && b29 == "29" && b30 == "30" && b31 == "31" && b32 == "32" && b33 == "33" && b34 == "34" && b35 == "35" && b36 == "36" && b37 == "37" && b38 == "38" && b39 == "39" && b40 == "40" && b41 == "41" && b42 == "42" && b43 == "43" && b44 == "44" && b45 == "45" && b46 == "46" && b47 == "47" && b48 == "48" && b49 == "49" && b50 == "50" && b51 == "51" && b52 == "52" && b53 == "53" && b54 == "54" && b55 == "55" && b56 == "56" && b57 == "57" && b58 == "58" && b59== "59" && b60 == "60" && b61 == "61" && b62 == "62" && b63 == "63")
        {
            Database(User.userid,time,counter);
            JOptionPane.showMessageDialog(this,"You win the Level 5","Puzzle Game",JOptionPane.INFORMATION_MESSAGE);
            LevelChooser levelChooser = new LevelChooser();
            dispose();
            levelChooser.show();
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
            String sql = "INSERT INTO level6details (userID, time, clicks, status) " +
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

        Level6 six = new Level6();
    }
}
