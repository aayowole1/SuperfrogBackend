package edu.tcu.cs.superfrogbackend.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import edu.tcu.cs.superfrogbackend.Authentication.Models.User;

@Entity
public class Appearance {
    @Id
    private Integer id;
    private Date date;
    @ManyToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    private List<User> students = new ArrayList<>();
    private boolean pending;
    private String theme;
    private String milageRange;
    private float price;
    @ManyToOne
    @JsonIgnore
    private User customer;

    public Appearance() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<User> getStudents() {
        return students;
    }

    public void setStudents(List<User> students) {
        this.students = students;
    }

    public boolean isPending() {
        return pending;
    }

    public void setPending(boolean pending) {
        this.pending = pending;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getMilageRange() {
        return milageRange;
    }

    public void setMilageRange(String milageRange) {
        this.milageRange = milageRange;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public void addStudent(User student){
        //add appearance to students appearances
        student.addAppearance(this);
        //add this student to this apperances student list
        this.students.add(student);
    }

    public void removeStudent(User student){
        //remove student
        student.removeApperance(this);
        // remove from students list
        this.students.remove(student);
    }

}
