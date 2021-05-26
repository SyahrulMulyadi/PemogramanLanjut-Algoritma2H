package TugasAlgoritma.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormBiodata {
    private JTextField textNama;
    private JTextField textNim;
    private JButton buttonSave;
    private JPanel rootPanel;
    private JTextField textJenjang;
    private JTextField textMasuk;
    private JTextField textFakultas;
    private JTextField textJurusan;
    private JTextField textJenis;
    private JTextField textUrut;
    private JLabel labelHasil;

    public FormBiodata() {
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textNama.getText();
                String nim = textNim.getText();
                String jenjang = textJenjang.getText();
                String masuk = textMasuk.getText();
                String fakultas = textFakultas.getText();
                String jurusan = textJurusan.getText();
                String jenis = textJenis.getText();
                String urut = textUrut.getText();

                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(nama);
                mhs.setNim(nim);
                mhs.setJenjang(jenjang);
                mhs.setMasuk(masuk);
                mhs.setFakultas(fakultas);
                mhs.setJurusan(jurusan);
                mhs.setJenis(jenis);
                mhs.setUrut(urut);

                System.out.println(mhs.toString());

                labelHasil.setText(mhs.toString());

            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
