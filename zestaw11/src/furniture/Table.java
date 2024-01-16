package furniture;

class Table {
    private double price;
    private Table(double price) {
        this.price = price;
    }
    static Table createTable(double price)
    {
        return new Table(price);
    }
    public double getPrice() {
        return price;
    }
}

