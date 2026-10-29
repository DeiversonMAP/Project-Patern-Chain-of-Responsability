package org.example.chain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AprovadorDescontoTest {

    @Test
    void setProximoDeveDevolverOProximoElo() {
        AprovadorDesconto vendedor = new Vendedor();
        AprovadorDesconto gerente = new Gerente();
        assertSame(gerente, vendedor.setProximo(gerente));
    }

    @Test
    void deveRepassarAoProximoQuandoExcedeOLimite() {
        AprovadorDesconto vendedor = new Vendedor();
        vendedor.setProximo(new Gerente());
        assertEquals("Gerente aprovou desconto de 10%", vendedor.aprovar(10));
    }

    @Test
    void naoDeveRepassarQuandoEstaDentroDoLimite() {
        AprovadorDesconto vendedor = new Vendedor();
        vendedor.setProximo(new Gerente());
        assertEquals("Vendedor aprovou desconto de 3%", vendedor.aprovar(3));
    }
}
