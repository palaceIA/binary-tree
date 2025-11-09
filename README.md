# 🌳 Árvore Binária de Busca (Binary Search Tree - BST)

Este projeto implementa uma **Árvore Binária de Busca (BST)** em **Java**, com as operações básicas de:

- Inserção de nós 🧩  
- Busca de valores 🔍  
- Percursos **Pré-Ordem**, **Em-Ordem** e **Pós-Ordem** utilizando **recursividade** 🔁  

---

## 🚀 Estrutura do Projeto

O projeto é composto por duas classes principais:

### 🧱 `Node.java`
Representa um nó da árvore, contendo:
- `value` → valor armazenado  
- `esquerda` → referência para o nó à esquerda  
- `direita` → referência para o nó à direita  

### 🌿 `ArvoreBinaria.java`
Implementa a árvore binária, com os seguintes métodos:
- `inserir(int value)` → adiciona um novo nó na posição correta  
- `buscar(int value)` → verifica se um valor existe na árvore  
- `preOrdem(Node node)` → percorre raiz → esquerda → direita  
- `emOrdem(Node node)` → percorre esquerda → raiz → direita  
- `posOrdem(Node node)` → percorre esquerda → direita → raiz  

Além disso, há um método `main` para demonstração completa da árvore.

---

## 💡 Conceitos Importantes

### 🧠 1. O que é **recursividade**?
Recursividade é uma **técnica de programação em que uma função chama a si mesma** para resolver um problema menor de uma mesma natureza.  
Ela é muito usada quando um problema pode ser dividido em **subproblemas semelhantes**, como no caso de percorrer estruturas hierárquicas (ex: árvores e diretórios).


### 🧠 2. Como a recursividade é usada na percorrência (travessia) de uma **árvore binária**?
Nas árvores, cada nó pode ser visto como a raiz de uma subárvore.A recursividade facilita o processo de percorrer todos os nós, pois basta aplicar a mesma lógica a cada subárvore.

### 🔄 3. Qual a diferença entre **recursão e laço (for/while)**?
A principal diferença entre recursão e laço está na forma como cada um controla a repetição de um bloco de código.Na recursão, uma função chama a si mesma até atingir uma condição base que interrompe o processo. Cada chamada cria uma nova entrada na pilha de execução, o que consome mais memória, mas torna o código mais elegante e natural para problemas hierárquicos

Já os laços (for, while) repetem um conjunto de instruções de forma iterativa, usando variáveis de controle e condições lógicas. São mais eficientes em termos de desempenho e consumo de memória, e geralmente preferidos em estruturas lineares, como listas e vetores.