package infrastructure.entities;

import domain.helpers.UserRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User implements domain.model.User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nickName;
    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private String mail;
    private ArrayList<Project> ownProjectImpls;
    private ArrayList<Project> projectImpls;
    private UserRole role;
    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getNickname() {
        return nickName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastname() {
        return lastName;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getMail() {
        return mail;
    }

    public ArrayList<Project> getOwnProjects() {
        return ownProjectImpls;
    }

    public ArrayList<Project> getProjects() {
        return projectImpls;
    }

    public UserRole getRole(){
        return role;
    }

    public void changeNickName(String nickName){
        this.nickName = nickName;
    }

    public void changeLogin(String login){
        this.login = login;
    }

    public void changePassword(String password){
        this.password = password;
    }

    public void changeMail(String mail){
        this.mail = mail;
    }

    public void changeRole(UserRole role){
        this.role = role;
    }

    public void addOwnProject(Project projectImpl){
        ownProjectImpls.add(projectImpl);
    }

    public void deleteOwnProject(Project projectImpl){
        ownProjectImpls.remove(ownProjectImpls.indexOf(projectImpl));
    }

    public void addProject(Project projectImpl){
        projectImpls.add(projectImpl);
    }

    public void deleteProject(Project projectImpl){
        projectImpls.remove(projectImpls.indexOf(projectImpl));
    }
}
