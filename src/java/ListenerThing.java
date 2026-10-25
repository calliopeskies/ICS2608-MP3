/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Date;

public class ListenerThing implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        Date rn = new Date();
        context.setAttribute("date", rn);
        
        String headerStuff = "<p>ICS2608 / 2CSD / DE JESUS - SALAYO - TARROZA</p>";
        context.setAttribute("headerStuff", headerStuff);
        
        String footerStuff = "<p>Date n Time: " + rn.toString() + " / MP3</p>";
        context.setAttribute("footerStuff", footerStuff);
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        
    }
}
