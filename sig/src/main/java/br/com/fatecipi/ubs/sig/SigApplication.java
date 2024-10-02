package br.com.fatecipi.ubs.sig;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import br.com.fatecipi.ubs.sig.armazenamento.ArmazenamentoPropriedades;
import br.com.fatecipi.ubs.sig.armazenamento.ArmazenamentoService;

@SpringBootApplication
@EnableConfigurationProperties(ArmazenamentoPropriedades.class)	
public class SigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SigApplication.class, args);
	}

	@Bean
	CommandLineRunner init(ArmazenamentoService armazenamentoService) {
		return (args) -> {
			armazenamentoService.deletarTodos();
			armazenamentoService.init();
			System.out.println("Iniciando a aplicação...");
		};
	}

}
