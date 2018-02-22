/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import sun.util.calendar.BaseCalendar.Date;

/**
 *
 * @author HP CORE I5
 */
@ManagedBean
@RequestScoped
public class BeanDateCourante {
    private Date dateCourante;

    /**
     * Creates a new instance of BeanDateCourante
     */
    public BeanDateCourante() {
        setDateCourante(Calendrier.getInstance().getTime());
    }
    public Date getDateCourante(){
        return dateCourante;
    }
    public void setDateCourante(Date dateCourante){
        this.dateCourante = dateCourante;
    }
    
}
