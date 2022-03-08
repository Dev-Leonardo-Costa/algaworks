package br.com.algaworks.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.algaworks.models.Cliente;

@RestController
@RequestMapping(RotasApi.CLIENTE)
public class ClineteController {
    
    @GetMapping
    public List<Cliente> ListarClientes(){
        Cliente cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("Leonardo Silva");
        cliente1.setEmail("leo@gmail.com");
        cliente1.setTelefone("85-992370872");

        Cliente cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("ElisaneSilva");
        cliente2.setEmail("Eli@gmail.com");
        cliente2.setTelefone("85-992368755");
        
        return Arrays.asList(cliente1,cliente2);
    }
}
