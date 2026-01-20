package com.example.pedido;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um pedido
 */
public class Pedido {
    private int numeroPedido;
    private LocalDate dataPedido;
    private String cliente;
    private List<ItemPedido> itens;
    private String status;
    
    /**
     * Construtor da classe Pedido
     * @param numeroPedido Número do pedido
     * @param cliente Nome do cliente
     */
    public Pedido(int numeroPedido, String cliente) {
        this.numeroPedido = numeroPedido;
        this.dataPedido = LocalDate.now();
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.status = "Pendente";
    }
    
    // Getters e Setters
    public int getNumeroPedido() {
        return numeroPedido;
    }
    
    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }
    
    public LocalDate getDataPedido() {
        return dataPedido;
    }
    
    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }
    
    public String getCliente() {
        return cliente;
    }
    
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public List<ItemPedido> getItens() {
        return itens;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Adiciona um item ao pedido
     * @param item Item a ser adicionado
     */
    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }
    
    /**
     * Remove um item do pedido
     * @param item Item a ser removido
     * @return true se o item foi removido, false caso contrário
     */
    public boolean removerItem(ItemPedido item) {
        return itens.remove(item);
    }
    
    /**
     * Remove um item do pedido pelo índice
     * @param indice Índice do item a ser removido
     */
    public void removerItem(int indice) {
        if (indice >= 0 && indice < itens.size()) {
            itens.remove(indice);
        }
    }
    
    /**
     * Calcula o valor total do pedido
     * @return Valor total do pedido
     */
    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }
    
    /**
     * Retorna a quantidade total de itens no pedido
     * @return Quantidade de itens
     */
    public int quantidadeItens() {
        return itens.size();
    }
    
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        StringBuilder sb = new StringBuilder();
        
        sb.append("=".repeat(60)).append("\n");
        sb.append("PEDIDO Nº ").append(numeroPedido).append("\n");
        sb.append("=".repeat(60)).append("\n");
        sb.append("Cliente: ").append(cliente).append("\n");
        sb.append("Data: ").append(dataPedido.format(formatter)).append("\n");
        sb.append("Status: ").append(status).append("\n");
        sb.append("-".repeat(60)).append("\n");
        sb.append("ITENS DO PEDIDO:\n");
        sb.append("-".repeat(60)).append("\n");
        
        if (itens.isEmpty()) {
            sb.append("Nenhum item no pedido.\n");
        } else {
            for (int i = 0; i < itens.size(); i++) {
                sb.append((i + 1)).append(". ").append(itens.get(i).toString()).append("\n");
            }
        }
        
        sb.append("-".repeat(60)).append("\n");
        sb.append(String.format("TOTAL: R$ %.2f\n", calcularTotal()));
        sb.append("=".repeat(60)).append("\n");
        
        return sb.toString();
    }
}
