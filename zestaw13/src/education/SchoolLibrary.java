package education;

class SchoolLibrary extends Library {
    private String schoolType;
    private int librarians;

    public SchoolLibrary(String name, String location, int books, String schoolType, int librarians) {
        super(name, location, books);
        this.schoolType = (schoolType==null||schoolType.isEmpty())?"średnia":schoolType;
        this.librarians = librarians<2?3:librarians;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        if(schoolType!=null||!schoolType.isEmpty())
            this.schoolType = schoolType;
    }

    public int getLibrarians() {
        return librarians;
    }

    public void setLibrarians(int librarians) {
        if(librarians>2)
            this.librarians=librarians;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSchool Type: " + schoolType +
                ". Number of librarians: " + librarians +
                ".";
    }
    void addBooks(int x)
    {
        this.setBooks(this.getBooks()+x);
        if(this.getBooks()>3000)
            this.setBooks(3000);
    }
}
