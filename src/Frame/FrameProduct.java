package Frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
			 //프로틴, 스낵, 닭가슴살 구매하는 페이지
public class FrameProduct extends JFrame {
	
	public FrameProduct() {

		
		//====================[기본 프레임설정]====================
		setBackground(Color.gray);
		setLayout(null);
		setSize(600, 800);
/*
		//====================[상단부 : topPanel]====================
		//[상단부 기본구조] - 크기, 레이아웃, 색
		JPanel topPanel = new JPanel();					
		
		topPanel.setBounds(0, 0, 600, 150);				
		topPanel.setLayout(null);							
		topPanel.setBackground(new Color(0xFFD700));	
		/////////////////배달배달에서 하단에 들어가는 폰트 세팅 추가하기 > 각각 버튼마다 폰트를 따로 줄필요 없는지 아 어차피 사진넣을거지  어쨋든//////////////////////////////
		
		*/
//[뒤로가기(btnBack) 버튼 : 상품 카테고리 선택 페이지(FrameCategory)로 이동]
        //버튼 설정
		JButton btnBack = new JButton("<");				
		
		btnBack.setBackground(Color.CYAN);			
		btnBack.setSize(45, 45);						
		btnBack.setLocation(5, 0);							
		btnBack.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		
		//상단부에 올리기
		//topPanel.add(btnBack);
		add(btnBack);
		
		//클릭액션
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				FrameBase.getInstance(new FrameCategory());
			}
		});
		
		
//[장바구니(btnBasket) 버튼 : 장바구니 페이지(FrameBasket)로 이동]
		
		//버튼 설정
		JButton btnBasket = new JButton("장바구니");
		
		btnBasket.setBackground(new Color(0xA6A6A6));
		btnBasket.setSize(183, 87);
		btnBasket.setLocation(391, 0);		//5+183+여유공간
		btnBasket.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		
		//상단부에 올리기
		//topPanel.add(btnBasket);
		add(btnBasket);
		
		//클릭액션
		btnBasket.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameBasket());
				dispose();
			}
		});
		

//[주문하기 문구(name1) 라벨]		
		
		//1.문구 만들기
		JLabel name1= new JLabel("주문하기"); 
		name1.setFont(new Font("나눔고딕코딩", Font.BOLD, 16));
		name1.setBounds(15, 50, 90, 60);
		
		//2.상단부 프레임에 붙이기
		//topPanel.add(name1);
		add(name1);
		
		
//[상품선택(프로틴, 스낵, 닭가슴살)]

		//1. 각각 버튼 3개 만들기
		JButton btnProt = new JButton("프로틴");
		btnProt.setBackground(Color.green);
		btnProt.setBounds(5, 100, 190, 40);
		
		JButton btnSnack = new JButton("스낵");
		btnSnack.setBackground(Color.green);
		btnSnack.setBounds(195, 100, 190, 40);
		
		JButton btnChicken = new JButton("닭가슴살");
		btnChicken.setBackground(Color.green);
		btnChicken.setBounds(385, 100, 190, 40);
		
		
		//상단부에 담기		
		//topPanel.add(btnProt);
		//topPanel.add(btnSnack);
		//topPanel.add(btnChicken);
		add(btnProt);
		add(btnSnack);
		add(btnChicken);
		

		
		//====================[프로틴 패널 : 프로틴 선택시 보이는 5개 상품]====================
//[패널 기본 설정]
		JPanel proteinSet = new JPanel();
		proteinSet.setBounds(0, 100, 600, 600);
		proteinSet.setBackground(Color.pink);
		
//[보충제1] (사진에 그림 그려놓은거 참고)
//이미지
//제품1
		//이미지 불러서 라벨에 입히기
		ImageIcon protein1 = new ImageIcon("보충제1.png");
		JLabel imgPro1 = new JLabel(protein1);
		
		imgPro1.setPreferredSize(new Dimension(0, 500));
		//imgPro1.setLocation(500, 500);
		
		
		JLabel pro11 = new JLabel("프로바이오틱 웨이 프로틴");
		pro11.setFont(new Font ("나눔고딕코딩",Font.BOLD, 20));
		pro11.setBounds(10, 50, 90, 20);
		
		JLabel pro12 = new JLabel("맛 : 초콜릿   총량 : 900g");
		pro11.setFont(new Font ("나눔고딕코딩",Font.PLAIN, 20));
		pro11.setBounds(10, 70, 90, 20);
		
		JLabel pro13 = new JLabel("<html>프로바이오틱 웨이 프로틴은 신체가 필요로 하는 고품질의 단백질을 제공하여 근육량1의 성장과 유지에 기여합니다."
				+"<br>신제품 프로바이오틱 웨이 프로틴으로 매일 필요한 단백질과 풍부한 유산균을 간편하게 섭취해보세요.</html>");
		pro11.setFont(new Font ("나눔고딕코딩",Font.PLAIN, 10));
		pro11.setBounds(10, 90, 200, 20);
		
		//프로틴 패널에 올리기
		proteinSet.add(imgPro1);
		proteinSet.add(pro11);
		proteinSet.add(pro12);
		proteinSet.add(pro13);

		
		
		
//상품설명
		//menu1에 해당 메뉴 사진 붙이기
		
		//1. 제이라벨로 글상자 추가 예쁘게 보이려면 글자를 각각 다르게 하는게 좋을 것 같은데 한 상자 안에서는 폰트 사이즈나 색을 다르게 할 수 있는지
		//JLabel story1 = new JLabel(Ap.get(p1));
		//2. 아니면 사진으로 추가해도 되나 
		
		// ex
		// 스팀닭가슴살 오리지널  								(제일 굵고 크게)
		// 내용량 : 100g    칼로리 : 110kcal    단백질 : 24g		(보통사이즈)
		// 스팀으로 푹 찐 기본에 충실한 단백한 오리지널 스팀 닭가슴살		(얇고 제일 작게)
		
//가격
		//1. 제이라벨로 가격불러오기
		
		
//수량 
		//1. 제이라벨로 처음숫자 0불러오고
		//2.-, + 버튼누르면 숫자 변화하게 
//-버튼
		//1. 0상태에서 -누르면 안된다고 하고
		//2. 9가 최대라고 하고
//+버튼		
		//1. 0상태에서 -누르면 안된다고 하고
		//2. 9가 최대라고 하고
		
		
		
		add(proteinSet);
		
		
		//====================[스낵 패널 : 스낵 선택시 보이는 5개 상품]====================
		JPanel snackSet = new JPanel();
		snackSet.setBounds(0, 100, 600, 600);
		snackSet.setBackground(Color.blue);
		
		add(snackSet);
		
		//이미지 불러서 라벨에 입히기
				ImageIcon snack1 = new ImageIcon("간식1.png");
				JLabel imgsnc1 = new JLabel(snack1);
				
				imgsnc1.setSize(150,150);
				//lblPro1.setLocation(0, 500);
				
				JLabel snack11 = new JLabel("프로틴 브라우니");
				snack11.setFont(new Font ("나눔고딕코딩",Font.BOLD, 20));
				snack11.setBounds(10, 10, 90, 60);
				
				JLabel snack12 = new JLabel("맛 : 초콜릿   총량 : 900g");
				snack12.setFont(new Font ("나눔고딕코딩",Font.PLAIN, 20));
				snack12.setBounds(10, 20, 90, 60);
				
				JLabel snack13 = new JLabel("프로바이오틱 웨이 프로틴은 신체가 필요로 하는 고품질의 단백질을 제공하여 근육량1의 성장과 유지에 기여합니다."
						+ "/n+신제품 프로바이오틱 웨이 프로틴으로 매일 필요한 단백질과 풍부한 유산균을 간편하게 섭취해보세요.");
				snack13.setFont(new Font ("나눔고딕코딩",Font.PLAIN, 10));
				snack13.setBounds(10, 30, 90, 60);
				
				//프로틴 패널에 올리기
				snackSet.add(imgsnc1);
				snackSet.add(snack11);
				snackSet.add(snack12);
				snackSet.add(snack13);

		
		
		
		
		//====================[닭가슴살 패널 : 닭가슴살 선택시 보이는 5개 상품]====================
		JPanel chickenSet = new JPanel();
		chickenSet.setBounds(0, 100, 600, 600);
		chickenSet.setBackground(Color.green);
		
		add(chickenSet);
		
		
//====================[상품누르면 패널 바뀌는 액션]====================
//[프로틴 클릭시]
		btnProt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				proteinSet.setVisible(true);
				snackSet.setVisible(false);
				chickenSet.setVisible(false);
			}
		});
		
		
		
		
//[스낵 클릭시]		
		btnSnack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				proteinSet.setVisible(false);
				snackSet.setVisible(true);
				chickenSet.setVisible(false);
				
			}
		});
		
		
		
//[닭가슴살 클릭시]
		btnChicken.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				proteinSet.setVisible(false);
				snackSet.setVisible(false);
				chickenSet.setVisible(true);
			}
		});
		
		
		/*
		//====================[하단부 : bottomPanel]====================
		//[하단부 기본구조] - 크기, 레이아웃, 색
		JPanel bottomPanel = new JPanel();
		
		bottomPanel.setBounds(0, 650, 600, 50);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.RED);
		*/
//[주문하기(btnOrder) 버튼]
		JButton btnOrder = new JButton("주문하기");
		btnOrder.setBackground(Color.GREEN);
		btnOrder.setBounds(330, 720, 130, 40);
		
		//bottomPanel.add(btnOrder);
		add(btnOrder);
		
		btnOrder.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameBasket());
				dispose();
			}
		});
		
//[장바구니 담기(btnPut) 버튼]
		JButton btnPut = new JButton("장바구니 담기");
		btnPut.setBackground(Color.GREEN);
		btnPut.setBounds(520, 750, 130, 40);
		
		//bottomPanel.add(btnPut);
		add(btnPut);
		
		btnPut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//장바구니에 내용추가하는거 만들어주고싶음///////////////////////////////////////////////////////////
				
			}
		});
		
		
		//하단부에 담기		
		//bottomPanel.add(btnOrder);
		//bottomPanel.add(btnPut);
		add(btnOrder);
		add(btnPut);
		

		//====================[프레임에 패널올리기]====================
		//add(topPanel);
		//add(bottomPanel);
		
	}
	
}

