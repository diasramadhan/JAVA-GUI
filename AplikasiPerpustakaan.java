package aplikasiperpustakaan;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AplikasiPerpustakaan {
    public static void main(String[] args) {
        
        //=========== BAGIAN CONTAINER ===========
        //membuat ojek Container
        JFrame form = new JFrame("Aplikasi Perpustakaan");
        //ukuran form
        form.setSize(400, 500);
        //mengatur fungsi close form -> posisi pojok kanan atas
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //agar form ditengah 
        form.setLocationRelativeTo(null);
        //mengatur layout secara manual
        form.setLayout(null);
        //menampilkan form
        form.setVisible(true);
        //=========== END BAGIAN CONTAINER ===========
        
        //=========== BAGIAN KOMPONENT ===========
        //membuat objek komponen
        JLabel labelJudul = new JLabel("Aplikasi Perpustakaan");
        //mengatur posisi dan ukuran dari komponen
        labelJudul.setBounds(120, 30, 150, 30);
        //memasukan komponen ke form
        form.add(labelJudul);
        
        
    }
    
}
