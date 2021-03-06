package com.codegym.music_backend.message.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

public class SignUpForm {

    @NotBlank
    @Size(min = 3, max = 50)
    private String name;

    private String avatarUrl;

    @NotBlank
    @Size(min = 3, max = 50)
    private String username;

    @NotBlank
    @Size(min = 6, max = 50)
    private String password;
    @NotBlank
    @Size(max = 60)
    private String email;

    private Set<String> role;

    public SignUpForm() {
    }

    public SignUpForm(@NotBlank @Size(min = 3, max = 50) String name, String avatarUrl, @NotBlank @Size(min = 3, max = 50) String username, @NotBlank @Size(min = 6, max = 50) String password, @NotBlank @Size(max = 60) String email, Set<String> role) {
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<String> getRole() {
        return role;
    }

    public void setRole(Set<String> role) {
        this.role = role;
    }
}
