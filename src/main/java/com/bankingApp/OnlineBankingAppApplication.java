package com.bankingApp;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "The New Rising Bank App",
				description = "Backend Rest APIS for NR Bank",
				version = "v1.0",
				contact = @Contact(
						name = "Ramesh Paswan",
						email = "raj168ramesh@gmail.com",
						url = "https://github.com/paswan444ramesh"
				),
				license = @License(
						name = "Ramesh raj ",
						url = "https://github.com/ramesh"
				)

		),
		externalDocs = @ExternalDocumentation(
				description = "Banking app documentation",
				url ="https://github.com/ramesh"
		)
)
public class OnlineBankingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineBankingAppApplication.class, args);
	}

}
