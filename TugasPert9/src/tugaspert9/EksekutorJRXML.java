package tugaspert9;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.JRResultSetDataSource;

public class EksekutorJRXML {

    /**
     * Cetak laporan dari DB menggunakan file JRXML
     *
     * @param conn      Koneksi database
     * @param judul     Judul laporan (optional)
     * @param pathJrxml Path file .jrxml
     * @param query     Query SQL untuk data
     * @throws Exception Jika gagal compile atau fill report
     */
    public static void cetakDariDB(Connection conn, String judul, String pathJrxml, String query) throws Exception {
        // Compile file JRXML
        JasperReport jr = JasperCompileManager.compileReport(pathJrxml);

        // Ambil data dari DB
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);

        // Parameter untuk report
        Map<String, Object> params = new HashMap<>();
        params.put("JUDUL", judul); // Bisa digunakan di JRXML

        // Fill report dengan data
        JasperPrint jp = JasperFillManager.fillReport(jr, params, jrRS);

        // Tampilkan report
        JasperViewer.viewReport(jp, false);

        // Tutup resources
        rs.close();
        stmt.close();
    }
}

