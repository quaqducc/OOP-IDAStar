package com.sortingdemo.view;

import com.sortingdemo.model.Graph;
import com.sortingdemo.model.Edge;
import com.sortingdemo.model.Node;

import javax.swing.*;
import java.awt.*;

public class GraphPanel extends JPanel {
    private Graph graph;
    private static final int NODE_RADIUS = 10;

    public GraphPanel(Graph graph) {
        this.graph = graph;
    }
    public void highlightNode(Node node) {
        Graphics g = getGraphics();
        g.setColor(Color.RED);
        g.fillOval(node.getX() - NODE_RADIUS, node.getY() - NODE_RADIUS, NODE_RADIUS * 2, NODE_RADIUS * 2);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        // Vẽ đồ thị
        for (Edge edge : graph.getEdges()) {
            Node start = edge.getStartNode();
            Node end = edge.getEndNode();
            int x1 = start.getX();
            int y1 = start.getY();
            int x2 = end.getX();
            int y2 = end.getY();

            g2.drawLine(x1, y1, x2, y2);

            // Hiển thị độ dài cạnh
            String length = String.valueOf(edge.getLength());
            int midX = (x1 + x2) / 2;
            int midY = (y1 + y2) / 2;
            g2.drawString(length, midX, midY);
        }

        // Vẽ các nút (Node)
        for (Node node : graph.getNodes()) {
            int x = node.getX();
            int y = node.getY();
            g2.fillOval(x - NODE_RADIUS, y - NODE_RADIUS, NODE_RADIUS * 2, NODE_RADIUS * 2);
        }
    }
}
