package main.Ejercicio_03_listLevels;

import java.util.List;
import java.util.Stack;

import main.materia.models.Node;

public class ListLevels {
    
    @SuppressWarnings("null")
    public List<List<Node>> listLevels(Node root){
        List<List<Node>> lista1 = null;
        List<Node> lista2 = null;
        if (root != null){
            lista2.add(root);
            lista1.add(lista2);

            lista2.add(root.getLeft());
            lista2.add(root.getRight());
            lista1.add(lista2);

            for (int i = 0; i < lista1.size(); i++){
                lista2.add(i, root.getLeft());
                lista2.add(i, root.getRight());
            }
            
            

        }
        

    }

}
