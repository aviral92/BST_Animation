
############################BST.java#######################################################

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aviral
 */
public class BST extends javax.swing.JFrame {

    /**
     * Creates new form BST
     */
    public int dimX,dimY;
    public Graphics display,dstr;
    public node rootnode,rnode;
    public NodeStr rootstr,rstr;
    int[] n=new int[10];
    String[] s=new String[10];
    public Graphics g,gstr;
    // int i=0;
    public BST() {
        initComponents();
         dimX=jPanel2.getWidth();
         dimY=jPanel2.getHeight();
         display=jPanel2.getGraphics();
         rootnode = new node(52);
         g=jPanel2.getGraphics();
         gstr=jPanel3.getGraphics();
         dstr=jPanel3.getGraphics();
         rootstr=new NodeStr("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 234, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Binary Search tree");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter Integer Data");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 329, Short.MAX_VALUE)
        );

        jButton2.setText("Get Data");
        jButton2.setEnabled(false);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Numbers");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Strings");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("BINARY SEARCH TREE");

        jButton3.setText("ClearAll");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(192, 192, 192))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(237, 237, 237)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)
                        .addComponent(jRadioButton2)
                        .addGap(378, 378, 378))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

   //Draw BST
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
       
        
        int k=0;
       
        StringTokenizer st= new StringTokenizer(jTextField1.getText()," ");
        
        while(st.hasMoreElements())
        {
            n[k]=Integer.parseInt(st.nextElement().toString());
            insert.insert(rootnode,n[k]);
            k++;
        }
      
        for(int j=0;j<k;j++)
            System.out.println(n[j]);
        
        
        if(jRadioButton1.isSelected()){
            	int d = treeDepth(rootnode);
                bh = dimY/d;
                display.setColor(Color.white);
                display.fillRect(0,0,dimX,dimY); 
        
                rnode=new node(n[0]);
              
                for(int j=0;j<k;j++)
                {
                    insert.insert(rnode,n[j]);
                    try{Thread.sleep(1000);} catch(Exception e) {}
                    aninode(rnode,0,10,dimX-20,n[j]);
                    ConstructNode(rnode,0,10,dimX-20);
        
                }
            }
        
        else{
            int d = depthstr(rootstr);
            bh = (dimY/d);
            display.setColor(Color.white);
            display.fillRect(0,0,dimX,dimY); 
        
            rstr=new NodeStr(s[0]);
              
            for(int j=0;j<s.length;j++)
            {
             insert.insert1(rstr,s[j]);
             try{ 
                 Thread.sleep(1000);
             } catch(Exception e) {}
             aninodeStr(rstr,0,10,dimX-20,s[j]);
             drawnodeStr(rstr,0,10,dimX-20);
        
            }
        }
        
    }

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
         if(jRadioButton2.isSelected()){
           jButton2.setEnabled(true);
           jTextField1.setEnabled(false);
         
         }
    }

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
       if(jRadioButton1.isSelected())
           jButton2.setEnabled(false);
           jTextField1.setEnabled(true);
    }

    //Stores the data taken from a text file into an array of strings
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
       BufferedReader br =null;
       
        int k=0;
        try{
            String Cline;
            br=new BufferedReader(new FileReader("C:\\try.txt"));
            
            while((Cline = br.readLine())!=null){
                //System.out.println(Cline);
                 StringTokenizer st = new StringTokenizer(Cline," ");
                
                
                while(st.hasMoreElements())
                {
                    s[k]=st.nextElement().toString();
                    insert.insert1(rootstr,s[k]);
                    k++;
                }
                
            }
        }
        
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            
            try{
                if(br!=null)
                    br.close();
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        }
        
        for(int j=0;j<k;j++)
            System.out.println(s[j]);
        
       
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        jPanel2.updateUI();
        jPanel3.updateUI();
        jTextField1.setText(null);
    }

    //Calculates the height of BST
    public static int treeDepth(node N)  // find max treeDepth of tree
    {
	if (N==null) 
            return 0;
        int l = treeDepth(N.left);
        int r = treeDepth(N.right);
        if (l>r)
            return l+1; 
        else 
            return r+1;
    }
    
    
     //Calculates the height of BST for String input
     public static int depthstr(NodeStr N)  // find max treeDepth of tree
    {
	if (N==null)
            return 0;
        int l = depthstr(N.left);
        int r = depthstr(N.right);
        if (l>r) 
            return l+1; 
        else 
            return r+1;
    }

    private int bh = 50; // branch height
    private int offY = 30;  

       // l is level
    //Draws each node
    private void ConstructNode(node N,int l, int lBound, int rBound)
    {
	if (N==null) return;
	display.setColor(Color.LIGHT_GRAY);
        String str = N.data + "";
	display.fillOval(( (lBound+rBound)/2)-5-5, offY+ (l*bh), str.length()*4+20, 20);
	display.setColor(Color.BLACK);
        display.setFont(new Font("Arial", Font.BOLD, 15));
	display.drawString( N.data+"",((lBound+rBound)/2)-10+5,offY+15+(l*bh));
	display.setColor(Color.blue); // draw branches
        if (N.left!=null)
	    {
   	       display.drawLine(( lBound+ rBound)/2,offY+5+5+(l*bh),(( 3*lBound +rBound)/4), offY+ (l*bh + bh ));
               ConstructNode(N.left, l+1, lBound,( lBound +rBound)/2);
	    }
        if (N.right!=null)
	    {
               display.drawLine((lBound +rBound)/2,offY +10+(l*bh),((3* rBound+lBound)/4), offY+(l*bh+bh));
               ConstructNode( N.right,l+1 ,(lBound+rBound )/2, rBound);
	    }
    } // ConstructNode
    
    private void aninode(node N,int l, int lBound, int rBound,int n)
    {
	if(n<N.data){
           if (N.left!=null )
	    {
                g.setColor(Color.YELLOW);
                String str = N.data + "";
                g.fillOval(((lBound+rBound)/2)-10,offY+(l*bh),str.length()*4+20,20);
        
                display.setColor(Color.BLACK);
                //display.setFont(display.getFont().deriveFont(100));
                display.setFont(new Font("Arial", Font.BOLD, 15));
                display.drawString( N.data+"",(( lBound+rBound)/2)-10+5, offY + 15+(l*bh));
        
                g.setColor(Color.BLUE);
            	g.drawString( n+"",(( lBound+rBound)/2)-15,offY +25 +(l *bh));
                
                
                try{
                    Thread.sleep(1000);
                } catch(Exception e) {}
                g.setColor(Color.LIGHT_GRAY);
                //String str = N.data + "";
                g.fillOval((( lBound+rBound)/2)- 10, offY + (l*bh),str.length()*4 + 20,20);
        
                display.setColor(Color.BLACK);
                //display.setFont(display.getFont().deriveFont(100));
                display.setFont(new Font("Arial", Font.BOLD, 15));
                display.drawString(N.data+"",((lBound+rBound)/2)-10+5,offY+15+(l*bh));
        
                g.setColor(Color.WHITE);
                g.drawString(n+"",((lBound+rBound)/2)-15,offY+25+(l*bh));
        
   	       aninode(N.left,l+1,lBound,(lBound+rBound)/2,n);
        
	    }
        }
        
        else
        {
            if (N.right!=null)
                {
                    g.setColor(Color.YELLOW);
                    String str = N.data + "";
                    g.fillOval(((lBound+rBound)/2) -10, offY+ (l*bh),str.length()*4+20,20);
        
                    display.setColor(Color.BLACK);
                    //display.setFont(display.getFont().deriveFont(100));
                    display.setFont(new Font("Arial", Font.BOLD, 15));
                    display.drawString(N.data+"", (( lBound+rBound)/2)-10+5 , offY+ 15+(l*bh));
        
                    g.setColor(Color.BLUE);
                    g.drawString(n+"",((lBound+rBound)/2)-15,offY+25+(l*bh));
                    try{
                        Thread.sleep(1000);
                    }
                    catch(Exception e) {}
                    g.setColor(Color.LIGHT_GRAY);
                    // String str = N.data + "";
                    g.fillOval(((lBound+rBound)/2)-10,offY+(l*bh),str.length()*4+20,20);
                    
                    display.setColor(Color.BLACK);
                    //display.setFont(display.getFont().deriveFont(100));
                    display.setFont(new Font("Arial", Font.BOLD, 15));
                    display.drawString(N.data+"",((lBound+rBound)/2)-10+5,offY+15+(l*bh));
                    
                    g.setColor(Color.WHITE);
                    g.drawString(n+"",((lBound+rBound)/2)-15,offY+25+(l*bh));
        
                    aninode(N.right,l+1,(lBound+rBound)/2,rBound,n);
                }
        } 
    }
    
    private void drawnodeStr(NodeStr N,int l, int lBound, int rBound)
    {
	if (N==null) return;
	 // slow down
        dstr.setColor(Color.LIGHT_GRAY);
        String str = N.data + "";
	dstr.fillOval(((lBound+rBound)/2)-10,offY+(l*bh),str.length()*4+20,20);
	dstr.setColor(Color.BLACK);
	dstr.drawString(N.data+"",((lBound+rBound)/2)-10+5,offY+15+(l*bh));
	dstr.setColor(Color.blue); // draw branches
        if (N.left!=null)
	    {
   	       dstr.drawLine((lBound+rBound)/2,offY+5+5+(l*bh),((3*lBound+rBound)/4),offY+(l*bh+bh));
               drawnodeStr(N.left,l+1,lBound,(lBound+rBound)/2);
	    }
        if (N.right!=null)
	    {
               dstr.drawLine((lBound+rBound)/2,offY+10+(l*bh),((3*rBound+lBound)/4),offY+(l*bh+bh));
               drawnodeStr(N.right,l+1,(lBound+rBound)/2,rBound);
	    }
    } // ConstructNode
    
    private void aninodeStr(NodeStr N,int l, int lBound, int rBound,String n)
    {
	if(n.compareTo(N.data)<0){
           if (N.left!=null )
	    {
                
                gstr.setColor(Color.BLUE);
            	gstr.drawString(n+"",((lBound+rBound)/2)-15,offY+25+(l*bh));
                try{Thread.sleep(1000);} catch(Exception e) {}
                gstr.setColor(Color.WHITE);
                gstr.drawString(n+"",((lBound+rBound)/2)-15,offY+25+(l*bh));
        
   	       aninodeStr(N.left,l+1,lBound,(lBound+rBound)/2,n);
        
	    }
        }
        
        else
        {
            if (N.right!=null)
                {
                    gstr.setColor(Color.BLUE);
                    gstr.drawString(n+"",((lBound+rBound)/2)-15,offY+25+(l*bh));
                    try{Thread.sleep(1000);} catch(Exception e) {}
                    gstr.setColor(Color.WHITE);
                    gstr.drawString(n+"",((lBound+rBound)/2)-15,offY+25+(l*bh));
        
                    aninodeStr(N.right,l+1,(lBound+rBound)/2,rBound,n);
                }
        } 
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BST().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration
}


