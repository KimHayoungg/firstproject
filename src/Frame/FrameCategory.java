package Frame;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
			 //식품 카테고리 선택
public class FrameCategory extends JFrame{

	public FrameCategory() {

		//====================[기본 프레임설정]====================
		setTitle("카테고리 선택");			
		//setBounds(0, 0, 600, 800);
		setSize(600,800);
       setBackground(Color.blue);
		setLayout(null);

        
		
		//====================[상단부 : topPanel]====================
        //[상단부 기본구조] - 크기, 레이아웃, 색
        JPanel topPanel=new JPanel();
		
        topPanel.setBounds(0, 0, 600, 100);				
        topPanel.setLayout(null);							
        //topPanel.setBackground(Color.darkGray);	
		/////////////////배달배달에서 하단에 들어가는 폰트 세팅 추가하기 > 각각 버튼마다 폰트를 따로 줄필요 없는지 아 어차피 사진넣을거지  어쨋든//////////////////////////////
		
		
//[뒤로가기(btnBack) 버튼 : 운동,구매 선택 페이지(FrameAction)로 이동]
        //버튼 설정
		JButton btnBack = new JButton("<");				
		
		btnBack.setBackground(Color.CYAN);			
		btnBack.setSize(45, 45);						
		btnBack.setLocation(5, 0);							
		btnBack.setFont(new Font("나눔고딕코딩", Font.BOLD, 18));
		
		//상단부에 올리기
		topPanel.add(btnBack);
		
		//클릭액션
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//FrameBase.getInstance(new FrameAction());
				//운동,구매 선택 페이지(가제 : FrameAction)로 이동할것 추가할 예정 한번만들어봄/////////////////////////////////////////////////////
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
		topPanel.add(btnBasket);
		
		//클릭액션
		btnBasket.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameBasket());
			    dispose();
			}
		});
		
		
		

		
		//====================[하단부 : bottomPanel]====================
		//[하단부 기본구조] - 크기, 레이아웃, 색
		JPanel bottomPanel = new JPanel();
		
		bottomPanel.setBounds(0, 100, 600, 700);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.LIGHT_GRAY);

		
//[프로틴(btnProtein) 버튼 : 상품페이지(FrameProduct)로 이동]
		
		//이미지 불러서 버튼에 입히기
		ImageIcon protein = new ImageIcon("프로틴대표이미지1.png");			
		JButton btnProtein = new JButton(protein);				
		
		btnProtein.setName("프로틴");								
		btnProtein.setSize(185,250);								
		btnProtein.setLocation(72,30);							
		
		//하단부에 올리기
		bottomPanel.add(btnProtein);
		
		//클릭 액션
		btnProtein.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				FrameBase.getInstance(new FrameProduct());
			}
		});
		
		
				
//[간식(btnSnack) 버튼 : 상품페이지(FrameProduct)로 이동]
		
		//이미지 불러서 버튼에 입히기
		ImageIcon snack = new ImageIcon("스낵대표이미지1.png");
		JButton btnSnack = new JButton(snack);
		
		btnSnack.setName("간식");

		btnSnack.setSize(185,250);
		btnSnack.setLocation(320,30);
		
		//하단부에 올리기
		bottomPanel.add(btnSnack);
	
		//클릭 액션
		btnSnack.addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				FrameBase.getInstance(new FrameProduct());
			}
		});
				
		
		
//[닭가슴살(btnChicken) 버튼 : 상품페이지(FrameProduct)로 이동]		
		
		//이미지 불러서 버튼에 입히기
		ImageIcon chicken = new ImageIcon("닭가슴살대표이미지.png");
		JButton btnChicken = new JButton(chicken);
		btnChicken.setName("닭가슴살");

		btnChicken.setSize(185,250);
		btnChicken.setLocation(72,340);
		
		//하단부에 올리기
		bottomPanel.add(btnChicken);			
				
		//클릭 액션
		btnChicken.addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				FrameBase.getInstance(new FrameProduct());
			}
		});
				
		

//[샐러드(btnSalad) 버튼 : 샐러드 주문페이지(FrameSalad)로 이동]		
		
		//이미지 불러서 버튼에 입히기
		ImageIcon salad = new ImageIcon("샐러드1.png");
		JButton btnSalad = new JButton(salad);
		btnSalad.setName("샐러드");

		btnSalad.setSize(185,250);
		btnSalad.setLocation(320,340);
		
		//하단부에 올리기
		bottomPanel.add(btnSalad);			
				
		//클릭 액션
		btnSalad.addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				FrameBase.getInstance(new FrameSalad());
			}
		});
		
		
		
		//====================[프레임에 상,하단부 올리기]====================
		add(topPanel);
		add(bottomPanel);
		
		setVisible(true);
		
		
	}//생성자

}//class

