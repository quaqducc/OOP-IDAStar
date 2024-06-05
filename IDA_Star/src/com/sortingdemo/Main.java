package com.sortingdemo;

import com.sortingdemo.model.Graph;
import com.sortingdemo.view.GraphCreationView;
import com.sortingdemo.view.GraphPanel;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng Graph
        Graph graph = new Graph();

        // Tạo một cửa sổ JFrame mới
        JFrame frame = new JFrame("Graph Creation");

        // Tạo một đối tượng GraphPanel và thêm vào cửa sổ JFrame
        GraphPanel graphPanel = new GraphPanel(graph);
        frame.add(graphPanel);

        // Tạo một đối tượng GraphCreationView và thêm vào cửa sổ JFrame
        GraphCreationView graphCreationView = new GraphCreationView(graph);
        frame.add(graphCreationView);

        // Thiết lập kích thước và hiển thị cửa sổ
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Thiết lập GraphPanel cho GraphCreationView
        graphCreationView.setGraphPanel(graphPanel);
    }
}
