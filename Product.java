package Video4HW;


public class Product {
    public static void main(String[] args) {

        Product prod1 = new Product("Iphone", 200, 3);
        Product prod2 = new Product("Meizu", 100, 2);
        Product prod3 = new Product("Nokia", 500, 5);
        Product prod4 = new Product("Oppo", 800, 1);

        Product product = new Product();
        // The most expensive product
        product.mostExpensiveProduct(prod1, prod2, prod3, prod4);

        // The biggest quantity product
        product.biggestQuantityProduct(prod1, prod2, prod3, prod4);

    }

    private String name;
    private int price;
    private int quantity;

    public Product() {

    }

    public Product(String name, int price, int quantity) {

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }

    public void mostExpensiveProduct(Product prod1, Product prod2, Product prod3, Product prod4) {

        if ((prod1.getPrice() > prod2.getPrice()) && (prod1.getPrice() > prod3.getPrice())
                && (prod1.getPrice() > prod4.getPrice())) {
            System.out.println("The most expensive product is " + prod1.getName()+"\tquantity: "+prod1.getQuantity());
        } else if ((prod2.getPrice() > prod3.getPrice()) && prod2.getPrice() > prod4.getPrice()) {
            System.out.println("The most expensive product is " + prod2.getName()+"\tquantity: "+prod2.getQuantity());
        } else if (prod3.getPrice() > prod4.getPrice()) {
            System.out.println("The most expensive product is " + prod3.getName()+"\tquantity: "+prod3.getQuantity());
        } else {
            System.out.println("The most expensive product is " + prod4.getName()+"\tquantity: "+prod4.getQuantity());
        }

    }

    public void biggestQuantityProduct(Product prod1, Product prod2, Product prod3, Product prod4) {

        if ((prod1.getQuantity() > prod2.getQuantity()) && (prod1.getQuantity() > prod3.getQuantity())
                && (prod1.getQuantity() > prod4.getQuantity())) {
            System.out.println("The biggest quantity of product is " + prod1.getName());
        } else if ((prod2.getQuantity() > prod3.getQuantity())
                && prod2.getQuantity() > prod4.getQuantity()) {
            System.out.println("The biggest quantity of product is " + prod2.getName());
        } else if (prod3.getQuantity() > prod4.getQuantity()) {
            System.out.println("The biggest quantity of product is " + prod3.getName());
        } else {
            System.out.println("The biggest quantity of product is " + prod4.getName());
        }

    }

}