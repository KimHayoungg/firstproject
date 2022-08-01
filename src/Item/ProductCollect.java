package Item;

import java.util.ArrayList;

public class ProductCollect {
/*
	//public static String 
	private static ArrayList<Product> Protein = new ArrayList<Product>();
	
	public static ArrayList<Product> getProtein() {
		Product p1 = new Product("프로바이오틱 웨이 프로틴", 
			    "맛 : 초콜릿   총량 : 900g" ,
			 	"프로바이오틱 웨이 프로틴은 신체가 필요로 하는 고품질의 단백질을 제공하여 근육량1의 성장과 유지에 기여합니다."+
			    "/n신제품 프로바이오틱 웨이 프로틴으로 매일 필요한 단백질과 풍부한 유산균을 간편하게 섭취해보세요.");

		Product p2 = new Product("THE 다이어트", 
			    "맛 : 초콜릿   총량 : 1500g" ,
			 	"THE 다이어트는 체중 감량 프로그램이나 건강한 생활방식을 보완하기에 적절한 제품입니다."+
			    "/n식이요법과 병행하시면 체중 감량에 큰 효과를 얻으실 수 있습니다.");
		
		Product p3 = new Product("THE 게이너", 
			    "맛 : 초콜릿   총량 : 2500g" ,
			 	"THE 게이너는 체중 증량에 필요한 중요한 성분들을 한 번에 얻을 수 있도록 만들어졌습니다."+
			    "/n또한, 건강한 지방 공급원인 아마씨 (flaxseed)와 MCT를 함유하고 있어 식이섬유와 칼로리 섭취를 증가시키는데에 매우 적합합니다.");
		
		Product p4 = new Product("클리어 소이 프로틴", 
			    "맛 : 레몬라임   총량 : 800g" ,
			 	"클리어 소이 프로틴은 기존의 비건 프로틴 쉐이크와 다릅니다."+
			    "/n분리 대두 단백과 과일 농축을 함유하고 있어 우유 제형의 프로틴 쉐이크보다 주스에 가까운 제품으로 상쾌한 음용감을 자랑합니다.");
		
		Product p5 = new Product("소이 + 콜라겐 프로틴", 
			    "맛 : 밀크티   총량 : 1500g" ,
			 	"소이 + 콜라겐 단백질은 단백질과 비오틴, 아연, 니코틴산을 비롯한 필수 비타민이 완벽하게 혼합되어"+
			    "/n모발, 피부, 손톱 건강 유지에 도움을 주어 언제나 건강하고 활력 있는 모습으로 가꾸어 줍니다.");

		Protein.add(p1);
		Protein.add(p2);
		Protein.add(p3);
		Protein.add(p4);
		Protein.add(p5);
		
						
		return Protein;
	}
	
	
	
}



package food;

import java.util.ArrayList;
//가게의 메뉴 정보를 담아놓은 클래스입니다!
public class MenuCollect {
*/	
	public static String StoreInformation;
	
	private static ArrayList<Product> Honkong = new ArrayList<Product>(); //홍콩반점 메뉴
	private static ArrayList<Product> Budae = new ArrayList<Product>(); 
	private static ArrayList<Product> Chieken = new ArrayList<Product>();
	private static ArrayList<Product> outback = new ArrayList<Product>();
	
	//홍콩반점
	public static ArrayList<Product> getHonkong() { 
		
		StoreInformation="홍콩반점0410\r\n"
				+ "상호명 : 홍콩반점0410\r\n"
				+ "운영시간 : 매일~오전 11:00 ~ 오후 10:30\r\n"
				+ "휴무일 : 연중무휴\r\n"
				+ "전화번호 : 050-6329-7713\r\n"
				+ "배달지역 : 매장 기준 1.5km 이내\r\n"
				+ "\r\n"
				+ "안내 및 혜택\r\n"
				+ "-리뷰이벤트\r\n"
				+ "1.매실음료 2.트러플오일 3.만능마라소스 중 1가지 선택\r\n"
				+ "\r\n"
				+ "-주문 후 배차시 요리를 시작하며 최대한\r\n"
				+ "불지 않게 빠르고 맛있게 보내드리기 위해\r\n"
				+ "최선을 다하고 있습니다.\r\n"
				+ "\r\n"
				+ "-배달 예상시간이 조금 늦을경우 바로 연락드리겠습니다.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "사업자 정보\r\n"
				+ "대표자명 : 성민지\r\n"
				+ "상호명 : 홍콩반점0410\r\n"
				+ "사업자주소 서울특별시 종로구 동숭동1-105\r\n"
				+ "지하층(동숭동)\r\n"
				+ "위 주소는 사업자등록증에 표기된 정보입니다.\r\n"
				+ "사업자 등록번호 101-09-62850\r\n"
				+ "";
		
		Product m1=new Product("프로바이오틱 웨이 프로틴", 
			    "맛 : 초콜릿   총량 : 900g" ,
			 	"프로바이오틱 웨이 프로틴은 신체가 필요로 하는 고품질의 단백질을 제공하여 근육량1의 성장과 유지에 기여합니다."+
			    "/n신제품 프로바이오틱 웨이 프로틴으로 매일 필요한 단백질과 풍부한 유산균을 간편하게 섭취해보세요.");
 
		Product m2=new Product("THE 다이어트", 
			    "맛 : 초콜릿   총량 : 1500g" ,
			 	"THE 다이어트는 체중 감량 프로그램이나 건강한 생활방식을 보완하기에 적절한 제품입니다."+
			    "/n식이요법과 병행하시면 체중 감량에 큰 효과를 얻으실 수 있습니다.");
		 
		Product m3=new Product("THE 게이너", 
			    "맛 : 초콜릿   총량 : 2500g" ,
			 	"THE 게이너는 체중 증량에 필요한 중요한 성분들을 한 번에 얻을 수 있도록 만들어졌습니다."+
			    "/n또한, 건강한 지방 공급원인 아마씨 (flaxseed)와 MCT를 함유하고 있어 식이섬유와 칼로리 섭취를 증가시키는데에 매우 적합합니다.");
		
		Product m4=new Product("클리어 소이 프로틴", 
			    "맛 : 레몬라임   총량 : 800g" ,
			 	"클리어 소이 프로틴은 기존의 비건 프로틴 쉐이크와 다릅니다."+
			    "/n분리 대두 단백과 과일 농축을 함유하고 있어 우유 제형의 프로틴 쉐이크보다 주스에 가까운 제품으로 상쾌한 음용감을 자랑합니다.");
		 
		
		Honkong.add(m1);
		Honkong.add(m2);
		Honkong.add(m3);
		Honkong.add(m4);
		
		return Honkong;
	}
	/*
	//강철부대찌개
	public static ArrayList<Product> getBudae() {
		
		StoreInformation="땅스부대찌개\r\n"
				+ "상호명 : 땅스부대찌개 숭인점\r\n"
				+ "운영시간 : 매일 - 오전 11:00~오후10:00\r\n"
				+ "휴무일 : 연중무휴\r\n"
				+ "전화번호 : 050-4830-8428\r\n"
				+ "배달지역 : 동대문구 일부, 성북구 일부, \r\n"
				+ "종로구 일부, 중구 일부, 성동구 일부\r\n"
				+ "\r\n"
				+ "안내 및 혜택\r\n"
				+ "SBS 성공의 정석 꾼, KBS 6시내고향에도 나온\r\n"
				+ "땅스부대찌게는 가격 거품을 뺀 가성비 최고의 테이크아웃\r\n"
				+ "전문점입니다.\r\n"
				+ "\r\n"
				+ "-밥,밑반찬,냄비 및 버너, 일회용 수저는\r\n"
				+ "제공되지 않습니다.\r\n"
				+ "땅스 라면사리는 메뉴에 1개 포함되어있습니다.\r\n"
				+ "\r\n"
				+ "사업자 정보\r\n"
				+ "대표자명 오세영\r\n"
				+ "상호명 땅스부대찌개 숭인점\r\n"
				+ "사업자주소 서울특별시 종로구 숭인동 1048\r\n"
				+ "1층(숭인동)\r\n"
				+ "위 주소는 사업자등록증에 표기된 정보입니다.\r\n"
				+ "사업자 등록번호 602-47-00460";
		
		Product m1=new Product("오리지널 부대찌개 3인분", 13900, "기본 부대찌개 3인분+라면사리 1개"); 
		Product m2=new Product("치즈 부대찌개 3인분", 15000, "기본 부대찌개 3인분+라면사리 1개"
				+ "\n+치즈 토핑추가"); 
		Product m3=new Product("베이컨 부대찌개 3인분", 16900, "베이컨 부대찌개 3인분+라면사리 1개"); 
		Product m4=new Product("왕만두 부대찌개 3인분", 16000, "기본 부대찌개 3인분+ 라면사리 1개"
				+ "\n+김치왕만두2개,고기왕만두2개"); 
		
		Budae.add(m1);
		Budae.add(m2);
		Budae.add(m3);
		Budae.add(m4);
		
		return Budae;
	}
	//교촌치킨
	public static ArrayList<Product> getChieken() {
		
		StoreInformation="교촌치킨\r\n"
				+ "상호명 : 교촌치킨 대학로점\r\n"
				+ "운영시간 : 매일 - 오전 11:20~익일 밤 12:20\r\n"
				+ "휴무일 : 연중무휴\r\n"
				+ "전화번호 : 050-4823-2699\r\n"
				+ "배달지역 : 대학로 인근, 삼선,성북,종로,창신,을지로일대\r\n"
				+ "\r\n"
				+ "안내 및 혜택\r\n"
				+ "-불편한 사안이나 요청사항이 있으시면 \r\n"
				+ "매장으로 연락주세요.\r\n"
				+ "최대한 빠르게 조치하겠습니다.\r\n"
				+ "-일회용품 사용규제정책으로 여분은\r\n"
				+ "제공하지 않습니다. 꼭 필요하신 경우 메모란에\r\n"
				+ "요청해주세요.\r\n"
				+ "\r\n"
				+ "사업자 정보\r\n"
				+ "대표자명 박준민\r\n"
				+ "상호명 교촌치킨 대학로점\r\n"
				+ "사업자주소 서울특별시 종로구 대학로11길23\r\n"
				+ "(명륜4가,지상1층)\r\n"
				+ "위 주소는 사업자등록증에 표기된 정보입니다.\r\n"
				+ "사업자 등록번호 101-10-60713";
		
		Product m1=new Menu("교촌리얼후라이드", 13900, "오트밀, 퀴노아, 아마란스 등 슈퍼푸드로 바삭함을 살린 후라이드"); 
		Product m2=new Menu("교촌반반오리지날", 13900, "교촌만의 차별화된 마늘과 간장 소스의\r\n"
				+ "풍부한 맛이 어우러진 한 마리 치킨"); 
		Product m3=new Menu("교촌레드콤보", 13900, "국내산 청양 홍고추의 매콤한 맛에\r\n"
				+ "날개와 다리를 함께 즐길 수 있는 메뉴"); 
		Product m4=new Menu("교촌허니콤보", 13900, "달콤한 허니 소스에 쫄깃한 날개와\r\n"
				+ "담백한 다리가 만난 메뉴"); 
		
		Chieken.add(m1);
		Chieken.add(m2);
		Chieken.add(m3);
		Chieken.add(m4);
		
		return Chieken;
	}
	//아웃백스테이크 하우스
	public static ArrayList<Menu> getOutback() {
		
		StoreInformation="아웃백스테이크하우스\r\n"
				+ "상호명 : (유) 아웃백스테이크하우스 명동점\r\n"
				+ "주소 : 서울특별시 중구 을지로2가 199-13 3층 (을지로2가)\r\n"
				+ "운영시간 : 매일 - 오전 10:40 ~ 오후 9:00\r\n"
				+ "휴무일 : 연중무휴\r\n"
				+ "\r\n"
				+ "안내 및 혜택\r\n"
				+ "★아웃백 모든 음식은 전자레인지에 1분을 데워 드시면\r\n"
				+ "더더더더더 맛있게 드실 수 있습니다!★\r\n"
				+ "\r\n"
				+ "★부쉬맨 브레드는 메인 요리 당 1개씩 제공되고 있습\r\n"
				+ "니다★\r\n"
				+ "\r\n"
				+ "★배달 메뉴에는 제휴 서비스 및 멤버쉽 혜택 적용이\r\n"
				+ "불가능합니다★\r\n"
				+ "\r\n"
				+ "사업자 정보\r\n"
				+ "대표자명 김예슬\r\n"
				+ "상호명 (유) 아웃백스테이크하우스 명동점\r\n"
				+ "사업자주소 서울특별시 중구 을지로2가 199-13 3층\r\n"
				+ "(을지로2가)\r\n"
				+ "위 주소는 사업자등록증에 표기된 정보입니다.\r\n"
				+ "사업자 등록번호 211-86-42619";
		
		Menu m1=new Menu("투움바파스타", 23900, "최고급 파마산 치즈와 새우, 양송이를\r\n"
				+ "함께 볶아 깊고 진한 크림소스 파스타\r\n"
				+ "아웃백 스페셜 갈릭 스테이크"); 
		Menu m2=new Menu("아웃백 스페셜 갈릭 스테이크", 30900, "발사믹 소스에 조리한 마늘이 어우러진 아웃백\r\n"
				+ "시그니쳐 스테이크(220g)+고구마+볶음밥 함께 제공"); 
		Menu m3=new Menu("베이비 백립", 37900, "부드러운 돼지갈비에 아웃백만의 특제소스를 발라 구워낸 바비큐 요리"); 
		Menu m4=new Menu("오지치즈 후라이즈", 9900, "두툼한 감자튀김에 체다치즈, 잭치즈를 듬뿍 녹여 베이컨을 뿌린 메뉴"); 
		
		outback.add(m1);
		outback.add(m2);
		outback.add(m3);
		outback.add(m4);
		
		return outback;
	}
	
*/	
	
}