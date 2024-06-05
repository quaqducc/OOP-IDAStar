package com.sortingdemo.model;

public class Edge {
    private Node startNode;
    private Node endNode;
    private int length;

    public Edge(Node startNode, Node endNode, int length) {
        this.startNode = startNode;
        this.endNode = endNode;
        this.length = length;
    }

    public Node getStartNode() {
        return startNode;
    }

    public Node getEndNode() {
        return endNode;
    }

    public int getLength() {
        return length;
    }
}
