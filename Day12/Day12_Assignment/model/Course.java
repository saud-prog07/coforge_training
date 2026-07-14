package com.coforge.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_course")
public class Course {

    @Id
    @Column(name = "course_id")
    private int courseid;

    @Column(name = "course_name")
    private String coursename;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;

    public Course() {
    }

    public Course(int courseid, String coursename) {
        this.courseid = courseid;
        this.coursename = coursename;
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course [courseid=" + courseid +
               ", coursename=" + coursename + "]";
    }
}