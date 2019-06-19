import java.awt.*;

public class ChatClient extends Frame {

	public static void main(String[] args) {
		new ChatClient().launchFrame();
	}
	
	public void launchFrame() {
		setLocation(400, 300);
		this.setSize(300, 300);
		setVisible(true);
	}

}
