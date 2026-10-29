package org.example.chain;

public class Gerente extends AprovadorDesconto {

    @Override
    protected int getLimite() {
        return 15;
    }

    @Override
    protected String getCargo() {
        return "Gerente";
    }
}
