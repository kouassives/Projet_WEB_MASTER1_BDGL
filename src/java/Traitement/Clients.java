/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Traitement;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HP CORE I5
 */
@Entity
@Table(name = "CLIENTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clients.findAll", query = "SELECT c FROM Clients c"),
    @NamedQuery(name = "Clients.findByCode", query = "SELECT c FROM Clients c WHERE c.code = :code"),
    @NamedQuery(name = "Clients.findByNom", query = "SELECT c FROM Clients c WHERE c.nom = :nom"),
    @NamedQuery(name = "Clients.findByPrenom", query = "SELECT c FROM Clients c WHERE c.prenom = :prenom"),
    @NamedQuery(name = "Clients.findByDate", query = "SELECT c FROM Clients c WHERE c.date = :date"),
    @NamedQuery(name = "Clients.findByAdresse", query = "SELECT c FROM Clients c WHERE c.adresse = :adresse"),
    @NamedQuery(name = "Clients.findByCodePostal", query = "SELECT c FROM Clients c WHERE c.codePostal = :codePostal"),
    @NamedQuery(name = "Clients.findByVille", query = "SELECT c FROM Clients c WHERE c.ville = :ville"),
    @NamedQuery(name = "Clients.findByTelFixe", query = "SELECT c FROM Clients c WHERE c.telFixe = :telFixe"),
    @NamedQuery(name = "Clients.findByMobilis", query = "SELECT c FROM Clients c WHERE c.mobilis = :mobilis"),
    @NamedQuery(name = "Clients.findByEmail", query = "SELECT c FROM Clients c WHERE c.email = :email"),
    @NamedQuery(name = "Clients.findByRemarques", query = "SELECT c FROM Clients c WHERE c.remarques = :remarques"),
    @NamedQuery(name = "Clients.findByCarteFidele", query = "SELECT c FROM Clients c WHERE c.carteFidele = :carteFidele")})
public class Clients implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "CODE")
    private String code;
    @Size(max = 255)
    @Column(name = "NOM")
    private String nom;
    @Size(max = 255)
    @Column(name = "PRENOM")
    private String prenom;
    @Column(name = "DATE")
    //@Temporal(TemporalType.DATE)
    private Date date;
    @Size(max = 255)
    @Column(name = "ADRESSE")
    private String adresse;
    @Size(max = 255)
    @Column(name = "CODE_POSTAL")
    private String codePostal;
    @Size(max = 255)
    @Column(name = "VILLE")
    private String ville;
    @Size(max = 255)
    @Column(name = "TEL_FIXE")
    private String telFixe;
    @Size(max = 255)
    @Column(name = "MOBILIS")
    private String mobilis;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 255)
    @Column(name = "REMARQUES")
    private String remarques;
    @Column(name = "CARTE_FIDELE")
    private Boolean carteFidele;

    public Clients() {
    }

    public Clients(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTelFixe() {
        return telFixe;
    }

    public void setTelFixe(String telFixe) {
        this.telFixe = telFixe;
    }

    public String getMobilis() {
        return mobilis;
    }

    public void setMobilis(String mobilis) {
        this.mobilis = mobilis;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemarques() {
        return remarques;
    }

    public void setRemarques(String remarques) {
        this.remarques = remarques;
    }

    public Boolean getCarteFidele() {
        return carteFidele;
    }

    public void setCarteFidele(Boolean carteFidele) {
        this.carteFidele = carteFidele;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clients)) {
            return false;
        }
        Clients other = (Clients) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Traitement.Clients[ code=" + code + " ]";
    }
    
}
