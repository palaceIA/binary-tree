public class ArvoreBinaria {
    private Node raiz; 

    public ArvoreBinaria(Node raiz){
        this.raiz = raiz; 
    }

    /*
     Essa função é responsável por inserir um novo valor dentro da árvore binária de busca.
     Primeiro, criamos um novo nó a partir do valor passado como parâmetro.
     Em seguida, verificamos se a árvore ainda está vazia (ou seja, se a raiz é nula). 
     Caso esteja, o novo nó se torna a raiz.
     Caso contrário, percorremos a árvore a partir da raiz, comparando o valor do novo nó
     com os nós existentes para encontrar a posição correta.
     Se o valor for menor, vamos para a esquerda; se for maior, seguimos pela direita.
     Quando encontramos uma posição nula, o novo nó é inserido como filho esquerdo ou direito,
     mantendo a estrutura da árvore binária de busca.
    */
    public void inserir(int value){
        Node novo = new Node(value);
        if(raiz == null) {
            raiz = novo;
        } else {
            Node atual = raiz; 
            Node pai = null; 

            while(atual != null){
                pai = atual;
                if(novo.value < atual.value){
                    atual = atual.esquerda;
                } else {
                    atual = atual.direita;
                }
            }
            
            if(novo.value < pai.value){
                pai.esquerda = novo;
            } else {
                pai.direita = novo;
            }
        }
    }

    /*
     Essa função realiza a busca de um valor dentro da árvore.
     O processo começa a partir da raiz e segue descendo pelos nós de acordo com as comparações.
     - Se o valor buscado for igual ao nó atual, retornamos true.
     - Se o valor for menor, seguimos pela subárvore à esquerda.
     - Se for maior, seguimos pela subárvore à direita.
     Caso o laço termine sem encontrar o valor, significa que ele não está presente na árvore,
     e retornamos false.
    */
    public boolean buscar(int value){
        Node atual = raiz;
        while (atual != null) {
            if(value == atual.value){
                return true;
            } else if(value < atual.value){
                atual = atual.esquerda;
            } else {
                atual = atual.direita;
            }
        } 
        return false;
    }

    /*
     Essa função realiza o percurso em **pré-ordem**.
     A ideia é visitar primeiro o nó atual (raiz), depois a subárvore esquerda e por fim a direita.
     Esse tipo de percurso é útil quando queremos copiar a estrutura da árvore
     ou apenas visualizar sua disposição hierárquica completa.
    */
    public void preOrdem(Node node){
        if(node != null){
            System.out.print(node.value + " ");
            preOrdem(node.esquerda);
            preOrdem(node.direita);
        }
    }

    /*
     Essa função realiza o percurso em **ordem** (ou "em ordem simétrica").
     Primeiro visitamos a subárvore à esquerda, depois o nó atual e, por fim, a subárvore à direita.
     Esse método é muito usado porque, em árvores binárias de busca,
     ele retorna os elementos em **ordem crescente**.
    */
    public void emOrdem(Node node){
        if(node != null){
            emOrdem(node.esquerda);
            System.out.print(node.value + " ");
            emOrdem(node.direita);
        }
    }

    /*
     Essa função realiza o percurso em **pós-ordem**.
     Aqui, o foco é visitar primeiro os filhos (esquerda e direita) e só depois o nó atual.
     Esse tipo de travessia é especialmente útil em operações de remoção ou liberação de memória,
     pois garante que todos os nós filhos sejam processados antes do pai.
    */
    public void posOrdem(Node node){
        if(node != null){
            posOrdem(node.esquerda);
            posOrdem(node.direita);
            System.out.print(node.value + " ");
        }
    }

    /*
     Retorna a raiz da árvore. 
     Esse método é útil para iniciar percursos (como pré-ordem, em ordem ou pós-ordem)
     a partir do nó principal.
    */
    public Node getRaiz(){
        return raiz;
    }
}
