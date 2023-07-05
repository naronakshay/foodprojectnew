package com.example.foodback.model;


import jakarta.persistence.*;

@Entity
@Table(name="rest")
public class Rest {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long restId;

    @Column(name = "name")
    private String  name;

    @Column(name = "image")
    private String  image;

    @Column(name="decs")
    private  String description;

    public Long getRestId() {
        return restId;
    }

    public void setRestId(Long restId) {
        this.restId = restId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Rest(Long restId, String name, String image, String description) {
        this.restId = restId;
        this.name = name;
        this.image = image;
        this.description = description;
    }

    public Rest() {
    }
}
