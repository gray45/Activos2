package Domain;
// Generated 17/03/2019 08:51:12 PM by Hibernate Tools 4.3.1



/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer id;
     private Dependencia dependencia;
     private String nombre;
     private String rol;
     private String dependecia;
     private String password;

    public Usuario() {
    }

    public Usuario(Dependencia dependencia, String nombre, String rol, String dependecia, String password) {
       this.dependencia = dependencia;
       this.nombre = nombre;
       this.rol = rol;
       this.dependecia = dependecia;
       this.password = password;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Dependencia getDependencia() {
        return this.dependencia;
    }
    
    public void setDependencia(Dependencia dependencia) {
        this.dependencia = dependencia;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRol() {
        return this.rol;
    }
    
    public void setRol(String rol) {
        this.rol = rol;
    }
    public String getDependecia() {
        return this.dependecia;
    }
    
    public void setDependecia(String dependecia) {
        this.dependecia = dependecia;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}


