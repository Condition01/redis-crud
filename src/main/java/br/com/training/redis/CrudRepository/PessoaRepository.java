package br.com.training.redis.CrudRepository;

import br.com.training.redis.model.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Integer> {
    List<Pessoa> findByNome(String nome);
}
