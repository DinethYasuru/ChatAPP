package Pojo;
// Generated Jan 28, 2021 11:26:29 PM by Hibernate Tools 4.3.1



/**
 * Department generated by hbm2java
 */
public class Department  implements java.io.Serializable {


     private String id;
     private String name;

    public Department() {
    }

    public Department(String id, String name) {
       this.id = id;
       this.name = name;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}


