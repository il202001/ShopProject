package Objects;
public class Products {
    private int prodID;
    private float price;
    private int amount;
    private String name;
    private String image;

    public Products(int prodID, float price, int amount, String name, String image) {
        this.prodID = prodID;
        this.price = price;
        this.amount = amount;
        this.name = name;
        this.image = image;
    }

    public void setProdID(int prodID) {
        this.prodID = prodID;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getProdID() {
        return prodID;
    }

    public float getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }
}
