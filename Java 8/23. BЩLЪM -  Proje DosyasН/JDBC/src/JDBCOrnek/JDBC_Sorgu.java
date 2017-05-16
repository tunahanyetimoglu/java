package JDBCOrnek;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Sorgu {
	public static Connection c;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baglantiAc();
		sorgu();
		baglantiKapat();
	}
	
	public static void sorgu(){
		try {
			String sql = "CALL ogrBilgiAl1(?,?,?)";
//			String sql2 = "CALL ogrBilgiAl2(?,?)";
			CallableStatement cs1 = c.prepareCall(sql);
			cs1.setInt(1, 5);
			cs1.registerOutParameter(2, java.sql.Types.VARCHAR);
			cs1.registerOutParameter(3, java.sql.Types.VARCHAR);
			cs1.execute();
			System.out.println("AD : " + cs1.getString(2) + " SOYAD : " + cs1.getString(3));
			
//			CallableStatement cs2 = c.prepareCall(sql2);
//			cs2.registerOutParameter(1, java.sql.Types.VARCHAR);
//			cs2.registerOutParameter(1, java.sql.Types.VARCHAR);
//			ResultSet r = cs2.executeQuery();
//			
//			while(r.next()){
//				System.out.println("Öðrenci isimi : " + r.getString(1));
//				System.out.println("Öðrenci Soyadý : " + r.getString(2));
//			}
			System.out.println("---------------------------");
			
			String sql2 = "SELECT * FROM ogrenci";
			Statement s = c.createStatement();
			ResultSet r = s.executeQuery(sql2);
			
			while(r.next()){
				System.out.println("Ad : " + r.getString("ogrAd"));
				System.out.println("Soyadý : " + r.getString("ogrSoyad"));
			}

		} catch (Exception e) {
				System.out.println(e.toString());
		}
	}

	public static void baglantiKapat(){
		try {
			c.close();
			System.out.println("Baðlantý baþarýyla kapatýldý.");		
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public static void baglantiAc(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String bag = "jdbc:mysql://localhost:3306/ornek";
			String kul = "root";
			String sif = "19711958";
			c = DriverManager.getConnection(bag, kul, sif);
			System.out.println("Baðlantý baþarýlý.");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
