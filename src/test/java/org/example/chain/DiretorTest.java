package org.example.chain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiretorTest {

    @Test
    void deveAprovarDescontoDentroDoLimite() {
        AprovadorDesconto diretor = new Diretor();
        assertEquals("Diretor aprovou desconto de 30%", diretor.aprovar(30));
    }

    @Test
    void deveRejeitarQuandoNaoHaProximoElo() {
        AprovadorDesconto diretor = new Diretor();
        assertEquals("Desconto de 31% rejeitado: acima do limite da cadeia", diretor.aprovar(31));
    }
}
