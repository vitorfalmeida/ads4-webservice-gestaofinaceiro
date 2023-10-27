package br.senac.go.resource;

import br.senac.go.interfaces.IResource;
import br.senac.go.model.Investimento;
import br.senac.go.service.InvestimentoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/investimento")
@Tags({
        @Tag(name = "investimento", description = "Documentação para o recurso de investimento")
})
public class InvestimentoResource implements IResource<Investimento, Integer> {

    @Autowired
    private InvestimentoService investimentoService; // Supondo que você tenha um serviço para Investimento

    @PostMapping(
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }
    )
    public Investimento create(@Valid @RequestBody Investimento entity) {
        log.info("Executado método InvestimentoResource.create");
        log.debug(String.format("Valores: %s", entity.toString()));
        return investimentoService.create(entity);
    }

    @Override
    @GetMapping(
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }
    )
    public Investimento read(@Valid @RequestBody Investimento entity) throws Exception {
        log.info("Executado método InvestimentoResource.read");
        log.debug(String.format("Valores: %s", entity.toString()));
        return investimentoService.read(entity);
    }

    @GetMapping("/{id}")
    public Investimento readById(@PathVariable Integer id) throws Exception {
        log.info("Executado método InvestimentoResource.readById");
        log.debug(String.format("Valores: %d", id));
        return investimentoService.readById(id);
    }

    @Override
    public Investimento update(Investimento entity) {
        return null;
    }

    @PatchMapping("/{id}")
    public Investimento updatePart(@PathVariable Integer id, @Valid @RequestBody Investimento entity) throws Exception {
        log.info("Executado método InvestimentoResource.updatePart");
        log.debug(String.format("Valores: %d %s", id, entity.toString()));
        return investimentoService.updatePart(id, entity);
    }

    @PutMapping("/{id}")
    public Investimento updateFull(@PathVariable Integer id, @Valid @RequestBody Investimento entity) {
        log.info("Executado método InvestimentoResource.updateFull");
        log.debug(String.format("Valores: %s", entity.toString()));
        return investimentoService.updateFull(id, entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        log.info("Executado método InvestimentoResource.delete");
        log.debug(String.format("Valores: %d", id));
        investimentoService.deleteById(id);
    }

    @Override
    @DeleteMapping(
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }
    )
    public void deleteByEntity(@Valid @RequestBody Investimento entity) {
        log.info("Executado método InvestimentoResource.deleteByEntity");
        log.debug(String.format("Valores: %s", entity.toString()));
        investimentoService.delete(entity);
    }
}

