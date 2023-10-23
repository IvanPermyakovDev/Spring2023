package application.entities;

import domain.helpers.UserRole;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.ArrayList;

public class User implements domain.model.User {
    public User(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nickName;
    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private String mail;
    private ArrayList<Project> ownProjects;
    private ArrayList<Project> projects;
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
        return ownProjects;
    }

    public ArrayList<Project> getProjects() {
        return projects;
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

    public void addOwnProject(Project project){
        ownProjects.add(project);
    }

    public void deleteOwnProject(Project project){
        ownProjects.remove(ownProjects.indexOf(project));
    }

    public void addProject(Project project){
        projects.add(project);
    }

    public void deleteProject(Project project){
        projects.remove(projects.indexOf(project));
    }
}
