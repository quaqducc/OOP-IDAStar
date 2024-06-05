package com.sortingdemo.view;

import com.sortingdemo.model.Graph;
import com.sortingdemo.model.IDAStarSearch;
import com.sortingdemo.model.Node;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {
    private Graph graph;
    private GraphPanel graphPanel;

    public MainView() {
        this.graph = new Graph(); // Khởi tạo graph ở đây
        this.graphPanel = new GraphPanel(graph);

        setLayout(new BorderLayout());
        add(graphPanel, BorderLayout.CENTER);
        add(new GraphCreationView(graph), BorderLayout.EAST);

        IDAStarSearch search = new IDAStarSearch(graph);
        search.setSearchListener(new IDAStarSearch.SearchListener() {
            @Override
            public void onNodeVisited(Node node) {
                graphPanel.highlightNode(node);
            }
        });

        // Other initialization code
        setTitle("Graph Visualization");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void display() {
        setVisible(true);
    }

    // Other methods
}
