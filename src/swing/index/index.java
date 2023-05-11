package swing.index;

import javax.swing.*;
import java.awt.*;

public class index extends javax.swing.JFrame {
    public index() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("메인");
        setSize(1600, 1000);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        Color b=new Color(46, 64, 89);

        JPanel c=new JPanel();  // 인덱스 배경화면 패널
        c.setBackground(b);
        add(c);

        setVisible(true);
    }

    public static void main(String[] args) {
        new index();
    }
}
