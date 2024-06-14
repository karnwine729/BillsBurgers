public class Item {
    private String name;
    private int size;
    private double price;
    
    public Item(String name, int size, double price) {
        this.name = name;
        this.size = (size > 0 && size < 3) ? size : 2;
        this.price = price;
    }
    
    public Item() {
        this("Default Name", 2, 1.00d);
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getSize() {
        return this.size;
    }
    
    public String getSize() {
        return (size = 1) ? "Small" : (size = 2) ? "Medium" : "Large";
    }
    
    public double getPrice() {
        return this.price;
    }
}
