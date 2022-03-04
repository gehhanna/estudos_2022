package com.example.demo.models;

import java.io.Serializable;

import javax.persistence.*;

import com.example.demo.DTOs.PessoaDTO;

@Entity
@Table(name = "tb_pessoa")
public class PessoaModel implements Serializable {
    // salvar objeto na memoria ou lugar fisico. implementar o serializeble.
    // so sistema remoto.
    private static final long serialVersionUID = 1L;
    // Id para gerar a chave primaria.
    // e o GeneratedValue  com o strategy para modificar a estrategia da chave primaria assim o valor
    // com Type.IDENTITY o banco que geral autoincrement.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // criação de uma nova coluna no banco atribuindo o tipo e a variavel.
    @Column 
    private String email;

    @Column 
    private String senha;

    public PessoaModel(){

    }

    public PessoaModel(PessoaDTO pessoaDTO){
        this.id = pessoaDTO.getId();
        this.email = pessoaDTO.getEmail();
        this.senha = pessoaDTO.getSenha();
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    
}