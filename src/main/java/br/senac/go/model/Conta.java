package br.senac.go.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "CONTA")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "DESCRICAO", nullable = false)
    private String descricao;

    @Column(name = "DATA_INICIO", nullable = false)
    private LocalDateTime dataInicio;

    @Column(name = "DATA_FIM")
    private LocalDateTime dataFim;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TIPO_CONTA_ID")  // Coluna no banco de dados para a chave estrangeira
    private TipoConta tipoConta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PESSOA_ID")  // Coluna no banco de dados para a chave estrangeira
    private Pessoa pessoa;
}
