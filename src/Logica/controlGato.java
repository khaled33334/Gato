
package Logica;

import java.awt.*;
import javax.swing.*;


public class controlGato {
    
    private static int turno =0;

    public controlGato() {
    }

    public static int getTurno() {
        return turno;
    }

    public static void setTurno(int turno) {
        controlGato.turno = turno;
    }
    

    
    
    public boolean paridad(int entero)
    {
        if(entero %2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void ver(JButton boton, int sigTurno)
    {
        if(sigTurno ==0 || paridad(sigTurno))
        {
            boton.setText("X");
            boton.setFont(new java.awt.Font("Tahoma", 0, 60));
            boton.setForeground(Color.RED);
        }
        if(!paridad(sigTurno))
        {
            boton.setText("O");
            boton.setFont(new java.awt.Font("Tahoma", 0, 60));
            boton.setForeground(Color.BLACK);
        }
        setTurno(getTurno()+1);
    }
    
    
    public String preguntarSioNo(String strMensaje) {
        int seleccion = JOptionPane.showOptionDialog(
                null, strMensaje, "Seleccione una operacion", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si", "No"}, "Si");
        if (seleccion != -1) {
            if ((seleccion + 1) == 1) {
                return "SI";
            } else {
                return "NO";
            }
        }
        return null;
    }
    
    private void reiniciar(JButton[][] a)
    {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j].setText("");
                a[i][j].setEnabled(true);
            }
        }
    }
    
    public void ganador(JButton[][] b)
    {
        
                if(b[0][0].getText().equals("X") && b[0][1].getText().equals("X")
                        && b[0][2].getText().equals("X"))
                {
                    JOptionPane.showMessageDialog(null, "El ganador es X");
                    reiniciar(b);
                    
                }
                if(b[1][0].getText().equals("X") && b[1][1].getText().equals("X")
                        && b[1][2].getText().equals("X"))
                {
                    JOptionPane.showMessageDialog(null, "El ganador es X");
                    reiniciar(b);
                }
                if(b[2][0].getText().equals("X") && b[2][1].getText().equals("X")
                        && b[2][2].getText().equals("X"))
                {
                    JOptionPane.showMessageDialog(null, "El ganador es X");
                    reiniciar(b);
                }
                if(b[0][0].getText().equals("X") && b[1][1].getText().equals("X")
                        && b[2][2].getText().equals("X"))
                {
                    JOptionPane.showMessageDialog(null, "El ganador es X");
                    reiniciar(b);
                }
                if(b[2][0].getText().equals("X") && b[1][1].getText().equals("X")
                        && b[0][2].getText().equals("X"))
                {
                    JOptionPane.showMessageDialog(null, "El ganador es X");
                    reiniciar(b);
                }
                if(b[0][0].getText().equals("X") && b[1][0].getText().equals("X")
                        && b[2][0].getText().equals("X"))
                {
                    JOptionPane.showMessageDialog(null, "El ganador es X");
                    reiniciar(b);
                }
                if(b[0][1].getText().equals("X") && b[1][1].getText().equals("X")
                        && b[2][1].getText().equals("X"))
                {
                    JOptionPane.showMessageDialog(null, "El ganador es X");
                    reiniciar(b);
                }
                if(b[0][2].getText().equals("X") && b[1][2].getText().equals("X")
                        && b[2][2].getText().equals("X"))
                {
                    JOptionPane.showMessageDialog(null, "El ganador es X");
                    reiniciar(b);
                }
                    
                       
                 
                
                
                
                
                
                if(b[0][0].getText().equals("O") && b[0][1].getText().equals("O")
                        && b[0][2].getText().equals("O"))
                {
                    JOptionPane.showMessageDialog(null, "El ganador es O");
                    reiniciar(b);
                }
                if(b[1][0].getText().equals("O") && b[1][1].getText().equals("O")
                        && b[1][2].getText().equals("O"))
                {
                    JOptionPane.showMessageDialog(null, "El ganador es O");
                    reiniciar(b);
                }
                if(b[2][0].getText().equals("O") && b[2][1].getText().equals("O")
                        && b[2][2].getText().equals("O"))
                {
                    JOptionPane.showMessageDialog(null, "El ganador es O");
                    reiniciar(b);
                }
                if(b[0][0].getText().equals("O") && b[1][1].getText().equals("O")
                        && b[2][2].getText().equals("O"))
                {
                    JOptionPane.showMessageDialog(null, "El ganador es O");
                    reiniciar(b);
                }
                if(b[2][0].getText().equals("O") && b[1][1].getText().equals("O")
                        && b[0][2].getText().equals("O"))
                {
                    JOptionPane.showMessageDialog(null, "El ganador es O");
                    reiniciar(b);
                }
                if(b[0][0].getText().equals("O") && b[1][0].getText().equals("O")
                        && b[2][0].getText().equals("O"))
                {
                    JOptionPane.showMessageDialog(null, "El ganador es O");
                    reiniciar(b);
                }
                if(b[0][1].getText().equals("O") && b[1][1].getText().equals("O")
                        && b[2][1].getText().equals("O"))
                {
                    JOptionPane.showMessageDialog(null, "El ganador es O");
                    reiniciar(b);
                }
                if(b[0][2].getText().equals("O") && b[1][2].getText().equals("O")
                        && b[2][2].getText().equals("O"))
                {
                    JOptionPane.showMessageDialog(null, "El ganador es O");
                    reiniciar(b);
                }
    }
    
    
    
}
