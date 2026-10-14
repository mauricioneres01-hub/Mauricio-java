# 🧬 Trabalho Prático: Teoria dos Conjuntos e Conjuntos Numéricos - Disciplina Matemática para computação

* **Nome do Integrante 1: Mauricio Neres  
* **Nome do Integrante 2: Vicent Ka Soen Lam 

Este projeto é um laboratório computacional desenvolvido em **Java** para aplicar conceitos matemáticos de Teoria dos Conjuntos, Classificação de Conjuntos Numéricos e Operações com Intervalos Reais.

## 🛠️ 1. Organização do Código e Decisões Tomadas

O projeto foi estruturado utilizando conceitos de **Orientação a Objetos** e **Modularização** no pacote `Matematica`. Cada responsabilidade foi isolada em arquivos independentes para garantir a qualidade, legibilidade e fácil manutenção do código:

*   **`Main.java`:** Ponto de entrada do sistema que gerencia o fluxo entre as três partes principais do trabalho.
*   **`Menu.java`:** Centraliza a exibição gráfica em modo texto do menu principal.
*   **`Teoria.java`:** Controla o submenu da **Parte 1**, gerenciando a criação dinâmica dos Conjuntos A e B, barrando elementos repetidos na entrada e direcionando as operações.
*   **`Conjuntos.java`:** Contém o classificador genérico da **Parte 2**.
*   **`Intervalos.java`:** Desenvolve a lógica matemática de intervalos contínuos da **Parte 3**.
*   **Arquivos de Operação (`Uniao.java`, `Intersecao.java`, etc.):** Cada operação matemática da Parte 1 possui sua própria classe isolada.

### 🛡️ Abordagem do Desafio (Lógica Manual)
Conforme exigido pelo desafio, **não foram utilizados operadores ou métodos nativos de conjuntos** do Java (como `HashSet` ou operações automáticas). Toda a lógica foi desenvolvida "no braço", utilizando estruturas clássicas de repetição (`for`), acesso posicional por índice (`.get(i)`) e operadores de negação condicionais (`!`) para realizar buscas e agrupamentos manuais.

---

## 📝 2. Relatório do Projeto (1 Página)

### Onde a teoria dos conjuntos apareceu no código?
A teoria dos conjuntos serviu como base estrutural para todo o algoritmo do programa:
1.  **Validação de Dados:** Na entrada de elementos em `Teoria.java`, onde a propriedade de que um conjunto não possui elementos duplicados foi garantida checando a existência do item antes da inserção.
2.  **Relação de Inclusão e Herança na Parte 2:** Ao classificar um número, a lógica respeitou a hierarquia dos conjuntos numéricos (\(\mathbb{N} \subset \mathbb{Z} \subset \mathbb{Q} \subset \mathbb{R}\)), fazendo com que um número Natural acumule automaticamente as justificativas e pertinências de Inteiro, Racional e Real.
3.  **Topologia dos Intervalos Reais na Parte 3:** A teoria apareceu na definição dos limites geométricos das retas reais, onde a união e a interseção foram solucionadas mapeando logicamente o maior início (`Math.max`) e o menor fim (`Math.min`) dos intervalos.

### Qual operação foi a mais difícil de implementar e por quê?
A operação mais difícil de implementar foi o **Classificador de Números (Parte 2)** contido no arquivo `Conjuntos.java`. 

Ela foi a mais complexa porque exigiu transformar regras matemáticas abstratas em validações de análise textual estrita. Identificar uma dízima periódica genérica a partir do padrão de parênteses adotado pelo professor (ex: `1,2(5)`), extrair os números corretos de uma fração quebrando o texto na barra (`/`) usando `.split()`, e calcular se uma raiz genérica como `r9` ou `r2` era um quadrado perfeito exato ou um número irracional exigiu uma engenharia de manipulação de Strings muito minuciosa para evitar que o programa disparasse falhas de conversão de dados executando com entradas aleatórias.

---

## 📊 3. Casos de Teste e Logs de Execução

### 🔹 Parte 1: Teoria dos Conjuntos (Casos de Borda do Gabarito)

#### Caso Geral (Elementos repetidos ignorados na entrada)
*   **Entrada inserida:** \(A = \{1, 1, 2, 3, 4\}\) | \(B = \{3, 4, 5, 6\}\)
*   **Logs do Terminal:**
    *   `A uniao dos conjuntos A e B e: [1, 2, 3, 4, 5, 6]` (Duplicidade eliminada)
    *   `A intersecao dos conjuntos A e B e: [3, 4]`
    *   `A diferenca (A - B) e: [1, 2]`
    *   `A diferenca (B - A) e: [5, 6]`
    *   `A diferenca Simetrica e: [1, 2, 5, 6]`
    *   `A cardinalidade do Conjunto A e: 4` | `A cardinalidade do Conjunto B e: 4`

#### Validação da Solução Nativa (Exigência do Enunciado)
Ao selecionar a opção de Complemento, o sistema calcula o resultado usando o algoritmo manual e o compara com o método nativo `.removeAll()` do Java:
*   `-> Resultado da Implementacao Manual: [5, 6, 7, 8, 9, 10]`
*   `-> Resultado da Solucao Nativa (.removeAll): [5, 6, 7, 8, 9, 10]`
*   `STATUS: Validacao concluida com sucesso! Ambas as solucoes sao iguais.`

#### Conjuntos Disjuntos
*   **Entrada:** \(A = \{1, 2\}\) | \(B = \{3, 4\}\)
*   **Logs do Terminal:**
    *   `A intersecao dos conjuntos A e B e: []` (Conjunto Vazio comprovado)

#### Conjuntos Iguais
*   **Entrada:** \(A = \{1, 2, 3\}\) | \(B = \{1, 2, 3\}\)
*   **Logs do Terminal:**
    *   `A diferenca (A - B) e: []`
    *   `A diferenca Simetrica e: []`

---

## 📐 4. Mini-Projeto: Intervalos Reais (Parte 3)

### Comparação de Cálculos: À Mão vs. Programa

Para validar a corretude da Parte 3, realizamos o teste com os intervalos **\(A = [1.0, 5.0]\)** e **\(B = [3.0, 7.0]\)**.

#### 📋 Tabela de Validação dos Resultados:

| Operação | Cálculo Realizado à Mão | Saída Real do Programa | Status |
| :--- | :--- | :--- | :--- |
| **União (\(A \cup B\))** | \([1.0, 7.0]\) | `Resultado da Uniao: [1.0, 7.0]` | **Concluído com Sucesso** |
| **Interseção (\(A \cap B\))** | \([3.0, 5.0]\) | `Resultado da Intersecao: [3.0, 5.0]` | **Concluído com Sucesso** |
| **Pertinência (\(4.0\))** | \(4.0 \in A\) (Sim) \| \(4.0 \in B\) (Sim) | `O numero 4.0 PERTENCE ao Intervalo A.` <br> `O numero 4.0 PERTENCE ao Intervalo B.` | **Concluído com Sucesso** |
| **Pertinência (\(6.0\))** | \(6.0 \notin A\) (Não) \| \(6.0 \in B\) (Sim) | `O numero 6.0 NAO pertence ao Intervalo A.` <br> `O numero 6.0 PERTENCE ao Intervalo B.` | **Concluído com Sucesso** |

*(Nota da equipe: os cenários com intervalos totalmente disjuntos também foram validados, exibindo a mensagem `[ ] (Intersecao Vazia!)` corretamente na tela).*