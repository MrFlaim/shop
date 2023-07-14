package practice.contentmanagement.entity;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "storeID")
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "store")
    private Store store;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "money")
    private double money;
    @Column(name = "image")
    private String image;
    @Column(name = "quantity")
    private int quantity;

    public Product() {
    }

    public Product(int id, Store store, String name, String description, double money, String image, int quantity) {
        this.id = id;
        this.store = store;
        this.name = name;
        this.description = description;
        this.money = money;
        this.image = image;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
