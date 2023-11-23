package education;

import java.util.Objects;

class University extends School{
    private String type;
    private int studies;

    public University(String name, String address, int students, String type, int studies) {
        super(name, address, students);
        this.type = type.isEmpty() ? "university of technology" : type;
        this.studies = studies>=0 ? studies : 10;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (!type.isEmpty())
            this.type = type;
    }

    public int getStudies() {
        return studies;
    }

    public void setStudies(int studies) {
        if (studies >= 0)
            this.studies = studies;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: " + type+
                ". Number of fields of study: " + studies+".";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        University university = (University) o;

        return studies == university.studies;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + studies;
        return result;
    }
}

