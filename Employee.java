/*  Team E Employee Class
   Create Employee Objects
 */

public class Employee {
    //attributes
    private int empID;
    private String nameF;
    private String nameL;
    private String team;
    
    //Constructor
    public Employee(){
        empID =0;  //need to set null
        nameF = "Unknown";
        nameL = "Unknown";
        team = "Unknown";        
    }
    
    public Employee(int empID, String nameF, String nameL, String team){
        this.setempID(empID);
        this.setNameF(nameF);
        this.setNameL (nameL);
        this.setTeam(team);
        
    }
    
    //behaviors
    
    //getters and setters
    public int getempID(){
        return empID;
    }
    public void setempID(int empID){
        this.empID = empID;
    }
    //
    public String getNameF(){
        return nameF;
    }
    public void setNameF(String nameF){
        this.nameF = nameF;
    }
    //
    public String getNameL(){
        return nameL;        
    }
    public void setNameL(String nameL){
        this.nameL = nameL;
    }
    //
    public String getTeam(){
        return team;
    }
    public void setTeam(String team){
        this.team = team;
    }
    
    
}
