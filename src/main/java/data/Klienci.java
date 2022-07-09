package data;

import javax.persistence.*;

@Entity
@Table(name="klienci")
public class Klienci {

    @Column(name="imie")
    private String imie;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="idklient")
    private Integer idklient;

    public Klienci(String imie, Integer idklient) {
        this.imie = imie;
        this.idklient = idklient;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Integer getIdklient() {
        return idklient;
    }

    public void setIdklient(Integer idklient) {
        this.idklient = idklient;
    }
}
