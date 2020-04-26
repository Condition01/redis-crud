package br.com.training.redis.controller;


import br.com.training.redis.model.Pessoa;
import br.com.training.redis.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/pessoa")
public class PersonController {

    private PessoaService pService;

    public PersonController(@Autowired PessoaService pService) {
        this.pService = pService;
    }

    @GetMapping(value = "/get/{id}", produces = "application/json")
    public ResponseEntity<Object> getPessoa(@PathVariable("id") int personId) throws NumberFormatException {
        return ResponseEntity.ok().body(pService.getById(personId));
    }

    @PostMapping(value = "/save", produces = "application/json", consumes = "application/json")
    ResponseEntity<Object> savePessoa(@RequestBody Pessoa pessoa) {
        try {
            return ResponseEntity.ok().body(pService.save(pessoa));
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body("Não foi possivel inserir esse usuario");
        }
    }

    @GetMapping(value = "/getAll", produces = "application/json")
    public ResponseEntity<Object> getAllPersons() {
        try {
            return ResponseEntity.ok().body(pService.findAll());
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body("Não foi possivel achar as pessoas solicitadas");
        }
    }

    @GetMapping(value = "/getByName", produces = "application/json")
    public ResponseEntity<Object> getPessoa(@RequestParam("nome") String nome) {
        return ResponseEntity.ok().body(pService.findByNome(nome));
    }

    @DeleteMapping(value = "/delete/{id}", produces = "application/json")
    public void deletePerson(@PathVariable("id") int personId) {
        pService.delete(personId);
    }

}
