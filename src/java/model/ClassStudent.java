/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DiepTCNN
 */
public class ClassStudent {
    protected String id;
    protected String name;
    protected int number;

    public ClassStudent(String id, String name, int number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public ClassStudent() {
    }

  
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "ClassStudent{" + "id=" + id + ", name=" + name + ", number=" + number + '}';
    }
    
    
}
