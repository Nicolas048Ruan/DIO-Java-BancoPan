package dio.aula.model;

import javax.persistence.*;

@Entity // C usar jpa e usar entidades
public class User {

    @Id // Para ser entidade precisa de um id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gerar automaticamente uma estrutura de identificação
    @Column(name = "user_id") // Flando q o nome vai ter uma diferença cm o atributo
    private Integer id;
    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 20, nullable = false)
    private String username;
    @Column(length = 100, nullable = false)
    private String password;

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

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + "]";
    }
    
}