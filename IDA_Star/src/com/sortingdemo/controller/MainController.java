package com.sortingdemo.controller;

import com.sortingdemo.model.IDAStarSearch;
import com.sortingdemo.model.Node;

public class MainController {
    private IDAStarSearch searchAlgorithm;

    public void setSearchAlgorithm(IDAStarSearch searchAlgorithm) {
        this.searchAlgorithm = searchAlgorithm;
    }

    public void executeSearch(Node startNode, Node goalNode) {
        if (searchAlgorithm != null) {
            searchAlgorithm.search(startNode, goalNode);
        }
    }
}
