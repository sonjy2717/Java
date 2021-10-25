package ex21jdbc.shopping;

import java.sql.ResultSet;
import java.sql.Statement;

import ex21jdbc.connect.IConnectImpl;

public class SelectShop extends IConnectImpl {
	
	Statement stmt;
	ResultSet rs;
	
	public SelectShop() {
		super(ORACLE_DRIVER, "kosmo", "1234");
	}
	
	@Override
	public void execute() {
		try {
			stmt = con.createStatement();
			
			String search = scanValue("검색할 상품명");
			
			String query = "SELECT g_idx, goods_name, "
					+ " to_char(goods_price, '99,999,000'), "
					+ " to_char(regidate, 'yyyy-mm-dd hh:mm') time, p_code "
					+ " FROM sh_goods WHERE goods_name LIKE '%" + search + "%'";
			
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				int index = rs.getInt(1);
				String name = rs.getString(2);
				String price = rs.getString(3);
				String date = rs.getString(4);
				int code = rs.getInt(5);
				
				System.out.printf("%s  %s  %s  %s  %s\n",
						index, name, price, date, code);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args) {
		
		new SelectShop().execute();
		
	}
	
}
