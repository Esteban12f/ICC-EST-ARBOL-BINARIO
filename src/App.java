import java.util.List;

import main.Ejercicio_03_listLevels.ListLevels;
import main.materia.controllers.ArbolAVL;
import main.materia.controllers.ArbolBinario;
import main.materia.controllers.ArbolRecorridos;
import main.materia.models.Node;

public class App {
    public static void main(String[] args) throws Exception {
        // runArbolBinario();
        // runEjercicio3();
        runArbolAvl();
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

    public static void runEjercicio3(){
        ArbolBinario arbolBinario = new ArbolBinario();
        ListLevels levels = new ListLevels();

        int[] valores = {4, 2, 1, 3, 7, 6, 9};

        for (int i = 0; i < valores.length; i++){
            arbolBinario.insert(valores[i]);
        }
        arbolBinario.printTree();
        List<List<Node>> lista = levels.listLevels(arbolBinario.getRoot());
        levels.printList(lista);

    }

    public static void runArbolAvl(){
        int[] values = {10, 20, 15, 24, 9, 8, 21, 23, 50, 25};

        ArbolAVL aAvl = new ArbolAVL();
        for (int i = 0; i < values.length; i++){
            aAvl.insert(values[i]);
            aAvl.printTree();
        }
        
    }

}
