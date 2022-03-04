package com.example.demo.DAO;

import javax.ejb.Stateless;

import com.example.demo.models.ContaModel;

@Stateless

public class ContaDAO extends GenericDAO<Long, ContaModel>{

    public ContaModel findByName(String name){
        return getEntityManager()
                .createNamedQuery("Conta.getByName", ContaModel.class)
                .setParameter("nome", name)
                .getSingleResult();
}
