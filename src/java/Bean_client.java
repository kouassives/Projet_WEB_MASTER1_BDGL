/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Traitement.Clients;
import Traitement.ClientsFacadeLocal;
import java.sql.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author HP CORE I5
 */
@ManagedBean
@RequestScoped
public class Bean_client {
    @EJB
    private ClientsFacadeLocal em;
    private Clients cli = new Clients();
    private String msg;
    
    @PostConstruct
    public void init(){
        initialliserDateInscription();
        
    }
    
    public List<Clients> afficheClient(){
        return em.findAll();
    }
    public void ajoutClient(){
        initialliserDateInscription();
        em.create(cli);
        this.msg="Ajouter Effectuer avec succès...";
    
    }
    private void initialliserDateInscription(){
        Date date = new Date( System.currentTimeMillis());
        cli.setDate(date);
    };
    
    public ClientsFacadeLocal getEm() {
        return em;
    }

    public void setEm(ClientsFacadeLocal em) {
        this.em = em;
    }

    public Clients getCli() {
        return cli;
    }

    public void setCli(Clients cli) {
        this.cli = cli;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    

    

    /**
     * Creates a new instance of Bean_client
     */
    public Bean_client() {
    }
    
}
