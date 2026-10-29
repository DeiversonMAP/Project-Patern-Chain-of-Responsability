package org.example.chain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CadeiaAprovacaoTest {

    private final AprovadorDesconto cadeia = CadeiaAprovacao.montar();

    @Test
    void vendedorAprovaDescontoPequeno() {
        assertEquals("Vendedor aprovou desconto de 5%", cadeia.aprovar(5));
    }

    @Test
    void gerenteAprovaDescontoMedio() {
        assertEquals("Gerente aprovou desconto de 12%", cadeia.aprovar(12));
    }

    @Test
    void diretorAprovaDescontoGrande() {
        assertEquals("Diretor aprovou desconto de 25%", cadeia.aprovar(25));
    }

    @Test
    void cadeiaRejeitaDescontoAcimaDeTodosOsLimites() {
        assertEquals("Desconto de 40% rejeitado: acima do limite da cadeia", cadeia.aprovar(40));
    }
}
