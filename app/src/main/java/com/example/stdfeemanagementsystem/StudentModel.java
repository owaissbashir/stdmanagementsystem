package com.example.stdfeemanagementsystem;

public class StudentModel {
    Integer stdid,enrollmentid,courseid;
    String name,password,DateCourseStarted;
    Boolean status;


    public StudentModel(Integer stdid, Integer enrollmentid, Integer courseid, String name, String password, String dateCourseStarted, Boolean status) {
        this.stdid = stdid;
        this.enrollmentid = enrollmentid;
        this.courseid = courseid;
        this.name = name;
        this.password = password;
        DateCourseStarted = dateCourseStarted;
        this.status = status;
    }

    public Integer getStdid() {
        return stdid;
    }

    public void setStdid(Integer stdid) {
        this.stdid = stdid;
    }

    public Integer getEnrollmentid() {
        return enrollmentid;
    }

    public void setEnrollmentid(Integer enrollmentid) {
        this.enrollmentid = enrollmentid;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDateCourseStarted() {
        return DateCourseStarted;
    }

    public void setDateCourseStarted(String dateCourseStarted) {
        DateCourseStarted = dateCourseStarted;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
