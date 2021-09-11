package com.example.stdfeemanagementsystem;

public class CourseModel {
    Integer courseid;
    String coursename;

    public CourseModel(Integer courseid, String coursename) {
        this.courseid = courseid;
        this.coursename = coursename;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }
}
