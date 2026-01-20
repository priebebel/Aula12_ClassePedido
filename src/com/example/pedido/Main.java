package com.example.pedido;

/**
 * Classe principal para testar a implementação da Classe Pedido
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE PEDIDOS ===\n");
        
        // Criando um novo pedido
        Pedido pedido1 = new Pedido(1001, "João Silva");
        
        // Adicionando itens ao pedido
        ItemPedido item1 = new ItemPedido("Notebook Dell", 1, 3500.00);
        ItemPedido item2 = new ItemPedido("Mouse Logitech", 2, 85.50);
        ItemPedido item3 = new ItemPedido("Teclado Mecânico", 1, 450.00);
        
        pedido1.adicionarItem(item1);
        pedido1.adicionarItem(item2);
        pedido1.adicionarItem(item3);
        
        // Exibindo o pedido
        System.out.println(pedido1);
        
        System.out.println("\n=== MODIFICANDO O PEDIDO ===\n");
        
        // Alterando o status
        pedido1.setStatus("Em Processamento");
        
        // Adicionando mais um item
        ItemPedido item4 = new ItemPedido("Webcam HD", 1, 320.00);
        pedido1.adicionarItem(item4);
        
        // Exibindo o pedido atualizado
        System.out.println(pedido1);
        
        System.out.println("\n=== CRIANDO OUTRO PEDIDO ===\n");
        
        // Criando um segundo pedido
        Pedido pedido2 = new Pedido(1002, "Maria Santos");
        pedido2.adicionarItem(new ItemPedido("Monitor LG 24\"", 2, 850.00));
        pedido2.adicionarItem(new ItemPedido("Cabo HDMI", 2, 35.00));
        pedido2.setStatus("Confirmado");
        
        System.out.println(pedido2);
        
        System.out.println("\n=== REMOVENDO ITEM DO PEDIDO 2 ===\n");
        
        // Removendo um item
        pedido2.removerItem(1);
        
        System.out.println(pedido2);
        
        System.out.println("\nQuantidade de itens no Pedido 1: " + pedido1.quantidadeItens());
        System.out.println("Quantidade de itens no Pedido 2: " + pedido2.quantidadeItens());
    }
}
