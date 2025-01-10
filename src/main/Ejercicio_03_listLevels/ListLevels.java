package main.Ejercicio_03_listLevels;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import main.materia.models.Node;

public class ListLevels {
    
    @SuppressWarnings("null")
    public List<List<Node>> listLevels(Node root){
        List<List<Node>> lista1 = new ArrayList<>();

        if (root != null){
            Queue<Node> colaNodos = new LinkedList<>();
            colaNodos.add(root);

            while (!colaNodos.isEmpty()) {
                int nivelesCola = colaNodos.size();
                List<Node> lista2 = new ArrayList<>();

                for (int i = 0; i < nivelesCola; i++){
                    Node node = colaNodos.poll();
                    lista2.add(node);
                    if (node.getLeft() != null) {
                        colaNodos.add(node.getLeft());
                    }
        
                    if (node.getRight() != null){
                        colaNodos.add(node.getRight());
                    }
                }
                lista1.add(lista2);
        }

        }
        return lista1;
    }

    public void printList(List<List<Node>> listaDeListas) {
        for (int i = 0; i < listaDeListas.size(); i++){
            List<Node> listaNodos= listaDeListas.get(i);
            for (Node node : listaNodos){
                System.out.print(node.getValue() + " ->");
            }
            System.out.println("");
        }
    }

}
