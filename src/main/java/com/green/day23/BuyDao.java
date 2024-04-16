package com.green.day23;

import com.green.day22.MyConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BuyDao {
    private MyConnection myConn;

    public BuyDao() {
        myConn = new MyConnection();
    }

    //PreparedStatement를 사용한 sql
    public int insBuy(BuyEntity entity) {
        String sql = "INSERT INTO buy (mem_id, prod_name, group_name, price, amount)" +
                " VALUES (?, ?, ?, ?, ?)";

        System.out.println(sql);

        int result = 0;
        try (Connection conn = myConn.getConn(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, entity.getMemId());
            ps.setString(2, entity.getProdName());
            ps.setString(3, entity.getGroupName());
            ps.setInt(4, entity.getPrice());
            ps.setInt(5, entity.getAmount());
            // 영향받은 행 갯수
            result = ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public List<BuySelVo> selBuyGroupByMemId() {
        List<BuySelVo> list = new ArrayList<BuySelVo>();
        String sql = "SELECT COUNT(amount) FROM buy GROUP BY mem_id";
        return list;
    }

    public int updBuy(BuyEntity entity) {
        String sql = "UPDATE buy SET mem_id = ?, prod_name = ?, group_name = ?, price = ?, amount = ?" +
                " WHERE num = ?";

        System.out.println(sql);

        int result = 0;
        try (Connection conn = myConn.getConn(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, entity.getMemId());
            ps.setString(2, entity.getProdName());
            ps.setString(3, entity.getGroupName());
            ps.setInt(4, entity.getPrice());
            ps.setInt(5, entity.getAmount());
            ps.setInt(6, entity.getNum());
            // 영향받은 행 갯수
            result = ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public int delBuy(int num) {
        String sql = "DELETE FROM buy WHERE num = ?";

        System.out.println(sql);

        int result = 0;
        try (Connection conn = myConn.getConn(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, num);
            // 영향받은 행 갯수
            result = ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}

class BuyDaoTest {
    public static void main(String[] args) {
        BuyDao buyDao = new BuyDao();
        BuyEntity entity = new BuyEntity();

        entity.setNum(17);
        entity.setMemId("NJS");
        entity.setProdName("목걸이");
        entity.setGroupName("패션");
        entity.setPrice(700);
        entity.setAmount(1);

        int affectedRow = 0;
//        affectedRow = buyDao.insBuy(entity);
//        affectedRow = buyDao.updBuy(entity);
//        affectedRow = buyDao.delBuy(16);

        System.out.printf("affectedRow : %d\n", affectedRow);
    }
}