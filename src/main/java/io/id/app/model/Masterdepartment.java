/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.id.app.model;

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
 * @author permadi
 */
@Entity
@Table(name = "masterdepartment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Masterdepartment.findAll", query = "SELECT m FROM Masterdepartment m"),
    @NamedQuery(name = "Masterdepartment.findByDepartmentid", query = "SELECT m FROM Masterdepartment m WHERE m.departmentid = :departmentid"),
    @NamedQuery(name = "Masterdepartment.findByDepartmentcode", query = "SELECT m FROM Masterdepartment m WHERE m.departmentcode = :departmentcode"),
    @NamedQuery(name = "Masterdepartment.findByDepartmentname", query = "SELECT m FROM Masterdepartment m WHERE m.departmentname = :departmentname"),
    @NamedQuery(name = "Masterdepartment.findByDescription", query = "SELECT m FROM Masterdepartment m WHERE m.description = :description"),
    @NamedQuery(name = "Masterdepartment.findByIsactive", query = "SELECT m FROM Masterdepartment m WHERE m.isactive = :isactive")})
public class Masterdepartment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "departmentid")
    private Integer departmentid;
    @Size(max = 10)
    @Column(name = "departmentcode")
    private String departmentcode;
    @Size(max = 30)
    @Column(name = "departmentname")
    private String departmentname;
    @Size(max = 50)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "isactive")
    private short isactive;

    public Masterdepartment() {
    }

    public Masterdepartment(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public Masterdepartment(Integer departmentid, short isactive) {
        this.departmentid = departmentid;
        this.isactive = isactive;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepartmentcode() {
        return departmentcode;
    }

    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public short getIsactive() {
        return isactive;
    }

    public void setIsactive(short isactive) {
        this.isactive = isactive;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (departmentid != null ? departmentid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Masterdepartment)) {
            return false;
        }
        Masterdepartment other = (Masterdepartment) object;
        if ((this.departmentid == null && other.departmentid != null) || (this.departmentid != null && !this.departmentid.equals(other.departmentid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "io.id.app.model.Masterdepartment[ departmentid=" + departmentid + " ]";
    }
    
}
