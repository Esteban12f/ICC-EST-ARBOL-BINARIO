import main.Ejercicio_03_listLevels.ListLevels;
import main.materia.controllers.ArbolBinario;
import main.materia.controllers.ArbolRecorridos;

public class App {
    public static void main(String[] args) throws Exception {
        // runArbolBinario();
        runEjercicio3();
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
        lista = levels.listLevels(arbolBinario.getRoot());

    }

}
