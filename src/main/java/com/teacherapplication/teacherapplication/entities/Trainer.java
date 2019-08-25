/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teacherapplication.teacherapplication.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author christy
 */
@Entity
@Table(name = "trainer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trainer.findAll", query = "SELECT t FROM Trainer t")
    , @NamedQuery(name = "Trainer.findByTrainerid", query = "SELECT t FROM Trainer t WHERE t.trainerid = :trainerid")
    , @NamedQuery(name = "Trainer.findByFirstname", query = "SELECT t FROM Trainer t WHERE t.firstname = :firstname")
    , @NamedQuery(name = "Trainer.findByLastname", query = "SELECT t FROM Trainer t WHERE t.lastname = :lastname")
    , @NamedQuery(name = "Trainer.findBySubject", query = "SELECT t FROM Trainer t WHERE t.subject = :subject")})
public class Trainer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "trainerid")
    private Integer trainerid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10, message = "Invalid firstname: min=1 and max=10")
    @Column(name = "firstname")
    private String firstname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10, message = "Invalid lastname: min=1 and max=10")
    @Column(name = "lastname")
    private String lastname;
    @Size(max = 45, message = " max=45")
    @Column(name = "subject")
    private String subject;

    public Trainer() {
    }

    public Trainer(Integer trainerid) {
        this.trainerid = trainerid;
    }

    public Trainer(Integer trainerid, String firstname, String lastname) {
        this.trainerid = trainerid;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Integer getTrainerid() {
        return trainerid;
    }

    public void setTrainerid(Integer trainerid) {
        this.trainerid = trainerid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trainerid != null ? trainerid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trainer)) {
            return false;
        }
        Trainer other = (Trainer) object;
        if ((this.trainerid == null && other.trainerid != null) || (this.trainerid != null && !this.trainerid.equals(other.trainerid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.teacherapplication.teacherapplication.entities.Trainer[ trainerid=" + trainerid + " ]";
    }
    
}