package ex21jdbc.shopping;

import ex21jdbc.connect.IConnectImpl;

public class EditDelShop extends IConnectImpl {
	
	public EditDelShop() {
		super(ORACLE_DRIVER, "kosmo", "1234");
	}
	
	@Override
	public void execute() {
		try {
			
			String UpQuery = "UPDATE sh_goods SET goods_name = ?, "
					+ " goods_price = ?, p_code = ? WHERE g_idx = ?";
			
			psmt = con.prepareStatement(UpQuery);
			
			while (true) {
				
				System.out.println("\n제발 숫자만 입력해주세요ㅠㅠㅠㅠ");
				String SChoice = scanValue("(1)수정 (2)삭제");
				int choice = Integer.parseInt(SChoice);
				
				if (choice == 1) {
					
					String searchIndex = scanValue("수정할 일련번호");
					int gIndex = Integer.parseInt(searchIndex);
					
					psmt.setString(1, scanValue("상품명"));
					
					String priceScan = scanValue("가격");
					int price = Integer.parseInt(priceScan);
					
					String codeScan = scanValue("상품코드");
					int code = Integer.parseInt(codeScan);
					
					psmt.setInt(2, price);
					psmt.setInt(3, code);
					psmt.setInt(4, gIndex);
					
					int data = psmt.executeUpdate();
					System.out.println(data + "행이 업데이트 되었습니다");
				}
				else if (choice == 2) {
					
					String DeQuery = "DELETE FROM sh_goods WHERE g_idx = ?";
					
					psmt = con.prepareStatement(DeQuery);
					
					String search = scanValue("삭제할 인덱스 번호");
					int index = Integer.parseInt(search);
					
					psmt.setInt(1, index);
					
					int data = psmt.executeUpdate();
					System.out.println(data + "행이 삭제되었습니다");
				}
				else {
					System.out.println("잘못 된 값 입력함");
					continue;
				}
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
		
		new EditDelShop().execute();
		
	}
	
}
