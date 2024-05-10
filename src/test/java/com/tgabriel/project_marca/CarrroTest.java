package com.tgabriel.project_marca;

import com.tgabriel.project_marca.dao.CarroDao;
import com.tgabriel.project_marca.dao.ICarroDao;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class CarroTest {

	private ICarroDao daoCarro;

	public CarroTest(){
		daoCarro = new CarroDao();
	}
	@Test
	 void cadastrar() {

		Carro carro = new Carro();
		carro.setCodigo("test1");
		carro.setNome("corola");

		daoCarro.cadastrar(carro);

		assertNotNull(carro);
		assertNotNull(carro.getId());
	}

}

