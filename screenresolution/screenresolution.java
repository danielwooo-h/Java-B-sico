package screenresolution;

import java.awt.Dimension;
import java.awt.Toolkit;

public class screenresolution {
    
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução da sua máquina é: " + d.width + " x " + d.height);
    }
}
