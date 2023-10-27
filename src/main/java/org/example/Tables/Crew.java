package org.example.Tables;

import javax.persistence.*;





@Entity
@Table(name = "crews")
public class Crew {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcrews")
    private int idCrews;
    @Column(name = "name")
    private String name;
    @Column(name = "members")
    private int members;
    @Column(name = "id")
    private int id;
    @Column(name = "age")
    private int age;


    public int getIdCrews() {
        return idCrews;
    }
    public void setIdCrews(int idCrews) {
        this.idCrews = idCrews;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMembers() {
        return members;
    }
    public void setMembers(int members) {
        this.members = members;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
