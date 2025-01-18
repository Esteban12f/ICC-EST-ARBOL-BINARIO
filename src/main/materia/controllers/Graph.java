package main.materia.controllers;

import java.util.ArrayList;
import java.util.List;
import main.materia.models.NodeGraph;

public class Graph {
    private List <NodeGraph> nodes;

    public Graph() {
        this.nodes = new ArrayList<>();
    }

    public NodeGraph addNodeG(int value){
        NodeGraph nodeGraph = new NodeGraph(value);
        nodes.add(nodeGraph);
        return nodeGraph;
    }

    public void addEdge(NodeGraph src,NodeGraph dest){
        src.addNeighbor(dest);
        dest.addNeighbor(src);
    }

    public void printGraph(){
        for(NodeGraph nodeGraph : nodes){
            System.out.print("vertice: " + nodeGraph.getValue() + ": ");
            for(NodeGraph nei : nodeGraph.getNeighbors()){
                System.out.print(nei.getValue() + " - ");
            }
            System.out.println();
        }
    }

    public void getDFS(NodeGraph startNodeG){
    }

    private void getDFSUtil(NodeGraph node , boolean[] visited){
    }

    public void getBFS(NodeGraph startNodeG){
    }

    public int[][] getAdjacencyMatrix(){
        return null;
    }

    public void printAdjacencyMatrix(){
    }
}
