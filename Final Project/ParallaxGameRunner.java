import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ParallaxGameRunner {
	static boolean started = false;
	public static final int arenaWidth = 1400;
	public static final int arenaHeight = 900;

	public static void main(String[] args) {

		JFrame frame = new JFrame("Parallax by Albert Lin 2018");
		frame.setSize(1500, 1000);
		frame.setResizable(false);

		frame.setLocationRelativeTo(null);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel gamePanel = new JPanel();
		
		JButton restarter = new JButton("Start");
		restarter.setPreferredSize(new Dimension(300, 30));
		JButton keyBinder = new JButton("Key Bindings");
		keyBinder.setPreferredSize(new Dimension(300, 30));

		ArenaComponent arenaComponent = new ArenaComponent();
		arenaComponent.setPreferredSize(new Dimension(arenaWidth, arenaHeight));
		arenaComponent.setFocusable(true);

		TitleScreenComponent titleScreenComponent = new TitleScreenComponent();
		titleScreenComponent.setPreferredSize(new Dimension(arenaWidth, arenaHeight));
		
		gamePanel.add(titleScreenComponent);
		gamePanel.add(restarter);
		gamePanel.add(keyBinder);
		frame.add(gamePanel);
		// GUI parts initialized above
		
		
		
		//defining all buttons
		class BListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				if (!started) {
					restarter.setText("Restart");
					gamePanel.removeAll();
					gamePanel.add(arenaComponent);
					gamePanel.add(restarter);
					gamePanel.add(keyBinder);
				}
				
				arenaComponent.grabFocus();
				arenaComponent.startGame();
				
			}
		}
		class KeyBindingButtonListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				
				arenaComponent.setKeyBindings();
				
			}
		}
		//adding all the functions to the components
		restarter.addActionListener(new BListener());
		keyBinder.addActionListener(new KeyBindingButtonListener());
		frame.setVisible(true);

	}

}
