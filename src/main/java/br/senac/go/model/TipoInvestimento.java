package br.senac.go.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data //faz os métodos get,set,tostring, hascode, equals
@Entity //fala para o ORM gerenciar o estado deste item no banco de dados
@Table(name = "TIPO_INVESTIMENTO") //'nomea' a tabela do banco de dados
public class TipoInvestimento {

    @Id //fala que este item é chave primária
    @GeneratedValue(strategy= GenerationType.AUTO) //auto-incremental
    @Column(name = "ID")
    private Integer id;

    @Column(name = "DESCRICAO", length = 120, nullable = false)
    String descricao;

    @Column(name = "TEM_RISCO", length = 1, nullable = false)
    Boolean temRisco;

    @Column(name = "DATA_INICIO")
    LocalDateTime dataInicio;

    @Column(name = "DATA_FIM")
    LocalDateTime dataFim;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INVESTIMENTO_ID")  // Coluna no banco de dados para a chave estrangeira
    private Investimento investimento;
}
