package br.com.training.redis.service;

import br.com.training.redis.CrudRepository.PessoaRepository;
import br.com.training.redis.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    private PessoaRepository pRepository;

    public PessoaService(@Autowired PessoaRepository pRepository){
        this.pRepository = pRepository;
    }

    public Pessoa save(Pessoa pessoa){
        return this.pRepository.save(pessoa);
    }

    public Optional<Pessoa> getById(int id){
        return this.pRepository.findById(id);
    }

    public List<Pessoa> findByNome(String nome){
        return this.pRepository.findByNome(nome);
    }

    public Iterable<Pessoa> findAll(){
        return this.pRepository.findAll();
    }

    public void delete(int id) {
        Pessoa p = pRepository.findById(id).get(); //vem optional por isso o get()
        this.pRepository.delete(p);
    }

}
