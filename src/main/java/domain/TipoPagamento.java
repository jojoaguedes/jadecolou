package domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipo_pagamento")

public class TipoPagamento implements BaseEntity {
    @Id
    @GeneratedValue(generator = "tipo_pagamento_seq",
            strategy = GenerationType.AUTO)
    @Column(name = "id_tipo_pagamento")
    private long idTipoPagamento;
    @Column (name = "nome_pagamento")
    private String nome;
    @OneToMany(mappedBy="pagamento")
    private List<Pagamento> listaDePagamento;

    public TipoPagamento() {
    }

    public long getIdTipoPagamento() {
        return idTipoPagamento;
    }

    public void setIdTipoPagamento(long idTipoPagamento) {
        this.idTipoPagamento = idTipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pagamento> getListaDePagamento() {
        return listaDePagamento;
    }

    public void setListaDePagamento(List<Pagamento> listaDePagamento) {
        this.listaDePagamento = listaDePagamento;
    }
    @Override
    public Long getId() {
        return null;
    }
}
