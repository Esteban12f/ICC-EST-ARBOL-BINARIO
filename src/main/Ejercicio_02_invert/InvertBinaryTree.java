package main.Ejercicio_02_invert;

import main.materia.models.Node;

public class InvertBinaryTree {
    
    public Node invertTree(Node root){
        if (root != null){
            Node aux = root.getRight();
            root.setRight(root.getLeft());
            root.setLeft(aux);
            invertTree(root.getLeft());
            invertTree(root.getRight());
        }
        return root;
    }

}
