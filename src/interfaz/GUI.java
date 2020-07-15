package interfaz;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class GUI extends Shell {

	public static void main(String args[]) {
		try {
			Display display = Display.getDefault();
			GUI shell = new GUI(display);
			shell.open();
			shell.layout();
			while (!shell.isDisposed()) {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public GUI(Display display) {
		super(display, SWT.SHELL_TRIM);
		createContents();
	}

	protected void createContents() {
		setText("SWT Application");
		setSize(450, 300);

	}

	@Override
	protected void checkSubclass() {
		
	}

}
