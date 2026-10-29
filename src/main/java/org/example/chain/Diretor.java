package org.example.chain;

public class Diretor extends AprovadorDesconto {

    @Override
    protected int getLimite() {
        return 30;
    }

    @Override
    protected String getCargo() {
        return "Diretor";
    }
}
