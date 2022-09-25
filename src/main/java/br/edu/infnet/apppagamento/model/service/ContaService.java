package br.edu.infnet.apppagamento.model.service;

import br.edu.infnet.apppagamento.model.domain.Consumo;
import br.edu.infnet.apppagamento.model.domain.Conta;
import br.edu.infnet.apppagamento.model.domain.Usuario;
import br.edu.infnet.apppagamento.model.repository.ContaRepository;
import br.edu.infnet.apppagamento.model.test.AppImpressao;
import ch.qos.logback.core.util.COWArrayList;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ContaService {

    private ContaRepository contaRepository;

    public ContaService(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    public List<Conta> obterLista() {
        return (List<Conta>) contaRepository.findAll();
    }

    public List<Conta> obterLista(Usuario usuario) {
        return (List<Conta>) contaRepository.findAll(usuario.getId());
    }

    public void excluir(Integer id) {
        contaRepository.deleteById(id);
    }
}
