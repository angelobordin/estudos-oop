package DesafioCartaoDeCredito.classes;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> listaCompras;
    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaCompras = new ArrayList<Compra>();
    }

    public boolean registraCompra(Compra compra) {
        if (this.saldo < compra.getValorCompra()) return false;
        this.saldo -= compra.getValorCompra();
        listaCompras.add(compra);
        return true;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> listaCompras() {
        return listaCompras;
    }
}
