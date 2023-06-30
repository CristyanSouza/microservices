package com.devsuperior.hroauth.entities;




public class Role {

    private Long id;
    private String roleName;


    public Role() {
    }


    public Role(Long id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    
}
