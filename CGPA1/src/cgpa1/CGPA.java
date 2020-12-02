package cgpa1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class CGPA extends JFrame {

    private Container c;
    private JLabel label;
    private JTable table;
    private String[] cols = {"Name", "ID", "CGPA"};
    private String[][] row = {{"Arittra", "101", "2.79"}, {"Arittra", "101", "2.79"}, {"Arittra", "101", "2.79"}, {"Arittra", "101", "2.79"}

};
    private JScrollPane pj;

    CGPA() {
        init();
    }

    private void init() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        Font f = new Font("Arial", Font.BOLD + Font.ITALIC, 14);
        table = new JTable(row, cols);
        //table.setEnabled(false);
        table.setSelectionBackground(Color.yellow);
//     table.setLineWrap(true);
//        table.setWrapStyleWord(true);

        pj = new JScrollPane(table);
        pj.setBounds(100, 60, 600, 200);
        c.add(pj);

        label = new JLabel("Studenet Details");
        label.setBounds(250, 20, 200, 50);
        label.setFont(f);
        c.add(label);

    }

    public static void main(String[] args) {

        CGPA g = new CGPA();
        g.setBounds(100, 100, 750, 450);
        g.setVisible(true);
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        g.setTitle("TABle");

    }

}
