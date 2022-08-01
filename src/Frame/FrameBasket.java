package Frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameBasket extends JFrame {

	public FrameBasket() {

		//====================[기본 프레임설정]====================
		setBackground(Color.black);
		setSize(600, 800);
		setLayout(null);
	/*
		//====================[상단부 : topPanel]====================
		//[상단부 기본구조] - 크기, 레이아웃, 색
		JPanel topPanel = new JPanel();					
		
		topPanel.setBounds(0, 0, 600, 150);				
		topPanel.setLayout(null);							
		topPanel.setBackground(new Color(0xFFD700));	
		/////////////////배달배달에서 하단에 들어가는 폰트 세팅 추가하기 > 각각 버튼마다 폰트를 따로 줄필요 없는지 아 어차피 사진넣을거지  어쨋든//////////////////////////////
	*/	
				
//[뒤로가기(btnBack) 버튼 : 상품 카테고리 선택 페이지(FrameProduct)로 이동]
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
				FrameBase.getInstance(new FrameProduct());
			}
		});
				
				
//[장바구니 문구(name1) 라벨]		
		
		//1.문구 만들기
		JLabel name1= new JLabel("장바구니"); 
		name1.setFont(new Font("나눔고딕코딩", Font.BOLD, 16));
		name1.setBounds(15, 50, 90, 60);
		
		//2.상단부 프레임에 붙이기
		//topPanel.add(name1);
		add(name1);

//[주문할 상품 선택(제품, 샐러드)]

		//1. 각각 버튼 2개 만들기
		JButton btnPsc = new JButton("프로틴, 스낵, 닭가슴살");
		btnPsc.setBackground(Color.green);
		btnPsc.setBounds(10, 100, 300, 45);
		
		JButton btnDeli = new JButton("샐러드 바로배송");
		btnDeli.setBackground(Color.green);
		btnDeli.setBounds(310, 100, 300, 45);
		
	
		//2. 상단부에 담기		
		//topPanel.add(btnPsc);
		//topPanel.add(btnDeli);
		add(btnPsc);
		add(btnDeli);
	

		//====================[프로틴, 스낵, 닭가슴살 패널 : 장바구니 내용]====================
//[패널 기본 설정]
		JPanel pscSet = new JPanel();
		pscSet.setBounds(0, 100, 600, 600);
		pscSet.setBackground(Color.pink);
		

		
		add(pscSet);
		
		
		//====================[샐러드 바로배송 패널 : 장바구니 내용]====================
		JPanel deliSet = new JPanel();
		deliSet.setBounds(0, 100, 600, 600);
		deliSet.setBackground(new Color(80,150,50));
		
		add(deliSet);
		

		
		
		btnPsc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pscSet.setVisible(true);
				deliSet.setVisible(false);
			}
		});
		
		
		btnDeli.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pscSet.setVisible(false);
				deliSet.setVisible(true);
			}
		});
		

		//add(topPanel);
		
		JButton btnOrder = new JButton("주문하기");
		
		btnOrder.setBounds(495, 745, 100, 50);
		
		btnOrder.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameOrder());
			}
		});
		
		add(btnOrder);
		
		
		
		
	}//생성자
	
	
}//class

