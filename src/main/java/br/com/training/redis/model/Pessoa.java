package br.com.training.redis.model;

import br.com.training.redis.config.TimeDeserializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@RedisHash
public class Pessoa {

    @Indexed
    private Integer id;
    @Indexed
    private String nome;
    private String sobrenome;
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private Date dataNasc;
    private String telefone;
    private TipoPessoa tpPessoa;

    public Pessoa(String nome,
                  String sobrenome,
                  Date dataNasc,
                  String telefone,
                  TipoPessoa tpPessoa){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.telefone = telefone;
        this.tpPessoa = tpPessoa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public TipoPessoa getTpPessoa() {
        return tpPessoa;
    }

    public void setTpPessoa(TipoPessoa tpPessoa) {
        this.tpPessoa = tpPessoa;
    }

}
