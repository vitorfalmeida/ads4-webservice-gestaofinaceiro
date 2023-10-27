package br.senac.go.service;

import br.senac.go.interfaces.IService;
import br.senac.go.model.Investimento;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class InvestimentoService implements IService<Investimento, Integer> {

    @Override
    public Investimento create(Investimento entity) {
        log.info("Executado método InvestimentoService.create");
        log.debug(String.format("Valores: %s", entity.toString()));
        // Implementação da lógica para criar um investimento
        return null;
    }

    @Override
    public Investimento readById(Integer id) throws Exception {
        log.info("Executado método InvestimentoService.readById");
        log.debug(String.format("Valores: %d", id));
        // Implementação da lógica para ler um investimento pelo ID
        return null;
    }

    @Override
    public Investimento read(Investimento entity) throws Exception {
        log.info("Executado método InvestimentoService.read");
        log.debug(String.format("Valores: %s", entity.toString()));
        // Implementação da lógica para ler um investimento
        return null;
    }

    @Override
    public Investimento updateFull(Investimento entity) {
        log.info("Executado método InvestimentoService.updateFull");
        log.debug(String.format("Valores: %s", entity.toString()));
        // Implementação da lógica para atualizar um investimento completamente
        return null;
    }

    @Override
    public Investimento updatePart(Integer id, Investimento entity) throws Exception {
        log.info("Executado método InvestimentoService.updatePart");
        log.debug(String.format("Valores: %d %s", id, entity.toString()));
        // Implementação da lógica para atualizar parte de um investimento
        return null;
    }

    @Override
    public Investimento updateFull(Integer id, Investimento entity) {
        log.info("Executado método InvestimentoService.updateFull");
        log.debug(String.format("Valores: %d %s", id, entity.toString()));
        // Implementação da lógica para atualizar um investimento completamente com ID
        return null;
    }

    @Override
    public Investimento deleteById(Integer id) {
        log.info("Executado método InvestimentoService.deleteById");
        log.debug(String.format("Valores: %d", id));
        // Implementação da lógica para deletar um investimento pelo ID
        return null;
    }

    @Override
    public Investimento delete(Investimento entity) {
        log.info("Executado método InvestimentoService.delete");
        log.debug(String.format("Valores: %s", entity.toString()));
        // Implementação da lógica para deletar um investimento
        return null;
    }
}

