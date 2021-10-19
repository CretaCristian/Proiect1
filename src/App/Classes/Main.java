package App.Classes;

import App.GUI.MyGui;

import javax.swing.*;

public class Main {
    public static void main(String[]args){
        JFrame frame=new JFrame("Simulator F1");
        MyGui gui= new MyGui();
        frame.setContentPane(gui.panelprincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(1200,720);
        frame.setResizable(true);
    }
}

