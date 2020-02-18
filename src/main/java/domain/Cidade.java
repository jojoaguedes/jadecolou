package domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cidade")


public class Cidade implements BaseEntity {
    @Id
    @GeneratedValue(generator = "cidade_seq",
            strategy = GenerationType.AUTO)
    @Column(name = "id_cidade")
    private int idCidade;
    @Column(name = "nome_cidade")
    private String nome;
    @ManyToOne
    @JoinColumn(name="id_estado")
    private Estado estado;
   // private  id_estado;
   //  private int idTipoDestino;
   @ManyToOne
   @JoinColumn(name="id_tipo_destino")
    private TipoDestino tipoDestino;
    @OneToMany(mappedBy="voo")
    private List<Voo> listaDeVoos;



    public Cidade() {
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

  //  public long getId_estado() {
 //       return id_estado;
 //   }

//    public void setId_estado(long id_estado) {
//        this.id_estado = id_estado;
//    }

 //   public int getIdTipoDestino() {
  //      return idTipoDestino;
  //  }

   // public void setIdTipoDestino(int idTipoDestino) {
    //    this.idTipoDestino = idTipoDestino;
   // }

    public TipoDestino getTipoDestino() {
        return tipoDestino;
    }

    public void setTipoDestino(TipoDestino tipoDestino) {
        this.tipoDestino = tipoDestino;
    }

    public List<Voo> getListaDeVoos() {
        return listaDeVoos;
    }

    public void setListaDeVoos(List<Voo> listaDeVoos) {
        this.listaDeVoos = listaDeVoos;
    }
    @Override
    public Long getId() {
        return null;
    }
}
