
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tarun
 */
public class DigitalClock extends javax.swing.JPanel implements Runnable{

    /**
     * Creates new form DigitalClock
     */
    Label l;
    Thread th;
    Calendar cal;
    public DigitalClock() {
        setLayout(new FlowLayout(FlowLayout.CENTER));
        l = new Label("                              ");
        add(l);
        setBackground(Color.white);
        setSize(200,400);
        setVisible(true);       
        th = new Thread(this);
        th.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void run() {
        while(true){
            try {
                cal = Calendar.getInstance();
                int hours,min,sec;
                hours = cal.get(Calendar.HOUR_OF_DAY);
                min = cal.get(Calendar.MINUTE);
                sec = cal.get(Calendar.SECOND);
                Font f = new Font("Serif", 1, 18);
                l.setFont(f);
                l.setBackground(Color.WHITE);
                l.setText("Time - " + hours + ":" + min + ":" + sec);
                Thread.sleep(1000);
            } 
            catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}