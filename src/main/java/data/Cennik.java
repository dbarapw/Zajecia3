package data;

import javax.persistence.*;

@Entity
@Table(name="cennik")
public class Cennik {
    @Column(name="cena")
    private Integer cena;

    @Column(name="nazwa")
    private String nazwa;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="idcennik")
    private Integer idcennik;

    public Cennik(Integer cena, String nazwa, Integer idcennik) {
        this.cena = cena;
        this.nazwa = nazwa;
        this.idcennik = idcennik;
    }

    public Cennik() {
    }

    public Integer getCena() {
        return cena;
    }

    public void setCena(Integer cena) {
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Integer getIdcennik() {
        return idcennik;
    }

    public void setIdcennik(Integer idcennik) {
        this.idcennik = idcennik;
    }
}
