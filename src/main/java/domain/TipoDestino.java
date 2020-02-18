package domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipo_destino")

public class TipoDestino implements BaseEntity {
    @Id
    @GeneratedValue(generator = "tipo_destino_seq",
            strategy = GenerationType.AUTO)
    @Column(name = "id_tipo_destino")
    private long idTipoDestino;
    @Column(name = "nome_tipo_destino")
    private String nome;
    @OneToMany(mappedBy="cidade")
    private List<Cidade> listaDeCidades;

    public TipoDestino() {
    }

    public long getIdTipoDestino() {
        return idTipoDestino;
    }

    public void setIdTipoDestino(long idTipoDestino) {
        this.idTipoDestino = idTipoDestino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
