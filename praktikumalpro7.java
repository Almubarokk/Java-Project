/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 import java.io.IOException;
 import javax.swing.JOptionPane;
 import javax.swing.*;
 import java.awt.event.*;
/**
 *
 * @author USER
 */
public class praktikumalpro7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
      
      //Input Sederhana
      JFrame frame = new JFrame("Input Sederhana");
          JTextField textField = new JTextField(20);
          JButton button = new JButton("Kirim");

          JLabel label = new JLabel("Masukkan nama:");
          JLabel output = new JLabel("");

          button.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                  String nama = textField.getText();
                  output.setText("Monyet Lu " + nama + "!");
              }
          });

          JPanel panel = new JPanel();
          panel.add(label);
          panel.add(textField);
          panel.add(button);
          panel.add(output);

          frame.add(panel);
          frame.setSize(300, 150);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setVisible(true);
        
          
//       String nama = JOptionPane.showInputDialog("Masukkan nama:");
//          String umurStr = JOptionPane.showInputDialog("Masukkan umur:");
//          int umur = Integer.parseInt(umurStr);
//
//          JOptionPane.showMessageDialog(null, 
//              "Halo " + nama + ", umur kamu " + umur + " tahun."); 
        
//       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//          System.out.print("Masukkan nama: ");
//          String nama = br.readLine();
//
//          System.out.print("Masukkan umur: ");
//          int umur = Integer.parseInt(br.readLine());
//
//          System.out.println("Halo " + nama + ", umur kamu " + umur + " tahun.");
      } 
}
