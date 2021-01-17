package excel11;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;


public class Excel21 {

	public static void main(String[] args) throws FilloException {
		Fillo fillo = new Fillo();
		Connection connection = fillo.getConnection("E:\\mechanical 2017 admission details master data.xlsx");
		String strQuery = "Select * from diploma";
		Recordset recordset = connection.executeQuery(strQuery);

		while (recordset.next()) {
			System.out.println(recordset.getField("FIRST_NAME"));
		}

		recordset.close();
		connection.close();

	}

}
