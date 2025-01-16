package main.Ejercicio_01_insert;
import main.materia.models.Node;

public class InsertBTSTest {
    
    private Node root;
    
    public void insert(int value){
        root = insert(root, value);
    }
    
    public Node insert(Node root, int value){
        if (root == null) return new Node(value);

        if (value < root.getValue()){
            root.setLeft(insert(root.getLeft(), value));
        } else {
            root.setRight(insert(root.getRight(), value));
        }
        return root;
    }

    public Node getRoot() {
        return root;
    }
}
