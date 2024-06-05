package com.sortingdemo.model;

import java.util.*;

public class IDAStarSearch {
    private Graph graph;

    public interface SearchListener {
        void onNodeVisited(Node node);
    }

    private SearchListener listener;

    public void setSearchListener(SearchListener listener) {
        this.listener = listener;
    }

    public IDAStarSearch(Graph graph) {
        this.graph = graph;
    }

    public List<Node> search(Node start, Node goal) {
        // Implementation of IDA* search algorithm
        // Call visitNode(node) at appropriate places in the algorithm
        return new ArrayList<>();
    }

    private void visitNode(Node node) {
        if (listener != null) {
            listener.onNodeVisited(node);
        }
        // Logic of the algorithm
    }
}
