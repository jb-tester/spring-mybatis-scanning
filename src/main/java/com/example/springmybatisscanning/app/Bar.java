package com.example.springmybatisscanning.app;

import java.util.Objects;

/**
 * *
 * <p>Created by irina on 6/15/2023.</p>
 * <p>Project: spring-mybatis-scanning</p>
 * *
 */
public class Bar {
    int id;
    String name;
    int version;
    String comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Bar{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", version=" + version +
               ", comment='" + comment + '\'' +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bar bar = (Bar) o;
        return id == bar.id && version == bar.version && Objects.equals(name, bar.name) && Objects.equals(comment, bar.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, version, comment);
    }
}
