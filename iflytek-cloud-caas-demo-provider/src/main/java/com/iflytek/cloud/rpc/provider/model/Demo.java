package com.iflytek.cloud.rpc.provider.model;


import javax.persistence.*;

@Entity
@Table(name = "caas_demo")
public class Demo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "demo_string")
    private String demoString;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDemoString() {
        return demoString;
    }

    public void setDemoString(String demoString) {
        this.demoString = demoString;
    }
}
