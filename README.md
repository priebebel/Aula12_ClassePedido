# Aula12_ClassePedido
Criação da Classe Pedido

## Descrição
Este projeto implementa um sistema de gerenciamento de pedidos em Java, desenvolvido como exercício de aula. O sistema permite criar pedidos, adicionar itens, calcular totais e gerenciar o status dos pedidos.

## Estrutura do Projeto
```
src/com/example/pedido/
├── ItemPedido.java  # Classe que representa um item do pedido
├── Pedido.java      # Classe principal que representa um pedido
└── Main.java        # Classe de demonstração
```

## Funcionalidades

### Classe ItemPedido
- Armazena informações sobre produtos (nome, quantidade, preço unitário)
- Calcula o subtotal de cada item
- Validação de entrada (quantidade e preço não podem ser negativos)

### Classe Pedido
- Gerencia informações do pedido (número, data, cliente, status)
- Adiciona e remove itens do pedido
- Calcula o total do pedido
- Exibe informações formatadas do pedido
- Proteção contra modificações externas da lista de itens

## Como Compilar e Executar

### Compilar
```bash
javac -d bin src/com/example/pedido/*.java
```

### Executar
```bash
java -cp bin com.example.pedido.Main
```

## Exemplo de Uso
```java
// Criar um novo pedido
Pedido pedido = new Pedido(1001, "João Silva");

// Adicionar itens
pedido.adicionarItem(new ItemPedido("Notebook Dell", 1, 3500.00));
pedido.adicionarItem(new ItemPedido("Mouse Logitech", 2, 85.50));

// Alterar status
pedido.setStatus("Em Processamento");

// Exibir pedido
System.out.println(pedido);

// Calcular total
double total = pedido.calcularTotal();
```

## Recursos Implementados
- ✅ Encapsulamento adequado com getters/setters
- ✅ Validação de entrada de dados
- ✅ Métodos de negócio (adicionar/remover itens, calcular total)
- ✅ Formatação de saída com toString()
- ✅ Uso de Collections (ArrayList)
- ✅ Proteção de dados com lista imutável no getter
- ✅ Documentação Javadoc
- ✅ Sem vulnerabilidades de segurança (verificado com CodeQL)
