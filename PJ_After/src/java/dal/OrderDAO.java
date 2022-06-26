package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Item;
import model.Order;
import model.OrderDetail;
import model.Product;
import model.User;

/**
 *
 * @author asus
 */
public class OrderDAO extends DBContext{

    public int createReturnId(Order order) {
        String sql = "INSERT INTO [dbo].[Order]\n"
                + "           ([account_id]\n"
                + "           ,[totalmoney])\n"
                + "     VALUES\n"
                + "           (?,?)";
        try {            
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, order.getUid());
            ps.setDouble(2, order.getTotalMoney());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys(); //lấy key tự tăng
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }


       public int countProductByAccountID(int accountid) {
       
            String query = "SELECT COUNT(*) FROM [Order] WHERE account_id = ?";
            try {
               PreparedStatement ps = connection.prepareStatement(query);
                ps.setInt(1, accountid);
               ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    return rs.getInt(1);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        
        return 0;
    }
  
   public int countOrder() {
        String query = "select COUNT (*) from [order] ";
        try {
           
           PreparedStatement ps = connection.prepareStatement(query);
              ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
   
       public List<Order> getBillByDay(){
        List<Order> list = new ArrayList<>();
        String sql = "select * from [Order] b "
                + "inner join [user] u on b.account_id = u.id_user where created_date = cast(getdate() as Date)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
              ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User(rs.getInt("id_user"),rs.getString("username"),rs.getString("phone"),rs.getString("address"));              
                list.add(new Order(rs.getInt("id"), rs.getString("created_date"), rs.getInt("account_id"), rs.getDouble("totalMoney"),u));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
       public List<Order> getBillInfo(){
        List<Order> list = new ArrayList<>();
        String sql = "select * from [Order] b "
                + "inner join [user] u on b.account_id = u.id_user";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
              ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User(rs.getInt("id_user"),rs.getString("username"),rs.getString("phone"),rs.getString("address"));              
                list.add(new Order(rs.getInt("id"), rs.getString("created_date"), rs.getInt("account_id"), rs.getDouble("totalMoney"),u));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
