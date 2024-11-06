package com.lugo.api_colombia;

import com.lugo.api_colombia.principal.ApiColombiaClasePrincipal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiColombiaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApiColombiaApplication.class, args);
	}

    @Override
    public void run (String... args) throws Exception {
        ApiColombiaClasePrincipal apiColombiaApplication = new ApiColombiaClasePrincipal ();
        apiColombiaApplication.muestrameElMenu ();
    }
}
