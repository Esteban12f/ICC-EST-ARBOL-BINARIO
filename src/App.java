import java.util.List;
import java.util.Scanner;

import main.Ejercicio_01_insert.InsertBTSTest;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLevels.ListLevels;
import main.Ejercicio_04_depth.Depth;
import main.materia.controllers.ArbolAVL;
import main.materia.controllers.ArbolBinario;
import main.materia.controllers.ArbolRecorridos;
import main.materia.controllers.Graph;
import main.materia.models.Node;
import main.materia.models.NodeGraph;

public class App {
    
    public static void main(String[] args) throws Exception {
        // runArbolBinario();
        // runArbolAvl();
        // runEjercicio(1);
        // runEjercicio(2);
        // runEjercicio(3);
        // runEjercicio(4);
        // runGraph();
        runGraph2();
    }

    public static void runArbolBinario(){
        ArbolBinario aB = new ArbolBinario();
        int[] valores = {40, 20, 60, 10, 30, 50, 70, 5, 15, 55};

        for (int i = 0; i < valores.length; i++){
            aB.insert(valores[i]);
        }
        aB.printTree();

        ArbolRecorridos aR = new ArbolRecorridos();
        System.out.println("Recorrido preOrder");
        aR.preOrderRecursivo(aB.getRoot());
        System.out.println("");
        System.out.println("Recorrido posOrder");
        aR.posOrderRecursivo(aB.getRoot());
        System.out.println("");
        System.out.println("Recorrido inOrder");
        aR.inOrderRecursivo(aB.getRoot());
    }

    public static void runArbolAvl(){
        int[] values = {10, 20, 15, 24, 9, 8, 21, 23, 50, 25};

        ArbolAVL aAvl = new ArbolAVL();
        for (int i = 0; i < values.length; i++){
            aAvl.insert(values[i]);
            aAvl.printTree();
        }
        
    }

    public static void runEjercicio(int ejercicio){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio " + ejercicio + ":");
        InsertBTSTest insertBTSTest = new InsertBTSTest();
        ListLevels levels = new ListLevels();
        
        System.out.println("Ingrese la cantidad de nodos q desea ingresar: ");
        int values = scanner.nextInt();
        for(int i = 0; i < values; i++){
            System.out.println("Ingrese el valor del nodo " + (i+1) + ":");
            insertBTSTest.insert(scanner.nextInt());
        }

        List<List<Node>> lista = levels.listLevels(insertBTSTest.getRoot());
        System.out.println("Arbol ingresado: ");
        levels.printList(lista);
        System.out.println("");

        switch (ejercicio) {
            case 2:
                InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
                invertBinaryTree.invertTree(insertBTSTest.getRoot());
                System.out.println("Arbol invertido: ");
                lista = levels.listLevels(insertBTSTest.getRoot());
                levels.printList(lista);
                System.out.println("");
                break;
        

            case 4:
                Depth depth = new Depth();
                int profundidad = depth.maxDepth(insertBTSTest.getRoot());
                System.out.println("La profundidad del arbol es: " + profundidad);
                break;
            
            default:
                break;
        }
    }

    public static void runGraph(){
        Graph grafo = new Graph();
        NodeGraph g2nodo0 = grafo.addNodeG(0);
        NodeGraph g2nodo1 = grafo.addNodeG(1);
        NodeGraph g2nodo2 = grafo.addNodeG(2);
        NodeGraph g2nodo3 = grafo.addNodeG(3);
        NodeGraph g2nodo4 = grafo.addNodeG(4);
        NodeGraph g2nodo5 = grafo.addNodeG(5);
        grafo.addEdge(g2nodo0, g2nodo3);
        grafo.addEdge(g2nodo0, g2nodo5);
        grafo.addEdge(g2nodo3, g2nodo2);
        grafo.addEdge(g2nodo3, g2nodo4);
        grafo.addEdge(g2nodo4, g2nodo1);
        grafo.addEdge(g2nodo2, g2nodo1);
        grafo.addEdge(g2nodo1, g2nodo0);

        //grafo.printGraph();

        Graph grafo2 = new Graph();
        NodeGraph nodo0 = grafo2.addNodeG(0);
        NodeGraph nodo1 = grafo2.addNodeG(1);
        NodeGraph nodo2 = grafo2.addNodeG(2);
        NodeGraph nodo3 = grafo2.addNodeG(3);
        NodeGraph nodo4 = grafo2.addNodeG(4);
        NodeGraph nodo5 = grafo2.addNodeG(5);
        grafo2.addEdgeUni(nodo0, nodo3);
        grafo2.addEdgeUni(nodo0, nodo5);
        grafo2.addEdgeUni(nodo3, nodo2);
        grafo2.addEdgeUni(nodo3, nodo4);
        grafo2.addEdgeUni(nodo4, nodo1);
        grafo2.addEdgeUni(nodo2, nodo1);
        grafo2.addEdgeUni(nodo1, nodo0);

        grafo.printGraph();
        grafo2.printGraph();

        System.out.println("No dirigido: ");
        grafo.getDFS(g2nodo0);
        grafo.getBFS(g2nodo0);
        System.out.println("");

        System.out.println("Dirigido: ");
        grafo2.getDFS(nodo0);
        grafo2.getBFS(nodo0);


    }

    public static void runGraph2(){
        Graph grafo = new Graph();
        NodeGraph nodo0 = grafo.addNodeG(0);
        NodeGraph nodo1 = grafo.addNodeG(1);
        NodeGraph nodo2 = grafo.addNodeG(2);
        NodeGraph nodo3 = grafo.addNodeG(3);
        NodeGraph nodo4 = grafo.addNodeG(4);
        NodeGraph nodo5 = grafo.addNodeG(5);
        NodeGraph nodo7 = grafo.addNodeG(7);
        NodeGraph nodo8 = grafo.addNodeG(8);
        NodeGraph nodo9 = grafo.addNodeG(9);


        grafo.addEdge(nodo0, nodo1);
        grafo.addEdge(nodo0, nodo3);
        grafo.addEdge(nodo0, nodo5);
        grafo.addEdge(nodo3, nodo2);
        grafo.addEdge(nodo3, nodo4);
        grafo.addEdge(nodo3, nodo7);
        grafo.addEdge(nodo3, nodo9);
        grafo.addEdge(nodo2, nodo1);
        grafo.addEdge(nodo4, nodo1);
        grafo.addEdge(nodo7, nodo8);
        grafo.addEdge(nodo8, nodo1);

        grafo.printGraph();

        grafo.getDFS(nodo0);
        grafo.getDFS(nodo0, nodo7);
    }

}
