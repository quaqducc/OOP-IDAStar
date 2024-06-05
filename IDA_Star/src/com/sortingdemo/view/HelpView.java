package com.sortingdemo.view;

import javax.swing.*;

public class HelpView {
    public void display() {
        JOptionPane.showMessageDialog(null, "Help Information:\n" +
                "1. Select 'Create Graph' to create a new graph and run IDA* search.\n" +
                "2. IDA* Search: Iterative Deepening A* search algorithm.");
    }
}
