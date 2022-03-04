// alguma regra de negocio pode aplicara aqui na service.
package com.example.demo.services;

import javax.ejb.Stateless;

import com.example.demo.DAO.ContaDAO;
import com.example.demo.DTOs.ContaDTO;
import com.example.demo.models.ContaModel;

import javax.ejb.EJB;

@Stateless
public class ContaService {

    @EJB
    ContaDAO contaDAO;

    public ContaService(){
    }

    @Transactional
    public ContaModel salvar(ContaDTO contaDTO)
    {
       ContaModel conta = new ContaModel(contaDTO);
        contaDAO.insert(conta);
        return conta; 

    }
}
