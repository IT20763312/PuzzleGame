import io.quickchart.QuickChart;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Chart extends JFrame{
    private JPanel Chart;
    private JLabel lblURL;
    private JButton homeButton;
    private JButton backButton;

    public Chart(int l1clicks,int l2clicks,int l3clicks,int l4clicks,int l5clicks,int l6clicks,int l1time,int l2time,int l3time,int l4time,int l5time,int l6time){
        setContentPane(Chart);
        setTitle("Scoreboard");
        setSize(600,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation( 450,10);

        QuickChart chart = new QuickChart();
        chart.setWidth(900);
        chart.setHeight(600);
        chart.setConfig("{"
                + "    type: 'bar',"
                + "    data: {"
                + "        labels: ['Level 1', 'Level 2', 'Level 3', 'Level 4', 'Level 5', 'Level 6'],"
                + "        datasets: [{"
                + "            label: 'Clicks',"
                + "            data: ["+l1clicks+", "+l2clicks+", "+l3clicks+", "+l4clicks+","+l5clicks+","+l6clicks+"]"
                + "        },{label: 'Time in Seconds',data:["+l1time+", "+l2time+", "+l3time+", "+l4time+","+l5time+","+l6time+"]}]"
                + "    }"
                + "}");

        lblURL.setText(chart.getShortUrl());

        lblURL.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                String url = lblURL.getText();

                try {
                    Desktop.getDesktop().browse(new URI(url));
                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (URISyntaxException ex) {
                    ex.printStackTrace();
                }

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
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Scoreboard scoreboard = new Scoreboard();
                scoreboard.show();
                dispose();
            }
        });
    }

}
