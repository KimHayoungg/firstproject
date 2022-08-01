package Frame;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Frame.FrameBase;
			 //아무것도 없는 빈 창 
public class FrameBase extends JFrame {

	private static FrameBase instance;
		
		private FrameBase(JFrame f) {
			
			//해상도
			Toolkit tk=Toolkit.getDefaultToolkit();
			
			//기본 JFrame환경설정 (창이 뜨게 만들기)
			setTitle("책임GYM");										//프로젝트 이름
			setLayout(null);										//위치 내마음대로 지정
			setBounds(((int)tk.getScreenSize().getWidth())/2-300,	//가로600의 절반만큼 빼기
					  ((int)tk.getScreenSize().getHeight())/2-400, 	//세로800의 절반만큼 빼기
					  	600, 800);
		    
			getContentPane().setBackground(Color.yellow);
			
			
		} //생성자
		
	//싱글톤 기법을 사용하기 위한 메서드	
	static public void getInstance(JFrame f) {
		instance = new FrameBase(f);
		
		instance.getContentPane().removeAll();
		
		
		instance.revalidate();
		instance.repaint();//그리기	
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x버튼
     
	}

	@Override
	public int getDefaultCloseOperation() {
		// TODO Auto-generated method stub
		return super.getDefaultCloseOperation();
	}
	
	
	
     
     

	
}
