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
    public String getNickname() {
        return nickName;
    }

    public UserRole getRole(){
        return role;
    }

    public void changeNickName(String nickName){
        this.nickName = nickName;
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
