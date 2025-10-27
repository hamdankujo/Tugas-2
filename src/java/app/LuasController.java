package app;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

/**
 * Controller untuk aplikasi JavaFX menghitung luas dan keliling persegi panjang.
 */
public class LuasController {

    private TextField tPanjang = new TextField();
    private TextField tLebar = new TextField();
    private Label hasil = new Label();
    private Label hasilKeliling = new Label(); // BARU
    private VBox view;

    /**
     * Konstruktor untuk membuat tampilan GUI dan menambahkan event handler tombol.
     */
    public LuasController(){
        Button hitung = new Button("Hitung");
        Button hitungKeliling = new Button("Hitung Keliling"); // BARU
        Button reset = new Button("Reset");                      // BARU

        hitung.setOnAction(e -> hitung());
        hitungKeliling.setOnAction(e -> hitungKeliling());      // BARU
        reset.setOnAction(e -> {                                 // BARU
            tPanjang.clear();
            tLebar.clear();
            hasil.setText("");
            hasilKeliling.setText("");                           // BARU
        });

        view = new VBox(10,
                new Label("Panjang"), tPanjang,
                new Label("Lebar"), tLebar,
                hitung,                                           // tombol LUAS lama
                hitungKeliling,                                   // BARU
                reset,                                            // BARU
                hasilKeliling,                                    // BARU
                hasil                                             // hasil LUAS tetap di sini
        );
        view.setPadding(new Insets(20));
    }

    /**
     * Menghitung luas persegi panjang berdasarkan input panjang dan lebar.
     */
    private void hitung(){
        try{
            double p = Double.parseDouble(tPanjang.getText());
            double l = Double.parseDouble(tLebar.getText());
            hasil.setText("Luas = " + (p*l));
        }catch(Exception ex){
            hasil.setText("Input tidak valid");
        }
    }

    /**
     * Menghitung keliling persegi panjang berdasarkan input panjang dan lebar.
     */
    private void hitungKeliling(){ // BARU
        try{
            double p = Double.parseDouble(tPanjang.getText());
            double l = Double.parseDouble(tLebar.getText());
            hasilKeliling.setText("Keliling = " + 2*(p+l));
        }catch(Exception ex){
            hasilKeliling.setText("Input tidak valid");
        }
    }

    /**
     * Mengembalikan view VBox untuk ditampilkan di scene JavaFX.
     */
    public VBox getView(){
        return view;
    }
}

public static LuasController getInstance() {
    return ;
}
