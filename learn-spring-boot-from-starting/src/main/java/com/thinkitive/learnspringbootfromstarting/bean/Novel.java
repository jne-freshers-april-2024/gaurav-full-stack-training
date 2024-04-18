package com.thinkitive.learnspringbootfromstarting.bean;

public class Novel {
    private int id;
    private String name;

    public Novel(int id, String name) {
        this.id = id;
        this.name = name;
    }

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

    @Override
    public String toString() {
        return "Novel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Novel() {
        setName("A");
        setId(11);
    }
    public String init(){
        return "Start Here";
    }
    public String destryu(){
        return "Finish Here";
    }
}
