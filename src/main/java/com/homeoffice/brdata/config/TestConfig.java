package com.homeoffice.brdata.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.homeoffice.brdata.entities.Senso;
import com.homeoffice.brdata.repositories.SensoRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	//optei por implementar o CommandLineRunner para popular o BD na inicialização do programa
	
	@Autowired
	private SensoRepository sensoRepository; //injeção de dependencia para acessarmos o BD H2

	@Override
	//implementação do metodo da interface CommandLineRunner contendo o bloco de comandos a serem executados na inicialização
	public void run(String... args) throws Exception {
		
		Senso s1 = new Senso(2010, 15, "Pará", 1506351, "Santa Bárbara do Pará", "RM Belém", "1503", "Metropolitana de Belém", "15007", "Belém", 71545.000, 17154, 4171.000);
		Senso s2 = new Senso(2010, 17, "Tocantins", 1709500, "Gurupi", "RM Gurupi", "1701", "Ocidental do Tocantins", "17005", "Gurupi", 1234374.000, 76765, 16080.000);
		Senso s3 = new Senso(2010, 13, "Amazonas", 1302603, "Manaus", "RM Manaus", "1303", "Centro Amazonense", "13007", "Manaus", 50168821.000, 1802525, 11861.000);
		Senso s4 = new Senso(2010, 14, "Roraima", 1400100, "Boa Vista", "RM da Capital", "1401", "Norte de Roraima", "14001", "Boa Vista", 5123256.000, 284258, 18023.000);
		Senso s5 = new Senso(2010, 21, "Maranhão", 2105302, "Imperatriz", "RM Sudoeste Maranhense", "2102", "Oeste Maranhense", "21009", "Imperatriz", 2936194.000, 247553, 11861.000);
		
		sensoRepository.saveAll(Arrays.asList(s1, s2, s3, s4, s5));
		
	}
	
	
}


