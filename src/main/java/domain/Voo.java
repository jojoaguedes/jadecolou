package domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "voo")

public class Voo implements BaseEntity {
    @Id
    @GeneratedValue(generator = "voo_seq",
            strategy = GenerationType.AUTO)
    @Column(name = "id_voo")
    private long idVoo;
    @Column(name="preco")
    private double preco;
    @Column(name="nome_voo")
    private String nome;
    @Column(name="total_vagas")
    private int totalVagas;
    @Column(name="fl_encerrado")
    private Boolean flEncerrado = false;
    @OneToMany(mappedBy="voo")
    private List<Pagamento> listaPagamentos;
    @ManyToOne
    @JoinColumn(name="id_cidade")
    private Cidade cidade;
//    private int idCidade;

    public Voo() {
    }

    public long getIdVoo() {
        return idVoo;
    }

    public void setIdVoo(long idVoo) {
        this.idVoo = idVoo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalVagas() {
        return totalVagas;
    }

    public void setTotalVagas(int totalVagas) {
        this.totalVagas = totalVagas;
    }

    public Boolean getFlEncerrado() {
        return flEncerrado;
    }

    public void setFlEncerrado(Boolean flEncerrado) {
        this.flEncerrado = flEncerrado;
    }

    public List<Pagamento> getListaPagamentos() {
        return listaPagamentos;
    }

    public void setListaPagamentos(List<Pagamento> listaPagamentos) {
        this.listaPagamentos = listaPagamentos;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

//    public int getIdCidade() {
//        return idCidade;
//    }
//
//    public void setIdCidade(int idCidade) {
//        this.idCidade = idCidade;
//    }
    @Override
    public Long getId() {
        return null;
    }
}
