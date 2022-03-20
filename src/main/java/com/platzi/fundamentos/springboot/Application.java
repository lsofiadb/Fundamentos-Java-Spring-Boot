package com.platzi.fundamentos.springboot;

import com.platzi.fundamentos.springboot.component.TipoIVA;
import com.platzi.fundamentos.springboot.service.ServicioImpuestosFrancia;
import com.platzi.fundamentos.springboot.service.ServicioImpuestosItalia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	ServicioImpuestosItalia servicioImpuestosItalia;
	@Autowired
	ServicioImpuestosFrancia servicioImpuestosFrancia;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(servicioImpuestosItalia.calcularGastoConIVA(40000));
		System.out.println(servicioImpuestosFrancia.calcularGastoConIVA(40000));
	}
}
