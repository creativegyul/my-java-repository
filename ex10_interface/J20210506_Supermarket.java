package ex10_interface;

import java.util.ArrayList;
import java.util.List;

class HeadOffice{ //본사
	private String companyName="<노브랜드 No Brand>";
	void companyInfoPrint() {
		System.out.println(companyName);
	}
}
interface ProductCorner{
	public List<String> getProductItem();
	public void setProductItem(String...s);
	void productNamePrint();
}
interface MeatCorner{
	public List<String> getMeatItem();
	public void setMeatItem(List<String> meatItem);
	void meatNamePrint();
}
interface ClothesCorner{
	public List<String> getClothesItem();
	public void setClothesItem(List<String> clothesItem);
	void clothesNamePrint();
}

class Branch1 extends HeadOffice implements ProductCorner, MeatCorner {
	private String branchName="신림점";
	private List<String> productItem=new ArrayList<>(); //공산품 상품목록
	private List<String> meatItem;
	
	//세터,게터
	@Override
	public List<String> getMeatItem() {
		return meatItem;
	}
	@Override
	public void setMeatItem(List<String> meatItem) {
		this.meatItem=meatItem;
	}
	@Override
	public List<String> getProductItem() {
		return productItem;
	}
	@Override
	public void setProductItem(String... s) {
		for (String item:s) {
			productItem.add(item);
		}
	}

	@Override
	public void productNamePrint() {
		System.out.println("["+branchName+"] 공산품 코너");
		System.out.print("***");
		for(String item:productItem) {
			System.out.print(item+" ");
		}
		System.out.println();
	}
	@Override
	public void meatNamePrint() {
		System.out.println("["+branchName+"] 정육코너");
		System.out.print("***");
		for(String item:meatItem) {
			System.out.print(item+" ");
		}
		System.out.println();
	}
}
class Branch2 extends HeadOffice implements ProductCorner, ClothesCorner {
	private String branchName="잠실점";
	private List<String> productItem=new ArrayList<>();
	private List<String> clothesItem;
	//게터, 세터
	@Override
	public List<String> getClothesItem() {
		// TODO Auto-generated method stub
		return clothesItem;
	}
	@Override
	public void setClothesItem(List<String> clothesItem) {
		// TODO Auto-generated method stub
	}
	@Override
	public List<String> getProductItem() {
		return productItem;
	}
	@Override
	public void setProductItem(String... s) {
		for (String item:s) {
			productItem.add(item);
		}
	}
	
	@Override
	public void clothesNamePrint() {
		System.out.println("["+branchName+"] 의류코너");
		System.out.print("***");
		for(String item:clothesItem) {
			System.out.print(item+" ");
		}
		System.out.println();
	}
	@Override
	public void productNamePrint() {
		System.out.println("["+branchName+"] 공산품 코너");
		System.out.print("***");
		for(String item:productItem) {
			System.out.print(item+" ");
		}
		System.out.println();
	}
}

public class J20210506_Supermarket {

	public static void main(String[] args) {
		Branch1 b1=new Branch1();
		b1.companyInfoPrint();
		System.out.println("-------------------");
		//공산품코너:가변인자
		b1.setProductItem("욕실용품","주방용품","가구");
		b1.productNamePrint();
		//고기코너:상품리스트 객체생성
		List<String> meatItem=new ArrayList<>();
		meatItem.add("소고기");
		meatItem.add("돼지고기");
		b1.setMeatItem(meatItem);
		b1.meatNamePrint();
	}

}
