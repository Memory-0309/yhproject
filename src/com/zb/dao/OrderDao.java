package com.zb.dao;

import com.zb.pojo.Order;
import com.zb.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDao {

    public List<Order> dopage(Integer pageOn,Integer pageSize){
        Connection conn = null;
        try {
            conn = DBUtils.getConnectionByDatasource();
            String sql = "select * from tb_order limit ?,?";
            pageOn = (pageOn-1)*pageSize;
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,pageOn);
            ps.setInt(2,pageSize);
            ResultSet rs = ps.executeQuery();
            List<Order> list = new ArrayList<>();
            Order order = null;
            while (rs.next()){
                order=new Order();
                order.setId(rs.getInt("id"));
                order.setDoor_id(rs.getInt("door_id"));
                order.setOrder_no(rs.getString("order_no"));
                order.setOrder_type(rs.getString("order_type"));
                order.setPnum(rs.getInt("pnum"));
                order.setCashier(rs.getString("cashier"));
                order.setOrder_time(rs.getTime("order_time"));
                order.setPay_time(rs.getTime("pay_time"));
                order.setPay_type(rs.getString("pay_type"));
                order.setPrice(rs.getDouble("price"));
                list.add(order);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.close(conn);
        }
        return null;
    }

    public Integer pagecount(){
        Connection conn = null;
        try {
            conn =DBUtils.getConnectionByDatasource();
            String sql = "select count(*) from tb_order";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Integer count = 0;
            while (rs.next()){
                count = rs.getInt(1);
            }
            return count;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.close(conn);
        }
        return null;
    }
}
