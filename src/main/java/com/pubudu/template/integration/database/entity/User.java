package com.pubudu.template.integration.database.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Sample JPA {@link Entity} object.
 */
@Entity
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    @NotNull
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
