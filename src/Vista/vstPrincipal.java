
package Vista;

import Logica.controlGato;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class vstPrincipal extends JFrame implements ActionListener{
    
    private JPanel pnlLibre;
    private JButton[][] btnGato;
    private int filas = 3, columnas = 3, x = 80, y = 80;
    private Container contenedor;
    private controlGato control;
    
    public  vstPrincipal()
    {
        super("Gato");

        this.setSize(600, 600);
        this.setResizable(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        contenedor = this.getContentPane();
        
        control = new controlGato();
        btnGato = new JButton[filas][columnas];
        
        pnlLibre = new JPanel();
        pnlLibre.setLayout(null);
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j <columnas; j++) {
                String nombre = new Integer(i).toString();
                nombre += new Integer(j).toString();
                btnGato[i][j] = new JButton();
                pnlLibre.add(btnGato[i][j]);
                btnGato[i][j].setBounds(x, y, 140, 140);
                btnGato[i][j].setActionCommand(nombre);
                btnGato[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ax) {
                        System.out.println("Presionando el boton: " +ax.getActionCommand());
                        queBoton(ax);
                        
                    }
                });
                y+=150;
            }
            x+=150;
            y=80;
        }
        
        contenedor.add(pnlLibre);
        
    }
    
    private void queBoton(ActionEvent aev)
    {
        if(aev.getActionCommand().equals("00"))
        {
            control.ver(btnGato[0][0], control.getTurno());
            btnGato[0][0].setEnabled(false);
            control.ganador(btnGato);
        }
        if(aev.getActionCommand().equals("10"))
        {
            control.ver(btnGato[1][0], control.getTurno());
            btnGato[1][0].setEnabled(false);
            control.ganador(btnGato);
        }
        if(aev.getActionCommand().equals("20"))
        {
            control.ver(btnGato[2][0], control.getTurno());
            btnGato[2][0].setEnabled(false);
            control.ganador(btnGato);
        }
        if(aev.getActionCommand().equals("01"))
        {
            control.ver(btnGato[0][1], control.getTurno());
            btnGato[0][1].setEnabled(false);
            control.ganador(btnGato);
        }
        if(aev.getActionCommand().equals("11"))
        {
            control.ver(btnGato[1][1], control.getTurno());
            btnGato[1][1].setEnabled(false);
            control.ganador(btnGato);
        }
        if(aev.getActionCommand().equals("21"))
        {
            control.ver(btnGato[2][1], control.getTurno());
            btnGato[2][1].setEnabled(false);
            control.ganador(btnGato);
        }
        if(aev.getActionCommand().equals("02"))
        {
            control.ver(btnGato[0][2], control.getTurno());
            btnGato[0][2].setEnabled(false);
            control.ganador(btnGato);
        }
        if(aev.getActionCommand().equals("12"))
        {
            control.ver(btnGato[1][2], control.getTurno());
            btnGato[1][2].setEnabled(false);
            control.ganador(btnGato);
        }
        if(aev.getActionCommand().equals("22"))
        {
            control.ver(btnGato[2][2], control.getTurno());
            btnGato[2][2].setEnabled(false);
            control.ganador(btnGato);
        }
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
