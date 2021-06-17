package com.apiantonio.apiantonio.controller;

import com.apiantonio.apiantonio.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@RestController
public class ClienteController {

    @PersistenceContext //vai injetar um EntityManger na variavael manager
    private EntityManager manager;

    //Método que retorna uma lista de clientes
    @GetMapping("/clientes")
    public List<Cliente> listar(){
//        Cliente cliente = new Cliente();
//        cliente.setId(1L);
//        cliente.setNome("Antonio");
//        cliente.setEmail("abalsant@hotmail.com");
//        cliente.setFone("21 990605-9085");
//
//        Cliente cliente1 = new Cliente();
//        cliente1.setId(2L);
//        cliente1.setNome("Luan");
//        cliente1.setEmail("luan@gamil.com");
//        cliente1.setFone("21 99999-9999");
//
//        return Arrays.asList(cliente, cliente1);

        return manager.createQuery("from Cliente", Cliente.class)
                .getResultList();

    }


}
