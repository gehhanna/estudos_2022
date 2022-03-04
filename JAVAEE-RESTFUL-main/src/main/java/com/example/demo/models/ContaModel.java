package com.example.demo.models;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.demo.DTOs.ContaDTO;

public class ContaModel implements Serializable {

    private static final long serialVersionUID = 1L;
    // A anotação @Id é usada para especificar a chave primária de uma entidade. 
    @Id
    // modificar a estratégia de geração da chave primária.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    // criando uma coluna com o nome "numero_conta"
    @Column (name = "numero_conta")
    private String numeroConta;
    
    @Column 
    // double mecher com dinheiro pois e mais preciso nas virgulas.
    private Double saldo;
    // Construtor vazio.
    public ContaModel(){

    }
    // Construtor sobrecarregado.
    // transformando a conta model em DTO.
    public ContaModel(ContaDTO contaDTO) {
        this.id = contaDTO.getId();
        this.numeroConta = contaDTO.getNumeroConta();
        this.saldo = contaDTO.getSaldo();
    }
    // Gets e Seters. Get para poder obter um dado, Set para alteração.
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
