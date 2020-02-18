package domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "estado")
public class Estado implements BaseEntity {

    @Id
    @GeneratedValue(generator = "estado_seq",
            strategy = GenerationType.AUTO)
    @Column(name = "id_estado")
    private long idEstado;
    @Column(name = "nome_estado")
    private String nome;
    @Column(name = "sigla_estado")
    private String sigla;
    @OneToMany(mappedBy="estado")
    private List<Cidade> listaDeCidades;

    public Estado() {
    }
    public Estado(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public List<Cidade> getListaDeCidades() {
        return listaDeCidades;
    }

    public void setListaDeCidades(List<Cidade> listaDeCidades) {
        this.listaDeCidades = listaDeCidades;
    }

    @Override
    public Long getId() {
        return null;
    }
}
