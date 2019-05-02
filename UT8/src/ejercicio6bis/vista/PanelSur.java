package ejercicio6bis.vista;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class PanelSur extends JPanel {

	private static final long serialVersionUID = 1L;

	public PanelSur() {
		setBorder(new EmptyBorder(10, 0, 10, 10));
		FlowLayout flowLayout = (FlowLayout) getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);

		JLabel lblAutor = new JLabel("Autor: Alvaro Santillana Cernuda");
		lblAutor.setFont(new Font("SansSerif", Font.ITALIC, 12));
		lblAutor.setHorizontalAlignment(SwingConstants.RIGHT);
		this.add(lblAutor);

	}

}
