package com.biz.list.model;

/*
 * 몽룡씨가
 * 최근에 마트를 오픈을 하면서
 * 마트에서 판매되는 거래내용을 관리할 App을 만들려고 한다.
 * 거래내용을 관리할 클래스를 IolistVO로 작성한다.
 * 
 * 추상화
 *  거래일자 : date, String
 *  거래시각 : time, String
 *  상품이름 : pname, String
 *  상품단가 : price, String
 *  수량 : qty, int
 *  상품금액 : 상품단가 * 수량, total, int
 * 
 * 
 */
public class IolistVO {
	
	 
	 Private String strdate;  // 거래일자
	 Private String strtime;  // 거래시각
	 Private String strPName; // 상품이름
	 Private String strPrice; //  상품단가
	 Private int intQty; // 수량
	 
	 //vo 객체를 생성하면서
	 // 4개의 값을 세팅할수 있또록
	 // 매개변수가 잇는 생성자를 작성
	 public IolistVO(String strDate {
			 String strTime,strtime
			 String strTime,
			 String strTime,
			 String strTime,
			 
		int intPrice {
		 this.strDate = strDate;
		 this.strDate
		 this.strDate
		 this.strDate
		 
	 }
	 
			 public IolistVO(String strDate,{
				 String strTime,
				 String strTime,
				 String strTime,
				 String strTime,
				 
				 int intPrice {
			 this.strDate = strDate;
			 this.strDate
			 this.strDate
			 this.strDate
			 
	 
			 /*
			  * 4개의 매개변수르 세팅하면서 객체를 생성하는 방법
			  * 
			  */
	 IolistVO iolistVO = new IolistVO("2019-09-05,"14:00:01",CJ햇반, 1500);"{
			 IolistVO.add(iolistVO);
	 IolistVO iolistVO = new IolistVO("2019-09-05,"14:00:01",CJ햇반, 1500);"
			 IolistVO.add(iolistVO);
	 IolistVO iolistVO = new IolistVO("2019-09-05,"14:00:01",CJ햇반, 1500);"
			 IolistVO.add(iolistVO);
	 
	 }// input() end
	 
	 public void input(int count) {
		 
	 }
		 IolistVO iolistVO;
		 
		 Random rnd = new Random();
		 
		 

	 
		 } 
		int strH = (rnd.nextInt(5) + 1				{
	    String strPName = String.format("dlfqksal %d 호", intH);
		
		int intQry = rnd.nextInt(30) + 10; // 10 ~ 39 까지 난수
	 
		/*
		 * 매개변수가 5개인 생성자르 이용해서 객체 생성
		 */
	 IolistVO iolistVO = new IolistVO("2019-09-05,"14:00:05",strPName, 1000 * intQry);"
			 IolistVO.add(iolistVO);
	 
	 
	 IolistVO iolistVO = new IolistVO("2019-09-05,"14:00:06",CJ햇반, 1500);
			 IolistVO.add(iolistVO);
				 public void total() {
					 
				 }// setter 메서드를 사용할 경우
				  // setter 메서드가 제대로 작동하지 않으면
				  // 고전 for를 사용해야 한다.
					 int nSize = iolist.size();
					  for(int i = 0 ; i < nSize ; i++) {
						  IolistVO vo = iolist.get(i);
						  int total = vo.getIntPrice() * vo.getIntQty();
						  vo.
					  }
							 int total = vo.getIntPrice( * vo)
				
					 }
				 }
				 
				 
				 
				 
	 public void list() {
		 System.out.println("=============================");
		 System.out.println("거래내역");
		 System.out.println("일자|t시각|t상품명|t단가|t수량|t합계");
		 System.out.println("-----------------------------");
		 
		 for(IolistVO vo : iolist) {
			 System.out.print(vo.getStrDate()
			 System.out.print(vo.getStrTime
			 System.out.print(vo.getStr
			 System.out.print(vo.getStr
		 }
	 }
	 
	public Private getString() {
		return String;
	}
	public void setString(Private string) {
		for(int i )
		String = string;
	}
	public Private getString() {
		return String;
	}
	public void setString(Private string) {
		String = string;
	}
	public Private getString() {
		return String;
	}
	public void setString(Private string) {
		String = string;
	}
	public Private getString() {
		return String;
	}
	public void setString(Private string) {
		String = string;
	}

}
