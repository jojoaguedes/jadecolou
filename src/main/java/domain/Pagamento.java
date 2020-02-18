package domain;
import javax.persistence.*;

@Entity
@Table(name = "pagamento")

public class Pagamento implements BaseEntity {
    @Id
    @GeneratedValue(generator = "pagamento_seq",
            strategy = GenerationType.AUTO)
    @Column(name = "id_pagamento")
    private long idPagamento;

//    private int idPessoa;
//    private int idTipoPagamento;
//    private int idVoo;
    @ManyToOne
    @JoinColumn(name="id_pessoa")
    private Pessoa pessoa;
    @ManyToOne
    @JoinColumn(name="id_tipo_pagamento")
    private TipoPagamento tipoPagamento;
    @ManyToOne
    @JoinColumn(name="id_voo")
    private Voo voo;

    public Pagamento() {
    }

    public long getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(long idPagamento) {
        this.idPagamento = idPagamento;
    }

//    public int getIdPessoa() {
//        return idPessoa;
//    }
//
//    public void setIdPessoa(int idPessoa) {
//        this.idPessoa = idPessoa;
//    }
//
//    public int getIdTipoPagamento() {
//        return idTipoPagamento;
//    }
//
//    public void setIdTipoPagamento(int idTipoPagamento) {
//        this.idTipoPagamento = idTipoPagamento;
//    }
//
//    public int getIdVoo() {
//        return idVoo;
//    }
//
//    public void setIdVoo(int idVoo) {
//        this.idVoo = idVoo;
//    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }
    @Override
    public Long getId() {
        return null;
    }
}
