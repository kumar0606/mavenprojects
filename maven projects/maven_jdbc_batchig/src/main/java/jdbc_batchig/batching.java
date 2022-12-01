package jdbc_batchig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import coonection_util.connectionutil;

public class batching {
public static void main(String[] args) {
 Connection con=connectionutil.getConnection();
 PreparedStatement prs=null;
 PreparedStatement upd=null;
 try {
	 con.setAutoCommit(false);
	prs=con.prepareStatement("insert into employe values (?,?,?,?,?)");
//	prs.setInt(1, 12);
//	prs.setString(2, "ravi");
//	prs.setString(3, "kalavala");
//	prs.setDouble(4, 2000.00);
//	prs.setDouble(5, 300.00);
//	prs.addBatch();
//	prs.setInt(1, 13);
//	prs.setString(2, "ravi");
//	prs.setString(3, "kalavala");
//	prs.setDouble(4, 2000.00);
//	prs.setDouble(5, 300.00);
//	prs.addBatch();
	prs.setInt(1, 16);
	prs.setString(2, "ravi");
	prs.setString(3, "kalavala");
	prs.setDouble(4, 2000.00);
	prs.setDouble(5, 300.00);
	prs.addBatch();
	
	upd =con.prepareStatement("update employe set salary=? where eid=?");
	upd.setDouble(1, 500.00);
	upd.setInt(2, 11);
	upd.addBatch();
	int[] u=prs.executeBatch();
for (int i : u) {
	System.out.println(i);
}
	
	int[] i=upd.executeBatch();
	for (int j : i) {
		System.out.println(j);
	}
	con.commit();
} catch (SQLException e) {
try {
	con.rollback();
} catch (SQLException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
} 
	e.printStackTrace();
}finally {
	try {
		prs.close();
		upd.close();
		con.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
}
}
