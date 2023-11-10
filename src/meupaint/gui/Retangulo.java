package meupaint.gui;

import java.awt.Graphics2D;

/**
 * Um Retângulo.
 * 
 * @author Prof. Dr. David Buzatto
 */
public class Retangulo extends FormaGeometrica {

    @Override
    public void desenhar( Graphics2D g2d ) {
        
        g2d = (Graphics2D) g2d.create();
        
        int xIniD = xIni <= xFim ? xIni : xFim;
        int xFimD = xIni <= xFim ? xFim : xIni;
        int yIniD = yIni <= yFim ? yIni : yFim;
        int yFimD = yIni <= yFim ? yFim : yIni;
        
        if ( corPreenchimento != null ) {
            g2d.setColor( corPreenchimento );
            g2d.fillRect( xIniD, yIniD, xFimD - xIniD, yFimD - yIniD );
        }
        
        if ( corContorno != null ) {
            g2d.setColor( corContorno );
            g2d.drawRect( xIniD, yIniD, xFimD - xIniD, yFimD - yIniD );
        }
        
        g2d.dispose();
        
    }
    
}
