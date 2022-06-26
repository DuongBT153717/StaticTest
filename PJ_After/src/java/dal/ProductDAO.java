package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import model.Product;
import java.util.logging.Level;
/**
 *
 * @author asus
 */

public class ProductDAO extends DBContext {
    static final Logger LOGGER = Logger.getLogger(ProductDAO.class.getName());
    
    static final String IDPRO = "idpro";
    static final String IDCAT = "idcat";
    static final String NAMEPRO = "namepro";
    static final String IMAGE = "images";
    static final String QUANTITY = "quantity";
    static final String PRICE = "price";
    static final String SUPPLIER = "supplier";
    static final String INFOR = "infor";
    static final String SELLID = "sell_ID";
    public List<Product> getAll() {
        String sql = "select * from product order by id_pro desc";
        List<Product> list = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt(IDPRO),
                        rs.getInt(IDCAT),
                        rs.getString(NAMEPRO),
                        rs.getString(IMAGE),
                        rs.getInt(QUANTITY),
                        rs.getDouble(PRICE),
                        rs.getString(SUPPLIER),
                        rs.getString(INFOR),
                        rs.getInt(SELLID));
                list.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    //get list of product from category id
    public List<Product> getListProByCat(String id) {
        String sql = "select * from product where id_cat='" + id + "'";
        List<Product> list = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt(IDPRO),
                        rs.getInt(IDCAT),
                        rs.getString(NAMEPRO),
                        rs.getString(IMAGE),
                        rs.getInt(QUANTITY),
                        rs.getDouble(PRICE),
                        rs.getString(SUPPLIER),
                        rs.getString(INFOR),
                        rs.getInt(SELLID));
                list.add(p);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE,"error", e.getStackTrace());
        }
        return list;
    }

    public List<Product> getTop3ListProByCat(String cid, int pid) {
        String sql = "select top 3 * from product where id_cat= ? and id_pro != ?  ";
        List<Product> list = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, cid);
            ps.setInt(2, pid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt(IDPRO),
                        rs.getInt(IDCAT),
                        rs.getString(NAMEPRO),
                        rs.getString(IMAGE),
                        rs.getInt(QUANTITY),
                        rs.getDouble(PRICE),
                        rs.getString(SUPPLIER),
                        rs.getString(INFOR),
                        rs.getInt(SELLID));
                list.add(p);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.FINE,"error",e.getStackTrace());
        }
        return list;
    }

    //get newest product
    public Product getLast() {
        String sql = "select top 1 *from product\n"
                + "order by id_pro desc";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(IDPRO),
                        rs.getInt(IDCAT),
                        rs.getString(NAMEPRO),
                        rs.getString(IMAGE),
                        rs.getInt(QUANTITY),
                        rs.getDouble(PRICE),
                        rs.getString(SUPPLIER),
                        rs.getString(INFOR),
                        rs.getInt(SELLID));
                
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    //get product byid
    public List<Product> getLast3Product() {
        List<Product> list = new ArrayList<>();
        String sql = "select top 3 *from product\n"
                + "order by id_pro asc";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt(IDPRO),
                        rs.getInt(IDCAT),
                        rs.getString(NAMEPRO),
                        rs.getString(IMAGE),
                        rs.getInt(QUANTITY),
                        rs.getDouble(PRICE),
                        rs.getString(SUPPLIER),
                        rs.getString(INFOR),
                        rs.getInt(SELLID));
                list.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;

    }

    public Product getProductById(int id) {
        String sql = "select * from product where id_pro=?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(IDPRO),
                        rs.getInt(IDCAT),
                        rs.getString(NAMEPRO),
                        rs.getString(IMAGE),
                        rs.getInt(QUANTITY),
                        rs.getDouble(PRICE),
                        rs.getString(SUPPLIER),
                        rs.getString(INFOR),
                        rs.getInt(SELLID));
                
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    public List<Product> searchByName(String txtSearch) {
        String sql = "select*from product where name_pro like ? ";
        List<Product> list = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, "%" + txtSearch + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt(IDPRO),
                        rs.getInt(IDCAT),
                        rs.getString(NAMEPRO),
                        rs.getString(IMAGE),
                        rs.getInt(QUANTITY),
                        rs.getDouble(PRICE),
                        rs.getString(SUPPLIER),
                        rs.getString(INFOR),
                        rs.getInt(SELLID));
                list.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Product> searchByPrice(double min, double max) {
        String sql = "select*from product where price between ? and ? order by price";
        List<Product> list = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setDouble(1, min);
            ps.setDouble(2, max);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt(IDPRO),
                        rs.getInt(IDCAT),
                        rs.getString(NAMEPRO),
                        rs.getString(IMAGE),
                        rs.getInt(QUANTITY),
                        rs.getDouble(PRICE),
                        rs.getString(SUPPLIER),
                        rs.getString(INFOR),
                        rs.getInt(SELLID));
                list.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Product> getListProBySellID(int id) {
        String sql = "select * from product where sell_ID=?";
        List<Product> list = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Product p = new Product(
                        rs.getInt(IDPRO),
                        rs.getInt(IDCAT),
                        rs.getString(NAMEPRO),
                        rs.getString(IMAGE),
                        rs.getInt(QUANTITY),
                        rs.getDouble(PRICE),
                        rs.getString(SUPPLIER),
                        rs.getString(INFOR),
                        rs.getInt(SELLID));
                list.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void delete(int id) {
        String sql = "delete from product where id_pro = ?\n"
                + "delete from OrderLine where pid = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            st.setInt(2, id);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //check exist id

    public boolean existedPro(int id) {
        String sql = "select * from product where id_pro=?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    //get page product
    public List<Product> pagingProduct(int index) {
        String sql = "select * from product order by id_pro OFFSET ? ROWS FETCH NEXT 6 ROWS ONLY";
        List<Product> list = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, (index - 1) * 6);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt(IDPRO),
                        rs.getInt(IDCAT),
                        rs.getString(NAMEPRO),
                        rs.getString(IMAGE),
                        rs.getInt(QUANTITY),
                        rs.getDouble(PRICE),
                        rs.getString(SUPPLIER),
                        rs.getString(INFOR),
                        rs.getInt(SELLID));
                list.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;

    }

    public List<Product> pagingProductByName(int index, String name) {
        String sql = "select * from product where name_pro like ? order by id_pro OFFSET ? ROWS FETCH NEXT 2 ROWS ONLY ";
        List<Product> list = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(2, (index - 1) * 2);
            ps.setString(1, "%" + name + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt(IDPRO),
                        rs.getInt(IDCAT),
                        rs.getString(NAMEPRO),
                        rs.getString(IMAGE),
                        rs.getInt(QUANTITY),
                        rs.getDouble(PRICE),
                        rs.getString(SUPPLIER),
                        rs.getString(INFOR),
                        rs.getInt(SELLID));
                list.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;

    }

    //get total page
    public int count() {
        String query = "select COUNT (*) from product ";
        try {

            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int countByCid(String cid) {
        String query = "select COUNT (*) from product where id_cat = ? ";
        try {

            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, cid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int countProductBySeller(int sellid) {

        String query = "SELECT COUNT(*) FROM Product WHERE sell_ID = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, sellid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0;
    }

    public List<Product> pagingManagerProduct(int index, int sellid) {
        List<Product> list = new ArrayList<>();
        if (sellid == 0) {
            list = pagingProduct(index);
        } else {
            String query = "SELECT * FROM Product WHERE sell_ID = ? ORDER BY id_pro OFFSET ? ROWS FETCH NEXT 6 ROWS ONLY";
            try {
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setInt(1, sellid);
                ps.setInt(2, (index - 1) * 6);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    list.add(new Product(rs.getInt(IDPRO),
                            rs.getInt(IDCAT),
                            rs.getString(NAMEPRO),
                            rs.getString(IMAGE),
                            rs.getInt(QUANTITY),
                            rs.getDouble(PRICE),
                            rs.getString(SUPPLIER),
                            rs.getString(INFOR),
                            rs.getInt(SELLID)));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public int countBySearchName(String name) {
        String query = "select COUNT (*) from product where name_pro like ?";
        try {

            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, "%" + name + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int countByPrice(double min, double max) {
        String query = "select COUNT (*) from product where price between ? and ? ";
        try {

            PreparedStatement ps = connection.prepareStatement(query);
            ps.setDouble(1, min);
            ps.setDouble(2, max);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public List<Product> pagingProductByPrice(int index, double min, double max) {
        String sql = "select * from product where price between ? and ? order by price OFFSET ? ROWS FETCH NEXT 6 ROWS ONLY ";
        List<Product> list = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(3, (index - 1) * 6);
            ps.setDouble(1, min);
            ps.setDouble(2, max);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt(IDPRO),
                        rs.getInt(IDCAT),
                        rs.getString(NAMEPRO),
                        rs.getString(IMAGE),
                        rs.getInt(QUANTITY),
                        rs.getDouble(PRICE),
                        rs.getString(SUPPLIER),
                        rs.getString(INFOR),
                        rs.getInt(SELLID));
                list.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public List<Product> pagingProductBySortLow(int index) {
        String sql = "select * from product order by price OFFSET ? ROWS FETCH NEXT 6 ROWS ONLY ";
        List<Product> list = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, (index - 1) * 6);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt(IDPRO),
                        rs.getInt(IDCAT),
                        rs.getString(NAMEPRO),
                        rs.getString(IMAGE),
                        rs.getInt(QUANTITY),
                        rs.getDouble(PRICE),
                        rs.getString(SUPPLIER),
                        rs.getString(INFOR),
                        rs.getInt(SELLID));
                list.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public List<Product> pagingProductBySortHigh(int index) {
        String sql = "select * from product order by price desc OFFSET ? ROWS FETCH NEXT 6 ROWS ONLY ";
        List<Product> list = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, (index - 1) * 6);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt(IDPRO),
                        rs.getInt(IDCAT),
                        rs.getString(NAMEPRO),
                        rs.getString(IMAGE),
                        rs.getInt(QUANTITY),
                        rs.getDouble(PRICE),
                        rs.getString(SUPPLIER),
                        rs.getString(INFOR),
                        rs.getInt(SELLID));
                list.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public List<Product> pagingProductByCat(int index, String cid) {
        String sql = "select * from product where id_cat = ? order by id_pro OFFSET ? ROWS FETCH NEXT 5 ROWS ONLY ";
        List<Product> list = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(2, (index - 1) * 5);
            ps.setString(1, cid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt(IDPRO),
                        rs.getInt(IDCAT),
                        rs.getString(NAMEPRO),
                        rs.getString(IMAGE),
                        rs.getInt(QUANTITY),
                        rs.getDouble(PRICE),
                        rs.getString(SUPPLIER),
                        rs.getString(INFOR),
                        rs.getInt(SELLID));
                list.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;

    }

    public int CountProductLow() {
        int count = 0;
        String sql = "SELECT COUNT(*) as 'count'\n"
                + "  FROM product where quantity < 5 ";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    //add new product
    public void addPro(
            int idpro, int idcat, String namepro, String images, int quantity, double price, String supplier, String infor, int sellid) {
        String sql = "INSERT [dbo].[product] ([id_pro], [id_cat], [name_pro], [images], [quantity], [price], [supplier], [infor],[sell_ID]) VALUES(?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, idpro);
            ps.setInt(2, idcat);
            ps.setString(3, namepro);
            ps.setString(4, images);
            ps.setInt(5, quantity);
            ps.setDouble(6, price);
            ps.setString(7, supplier);
            ps.setString(8, infor);
            ps.setInt(9, sellid);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int update(Product d) {
        String sql = "update product set id_cat=?"
                + ",name_pro=?,images=?,quantity=?,price=?,supplier=?,infor=?,sell_ID=? where id_pro=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(9, d.getIdpro());
            st.setInt(1, d.getIdcat());

            st.setString(2, d.getNamepro());
            st.setString(3, d.getImages());
            st.setInt(4, d.getQuantity());
            st.setDouble(5, d.getPrice());
            st.setString(6, d.getSupplier());
            st.setString(7, d.getInfor());
            st.setInt(8, d.getSellID());
            return st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

  
    

    public List<Product> getAllProductBySortLow() {
        String sql = "select * from product order by price";
        List<Product> list = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt(IDPRO),
                        rs.getInt(IDCAT),
                        rs.getString(NAMEPRO),
                        rs.getString(IMAGE),
                        rs.getInt(QUANTITY),
                        rs.getDouble(PRICE),
                        rs.getString(SUPPLIER),
                        rs.getString(INFOR),
                        rs.getInt(SELLID));
                list.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
     public List<Product> getAllProductBySortHigh() {
        String sql = "select * from product order by price desc";
        List<Product> list = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt(IDPRO),
                        rs.getInt(IDCAT),
                        rs.getString(NAMEPRO),
                        rs.getString(IMAGE),
                        rs.getInt(QUANTITY),
                        rs.getDouble(PRICE),
                        rs.getString(SUPPLIER),
                        rs.getString(INFOR),
                        rs.getInt(SELLID));
                list.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
