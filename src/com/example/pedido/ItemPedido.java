package com.example.pedido;

/**
 * Classe que representa um item do pedido
 */
public class ItemPedido {
    private String produto;
    private int quantidade;
    private double precoUnitario;
    
    /**
     * Construtor da classe ItemPedido
     * @param produto Nome do produto
     * @param quantidade Quantidade do produto
     * @param precoUnitario Preço unitário do produto
     */
    public ItemPedido(String produto, int quantidade, double precoUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }
    
    // Getters e Setters
    public String getProduto() {
        return produto;
    }
    
    public void setProduto(String produto) {
        this.produto = produto;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public double getPrecoUnitario() {
        return precoUnitario;
    }
    
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    
    /**
     * Calcula o subtotal do item (quantidade * preço unitário)
     * @return Subtotal do item
     */
    public double calcularSubtotal() {
        return quantidade * precoUnitario;
    }
    
    @Override
    public String toString() {
        return String.format("Produto: %s | Quantidade: %d | Preço Unit.: R$ %.2f | Subtotal: R$ %.2f",
                           produto, quantidade, precoUnitario, calcularSubtotal());
    }
}
