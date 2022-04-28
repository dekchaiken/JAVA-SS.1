public class Faculty extends Person {
    public int officeHours;
    public String rank;
    
    @Override
    public String toString() {
        return "Faculty{" + "officeHours=" + officeHours + ", rank=" + rank + '}';
    }
}
