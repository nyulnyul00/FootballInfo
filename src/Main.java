
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Main {

    public static void main(String[] args) throws SQLException {
        // 데이터베이스에 연결합니다.
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");

        // `Statement` 개체를 만듭니다.
        Statement stmt = con.createStatement();

        // 경기 일정과 점수를 저장할 테이블을 만듭니다.
        String sql = "CREATE TABLE games (id INT AUTO_INCREMENT PRIMARY KEY, team1 VARCHAR(255), team2 VARCHAR(255), score1 INT, score2 INT);";
        stmt.executeUpdate(sql);

        // JFrame을 만듭니다.
        JFrame frame = new JFrame("Scoreboard");

        // JPanel을 만듭니다.
        JPanel panel = new JPanel();

        // JTable을 만듭니다.
        JTable table = new JTable();

        // JTable을 데이터베이스에서 가져옵니다.
        String sql2 = "SELECT * FROM games;";
        ResultSet rs = stmt.executeQuery(sql2);
        //table.setModel(new DefaultTableModel(rs.getMetaData(), rs.getRows()));

        // JTable을 패널에 추가합니다.
        panel.add(table);

        // JFrame에 패널을 추가합니다.
        frame.add(panel);

        // JFrame을 화면에 표시합니다.
        frame.pack();
        frame.setVisible(true);
    }
}

