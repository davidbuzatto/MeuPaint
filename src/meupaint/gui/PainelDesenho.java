package meupaint.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 * Painel de desenho de formas geométricas.
 * 
 * @author Prof. Dr. David Buzatto
 */
public class PainelDesenho extends JPanel {

    private FormaGeometrica formaTemporaria;
    private List<FormaGeometrica> formas;
    
    public PainelDesenho() {
        formas = new ArrayList<>();
    }
    
    @Override
    protected void paintComponent( Graphics g ) {
        
        super.paintComponent( g );
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint( 
                RenderingHints.KEY_ANTIALIASING, 
                RenderingHints.VALUE_ANTIALIAS_ON );
        
        g2d.setColor( Color.WHITE );
        g2d.fillRect( 0, 0, getWidth(), getHeight() );
        
        g2d.setColor( Color.BLACK );
        
        for ( FormaGeometrica forma : formas ) {
            forma.desenhar( g2d );
        }
        
        if ( formaTemporaria != null ) {
            formaTemporaria.desenhar( g2d );
        }
        
        g2d.setColor( Color.BLACK );
        g2d.drawRect( 0, 0, getWidth()-1, getHeight()-1 );
        g2d.dispose();
        
    }

    public void adicionarForma( FormaGeometrica forma ) {
        formas.add( forma );
    }

    public void setFormaTemporaria( FormaGeometrica formaTemporaria ) {
        this.formaTemporaria = formaTemporaria;
    }
    
}
