/*
 * This file is generated by jOOQ.
 */
package com.jooq.crud.model.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String  name;
    private Integer age;

    public Users() {}

    public Users(Users value) {
        this.id = value.id;
        this.name = value.name;
        this.age = value.age;
    }

    public Users(
        Integer id,
        String  name,
        Integer age
    ) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /**
     * Getter for <code>checkjooq.users.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>checkjooq.users.id</code>.
     */
    public Users setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>checkjooq.users.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>checkjooq.users.name</code>.
     */
    public Users setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>checkjooq.users.age</code>.
     */
    public Integer getAge() {
        return this.age;
    }

    /**
     * Setter for <code>checkjooq.users.age</code>.
     */
    public Users setAge(Integer age) {
        this.age = age;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Users other = (Users) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (age == null) {
            if (other.age != null)
                return false;
        }
        else if (!age.equals(other.age))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.age == null) ? 0 : this.age.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Users (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(age);

        sb.append(")");
        return sb.toString();
    }
}
