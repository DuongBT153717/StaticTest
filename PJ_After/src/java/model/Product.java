package model;

/**
 *
 * @author asus
 */
public class Product {
    
    private int idpro;
    private int idcat;
    private String namepro;
    private String images;
    private int quantity;
    private Double price;
    private String supplier;
    private String infor;
    private int sellID;
    public Product() {
    }

    public Product(int idpro, int idcat, String namepro, String images, int quantity, Double price, String supplier, String infor, int sellID) {
        this.idpro = idpro;
        this.idcat = idcat;
        this.namepro = namepro;
        this.images = images;
        this.quantity = quantity;
        this.price = price;
        this.supplier = supplier;
        this.infor = infor;
        this.sellID = sellID;
    }

    public Product(int idpro, String namepro, String images) {
        this.idpro = idpro;
        this.namepro = namepro;
        this.images = images;
    }

    public Product(String namepro) {
        this.namepro = namepro;
    }

    public int getIdpro() {
        return idpro;
    }

    public void setIdpro(int idpro) {
        this.idpro = idpro;
    }

    public int getIdcat() {
        return idcat;
    }

    public void setIdcat(int idcat) {
        this.idcat = idcat;
    }

    public String getNamepro() {
        return namepro;
    }

    public void setNamepro(String namepro) {
        this.namepro = namepro;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getInfor() {
        return infor;
    }

    public void setInfor(String infor) {
        this.infor = infor;
    }

    public int getSellID() {
        return sellID;
    }

    public void setSellID(int sellID) {
        this.sellID = sellID;
    }

    
}
