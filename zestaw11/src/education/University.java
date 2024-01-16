package education;

import java.util.Objects;

public class University extends School{
    private String type;
    private int studies;


    public University(String name, String address, int students, String type, int studies) {
        super(name, address, students);
        this.type=((type==null||type.isEmpty())?"university of technology":type);
        this.studies=(studies<0?10:studies);
    }
    public String getType() {
        return ((type==null||type.isEmpty())?"university of technology":type);
    }

    public void setType(String type) {
        if(!(type==null||type.isEmpty()))
            this.type=type;
    }
    public int getStudies() {
        return (studies<0?10:studies);
    }
    public void setStudies(int studies) {
        if(studies>0)
            this.studies=studies;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                ": Name: " + super.getName() + ". Addres: "+super.getAddress()+". Number of students: "+super.getStudents()
                +".\nType: "+this.type+". Number of fields of study: "+this.studies+".";

    }
    public void recruitment(int x)
    {
        super.setStudents(super.getStudents()+x);
        if(super.getStudents()>500)
            super.setStudents(500);
        this.studies=this.studies+x/10;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        University that = (University) o;
        return Objects.equals(studies, that.studies);
    }

    @Override
    public int hashCode() {
        int result=super.hashCode()*31;
        result=result*31+this.studies;
        return result;
    }
}
