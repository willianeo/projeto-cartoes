package io.github.cursodsousa.msavaliadorcredito.infra.clients;

import io.github.cursodsousa.msavaliadorcredito.domain.DadosCliente;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// @FeignClient(url = "http://localhost:8080", path = "/clientes") direto via http
@FeignClient(value = "msclientes", path = "/clientes")
public interface ClienteResourceClient {

    @GetMapping
    public ResponseEntity<DadosCliente> dadosCliente(@RequestParam("cpf") String cpf);
}
