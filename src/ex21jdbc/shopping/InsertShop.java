package ex21jdbc.shopping;

import ex21jdbc.connect.IConnectImpl;

public class InsertShop extends IConnectImpl {
	
	public InsertShop() {
		super(ORACLE_DRIVER, "kosmo", "1234");
	}
	
	@Override
	public void execute() {
		try {
			String query = "INSERT INTO sh_goods "
					+ " (g_idx, goods_name, goods_price, p_code) VALUES "
					+ " (seq_total_idx.nextval, ?, ?, ?)";
			
			psmt = con.prepareStatement(query);
			
			
			psmt.setString(1, scanValue("상품명"));
			
			String goodsPriceScan = scanValue("상품가격");
			int goodsPrice = Integer.parseInt(goodsPriceScan);
			
			String goodsCodeScan = scanValue("상품코드");
			int goodsCode = Integer.parseInt(goodsCodeScan);
			
			psmt.setInt(2, goodsPrice);
			psmt.setInt(3, goodsCode);
			
			int data = psmt.executeUpdate();
			System.out.println(data + "행이 입력되었습니다.");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	
	public static void main(String[] args) {
		
		new InsertShop().execute();
		
	}
	
}
