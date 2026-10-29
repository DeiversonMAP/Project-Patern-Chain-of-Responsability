package org.example.chain;

public class Vendedor extends AprovadorDesconto {

    @Override
    protected int getLimite() {
        return 5;
    }

    @Override
    protected String getCargo() {
        return "Vendedor";
    }
}
