package swing.index;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class index extends javax.swing.JFrame {
    private JLabel mainimg;

    public index() {
        initComponents();
    }

    private  JPanel c;
    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("메인");
        setSize(1600, 1000);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        Color b=new Color(46, 64, 89);

         c = new JPanel();  // 인덱스 배경화면 패널
        c.setBackground(b);
        add(c);
        setAppbar();
        setVisible(true);
    } //jframe 기본 세팅

    private void setAppbar(){ //디폴트 메인바 세팅
        JPanel pN = new JPanel();
        pN.setLayout(new FlowLayout());

        JToolBar toolbar = new JToolBar();
        Color sb=new Color(76, 129, 199);

        toolbar.setBackground(sb);
        toolbar.setLayout(new GridLayout(1, 5));
        toolbar.setBorder(new EmptyBorder(0, 5, 5, 0));
        toolbar.setPreferredSize(new Dimension(1450, 40));

        JButton mainMenu = new JButton();
        mainMenu.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
        mainMenu.setBorderPainted(false);
        toolbar.add(mainMenu);
        JButton teamMenu = new JButton("팀명단");
        teamMenu.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
        teamMenu.setBorderPainted(false);
        toolbar.add(teamMenu);
        JButton BEMenu = new JButton("베스트일레븐");
        BEMenu.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
        BEMenu.setBorderPainted(false);
        toolbar.add(BEMenu);
        JButton toMenu = new JButton("토너먼트");
        toMenu.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
        toMenu.setBorderPainted(false);
        toolbar.add(toMenu);
        JButton statMenu = new JButton("스텟");
        statMenu.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
        statMenu.setBorderPainted(false);
        toolbar.add(statMenu);


        JLabel imgLabel = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/nyul/Desktop/Footproject/index/src/swing/index/image/mmain.png");
        Image img = icon.getImage();
        Image updateImg = img.getScaledInstance(200, 40, Image.SCALE_SMOOTH);
        ImageIcon updateIcon = new ImageIcon(updateImg);
        imgLabel.setIcon(updateIcon);
        imgLabel.setBounds(100, 30, 265, 150);
        imgLabel.setHorizontalAlignment(JLabel.CENTER);
        mainMenu.add(imgLabel);

        JTextField serchbar = new JTextField(5);
        serchbar.setPreferredSize(new Dimension(500, 20));
        toolbar.add(serchbar);
        JButton btn5 = new JButton("검색");
        btn5.setPreferredSize(new Dimension(150, 20));
        btn5.setBounds(880, 10, 80, 30);
        toolbar.add(btn5);
        Color b=new Color(46, 64, 89);
        pN.setBackground(b);
        pN.add(toolbar, BorderLayout.NORTH);
        add(pN, BorderLayout.NORTH);
    }

    public static void main(String[] args) {

        new index();

    }
}
