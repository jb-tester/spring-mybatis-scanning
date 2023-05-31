package com.example.springmybatisscanning.samples;


public class Sample {
    int id;
    int version;
    String sample;
    String color;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getSample() {
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sample{" +
                "id=" + id +
                ", version=" + version +
                ", sample='" + sample + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
