
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class MhsView extends JFrame{
    JLabel lnim, lnama, lalamat;
    JTextField txnim, txnama, txalamat;
    JButton simpan,delete;
    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;  //untuk scroll
    Object namaKolom[]= {"NIM","Nama","Alamat"}; //Untuk membuat kolom dalam Array
    Statement statement;

    public MhsView(){
        setTitle ("Form Pengisian Mahasiswa");
        //atur Tabel
        tableModel = new DefaultTableModel(namaKolom,0); //0baris
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);
        
        //atur label
        lnim = new JLabel ("NIM");
        lnama = new JLabel ("Nama");
        lalamat = new JLabel ("Alamat");
        
        //atur textfield
        txnim = new JTextField ("");
        txnama = new JTextField ("");
        txalamat = new JTextField ("");
        
        //atur tombol
        simpan = new JButton("Cetak");
        delete = new JButton("Delete");
        
        setLayout(null);
        add(lnim);
        add(lnama);
        add(lalamat);
        add(txnim);
        add(txnama);
        add(txalamat);
        add(simpan);
        add(delete);
        add(scrollPane);

        lnim.setBounds(75, 25, 30, 20);
        lnama.setBounds(75, 50, 50, 20);
        lalamat.setBounds(75, 75, 50, 20);
        txnim.setBounds(150, 25, 300, 20);
        txnama.setBounds(150, 50, 300, 20);
        txalamat.setBounds(150, 75, 300, 100);
        simpan.setBounds(230, 190, 75, 20);
        delete.setBounds(310, 190, 75, 20);
        scrollPane.setBounds(75, 255, 480, 200);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        setSize(600,500); // untuk luas tampilan
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public String getNim(){
        return txnim.getText();
    }
    
    public String getNama(){
        return txnama.getText();
    }
    
    public String getAlamat(){
        return txalamat.getText();
    }
    
}
