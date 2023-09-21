package DesafioCartaoDeCredito.classes;

public class Compra {
    private String descricaoCompra;
    private double valorCompra;

    public Compra(String descricao, double valor) {
        this.descricaoCompra = descricao;
        this.valorCompra = valor;
    }

    public String getDescricaoCompra() { return this.descricaoCompra; };
    public double getValorCompra() { return this.valorCompra; };

    @Override
    public String toString() {
        return this.descricaoCompra + " no valor de " + this.valorCompra;
    }
}
