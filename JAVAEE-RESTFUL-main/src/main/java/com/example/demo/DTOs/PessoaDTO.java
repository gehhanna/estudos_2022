package com.example.demo.DTOs;

import com.example.demo.models.PessoaModel;

import javax.validation.constraints.NotNull;

public class PessoaDTO {

    private Long id;

    @NotNull
    private String email;
    @NotNull
    private String senha;
    
    public PessoaDTO(){

    }
    
    // PessoaDTO recebendo os parametros da PessoaModel.
    public PessoaDTO(PessoaModel pessoaModel){
        this.id = pessoaModel.getId();
        this.email = pessoaModel.getEmail();
        this.senha = pessoaModel.getSenha();
        
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
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

