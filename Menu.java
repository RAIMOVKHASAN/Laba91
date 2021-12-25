import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Menu extends JFrame implements ActionListener{
	private SimpleGUI myPanel = new SimpleGUI();
	public Menu(String name){
		//конструктор окна с меню, параметр – заголовок окна
		super(name);//передаем заголовок окна в конструктор класса-родителя – в JFrame
		add(myPanel, BorderLayout.CENTER);
		JMenuBar myMenuBar=new JMenuBar();// создаем строку меню
		JMenuItem menus[]=new JMenuItem[6]; //создаем второй пункт меню и далее аналогично первому
		for (int i = 0; i < 6; i++) {
			menus[i] = new JMenuItem(SimpleGUI.Figure.values()[i].toString());
			menus[i].addActionListener(this);
			myMenuBar.add(menus[i]);
		}
		setJMenuBar(myMenuBar);
		// Dimension size = getSize();
		// size.setSize(size.width + 350, size.height + 200);
		// setMinimumSize(size);
		pack();
		setVisible(true);
		//в строку меню добавляем главные пункты меню
		// setJMenuBar(myMenuBar);
		//устанавливаем для окна созданное меню
		// setVisible(true);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		myPanel.ris(e.getActionCommand());
	}
}
