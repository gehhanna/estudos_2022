package com.example.demo.DAO;

import com.example.demo.models.PessoaModel;

import javax.ejb.Stateless;

@Stateless
public class PessoaDAO extends GenericDAO<Long, PessoaModel>{

    public PessoaModel findByName(String name){
        return getEntityManager()
                .createNamedQuery("Pessoa.getByName", PessoaModel.class)
                .setParameter("nome", name)
                .getSingleResult();
    }
}