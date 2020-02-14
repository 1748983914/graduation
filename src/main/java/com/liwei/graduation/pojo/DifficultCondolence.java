package com.liwei.graduation.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class DifficultCondolence {
    private Integer id;

    private String leaderid;

    private String leadername;

    private String coodepart;

    private String contacttel;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date consolationdate;

    private String difficultpartyid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLeaderid() {
        return leaderid;
    }

    public void setLeaderid(String leaderid) {
        this.leaderid = leaderid == null ? null : leaderid.trim();
    }

    public String getLeadername() {
        return leadername;
    }

    public void setLeadername(String leadername) {
        this.leadername = leadername == null ? null : leadername.trim();
    }

    public String getCoodepart() {
        return coodepart;
    }

    public void setCoodepart(String coodepart) {
        this.coodepart = coodepart == null ? null : coodepart.trim();
    }

    public String getContacttel() {
        return contacttel;
    }

    public void setContacttel(String contacttel) {
        this.contacttel = contacttel == null ? null : contacttel.trim();
    }

    public Date getConsolationdate() {
        return consolationdate;
    }

    public void setConsolationdate(Date consolationdate) {
        this.consolationdate = consolationdate;
    }

    public String getDifficultpartyid() {
        return difficultpartyid;
    }

    public void setDifficultpartyid(String difficultpartyid) {
        this.difficultpartyid = difficultpartyid == null ? null : difficultpartyid.trim();
    }
}