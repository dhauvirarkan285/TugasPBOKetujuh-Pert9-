# LAPORAN PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK (PBO) PERTEMUAN KE-9
## Topik
* Mengunduh dan memasang PlugIn serta mengimplementasikan penggunakan JasperReports *
---
| Kategori | Detail |
| -- | -- |
| Nama | Muhamad Dhauvir Arkan |
| NIM | 09020624044  |
| Mata Kuliah | Pemrograman Berorientasi Objek H7B.3 |
| Dosen Pengampu | Bpk. Bayu Adhi Nugroho |
| Program Studi | Sistem Informasi |
| Fakultas | Sains dan Teknologi |
| Universitas | UIN Sunan Ampel Surabaya |
| Tahun Perkuliahan | 2025-2026 Ganjil |

## Tatacara
1. Pertama, kalian diharuskan menginstalasi/mengunduh iReport 5.6.0 yang selanjutnya akan dipluggin ke dalam NetBeans
   <img src="Screenshot 2025-10-18 165852.png" alt="Plugin NetBeans" width="600" />
2. Selanjutnya kita membuat Name Class seuai peran masing-masing namun harus sesuai dengan tujuannya
3. Lalu, kita membuat Report Wizard dengan nama DataKepemilikan.jrxml
   <img src="Screenshot 2025-10-18 174254.png" alt="Report Wizard" width="600" />
4. Setelah itu, hasil keseluruhan isi dari Java Apps yang kita buat seperti dibawah ini
   <img src="Screenshot 2025-10-19 054137.png" alt="Java Apps Saya" width="600" />
5. Wajib hukumnya untuk menambah JAR di Library. Walaupun pada realita nantinya tidak berhasil karena keterbatasan versi NetBeans saya
   <img src="Screenshot 2025-10-19 054504.png" alt="JAR Library" width="600" />
6. Selanjutnya, kita mengisi beberapa kodingan agar bisa terhubung dengan salah satu Main Class yang akan kita jalankan nanti
7. Setelah itu, saat membuat Report Wizard, kita wajib mengisi query berupa select*data from (nama table database) yang sebelumnya kita buat
   <img src="Screenshot 2025-10-19 061736.png" alt="Mengisi Table Database" width="600" />
8. Tampilan keseluruhan dari query PostgreSQL yang saya buat via CmdPrompt seperti ini
   <img src="Screenshot 2025-10-19 054014.png" alt="Tampilan CMD" width="600" />
9. Langkah seterusnya kita setelah mengisi query, kita wajib memindahkan baris table database dari kiri ke kanan agar bisa kita gunakan
    <img src="Screenshot 2025-10-19 061840.png" alt="Pindah Dari Kanan Ke Kiri" width="600" />
10. Setelah itu, kita tampilkan Design dari Report Wizard yang telah kita buat
   <img src="Screenshot 2025-10-19 073620.png" alt="Design Report Wizard" width="600" />
11. Langkah seterusnya yang kita lakukan adalah mengisi codingan yang digunakan untuk mengubah jrxml ke jasper secara manual
    <img src="Screenshot 2025-10-19 073848.png" alt="Codingan Pengubah I" width="600" />
    <img src="Screenshot 2025-10-19 073905.png" alt="Codingan Pengubah II" width="600" />
Karena keterbatasan versi NetBeans, maka penting untuk diketahui guna menentukan port yang sesuai di Library NetBeans agar benar-benar dicetak secara keseluruhan

