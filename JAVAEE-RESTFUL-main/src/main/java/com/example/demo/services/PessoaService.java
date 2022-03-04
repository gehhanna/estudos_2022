package com.example.demo.services;

import com.example.demo.DAO.PessoaDAO;
import com.example.demo.DTOs.PessoaDTO;
import com.example.demo.models.PessoaModel;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class PessoaService {

    @EJB
    PessoaDAO pessoaDAO;

    public PessoaService() {
    }

    public PessoaDTO findById(Long id) {
        PessoaModel pessoaModel = pessoaDAO.findById(id);
        return new PessoaDTO(pessoaModel);
    }

    public PessoaDTO findByName(String name) {
        PessoaModel pessoaModel = pessoaDAO.findByName(name);
        return new PessoaDTO(pessoaModel);
    }

    public List<PessoaDTO> findAll() {
        List<PessoaModel> listPessoas = pessoaDAO.list();
        return listPessoas.stream().map(PessoaDTO::new).collect(Collectors.toList());
    }

    @Transactional
    public PessoaModel save(PessoaDTO pessoaDTO) {
        PessoaModel pessoaModel = new PessoaModel(pessoaDTO);
        pessoaDAO.insert(pessoaModel);
        return pessoaModel;
    }

    @Transactional
    public PessoaDTO update(PessoaDTO pessoaDTO) {
        PessoaModel pessoaModel = new PessoaModel(pessoaDTO);
        pessoaDAO.update(pessoaModel);
        return new PessoaDTO(pessoaModel);
    }

    @Transactional
    public void delete(Long id) {
        PessoaModel pessoaModel = pessoaDAO.findById(id);
        pessoaDAO.remove(pessoaModel);
    }
}