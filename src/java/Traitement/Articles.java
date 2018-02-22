/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Traitement;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "ARTICLES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Articles.findAll", query = "SELECT a FROM Articles a"),
    @NamedQuery(name = "Articles.findByCode", query = "SELECT a FROM Articles a WHERE a.code = :code"),
    @NamedQuery(name = "Articles.findByCodeCategorie", query = "SELECT a FROM Articles a WHERE a.codeCategorie = :codeCategorie"),
    @NamedQuery(name = "Articles.findByDesignation", query = "SELECT a FROM Articles a WHERE a.designation = :designation"),
    @NamedQuery(name = "Articles.findByQuantite", query = "SELECT a FROM Articles a WHERE a.quantite = :quantite"),
    @NamedQuery(name = "Articles.findByPrixUnitaire", query = "SELECT a FROM Articles a WHERE a.prixUnitaire = :prixUnitaire"),
    @NamedQuery(name = "Articles.findByDate", query = "SELECT a FROM Articles a WHERE a.date = :date")})
public class Articles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "CODE")
    private String code;
    @Size(max = 3)
    @Column(name = "CODE_CATEGORIE")
    private String codeCategorie;
    @Size(max = 255)
    @Column(name = "DESIGNATION")
    private String designation;
    @Column(name = "QUANTITE")
    private Integer quantite;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRIX_UNITAIRE")
    private Double prixUnitaire;
    @Column(name = "DATE")
    @Temporal(TemporalType.DATE)
    private Date date;

    public Articles() {
    }

    public Articles(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeCategorie() {
        return codeCategorie;
    }

    public void setCodeCategorie(String codeCategorie) {
        this.codeCategorie = codeCategorie;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(Double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
        if (!(object instanceof Articles)) {
            return false;
        }
        Articles other = (Articles) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Traitement.Articles[ code=" + code + " ]";
    }
    
}
