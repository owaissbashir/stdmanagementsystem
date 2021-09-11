package com.example.stdfeemanagementsystem;

public class FeesModel {
    Integer invoiceno,courseid,stdid;
    String feetype,feeduedate;
    Boolean feestatus;

    public FeesModel(Integer invoiceno, Integer courseid, Integer stdid, String feetype, String feeduedate, Boolean feestatus) {
        this.invoiceno = invoiceno;
        this.courseid = courseid;
        this.stdid = stdid;
        this.feetype = feetype;
        this.feeduedate = feeduedate;
        this.feestatus = feestatus;
    }

    public Integer getInvoiceno() {
        return invoiceno;
    }

    public void setInvoiceno(Integer invoiceno) {
        this.invoiceno = invoiceno;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Integer getStdid() {
        return stdid;
    }

    public void setStdid(Integer stdid) {
        this.stdid = stdid;
    }

    public String getFeetype() {
        return feetype;
    }

    public void setFeetype(String feetype) {
        this.feetype = feetype;
    }

    public String getFeeduedate() {
        return feeduedate;
    }

    public void setFeeduedate(String feeduedate) {
        this.feeduedate = feeduedate;
    }

    public Boolean getFeestatus() {
        return feestatus;
    }

    public void setFeestatus(Boolean feestatus) {
        this.feestatus = feestatus;
    }
}

