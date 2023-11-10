package meupaint.gui;

import java.awt.Graphics2D;

/**
 * Uma Linha.
 * 
 * @author Prof. Dr. David Buzatto
 */
public class Linha extends FormaGeometrica {
    
    @Override
    public void desenhar( Graphics2D g2d ) {
        
        g2d = (Graphics2D) g2d.create();
        
        if ( corContorno != null ) {
            g2d.setColor( corContorno );
            g2d.drawLine( xIni, yIni, xFim, yFim );
        }
        
        g2d.dispose();
    }
    
}
