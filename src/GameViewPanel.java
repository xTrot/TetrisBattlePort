import javax.swing.BoxLayout;
import javax.swing.JPanel;


public class GameViewPanel extends JPanel {

	private static final long serialVersionUID = 7619756819145286482L;
	private boolean isHost;
	private GameComponent gView;

	/**
	 * This is the GameViewPanel it will contain the GameView
	 * but there are two types of view the HostView and the 
	 * ClientView. You can specify which with the isHost 
	 * parameter.
	 * @param isHost If true chooses the HostVIew.
	 */
	public GameViewPanel(boolean isHost) {
		// TODO Auto-generated constructor stub
		this.isHost=isHost;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		gView = new GameComponent(this.isHost);
		this.add(gView);
		this.setVisible(true);
		
	}

}
