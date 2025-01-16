package main.Ejercicio_04_depth;

import main.materia.models.Node;

public class Depth {
    
    public int maxDepth(Node root){
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.getLeft()), maxDepth(root.getRight()));
    }

}
