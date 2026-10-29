package org.example.chain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendedorTest {

    @Test
    void deveAprovarDescontoDentroDoLimite() {
        AprovadorDesconto vendedor = new Vendedor();
        assertEquals("Vendedor aprovou desconto de 5%", vendedor.aprovar(5));
    }

    @Test
    void deveRejeitarQuandoNaoHaProximoElo() {
        AprovadorDesconto vendedor = new Vendedor();
        assertEquals("Desconto de 6% rejeitado: acima do limite da cadeia", vendedor.aprovar(6));
    }
}
