# LuasPersegiPanjang

Aplikasi **JavaFX** sederhana untuk menghitung **luas dan keliling persegi panjang**.  
User memasukkan **panjang** dan **lebar**, lalu dapat menghitung **Luas**, **Keliling**, dan melakukan **Reset** input.

---

## Fitur Utama

- Hitung **Luas** persegi panjang
- Hitung **Keliling** persegi panjang
- Tombol **Reset** untuk menghapus input dan hasil
- Validasi input: menampilkan pesan jika input kosong atau bukan angka
- GUI rapi dan mudah digunakan

---


---

## Struktur Project

src/main/java/

├─ app/

│ ├─ MainApp.java # Main class aplikasi JavaFX

│ └─ LuasController.java # Controller GUI dan logika perhitungan

└─ module-info.java # Module info JavaFX

---

## Cara Menjalankan

1. Pastikan **JavaFX SDK** sudah ter-download dan path-nya diketahui.
2. Buka project di **IntelliJ IDEA**.
3. Tambahkan JavaFX SDK:
    - **File → Project Structure → Libraries → + → Java**
    - Pilih folder `lib` JavaFX SDK
4. Edit Run Configuration untuk `MainApp` dan tambahkan **VM Options**: --module-path "D:\path\to\javafx-sdk-23\lib" --add-modules javafx.controls

5. Jalankan `MainApp`. GUI akan muncul dan siap digunakan.

---

## Kelas Utama

### `MainApp`
- `start(Stage stage)` : Membuat scene dan menampilkan stage utama.
- `main(String[] args)` : Menjalankan aplikasi JavaFX.

### `LuasController`
- `LuasController()` : Konstruktor, membuat GUI dan tombol hitung/reset.
- `hitung()` : Menghitung **Luas** persegi panjang.
- `hitungKeliling()` : Menghitung **Keliling** persegi panjang.
- `getView()` : Mengembalikan VBox GUI untuk ditampilkan di scene.

---

## JavaDoc

Semua kelas dan method sudah menggunakan **JavaDoc**.  
Untuk membuat dokumentasi:

```bash
javadoc -d doc -sourcepath src/main/java -subpackages app