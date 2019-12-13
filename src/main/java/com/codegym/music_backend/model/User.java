package com.codegym.music_backend.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "username"
        }),
        @UniqueConstraint(columnNames = {"email"})
})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
    private String avatarUrl;
    @NotBlank
    @Size(min =3 ,max =50)
    private String name;

    @NotBlank
    @Size(min =3,max=50)
    private String username;
    //@ NaturaId
    @NotBlank
    @Size(max= 100)
    private String  email;

    @NotBlank
    @Size(min =6 ,max =100)
    private String password;

    @ManyToMany(fetch =  FetchType.LAZY)
    @JoinTable(name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles =new HashSet<>();

    public User() {
    }

    public User(String avatarUrl, @NotBlank @Size(min = 3, max = 50) String name, @NotBlank @Size(min = 3, max = 50) String username, @NotBlank @Size(max = 100) String email, @NotBlank @Size(min = 6, max = 100) String password, Set<Role> roles) {
        this.avatarUrl = avatarUrl;
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
