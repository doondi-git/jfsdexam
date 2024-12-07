package com.klef.jfsd.exam;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED) // Defines inheritance strategy
public abstract class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate ID
    private int id;
    private String name;
    private String type;
    private int maxSpeed;
    private String color;

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public int getMaxSpeed() { return maxSpeed; }
    public void setMaxSpeed(int maxSpeed) { this.maxSpeed = maxSpeed; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
}
