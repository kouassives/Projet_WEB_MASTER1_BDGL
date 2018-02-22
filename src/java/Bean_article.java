/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Traitement.Articles;
import Traitement.ArticlesFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author HP CORE I5
 */
@ManagedBean
@RequestScoped
public class Bean_article {
    @EJB
    private ArticlesFacadeLocal em;
    private Articles arti = new Articles();
    private String msg;
    public List<Articles>afficheArticle(){
        return em.findAll();
    }
    public void ajoutArticle(){
        em.create(arti);
        this.msg="Ajouter Effectuer avec succès...";
    }
    public ArticlesFacadeLocal getEm() {
        return em;
    }

    public void setEm(ArticlesFacadeLocal em) {
        this.em = em;
    }


    public Articles getArti() {
        return arti;
    }

    public void setArti(Articles arti) {
        this.arti = arti;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    

    /**
     * Creates a new instance of Bean_article
     */
    public Bean_article() {
    }
    
}
