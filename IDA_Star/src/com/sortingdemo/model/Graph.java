package com.sortingdemo.model;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<Node> nodes;
    private List<Edge> edges;

    public Graph() {
        nodes = new ArrayList<>();
        edges = new ArrayList<>();
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void addNode(Node node) {
        nodes.add(node);
        // Sau mỗi lần thêm nút mới, cập nhật hiển thị trên cả GraphCreationView và GraphPanel
        repaintGraphs();
    }

    public void addEdge(Edge edge) {
        edges.add(edge);
        // Sau mỗi lần thêm cạnh mới, cập nhật hiển thị trên cả GraphCreationView và GraphPanel
        repaintGraphs();
    }

    public Node getNode(String nodeName) {
        for (Node node : nodes) {
            if (node.getName().equals(nodeName)) {
                return node;
            }
        }
        return null; // Nếu không tìm thấy node với tên tương ứng
    }

    private void repaintGraphs() {
        // Thêm code để cập nhật hiển thị trên cả GraphCreationView và GraphPanel ở đây
    }
}
