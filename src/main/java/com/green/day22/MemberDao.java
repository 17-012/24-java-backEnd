package com.green.day22;

import java.sql.*;
import java.util.*;

// member 테이블 용 Data Access Object
public class MemberDao {
    private MyConnection myConn;

    public MemberDao() {
        myConn = new MyConnection();
    }

    public int execute(String sql) {
        int result = 0;
        try (Connection conn = myConn.getConn(); Statement stat = conn.createStatement()) {
            // 영향받은 행 갯수
            result = stat.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    // insert 문법
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
                entity.getHeight(), entity.getDebutDate()
        );
        System.out.println(sql);
        return execute(sql);
    }

    // select 문법 ( List )
    public List<MemberEntity> selMemberList() {
        List<MemberEntity> list = new ArrayList<MemberEntity>();
        String sql = String.format("SELECT mem_id, mem_name, debut_date FROM member ORDER BY debut_date DESC");

        try (Connection conn = myConn.getConn(); Statement stat = conn.createStatement(); ResultSet rs = stat.executeQuery(sql)) {
            while (rs.next()) {
                String memId = rs.getString("mem_id");
                String memName = rs.getString("mem_name");
                String debutDate = rs.getString("debut_date");

                MemberEntity memberEntity = new MemberEntity();

                memberEntity.setMemId(memId);
                memberEntity.setMemName(memName);
                memberEntity.setDebutDate(debutDate);

                list.add(memberEntity);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    // select 문법 ( 1개 )
    public MemberEntity selMember(String memId) {
        MemberEntity entity = new MemberEntity();
        String sql = String.format("SELECT mem_id, mem_name, mem_number, addr, phone1, phone2, height, debut_date" +
                " FROM member" +
                " WHERE mem_id = '%s'", memId);
        System.out.println(sql);

        try (Connection conn = myConn.getConn();
             Statement stat = conn.createStatement();
             ResultSet rs = stat.executeQuery(sql)
        ) {
            if (rs.next()) {
                entity.setMemId(rs.getString("mem_id"));
                entity.setMemName(rs.getString("mem_name"));
                entity.setMemNumber(rs.getInt("mem_number"));
                entity.setAddr(rs.getString("addr"));
                entity.setPhone1(rs.getString("phone1"));
                entity.setPhone2(rs.getString("phone2"));
                entity.setHeight(rs.getInt("height"));
                entity.setDebutDate(rs.getString("debut_date"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return entity;
    }


    //update 문법
    public int updMember(MemberEntity entity) {
        String mid = "";
        if (entity.getMemName() != null && entity.getMemName().length() > 0) {
            mid += String.format(", mem_name = '%s'", entity.getMemName());
        }
        if (entity.getMemNumber() > 0) {
            mid += String.format(", mem_number = %d", entity.getMemNumber());
        }
        if (entity.getAddr() != null && entity.getAddr().length() > 0) {
            mid += String.format(", addr = '%s'", entity.getAddr());
        }
        if (entity.getPhone1() != null && entity.getPhone1().length() > 0) {
            mid += String.format(", phone1 = '%s'", entity.getPhone1());
        }
        if (entity.getPhone2() != null && entity.getPhone2().length() > 0) {
            mid += String.format(", phone2 = '%s'", entity.getPhone2());
        }
        if (entity.getHeight() > 0) {
            mid += String.format(", height = %d", entity.getHeight());
        }
        System.out.println(mid);
        mid = mid.substring(2);
        System.out.println(mid);

        String sql = String.format("UPDATE member SET %s WHERE  mem_id = '%s'", mid, entity.getMemId());

        System.out.println(sql);
        return execute(sql);
    }

    //delete 문법
    public int delMember(MemberEntity entity) {
        String sql = String.format("DELETE FROM member WHERE mem_id = '%s'", entity.getMemId());
        return execute(sql);
    }
}

class MemberDaoSelectTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao();
//        List<MemberEntity> list = memberDao.selMemberList();
//        for (MemberEntity entity : list) {
//            System.out.println(entity);
//        }

        MemberEntity memberEntity = memberDao.selMember("NJS");
        System.out.println(memberEntity);
    }
}

class MemberDaoDeleteTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao();
        MemberEntity memberEntity = new MemberEntity();

        memberEntity.setMemId("NJS");

        int affectedRow = memberDao.delMember(memberEntity);
        System.out.printf("affectedRow : %d\n", affectedRow);
    }
}

class MemberDaoUpdateTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao();
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setMemId("NJS");
        memberEntity.setMemNumber(6);
        memberEntity.setAddr("제주");
        memberEntity.setPhone1("011");

        int affectedRow = memberDao.updMember(memberEntity);
        System.out.printf("affectedRow : %d\n", affectedRow);
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