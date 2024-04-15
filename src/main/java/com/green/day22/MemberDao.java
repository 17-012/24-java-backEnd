package com.green.day22;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

// member 테이블 용 Data Access Object
public class MemberDao {
    private MyConnection myConn;

    public MemberDao() {
        myConn = new MyConnection();
    }

    public int insMember(final MemberEntity entity) {
        String sql = String.format("INSERT INTO member" +
                        "(mem_id, mem_name," +
                        " mem_number, addr," +
                        " phone1, phone2," +
                        " height, debut_date)" +
                        "VALUES " +
                        "('%s', '%s'," +
                        " '%d', '%s'," +
                        " '%s', '%s'," +
                        " '%d', '%s')",
                        entity.getMemId(), entity.getMemName(),
                        entity.getMemNumber(), entity.getAddr(),
                        entity.getPhone1(), entity.getPhone2(),
                        entity.getHeight(), entity.getDebutDate());

        System.out.println(sql);
        Connection conn = null;
        Statement stat = null;
        int result = 0;
        try {
            conn = myConn.getConn();
            stat = conn.createStatement();
            result = stat.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            myConn.close(stat, conn);
        }

        return result;
    }

}

class MemberDAOTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao();

        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setMemId("NJS");
        memberEntity.setMemName("뉴진스");
        memberEntity.setMemNumber(4);
        memberEntity.setAddr("대구");
        memberEntity.setPhone1("053");
        memberEntity.setPhone2("77777777");
        memberEntity.setHeight(166);
        memberEntity.setDebutDate("2022-10-01");

        int affectedRow = memberDao.insMember(memberEntity);
        System.out.printf("affectedRow : %d\n", affectedRow);
    }
}