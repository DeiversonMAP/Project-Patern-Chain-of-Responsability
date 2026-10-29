package org.example.chain;

public class CadeiaAprovacao {

    /** Monta Vendedor -> Gerente -> Diretor e devolve o primeiro elo. */
    public static AprovadorDesconto montar() {
        AprovadorDesconto vendedor = new Vendedor();
        vendedor.setProximo(new Gerente()).setProximo(new Diretor());
        return vendedor;
    }
}
