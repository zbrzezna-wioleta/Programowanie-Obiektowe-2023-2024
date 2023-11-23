package pl.edu.uwm.zad14;

import java.util.Objects;

class Tester extends Employee{
    private String testingType;

    public Tester(String firstName, String lastName, int salary, String testingType) {
        super(firstName, lastName, salary);
        this.testingType = testingType;
    }

    public String getTestingType() {
        return testingType;
    }

    public void setTestingType(String testingType) {
        this.testingType = testingType;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + testingType + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        Tester tester = (Tester) o;

        return Objects.equals(testingType, tester.testingType);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (testingType != null ? testingType.hashCode() : 0);
        return result;
    }
}
