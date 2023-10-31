package Task13;

import java.util.*;

class Product {
    private int id;
    private String name;
    private int quantity;

    public Product(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }


public class InventoryManagement{

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        Map<Integer, Product> productMap = new HashMap<>();
        

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Inventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. List Products");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
        
        int productIdCounter = 1;
        
    
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    
                    System.out.print("Enter product name: ");
                    String name = scanner.next();
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();

                    

                    Product product = new Product(productIdCounter, name, quantity);
                    System.out.println(product);
                    
                    
                    productList.add(product);
                    productMap.put(productIdCounter, product);
                    productIdCounter++;
                    System.out.println("Product added successfully!");
                    break;

                case 2:
                    
                    System.out.print("Enter product ID to remove: ");
                    int productIdToRemove = scanner.nextInt();
                    Product removedProduct = productMap.remove(productIdToRemove);
                    if (removedProduct != null) {
                        productList.remove(removedProduct);
                        System.out.println("Product removed successfully!");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 3:
                    
                    System.out.println("List of Products:");
                    for (Product p : productList) {
                        System.out.println(p);
                    }
                    break;

                case 4:
                    
                    System.out.println("Exiting the Inventory Management System.");
                    scanner.close();
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                }
        }
    }
}
    public String toString() {
        return "Product ID: " + id + ", Name: " + name + ", Quantity: " + quantity;
    }
}
