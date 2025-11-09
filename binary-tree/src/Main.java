public class Main {
    public static void main(String[] args) {
            ArvoreBinaria arvore = new ArvoreBinaria(new Node(50));

            arvore.inserir(30);
            arvore.inserir(70);
            arvore.inserir(20);
            arvore.inserir(40);
            arvore.inserir(60);
            arvore.inserir(80);

            System.out.println("Percurso em Pré-Ordem (raiz-esquerda-direita):");
            arvore.preOrdem(arvore.getRaiz());
            System.out.println("\n");

            System.out.println("Percurso em Ordem (esquerda-raiz-direita):");
            arvore.emOrdem(arvore.getRaiz());
            System.out.println("\n");

            System.out.println("Percurso em Pós-Ordem (esquerda-direita-raiz):");
            arvore.posOrdem(arvore.getRaiz());
            System.out.println("\n");

            int valorBusca = 40;
            System.out.println("Buscar " + valorBusca + ": " + (arvore.buscar(valorBusca) ? "Encontrado" : "Não encontrado"));
    }
}
