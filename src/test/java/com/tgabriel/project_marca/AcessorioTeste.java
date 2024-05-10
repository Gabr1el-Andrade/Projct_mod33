package com.tgabriel.project_marca;

import com.tgabriel.project_marca.dao.AcessorioDao;
import com.tgabriel.project_marca.dao.CarroDao;
import com.tgabriel.project_marca.dao.IAcessorio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AcessorioTeste {

    private IAcessorio daoAC;

    public AcessorioTeste (){
        daoAC = new AcessorioDao();
    }

    @Test
    public void cadastrar() {

        Acessorio ac = new Acessorio();
        ac.setCodigo("test1");
        ac.setNome("corola");
        ac.setDescricao("test");

        daoAC.cadastrar(ac);

        assertNotNull(ac);
        assertNotNull(ac.getId());
    }
}
