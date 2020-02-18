package domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pessoa")

public class Pessoa implements BaseEntity {
    @Id
    @GeneratedValue(generator = "pessoa_seq",
            strategy = GenerationType.AUTO)
    @Column(name = "id_pessoa")
    private long idPessoa;
    @Column(name = "nome_pessoa")
    private String nome;
    @Column(name = "cpf")
    private String cpf;
    @OneToMany(mappedBy="pagamento")
    private List<Pagamento> listaDePagamentos;

    public Pessoa() {
    }

    public long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    @Override
    public Long getId() {
        return null;
    }
}
