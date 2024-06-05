package com.sortingdemo.view;

import com.sortingdemo.model.Graph;
import com.sortingdemo.model.Node;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphCreationView extends JPanel {
    private Graph graph;
    private JTextField nodeNameField;
    private JButton addNodeButton;
    private GraphPanel graphPanel; // Thêm một thuộc tính để tham chiếu tới GraphPanel

    public GraphCreationView(Graph graph) {
        this.graph = graph;

        nodeNameField = new JTextField(10);
        addNodeButton = new JButton("Add Node");

        add(new JLabel("Node Name:"));
        add(nodeNameField);
        add(addNodeButton);

        addNodeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nodeName = nodeNameField.getText();
                Node node = new Node((int)(Math.random() * 600), (int)(Math.random() * 600), nodeName);
                graph.addNode(node);
                nodeNameField.setText("");
            }
        });
    }

    public void setGraphPanel(GraphPanel graphPanel) {
        this.graphPanel = graphPanel;
    }
}
