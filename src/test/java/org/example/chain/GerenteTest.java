package org.example.chain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {

    @Test
    void deveAprovarDescontoDentroDoLimite() {
        AprovadorDesconto gerente = new Gerente();
        assertEquals("Gerente aprovou desconto de 15%", gerente.aprovar(15));
    }

    @Test
    void deveRejeitarQuandoNaoHaProximoElo() {
        AprovadorDesconto gerente = new Gerente();
        assertEquals("Desconto de 16% rejeitado: acima do limite da cadeia", gerente.aprovar(16));
    }
}
