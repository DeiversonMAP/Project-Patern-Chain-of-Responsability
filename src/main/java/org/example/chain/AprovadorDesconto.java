package org.example.chain;

public abstract class AprovadorDesconto {

    private AprovadorDesconto proximo;

    /** Define o próximo elo e o devolve, permitindo encadear: a.setProximo(b).setProximo(c). */
    public AprovadorDesconto setProximo(AprovadorDesconto proximo) {
        this.proximo = proximo;
        return proximo;
    }

    protected abstract int getLimite();

    protected abstract String getCargo();

    public String aprovar(int percentual) {
        if (percentual <= getLimite()) {
            return getCargo() + " aprovou desconto de " + percentual + "%";
        }
        if (proximo != null) {
            return proximo.aprovar(percentual);
        }
        return "Desconto de " + percentual + "% rejeitado: acima do limite da cadeia";
    }
}
