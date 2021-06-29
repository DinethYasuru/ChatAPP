package Admin;

import ControllerPck.Controller;
import Login.Login;
import Pojo.Chat;
import Pojo.Chatsubscribers;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ViewStudents extends javax.swing.JFrame {
    
    int xmouse;
    int ymouse;
    int height = 10;

    public ViewStudents() {
//        createBuble();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 600));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Chat List");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(400, 60, 100, 40);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(jPanel3);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 460));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(410, 110, 560, 460);

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("View Students");
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 170, 330, 70);

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Create New Chats");
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 70, 330, 70);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons8_close_window_25px.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(964, 0, 30, 30);

        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel3MouseDragged(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 1000, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/admin_dash.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 600);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
        int x = evt.getXOnScreen()-xmouse;
        int y = evt.getYOnScreen()-ymouse;
        this.setLocation(x, y);
    }//GEN-LAST:event_jLabel3MouseDragged

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        xmouse=evt.getX();
        ymouse=evt.getY();
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    
//    void createBuble() {
//        
//        Session session = Controller.getSessionFactory().openSession();
//        Transaction transaction = session.beginTransaction();
//        
//        String sql = "From Chat";
//        Query query = session.createQuery(sql);
//        
//        List<Chat> chatList = query.list();
//        
//        for (Iterator<Chat> iterator = chatList.iterator(); iterator.hasNext();) {
//            Chat next = iterator.next();
//            
//            String chatId = next.getChatId();
//            String chatName = next.getName();
//            Date chatDateCreated = next.getDateCreated();
//            int members = 0;
//            
//            
//            Session session1 = Controller.getSessionFactory().openSession();
//            Transaction transaction1 = session1.beginTransaction();
//            
//            String sql1 = "From Chatsubscribers";
//            Query q1 = session1.createQuery(sql1);
//            
//            List<Chatsubscribers> subscribersList = q1.list();
//            
//            for (Iterator<Chatsubscribers> iterator1 = subscribersList.iterator(); iterator1.hasNext();) {
//                Chatsubscribers next1 = iterator1.next();
//                
//                if (chatId.equals(next1.getChatId()) && next1.getStatus().equalsIgnoreCase("Subscribed")) {
//                    members = members+1;
//                }
//            }
//            
//            JPanel jPanel4 = new javax.swing.JPanel();
//            JLabel lblChatId = new javax.swing.JLabel();
//            JLabel lblChatName = new javax.swing.JLabel();
//            JLabel lblChatDateCreated = new javax.swing.JLabel();
//            JLabel lblChatMembers = new javax.swing.JLabel();
//            
//            jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
//            jPanel4.add(lblChatId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));
//            jPanel4.add(lblChatName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));
//            jPanel4.add(lblChatDateCreated, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));
//            jPanel4.add(lblChatMembers, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));
//            
//            String chatDate = chatDateCreated.toString();
//            
//            
//            lblChatId.setText(chatId);
//            lblChatName.setText(chatName);
//            lblChatDateCreated.setText(chatDate);
////            lblChatMembers.setText(members);
//
//            
//            System.out.println(chatId+"\t"+chatName+"\t"+chatDateCreated+"\t"+members);
//            
//        }
//
//    }
    
  
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
