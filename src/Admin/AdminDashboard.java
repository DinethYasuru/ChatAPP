package Admin;

import User.*;
import ControllerPck.Controller;
import Login.Login;
import Pojo.Chat;
import Pojo.Chatsubscribers;
import Subscriber.Observer;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AdminDashboard extends javax.swing.JFrame implements Observer {

    int xmouse;
    int ymouse;
    int height = 10;
    private String uid;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
//        System.out.println("dashboard"+getUid());
    }

    public AdminDashboard() {
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtChatId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtChatName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 600));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Chat List");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 100, 40));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(jPanel3);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 540, 460));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Create Chat");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Enter Chat ID");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, -1));

        txtChatId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(txtChatId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 270, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Enter Chat Name");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 120, -1));

        txtChatName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtChatName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChatNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtChatName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 270, 30));

        jLabel8.setBackground(new java.awt.Color(0, 153, 153));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Create");
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 100, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons8_refresh_35px.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 10, 40, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 940, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons8_close_window_25px.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 30, 30));

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
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/detailsBack.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
        int x = evt.getXOnScreen() - xmouse;
        int y = evt.getYOnScreen() - ymouse;
        this.setLocation(x, y);
    }//GEN-LAST:event_jLabel3MouseDragged

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_jLabel3MousePressed
    int xheight = 10;

    public void createBuble(int members, String chatName, String chatId, String chatDateCreated) {

        JPanel pnlCard = new JPanel();
        JLabel lblDeleteChat = new JLabel();
        JLabel lblChatCretedtime = new JLabel();
        JLabel lblChatName = new JLabel();
        JLabel lblChatId = new JLabel();

        pnlCard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDeleteChat.setBackground(new java.awt.Color(0, 153, 153));
        lblDeleteChat.setForeground(new java.awt.Color(255, 255, 255));
        lblDeleteChat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblDeleteChat.setOpaque(true);
        lblDeleteChat.setText(String.valueOf(members));
        pnlCard.add(lblDeleteChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 40, 40));

        lblChatCretedtime.setBackground(new java.awt.Color(0, 153, 153));
        lblChatCretedtime.setForeground(new java.awt.Color(255, 255, 255));
        lblChatCretedtime.setText(String.valueOf(chatDateCreated));
        lblChatCretedtime.setOpaque(true);
        pnlCard.add(lblChatCretedtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 180, 40));

        lblChatName.setBackground(new java.awt.Color(0, 153, 153));
        lblChatName.setForeground(new java.awt.Color(255, 255, 255));
        lblChatName.setText(chatName);
        lblChatName.setOpaque(true);
        pnlCard.add(lblChatName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 230, 40));

        lblChatId.setBackground(new java.awt.Color(0, 153, 153));
        lblChatId.setForeground(new java.awt.Color(255, 255, 255));
        lblChatId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChatId.setText(chatId);
        lblChatId.setOpaque(true);
        pnlCard.add(lblChatId, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 40));

        jPanel3.add(pnlCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, xheight, 520, 40));

        xheight += 60;
        
          pnlCard.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                   

                }
            });
        
        

    }

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    public void querry(){
       Session session = Controller.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        String sql = "From Chat";
        Query query = session.createQuery(sql);

        List<Chat> chatList = query.list();

        for (Iterator<Chat> iterator = chatList.iterator(); iterator.hasNext();) {
            Chat next = iterator.next();

            String chatId = next.getChatId();
            String subscribedChatId = null;
            String chatName = next.getName();
            Date chatDateCreated = next.getDateCreated();
            int members = 0;

            Session session1 = Controller.getSessionFactory().openSession();
            Transaction transaction1 = session1.beginTransaction();

            String sql1 = "From Chatsubscribers";
            Query q1 = session1.createQuery(sql1);

            List<Chatsubscribers> subscribersList = q1.list();

            for (Iterator<Chatsubscribers> iterator1 = subscribersList.iterator(); iterator1.hasNext();) {
                Chatsubscribers next1 = iterator1.next();

                if (chatId.equals(next1.getChatId()) && next1.getStatus().equalsIgnoreCase("Subscribed")) {
                    members = members + 1;
                }
            }
            createBuble(members, chatName, chatId, chatName);
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     querry();
    }//GEN-LAST:event_formWindowOpened

    private void txtChatNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChatNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChatNameActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        Session session = Controller.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Chat chat = new Chat();
        chat.setChatId(txtChatId.getText());
        chat.setName(txtChatName.getText());
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        chat.setDateCreated(date);
        
        session.save(chat);
        transaction.commit();
       this.dispose();
       this.setVisible(true);
        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
      this.dispose();
      //jScrollPane1.removeAll();
      jPanel3.removeAll();
      xheight=10;
      querry();
       this.setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

//    void createBuble() {
    //
    //        String status = null;
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
    //            String subscribedChatId = null;
    //            String chatName = next.getName();
    //            Date chatDateCreated = next.getDateCreated();
    //            int members = 0;
    //
    //            Session session1 = Controller.getSessionFactory().openSession();
    //            Transaction transaction1 = session1.beginTransaction();
    //
    //            String sql1 = "From Chatsubscribers";
    //            Query q1 = session1.createQuery(sql1);
    //
    //            List<Chatsubscribers> subscribersList = q1.list();
    //
    //            JPanel jPanel4 = new JPanel();
    //            JLabel lblSubscribeToggle = new JLabel();
    //            JLabel jLabel11 = new JLabel();
    //            JLabel jLabel9 = new JLabel();
    //            JLabel jLabel10 = new JLabel();
    //            JLabel lblMemberCount = new JLabel();
    //            JLabel lblDateCreated = new JLabel();
    //            JLabel jLabel6 = new JLabel();
    //            JLabel lblChatId = new JLabel();
    //            JLabel lblChatName = new JLabel();
    //            JLabel jLabel5 = new JLabel();
    //
    //            jPanel4.setBackground(new java.awt.Color(204, 204, 204));
    //            jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    //
    //            lblSubscribeToggle.setBackground(new java.awt.Color(0, 102, 102));
    //            lblSubscribeToggle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    //            lblSubscribeToggle.setForeground(new java.awt.Color(255, 255, 255));
    //            lblSubscribeToggle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    //
    //            for (Iterator<Chatsubscribers> iterator1 = subscribersList.iterator(); iterator1.hasNext();) {
    //                Chatsubscribers next1 = iterator1.next();
    //
    //                if (chatId.equals(next1.getChatId()) && next1.getStatus().equalsIgnoreCase("Subscribed")) {
    //                    members = members + 1;
    //                }
    //            }
    //            System.out.println(chatId + "\t" + chatName + "\t" + chatDateCreated + "\t" + members);
    //
    //            lblSubscribeToggle.setOpaque(true);
    //            jPanel4.add(lblSubscribeToggle, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 14, 150, 32));
    //
    //            jLabel11.setFont(new java.awt.Font("Segoe Print", 0, 48)); // NOI18N
    //            jLabel11.setForeground(new java.awt.Color(0, 102, 102));
    //            jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    //            jLabel11.setText("|");
    //            jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, 40));
    //
    //            jLabel10.setFont(new java.awt.Font("Segoe Print", 0, 48)); // NOI18N
    //            jLabel10.setForeground(new java.awt.Color(0, 102, 102));
    //            jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    //            jLabel10.setText("|");
    //            jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, 40));
    //
    //            jLabel9.setFont(new java.awt.Font("Segoe Print", 0, 48)); // NOI18N
    //            jLabel9.setForeground(new java.awt.Color(0, 102, 102));
    //            jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    //            jLabel9.setText("|");
    //            jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 40));
    //
    //            lblMemberCount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    //            lblMemberCount.setForeground(new java.awt.Color(255, 255, 255));
    //            lblMemberCount.setText(String.valueOf(members));
    //            lblMemberCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    //            jPanel4.add(lblMemberCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 60, 40));
    //
    //            lblDateCreated.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    //            lblDateCreated.setForeground(new java.awt.Color(255, 255, 255));
    //            lblDateCreated.setText(String.valueOf(chatDateCreated));
    //            lblDateCreated.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    //            jPanel4.add(lblDateCreated, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 160, 40));
    //
    //            jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 48)); // NOI18N
    //            jLabel6.setForeground(new java.awt.Color(0, 102, 102));
    //            jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    //            jLabel6.setText("|");
    //            jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, 40));
    //
    //            lblChatId.setBackground(new java.awt.Color(0, 153, 153));
    //            lblChatId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    //            lblChatId.setForeground(new java.awt.Color(255, 255, 255));
    //            lblChatId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    //            lblChatId.setText(chatId);
    //            lblChatId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    //            lblChatId.setOpaque(true);
    //            jPanel4.add(lblChatId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 40));
    //
    //            lblChatName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    //            lblChatName.setForeground(new java.awt.Color(255, 255, 255));
    //            lblChatName.setText(chatName);
    //            lblChatName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    //            jPanel4.add(lblChatName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 380, 40));
    //
    //            jLabel5.setBackground(new java.awt.Color(0, 153, 153));
    //            jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    //            jLabel5.setForeground(new java.awt.Color(255, 255, 255));
    //            jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    //            jLabel5.setOpaque(true);
    //            jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 900, 40));
    //
    //            getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 920, 60));
    //
    //            jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, height, 920, 60));
    //            height = height + 70;
    //        }
    //
    //    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtChatId;
    private javax.swing.JTextField txtChatName;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(String msg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void subscribeChat(String chatId) {
        Session s1 = Controller.getSessionFactory().openSession();
        Transaction t1 = s1.beginTransaction();

        Chatsubscribers cs = new Chatsubscribers();

        cs.setChatId(chatId);
        cs.setStudentId(uid);
        cs.setStatus("Subscribed");

        s1.save(cs);
        t1.commit();
    }

    @Override
    public void unsubscribeChat(String chatId) {

    }
}
