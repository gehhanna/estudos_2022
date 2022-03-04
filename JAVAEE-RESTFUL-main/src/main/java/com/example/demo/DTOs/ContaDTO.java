package com.example.demo.DTOs;

import com.example.demo.models.ContaModel;

public class ContaDTO {
    
    private Long id;
    private String numeroConta;
    private Double saldo;

    public ContaDTO(){

    }
    // Aqui o DTO e passado para uma ContaModel.
    public ContaDTO(ContaModel contaModel){
        this.id = contaModel.getId();
        this.numeroConta = contaModel.getNumeroConta();
        this.saldo = contaModel.getSaldo();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    

}
