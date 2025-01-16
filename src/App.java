import java.util.List;

import main.Ejercicio_01_insert.InsertBTSTest;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLevels.ListLevels;
import main.Ejercicio_04_depth.Depth;
import main.materia.controllers.ArbolAVL;
import main.materia.controllers.ArbolBinario;
import main.materia.controllers.ArbolRecorridos;
import main.materia.models.Node;

public class App {
    public static void main(String[] args) throws Exception {
        // runArbolBinario();
        // runArbolAvl();
        runEjercicio1();
        runEjercicio2();
        runEjercicio3();
        runEjercicio4();
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

    public static void runEjercicio1(){
        System.out.println("Ejercicio 1:");
        InsertBTSTest insertBTSTest = new InsertBTSTest();
        ListLevels levels = new ListLevels();
        
        int [] values = {5, 3, 7, 2, 4, 6, 8};
        
        for(int i = 0; i < values.length; i++){
            insertBTSTest.insert(values[i]);
        }

        List<List<Node>> lista = levels.listLevels(insertBTSTest.getRoot());
        levels.printList(lista);
        System.out.println("");
    }

    public static void runEjercicio2(){
        System.out.println("Ejercicio 2:");
        InsertBTSTest insertBTSTest = new InsertBTSTest();
        ListLevels levels = new ListLevels();
        
        int [] values = {4, 2, 7, 1, 3, 6, 9};
        
        for(int i = 0; i < values.length; i++){
            insertBTSTest.insert(values[i]);
        }

        System.out.println("Arbol ingresado: ");
        List<List<Node>> lista = levels.listLevels(insertBTSTest.getRoot());
        levels.printList(lista);
        System.out.println("");
        
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        invertBinaryTree.invertTree(insertBTSTest.getRoot());

        System.out.println("Arbol invertido: ");
        lista = levels.listLevels(insertBTSTest.getRoot());
        levels.printList(lista);
        System.out.println("");
    }

    public static void runEjercicio3(){
        System.out.println("Ejercicio 3:");
        ArbolBinario arbolBinario = new ArbolBinario();
        ListLevels levels = new ListLevels();

        int[] valores = {4, 2, 7, 1, 3, 6, 9};

        for (int i = 0; i < valores.length; i++){
            arbolBinario.insert(valores[i]);
        }
        List<List<Node>> lista = levels.listLevels(arbolBinario.getRoot());
        levels.printList(lista);
        System.out.println("");
    }

    public static void runEjercicio4(){
        System.out.println("Ejercicio 4: ");
        InsertBTSTest insertBTSTest = new InsertBTSTest();
        ListLevels levels = new ListLevels();
        
        int [] values = {4, 2, 7, 1, 3, 8};
        
        for(int i = 0; i < values.length; i++){
            insertBTSTest.insert(values[i]);
        }

        List<List<Node>> lista = levels.listLevels(insertBTSTest.getRoot());
        levels.printList(lista);
        Depth depth = new Depth();
        int profundidad = depth.maxDepth(insertBTSTest.getRoot());
        System.out.println("La profundidad del arbol es: " + profundidad);
    }

}
