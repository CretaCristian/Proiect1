package App.GUI;

import App.Classes.Driver;
import App.Classes.Ferrari;
import App.Classes.Mercedes;
import App.Classes.RedBull;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.YES_OPTION;

public class MyGui {
    public JPanel panelprincipal;
    private JButton startButton;
    private JPanel panelLeft;
    private JPanel panelCircuit;
    private JButton circuitButton;
    private JPanel panelTyers;
    private JPanel panelNrLaps;
    private JButton tyerTypeButton;
    private JButton nrlapsButton;
    private JTextField textField1;
    private JButton confirmButton;
    private JButton monzaButton;
    private JButton austriaButton;
    private JButton monacoButton;
    private JLabel pozaMonza;
    private JLabel pozaAustria;
    private JLabel pozaMonaco;
    private JButton softButton;
    private JButton mediumButton;
    private JButton hardButton;
    private JLabel pozaSoft;
    private JLabel pozaMedium;
    private JLabel pozaHard;
    private JButton incepetiCrusaButton;
    private JPanel rezultateCursa;
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JLabel l4;
    private JLabel l5;
    private JLabel l6;
    private JButton iesireButton;
    private int x=0;
    private int nrLaps=0;

    public MyGui() {
        panelprincipal.setVisible(true);
        panelLeft.setVisible(false);
        panelCircuit.setVisible(false);
        panelTyers.setVisible(false);
        panelNrLaps.setVisible(false);
        Mercedes mercedes=new Mercedes("",0.0,"");
        Ferrari ferrari=new Ferrari("",0.0,"");
        RedBull redBull=new RedBull("",0.0,"");
        Driver max=new Driver("Verstappen","Max","RedBull",0.0);
        Driver lewis=new Driver("Hamilton","Lewis","Mercedes",0.0);
        Driver charles=new Driver("Leclerc","Charles","Ferrari",0.0);
        Driver perez=new Driver("Perez","Checo","RedBull",0.0);
        Driver bottas=new Driver("Bottas","Valtteri","Mercedes",0.0);
        Driver sainz=new Driver("Sainz","Carlos","Ferrari",0.0);
        Driver d[]={max, lewis, charles,perez,bottas,sainz};

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelLeft.setVisible(true);

            }
        });
        circuitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelCircuit.setVisible(true);
                panelNrLaps.setVisible(false);
                panelTyers.setVisible(false);
            }
        });
        tyerTypeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelCircuit.setVisible(false);
                panelNrLaps.setVisible(false);
                panelTyers.setVisible(true);
            }
        });
        nrlapsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelCircuit.setVisible(false);
                panelNrLaps.setVisible(true);
                panelTyers.setVisible(false);
            }
        });
        incepetiCrusaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        monzaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            ferrari.selectCircuit("Monza");
            mercedes.selectCircuit("Monza");
            redBull.selectCircuit("Monza");
            panelCircuit.setVisible(false);
            }
        });
        austriaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ferrari.selectCircuit("Austria");
                mercedes.selectCircuit("Austria");
                redBull.selectCircuit("Austria");
                panelCircuit.setVisible(false);
            }
        });
        monacoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ferrari.selectCircuit("Monaco");
                mercedes.selectCircuit("Monaco");
                redBull.selectCircuit("Monaco");
                panelCircuit.setVisible(false);
            }
        });
        softButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ferrari.pneuri("Soft");
                mercedes.pneuri("Soft");
                redBull.pneuri("Soft");
                panelTyers.setVisible(false);
            }
        });
        mediumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ferrari.pneuri("Medium");
                mercedes.pneuri("Medium");
                redBull.pneuri("Medium");
                panelTyers.setVisible(false);
            }
        });
        hardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ferrari.pneuri("Hard");
                mercedes.pneuri("Hard");
                redBull.pneuri("Hard");
                panelTyers.setVisible(false);
            }
        });
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result1 = JOptionPane.showConfirmDialog(null, "Sunteti siguri ca doriti atatea ture?", "Checking", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (result1 == YES_OPTION) {
                    panelNrLaps.setVisible(false);
                    nrLaps=Integer.parseInt(textField1.getText());
                }
            }
        });
        incepetiCrusaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelLeft.setVisible(false);
                    for(int i=0;i<nrLaps;++i){

                d[0].setLapTime(d[0].getLapTime() +redBull.lapTime() );
                d[1].setLapTime(d[0].getLapTime() +mercedes.lapTime() );
                d[2].setLapTime(d[0].getLapTime() +ferrari.lapTime() );
                d[3].setLapTime(d[0].getLapTime() +redBull.lapTime() );
                d[4].setLapTime(d[0].getLapTime() +mercedes.lapTime() );
                d[5].setLapTime(d[0].getLapTime() +ferrari.lapTime() );
                    }

                for (int i = 0; i < 5; ++i) {
                    int min_idx = i;
                    for (int j = i + 1; j < 6; ++j)
                        if (d[j].getLapTime() < d[min_idx].getLapTime())
                            min_idx = j;


                   Driver temp = d[min_idx];
                    d[min_idx] = d[i];
                    d[i] = temp;
                }
                rezultateCursa.setVisible(true);
                l1.setText(d[0].toString());
                l2.setText(d[1].toString());
                l3.setText(d[2].toString());
                l4.setText(d[3].toString());
                l5.setText(d[4].toString());
                l6.setText(d[5].toString());

            }
        });
        iesireButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
