package br.senai.sc.demo.controller;

import org.springframework.web.bind.annotation.*;


// @RestController
//
// Determina que a classe é gerenciada pelo Spring, do estereótipo RestController
// Facilita a identificação de endpoints pelo Spring

// @RequestMapping("/teste")
//
// localhost:8080/teste
// Determina qual a uri "base" para os endpoints da controller

// Endpoint
//
// Uma interface por onde outras aplicações interagem com a api, formado por: rota (/teste) e método (GET)

// @PathVariable
//
// Forma de ifentificar variáveis de caminho
// localhost:8080/teste/123
// @GetMapping("/{id}")
// public String endpointGet(@PathVariable int id) {
//     return "GET: " + id;
// }
//
// Também é possível definir nomes diferentes de PathVariable e variável dentro da função utilizando name,
// ao utilizar value podemos definir um valor default para a variável
// @GetMapping("/{idPut}")
// localhost:8080/teste/123
// public String endpointGet(@PathVariable(name = "idPut") int id) {
//     return "GET: " + id;
// }

// @RequestBody
//
// Forma de identificar e atribuir o corpo (informações pertinentes à requisição) da requisição à uma variável
// @PostMapping
// public String endpointPost(@RequestBody String nome) {
//     return "POST - Olá, " + nome + ".";
// }

// @RequestParam
//
// Forma de identificar e atribuir os valores de parâmetros de URI às variáveis
// localhost:8080/teste?id=123
// @PatchMapping()
// public String endpointPatch(@RequestParam int id, @RequestBody String nome) {
//     return "PATCH - ID: " + id + " - Olá, " + nome + ".";
// }

// Métodos
//
// GET -> Retorna objetos a quem consumir a interface, podendo ser um único objeto ou uma lista;
// DELETE -> Remove/desabilita algo;
// PATCH -> Atualização pequena/parcial de um único atributo (comumente); => É possível ter um body
// PUT -> Atualização de uma quantidade maior de informações de um objeto; => É necessário ter um body
// POST -> Recebe informações de um novo objeto e salva-as em algum lugar; => É necessário ter um body

@RestController
@RequestMapping("/teste")
public class PrimeiroEndpointController {

    @GetMapping
    public String endpointGet() {
        return "GET";
    }

    @GetMapping("/{id}")
    public String endpointGet(@PathVariable int id) {
        return "GET: " + id;
    }

    @PostMapping
    public String endpointPost(@RequestBody String nome) {
        return "POST - Olá, " + nome + ".";
    }

    @PutMapping("/{id}")
    public String endpointPut(@PathVariable int id, @RequestBody String nome) {
        return "PUT - ID: " + id + " - Olá, " + nome + ".";
    }

    @PatchMapping("/{id}")
    public String endpointPatch(@PathVariable int id, @RequestBody String nome) {
        return "PATCH - ID: " + id + " - Olá, " + nome + ".";
    }

    @DeleteMapping("/{id}")
    public String endpointDelete(@PathVariable int id) {
        return "DELETE - ID: " + id;
    }

}
