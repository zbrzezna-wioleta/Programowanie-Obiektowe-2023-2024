package com.urban.planning;

class Park {
    private String name;
    private double area;

    public void validateArea(double area){
        if (area < 0){
            this.area = 2.5;
        }
    }

    public Park(String name, double area){
        this.name = name;
        this.area = area;

        validateArea(this.area);
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(double area) {
        if (area >= 0) {
            this.area = area;
        }
    }

}
