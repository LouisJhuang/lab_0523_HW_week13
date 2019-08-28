package lab_0523_HW_week13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class StudentDB_20_StudentManagement extends javax.swing.JFrame {

    //學生資料維護
    //String DB_URL = "jdbc:mariadb://localhost:3306/studentdb";
    String DB_URL = "jdbc:mariadb://localhost:3306/studentdb2";
    Connection conn = null;
    Statement stat = null;
    ResultSet rs_student = null;
    int numRows = 0;
    ResultSet rs = null;
    ResultSet rsStrCourse = null;
    //學生資料維護

    //學生修課資料維護
    String DB_URL_StuClass = "jdbc:mariadb://localhost:3306/studentdb2";
    Connection conn_StuClass = null;
    Statement stat_StuClass = null;
    ResultSet rs_StuClass = null;
    int numRows_StuClass = 0;
    //學生修課資料維護

    //教師資料維護
    String DB_URL_tea = "jdbc:mariadb://localhost:3306/studentdb2";
    Connection conn_tea = null;
    Statement stat_tea = null;
    ResultSet rs_teacher = null;
    int numRows_tea = 0;
    //ResultSet rs_tea = null;
    //教師資料維護
    
    
    //學生導生資料維護
    String DB_URL_StuTea = "jdbc:mariadb://localhost:3306/studentdb2";
    Connection conn_StuTea = null;
    Statement stat_StuTea = null;
    ResultSet rs_StuTea = null;
    int numRows_StuTea = 0;
    //學生導生資料維護
    
    

    public StudentDB_20_StudentManagement() {
        initComponents();

        try {

            //學生資料維護
            conn = DriverManager.getConnection(DB_URL, "root", "mis");
            stat = conn.createStatement();  //可不給參數
            //stat = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs_student = stat.executeQuery("select * from student");
            rs_student.last();  //從最後一筆開始
            numRows = rs_student.getRow();  //把最後一筆 = 也就是總筆數存入 numRows 
            rs_student.first();  //再回到第一筆
            showRecord();
            //學生資料維護

            //學生修課資料維護
            conn_StuClass = DriverManager.getConnection(DB_URL_StuClass, "root", "mis");
            stat_StuClass = conn_StuClass.createStatement();  //可不給參數
            rs_StuClass = stat_StuClass.executeQuery("select * from student_class");
            rs_StuClass.last();  //從最後一筆開始
            numRows_StuClass = rs_StuClass.getRow();  //把最後一筆 = 也就是總筆數存入 numRows 
            rs_StuClass.first();  //再回到第一筆
            showRecord_StuClass();
            //學生修課資料維護

            //教師資料維護
            conn_tea = DriverManager.getConnection(DB_URL_tea, "root", "mis");
            stat_tea = conn_tea.createStatement();  //可不給參數
            rs_teacher = stat_tea.executeQuery("select * from teacher");
            rs_teacher.last();  //從最後一筆開始
            numRows_tea = rs_teacher.getRow();  //把最後一筆 = 也就是總筆數存入 numRows 
            rs_teacher.first();  //再回到第一筆
            showRecord_tea();
            //教師資料維護
            
            
            //學生導生資料維護
            conn_StuTea = DriverManager.getConnection(DB_URL_tea, "root", "mis");
            stat_StuTea = conn_StuTea.createStatement();  //可不給參數
            rs_StuTea = stat_StuTea.executeQuery("select * from student_advisor");
            rs_StuTea.last();   //從最後一筆開始
            numRows_StuTea = rs_StuTea.getRow();  //把最後一筆 = 也就是總筆數存入 numRows 
            rs_StuTea.first();  //再回到第一筆
            showRecord_StuTea();
            //學生導生資料維護
            
            

        } catch (SQLException ex) {
            System.out.println("資料庫操作出問題:" + ex.toString());
            ex.printStackTrace(); //列印出例外訊息錯誤的位置及原因
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelStatus = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        btnFindStClass = new javax.swing.JButton();
        tfieldStId = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaStClassDisplay = new javax.swing.JTextArea();
        btnFindStTeacher = new javax.swing.JButton();
        tfieldStId1 = new javax.swing.JTextField();
        btnStuAdvisor = new javax.swing.JButton();
        btnStuCourse = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tfieldFindName = new javax.swing.JTextField();
        btnPrevious = new javax.swing.JButton();
        jTextFieldRecNo = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        tfieldStudentID = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        tfieldStName = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        tfieldStPhone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnFindId = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfieldFindStId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnFindAll = new javax.swing.JButton();
        btnFindName = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnBlank = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jTextFieldRecStuClass = new javax.swing.JTextField();
        btnPrevious_StuClass = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tfieldStuClassStudentID = new javax.swing.JTextField();
        btnNext_StuClass = new javax.swing.JButton();
        btnInsert1 = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        btnBlank1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfieldStClassCourse = new javax.swing.JTextField();
        tfieldStClassScore = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnFindAll_StuClass = new javax.swing.JButton();
        btnFindName_StuClass = new javax.swing.JButton();
        btnFindId_StuCourse = new javax.swing.JButton();
        tfieldStuClassFindStId = new javax.swing.JTextField();
        tfieldStuClassFindName = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jlabel_TeacherName = new javax.swing.JLabel();
        jlabel_TeacherRoom = new javax.swing.JLabel();
        jTextFieldRecNo_tea = new javax.swing.JTextField();
        tfieldTeacherID = new javax.swing.JTextField();
        tfieldTeaName = new javax.swing.JTextField();
        tfieldTeaRoom = new javax.swing.JTextField();
        btnPrevious_tea = new javax.swing.JButton();
        btnNext_tea = new javax.swing.JButton();
        btnUpdate_tea = new javax.swing.JButton();
        btnInsert_tea = new javax.swing.JButton();
        btnDelete_tea = new javax.swing.JButton();
        btnBlank_tea = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnFindAll_tea = new javax.swing.JButton();
        btnFindName_tea = new javax.swing.JButton();
        btnFindId_tea = new javax.swing.JButton();
        tfieldFindName_tea = new javax.swing.JTextField();
        tfieldFindTeaId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfieldTeaDept = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldRecNo_StuTea = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfieldStuTeaID_Tea = new javax.swing.JTextField();
        tfieldStuTeaID_Stu = new javax.swing.JTextField();
        btnPrevious_StuTea = new javax.swing.JButton();
        btnNext_StuTea = new javax.swing.JButton();
        btnInsertStuTea = new javax.swing.JButton();
        btnBlank_StuTea = new javax.swing.JButton();
        btnFindAll1 = new javax.swing.JButton();
        btnFindName_StuTea = new javax.swing.JButton();
        btnFindId_StuTea = new javax.swing.JButton();
        tfieldFindStId__StuTea = new javax.swing.JTextField();
        tfieldFindName_StuTea = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("學生資料庫操作系統");

        labelStatus.setBackground(new java.awt.Color(204, 255, 204));
        labelStatus.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        labelStatus.setText("資料庫狀態");

        jTabbedPane1.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N

        btnFindStClass.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnFindStClass.setText("學生修課查詢");
        btnFindStClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindStClassActionPerformed(evt);
            }
        });

        tfieldStId.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        tfieldStId.setText("u001");

        txtAreaStClassDisplay.setColumns(20);
        txtAreaStClassDisplay.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        txtAreaStClassDisplay.setRows(5);
        jScrollPane2.setViewportView(txtAreaStClassDisplay);

        btnFindStTeacher.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnFindStTeacher.setText("教師指導學生名單");
        btnFindStTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindStTeacherActionPerformed(evt);
            }
        });

        tfieldStId1.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        tfieldStId1.setText("t01");

        btnStuAdvisor.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnStuAdvisor.setText("學生導師報表");
        btnStuAdvisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStuAdvisorActionPerformed(evt);
            }
        });

        btnStuCourse.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnStuCourse.setText("學生修課報表");
        btnStuCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStuCourseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFindStTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(btnFindStClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStuCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStuAdvisor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfieldStId1)
                    .addComponent(tfieldStId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnStuAdvisor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnStuCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnFindStClass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfieldStId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnFindStTeacher)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfieldStId1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("查詢與報表", jPanel4);

        tfieldFindName.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N

        btnPrevious.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        jTextFieldRecNo.setEditable(false);
        jTextFieldRecNo.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N

        btnNext.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnInsert.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnInsert.setText("新增這一筆");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        tfieldStudentID.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N

        btnUpdate.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnUpdate.setText("更新這一筆");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        tfieldStName.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N

        btnDelete.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnDelete.setText("刪除這一筆");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tfieldStPhone.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N

        jLabel1.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        jLabel1.setText("學號");

        btnFindId.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnFindId.setText("搜尋學號");
        btnFindId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindIdActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        jLabel2.setText("姓名");

        tfieldFindStId.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        jLabel3.setText("電話");

        btnFindAll.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnFindAll.setText("瀏覽全部");
        btnFindAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindAllActionPerformed(evt);
            }
        });

        btnFindName.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnFindName.setText("搜尋姓名");
        btnFindName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindNameActionPerformed(evt);
            }
        });

        btnBlank.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnBlank.setText("Blank");
        btnBlank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlankActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfieldStPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfieldStName, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfieldStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldRecNo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnPrevious))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBlank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFindAll)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnFindName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfieldFindName, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnFindId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfieldFindStId, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(198, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRecNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrevious)
                    .addComponent(btnUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfieldStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnNext)
                    .addComponent(btnInsert))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfieldStName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfieldStPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnBlank)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFindAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFindName)
                    .addComponent(tfieldFindName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFindId)
                    .addComponent(tfieldFindStId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("學生資料維護", jPanel1);

        jTextFieldRecStuClass.setEditable(false);
        jTextFieldRecStuClass.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N

        btnPrevious_StuClass.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnPrevious_StuClass.setText("Previous");
        btnPrevious_StuClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevious_StuClassActionPerformed(evt);
            }
        });

        btnUpdate1.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnUpdate1.setText("更新這一筆");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        jLabel5.setText("學號");

        tfieldStuClassStudentID.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N

        btnNext_StuClass.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnNext_StuClass.setText("Next");
        btnNext_StuClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext_StuClassActionPerformed(evt);
            }
        });

        btnInsert1.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnInsert1.setText("新增這一筆");
        btnInsert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsert1ActionPerformed(evt);
            }
        });

        btnDelete1.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnDelete1.setText("刪除這一筆");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        btnBlank1.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnBlank1.setText("Blank");
        btnBlank1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlank1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        jLabel6.setText("課號");

        tfieldStClassCourse.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N

        tfieldStClassScore.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N

        jLabel8.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        jLabel8.setText("分數");

        btnFindAll_StuClass.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnFindAll_StuClass.setText("瀏覽全部");
        btnFindAll_StuClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindAll_StuClassActionPerformed(evt);
            }
        });

        btnFindName_StuClass.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnFindName_StuClass.setText("搜尋學號");
        btnFindName_StuClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindName_StuClassActionPerformed(evt);
            }
        });

        btnFindId_StuCourse.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnFindId_StuCourse.setText("搜尋課號");
        btnFindId_StuCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindId_StuCourseActionPerformed(evt);
            }
        });

        tfieldStuClassFindStId.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N

        tfieldStuClassFindName.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfieldStClassScore, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfieldStClassCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(25, 25, 25)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfieldStuClassStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldRecStuClass, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnPrevious_StuClass))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNext_StuClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdate1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInsert1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBlank1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFindAll_StuClass)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btnFindName_StuClass)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfieldStuClassFindName, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btnFindId_StuCourse)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfieldStuClassFindStId, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(198, Short.MAX_VALUE))
            .addComponent(jSeparator3)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRecStuClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrevious_StuClass)
                    .addComponent(btnUpdate1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfieldStuClassStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btnNext_StuClass)
                    .addComponent(btnInsert1))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfieldStClassCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfieldStClassScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnDelete1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBlank1)))
                .addGap(24, 24, 24)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFindAll_StuClass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFindName_StuClass)
                    .addComponent(tfieldStuClassFindName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFindId_StuCourse)
                    .addComponent(tfieldStuClassFindStId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("學生修課資料維護", jPanel5);

        jLabel4.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        jLabel4.setText("教師編號");

        jlabel_TeacherName.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        jlabel_TeacherName.setText("教師姓名");

        jlabel_TeacherRoom.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        jlabel_TeacherRoom.setText("教師研究室");

        jTextFieldRecNo_tea.setEditable(false);
        jTextFieldRecNo_tea.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N

        tfieldTeacherID.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N

        tfieldTeaName.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N

        tfieldTeaRoom.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N

        btnPrevious_tea.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnPrevious_tea.setText("Previous");
        btnPrevious_tea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevious_teaActionPerformed(evt);
            }
        });

        btnNext_tea.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnNext_tea.setText("Next");
        btnNext_tea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext_teaActionPerformed(evt);
            }
        });

        btnUpdate_tea.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnUpdate_tea.setText("更新這一筆");
        btnUpdate_tea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate_teaActionPerformed(evt);
            }
        });

        btnInsert_tea.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnInsert_tea.setText("新增這一筆");
        btnInsert_tea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsert_teaActionPerformed(evt);
            }
        });

        btnDelete_tea.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnDelete_tea.setText("刪除這一筆");
        btnDelete_tea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete_teaActionPerformed(evt);
            }
        });

        btnBlank_tea.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnBlank_tea.setText("Blank");
        btnBlank_tea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlank_teaActionPerformed(evt);
            }
        });

        btnFindAll_tea.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnFindAll_tea.setText("瀏覽全部");
        btnFindAll_tea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindAll_teaActionPerformed(evt);
            }
        });

        btnFindName_tea.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnFindName_tea.setText("搜尋姓名");
        btnFindName_tea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindName_teaActionPerformed(evt);
            }
        });

        btnFindId_tea.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnFindId_tea.setText("搜尋編號");
        btnFindId_tea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindId_teaActionPerformed(evt);
            }
        });

        tfieldFindName_tea.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N

        tfieldFindTeaId.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        jLabel7.setText("教師部門");

        tfieldTeaDept.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(25, 25, 25)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfieldTeacherID, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldRecNo_tea, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlabel_TeacherName)
                                            .addComponent(jlabel_TeacherRoom))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(25, 25, 25)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfieldTeaRoom)
                                    .addComponent(tfieldTeaName, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(tfieldTeaDept))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnPrevious_tea))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNext_tea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdate_tea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInsert_tea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete_tea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBlank_tea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFindAll_tea)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnFindName_tea)
                                    .addComponent(btnFindId_tea))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfieldFindName_tea, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfieldFindTeaId, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(166, Short.MAX_VALUE))
            .addComponent(jSeparator2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRecNo_tea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrevious_tea)
                    .addComponent(btnUpdate_tea))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfieldTeacherID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(btnNext_tea))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlabel_TeacherName)
                            .addComponent(tfieldTeaName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfieldTeaRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlabel_TeacherRoom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tfieldTeaDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnInsert_tea)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete_tea)
                        .addGap(18, 18, 18)
                        .addComponent(btnBlank_tea)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFindAll_tea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFindName_tea)
                    .addComponent(tfieldFindName_tea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFindId_tea)
                    .addComponent(tfieldFindTeaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("教師資料維護", jPanel2);

        jTextFieldRecNo_StuTea.setEditable(false);
        jTextFieldRecNo_StuTea.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N

        jLabel9.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        jLabel9.setText("學生學號");

        jLabel10.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        jLabel10.setText("導師編號");

        tfieldStuTeaID_Tea.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N

        tfieldStuTeaID_Stu.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N

        btnPrevious_StuTea.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnPrevious_StuTea.setText("Previous");
        btnPrevious_StuTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevious_StuTeaActionPerformed(evt);
            }
        });

        btnNext_StuTea.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnNext_StuTea.setText("Next");
        btnNext_StuTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext_StuTeaActionPerformed(evt);
            }
        });

        btnInsertStuTea.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnInsertStuTea.setText("新增這一筆");
        btnInsertStuTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertStuTeaActionPerformed(evt);
            }
        });

        btnBlank_StuTea.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnBlank_StuTea.setText("Blank");
        btnBlank_StuTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlank_StuTeaActionPerformed(evt);
            }
        });

        btnFindAll1.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnFindAll1.setText("瀏覽全部");
        btnFindAll1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindAll1ActionPerformed(evt);
            }
        });

        btnFindName_StuTea.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnFindName_StuTea.setText("搜尋學生編號");
        btnFindName_StuTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindName_StuTeaActionPerformed(evt);
            }
        });

        btnFindId_StuTea.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N
        btnFindId_StuTea.setText("搜尋導師編號");
        btnFindId_StuTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindId_StuTeaActionPerformed(evt);
            }
        });

        tfieldFindStId__StuTea.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N

        tfieldFindName_StuTea.setFont(new java.awt.Font("微軟正黑體", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfieldStuTeaID_Tea, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(25, 25, 25)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfieldStuTeaID_Stu, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldRecNo_StuTea, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnPrevious_StuTea))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNext_StuTea, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnInsertStuTea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBlank_StuTea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnFindAll1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnFindName_StuTea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfieldFindName_StuTea, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnFindId_StuTea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfieldFindStId__StuTea, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(166, Short.MAX_VALUE))
            .addComponent(jSeparator4)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRecNo_StuTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrevious_StuTea)
                    .addComponent(btnInsertStuTea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfieldStuTeaID_Stu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(btnNext_StuTea)
                    .addComponent(btnBlank_StuTea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfieldStuTeaID_Tea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFindAll1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFindName_StuTea)
                    .addComponent(tfieldFindName_StuTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFindId_StuTea)
                    .addComponent(tfieldFindStId__StuTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("學生導生資料維護", jPanel3);

        jMenu1.setText("連線");

        jMenuItem1.setText("重新連線");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("結束連線");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("說明");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showRecord() throws SQLException {
        //學生資料維護
        tfieldStudentID.setText(rs_student.getObject(1).toString());  //學生ID
        tfieldStName.setText(rs_student.getObject(2).toString());     //學生姓名
        tfieldStPhone.setText(rs_student.getObject(3).toString());    //學生手機
        String msg = String.format("第%d / %d筆", rs_student.getRow(), numRows);
        jTextFieldRecNo.setText(msg);

    }

    private void showRecord_tea() throws SQLException {
        //教師資料維護
        tfieldTeacherID.setText(rs_teacher.getObject(1).toString());   //教師編號
        tfieldTeaName.setText(rs_teacher.getObject(2).toString());   //教師姓名
        tfieldTeaRoom.setText(rs_teacher.getObject(3).toString());   //教師研究室
        tfieldTeaDept.setText(rs_teacher.getObject(4).toString());    //教師部門
        String msg = String.format("第%d / %d筆", rs_teacher.getRow(), numRows_tea);
        jTextFieldRecNo_tea.setText(msg);

    }

    private void showRecord_StuClass() throws SQLException {
        //教師資料維護
        tfieldStuClassStudentID.setText(rs_StuClass.getObject(1).toString());   //學生學號
        tfieldStClassCourse.setText(rs_StuClass.getObject(2).toString());   //學生課號
        tfieldStClassScore.setText(rs_StuClass.getObject(3).toString());   //學生分數
        String msg = String.format("第%d / %d筆", rs_StuClass.getRow(), numRows_StuClass);
        jTextFieldRecStuClass.setText(msg);

    }
    
    
    private void showRecord_StuTea() throws SQLException {
        
        tfieldStuTeaID_Stu.setText(rs_StuTea.getObject(1).toString());   //學生學號
        tfieldStuTeaID_Tea.setText(rs_StuTea.getObject(2).toString());   //學生學號
        String msg = String.format("第%d / %d筆", rs_StuTea.getRow(), numRows_StuTea);
        jTextFieldRecNo_StuTea.setText(msg);
        
    }
    
    
    


    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        
        try {
            if (rs_student.previous()) {
                //如果有上一筆，就可以做這個條件式
                showRecord();
            } else {
                //沒有上一筆的話，就回到最後一筆，這樣可以有一個循環
                rs_student.last();
                showRecord();
            }
        } catch (SQLException ex) {
            System.out.println("資料庫操作出問題:" + ex.toString());
        }

    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed

        try {
            if (rs_student.next()) {
                //rsult.next()會把紀錄指標指到下一筆紀錄若成功 則回傳true否則回傳false
                showRecord();
            } else {
                rs_student.first();
                //沒有下一筆的話，就回到第一筆，這樣會成一個循環
                showRecord();
            }
        } catch (SQLException ex) {
            System.out.println("資料庫操作出問題:" + ex.toString());
        }

    }//GEN-LAST:event_btnNextActionPerformed

    private void btnFindAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindAllActionPerformed

        try {
            rs_student = stat.executeQuery("select * from student");
            rs_student.last(); //從最後一筆開始
            numRows = rs_student.getRow();  //抓到總筆數
            rs_student.first();  //再回到第一筆
            showRecord();
        } catch (SQLException ex) {
            System.out.println("資料庫操作出問題!");
        }

    }//GEN-LAST:event_btnFindAllActionPerformed

    private void btnFindNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindNameActionPerformed

        String sql = String.format("select * from student where name like '%s%s%s' ",
                "%", tfieldFindName.getText(), "%");
        //使用資料庫指令  改成可以搜尋片段中所有這個字的
        try {
            rs_student = stat.executeQuery(sql); //將這邊的語句發送到SQL
            if (rs_student.next() == false) {
                JOptionPane.showMessageDialog(rootPane, "查無資料!");  //找不到的話跳出視窗
                //參數1.Component parent:父容器元件，例如JFrame、JApplet、JDialog等  ,
                //參數2 訊息內容 
                //參數3 標題:預設為[訊息]  ,
                //參數4 設定要顯示的訊息類型 , 其預設為INFORMATION
                
                rs_student = stat.executeQuery("select * from student");
                rs_student.last();
                numRows = rs_student.getRow();
                rs_student.first();
                showRecord();
            } else {
                rs_student.last();
                numRows = rs_student.getRow();
                rs_student.first();
                showRecord();
            }
        } catch (SQLException ex) {
            System.out.println("資料庫操作出問題:" + ex.toString());
        }

    }//GEN-LAST:event_btnFindNameActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed

        String sql = String.format("Insert into student(student_id,name,phone) "
                + "values ('%s','%s','%s')",
                //資料庫新增
                tfieldStudentID.getText(),
                tfieldStName.getText(),
                tfieldStPhone.getText());
        try {
            stat.executeUpdate(sql);  //將這邊的語句發送到SQL
            labelStatus.setText("新增成功!");
            rs_student = stat.executeQuery("select * from student");
            rs_student.last();
            numRows = rs_student.getRow();
            rs_student.first();
            showRecord();
        } catch (SQLException e) {
            System.out.println("資料庫操作出問題:" + e.toString());
        }

    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        String sql = String.format("update student set name='%s',phone='%s' where student_id='%s'",
                //更新資料庫
                tfieldStName.getText(),
                tfieldStPhone.getText(),
                tfieldStudentID.getText());
        try {
            stat.executeUpdate(sql); //將這邊的語句發送到SQL
            labelStatus.setText("更新成功!");
            rs_student = stat.executeQuery("select * from student");
            rs_student.first();
            showRecord();
        } catch (SQLException e) {
            System.out.println("資料庫操作出問題:" + e.toString());
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        String sql = String.format("Delete from student where student_id='%s'",
                tfieldStudentID.getText());
        try {
            stat.execute(sql);  //將這邊的語句發送到SQL
            labelStatus.setText("刪除成功!");
            rs_student = stat.executeQuery("select * from student");
            rs_student.last();
            numRows = rs_student.getRow();
            rs_student.first();
            showRecord();
        } catch (SQLException e) {
            System.out.println("資料庫操作出問題:" + e.toString());
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnFindIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindIdActionPerformed

        String sql = String.format("select * from student where student_id like '%s%%'", tfieldFindStId.getText());
        //找資料
        try {
            rs_student = stat.executeQuery(sql); //將這邊的語句發送到SQL
            if (rs_student.next() == false) {
                JOptionPane.showMessageDialog(rootPane, "查無資料!");
                //參數1.Component parent:父容器元件，例如JFrame、JApplet、JDialog等  ,
                //參數2 訊息內容 
                //參數3 標題:預設為[訊息]  ,
                //參數4 設定要顯示的訊息類型 , 其預設為INFORMATION
                
                rs_student = stat.executeQuery("select * from student");
                rs_student.last();
                numRows = rs_student.getRow();
                rs_student.first();
                showRecord();
            } else {
                rs_student.last();
                numRows = rs_student.getRow();
                rs_student.first();
                showRecord();
            }
        } catch (SQLException ex) {
            System.out.println("資料庫操作出問題:" + ex.toString());
        }

    }//GEN-LAST:event_btnFindIdActionPerformed

    private void btnFindStClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindStClassActionPerformed
        
        String sql = String.format("SELECT student_class.student_id, student.name, class_name, class.credit, score "
                + "FROM student_class "
                + "INNER JOIN student on student_class.student_id = student.student_id "
                + "INNER JOIN class ON student_class.class_id = class.class_id "
                + "WHERE student_class.student_id='%s' ", tfieldStId.getText() );
        //System.out.println(sql);
        txtAreaStClassDisplay.setText("");
        String msg;
        try {
            rs = stat.executeQuery(sql);
            if (rs.next() == false) {
                JOptionPane.showMessageDialog(rootPane, "查無資料!");
            } else {
                msg = String.format("學號:%s\t姓名:%s\n", 
                        rs.getString("student_id"), 
                        rs.getString("name"));
                
                txtAreaStClassDisplay.append(msg);
                txtAreaStClassDisplay.append("課名\t學分\t分數\n");
                txtAreaStClassDisplay.append("---------------------------------------------------\n");
                do {
                    msg = String.format("%s\t%s\t%s\n", 
                            rs.getString("class_name"), 
                            rs.getString("credit"), 
                            rs.getString("score"));
                    txtAreaStClassDisplay.append(msg);
                } while ( rs.next() );
                txtAreaStClassDisplay.append("---------------------------------------------------\n");
                String sql2 = String.format("SELECT COUNT(*) as '修課數' , SUM(credit) as '總學分' , AVG(score) as '平均' "
                        + "FROM student_class "
                        + "INNER JOIN class on student_class.class_id = class.class_id "
                        + "WHERE student_id='%s'", tfieldStId.getText() );
                rs = stat.executeQuery(sql2);
                rs.first();
                msg = String.format("修課數:%s\t總學分:%s\t平均成績:%s\n", 
                        rs.getString("修課數"), 
                        rs.getString("總學分"), 
                        rs.getString("平均"));
                txtAreaStClassDisplay.append(msg);
                //System.out.println(msg);
            }
        } catch (SQLException ex) {
            System.out.println("資料庫操作出問題:" + ex.toString() );
        }

    }//GEN-LAST:event_btnFindStClassActionPerformed

    private void btnBlankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlankActionPerformed
        //全部清空
        tfieldStudentID.setText("");
        tfieldStName.setText("");
        tfieldStPhone.setText("");
        tfieldFindName.setText("");
        tfieldFindStId.setText("");

    }//GEN-LAST:event_btnBlankActionPerformed

    private void btnFindStTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindStTeacherActionPerformed

        String sql = String.format("SELECT student_advisor.student_id, student.name "
                + "FROM studentdb2.student_advisor "
                + "INNER JOIN "
                + "student ON student_advisor.student_id = student.student_id "
                + "WHERE student_advisor.teacher_id = '%s'", tfieldStId1.getText());

        String sql_teacher = String.format("SELECT name, room, dept "
                + "FROM teacher "
                + "WHERE teacher_id = '%s'", tfieldStId1.getText());
        txtAreaStClassDisplay.setText("");
        String msg;
        try {
            rs = stat.executeQuery(sql_teacher);
            if (rs.next() == false) {
                JOptionPane.showMessageDialog(rootPane, "查無資料!");
            } else {
                rs.first();
                msg = String.format("教師:%s\t研究室:%s\t部門:%s\n",
                        rs.getString("name"),
                        rs.getString("room"),
                        rs.getString("dept"));

                txtAreaStClassDisplay.append(msg);
                rs = stat.executeQuery(sql);
                rs.first();
                txtAreaStClassDisplay.append("學號\t姓名\n");
                txtAreaStClassDisplay.append("---------------------------------------------------\n");
                do {
                    msg = String.format("%s\t%s\n",
                            rs.getString("student_id"),
                            rs.getString("name"));

                    txtAreaStClassDisplay.append(msg);
                } while (rs.next());
                txtAreaStClassDisplay.append("---------------------------------------------------\n");
            }
        } catch (SQLException ex) {
            System.out.println("資料庫操作出問題:" + ex.toString());
        }

    }//GEN-LAST:event_btnFindStTeacherActionPerformed

    private void btnStuAdvisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStuAdvisorActionPerformed

        String sql = String.format("SELECT student.student_id AS '學號', student.name AS '姓名', teacher.Name AS '老師'\n"
                + "FROM student_advisor\n"
                + "INNER JOIN student ON student_advisor.Student_id = student.student_id \n"
                + "INNER JOIN teacher ON student_advisor.Teacher_id = teacher.Teacher_id;");
        txtAreaStClassDisplay.setText("");

        String msg;
        try {
            rs = stat.executeQuery(sql);
            rs.first();
            txtAreaStClassDisplay.append("學號\t姓名\t導師\n");
            txtAreaStClassDisplay.append("-------------------------------------------------\n");
            do {
                msg = String.format("%s\t%s\t%s\n",
                        rs.getString("student.student_id"),
                        rs.getString("姓名"),
                        rs.getString("老師"));
                txtAreaStClassDisplay.append(msg);
            } while (rs.next());
            txtAreaStClassDisplay.append("-------------------------------------------------\n");
        } catch (SQLException ex) {
            System.out.println("資料庫操作出問題:" + ex.toString());
        }

    }//GEN-LAST:event_btnStuAdvisorActionPerformed

    private void btnStuCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStuCourseActionPerformed

        String sql = String.format("SELECT student.student_id AS '學號', student.name AS '姓名', class.class_name AS '修課'\n"
                + "FROM student_class\n"
                + "INNER JOIN student on student_class.student_id = student.student_id \n"
                + "INNER JOIN class on student_class.class_id = class.class_id ;");
        txtAreaStClassDisplay.setText("");

        String msg;
        try {
            rs = stat.executeQuery(sql);
            rs.first();
            txtAreaStClassDisplay.append("學號\t姓名\t修課\n");
            txtAreaStClassDisplay.append("-------------------------------------------------\n");

            do {
                msg = String.format("%s\t%s\t%s\n",
                        rs.getString("student.student_id"),
                        rs.getString("student.name"),
                        rs.getString("class.class_name"));
                txtAreaStClassDisplay.append(msg);
            } while (rs.next());
            txtAreaStClassDisplay.append("-------------------------------------------------\n");

        } catch (SQLException ex) {
            System.out.println("資料庫操作出問題:" + ex.toString());
        }

        /*
        //先從 SQL 查詢
        select student.student_id as '學號' , student.name as '姓名' , class.class_name
        from student_class
        inner join student on student_class.student_id = student.student_id
        inner join class on student_class.class_id = class.class_id
         */

    }//GEN-LAST:event_btnStuCourseActionPerformed

    private void btnNext_teaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext_teaActionPerformed

        try {
            if (rs_teacher.next()) {
                //rsult.next()會把紀錄指標指到下一筆紀錄若成功 則回傳true否則回傳false
                showRecord_tea();
            } else {
                rs_teacher.first();
                //沒有下一筆的話，就回到第一筆，這樣會成一個循環
                showRecord_tea();
            }
        } catch (SQLException ex) {
            System.out.println("資料庫操作出問題:" + ex.toString());
        }

    }//GEN-LAST:event_btnNext_teaActionPerformed

    private void btnUpdate_teaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate_teaActionPerformed

        String sql = String.format("update teacher set name='%s', room='%s' ,  dept='%s' where teacher_id='%s'",
                //更新資料庫
                tfieldTeaName.getText(),
                tfieldTeaRoom.getText(),
                tfieldTeaDept.getText(),
                tfieldTeacherID.getText());
        try {
            stat_tea.executeUpdate(sql); //將這邊的語句發送到SQL
            labelStatus.setText("更新成功!");
            rs_teacher = stat_tea.executeQuery("select * from teacher");
            rs_teacher.first();
            showRecord_tea();
        } catch (SQLException e) {
            System.out.println("資料庫操作出問題:" + e.toString());
        }

    }//GEN-LAST:event_btnUpdate_teaActionPerformed

    private void btnInsert_teaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsert_teaActionPerformed

        String sql = String.format("Insert into teacher(teacher_id , name , room , dept ) "
                + " values ('%s' , '%s' , '%s' , '%s') ",
                //資料庫新增
                tfieldTeacherID.getText(), //教師編號
                tfieldTeaName.getText(), //教師姓名
                tfieldTeaRoom.getText(), //教師研究室
                tfieldTeaDept.getText());    //教師部門

        try {
            stat_tea.executeUpdate(sql);  //將這邊的語句發送到SQL
            labelStatus.setText("新增成功!");
            rs_teacher = stat_tea.executeQuery("select * from teacher");
            rs_teacher.last();
            numRows_tea = rs_teacher.getRow();
            rs_teacher.first();
            showRecord_tea();
        } catch (SQLException e) {
            System.out.println("資料庫操作出問題:" + e.toString());
        }

    }//GEN-LAST:event_btnInsert_teaActionPerformed

    private void btnDelete_teaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete_teaActionPerformed

        String sql = String.format("Delete from teacher where teacher_id='%s' ",
                tfieldTeacherID.getText());
        try {
            stat_tea.execute(sql);  //將這邊的語句發送到SQL
            labelStatus.setText("刪除成功!");
            rs_teacher = stat_tea.executeQuery("select * from teacher");
            rs_teacher.last();
            numRows_tea = rs_teacher.getRow();
            rs_teacher.first();
            showRecord_tea();
        } catch (SQLException e) {
            System.out.println("資料庫操作出問題:" + e.toString());
        }

    }//GEN-LAST:event_btnDelete_teaActionPerformed

    private void btnBlank_teaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlank_teaActionPerformed
        //全部清空
        tfieldTeacherID.setText("");
        tfieldTeaName.setText("");
        tfieldTeaRoom.setText("");
        tfieldTeaDept.setText("");
        tfieldFindName_tea.setText("");
        tfieldFindTeaId.setText("");

    }//GEN-LAST:event_btnBlank_teaActionPerformed

    private void btnFindAll_teaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindAll_teaActionPerformed

        try {
            rs_teacher = stat_tea.executeQuery("select * from teacher");
            rs_teacher.last(); //從最後一筆開始
            numRows_tea = rs_teacher.getRow();  //抓到總筆數
            rs_teacher.first();  //再回到第一筆
            showRecord_tea();
        } catch (SQLException ex) {
            System.out.println("資料庫操作出問題!");
        }

    }//GEN-LAST:event_btnFindAll_teaActionPerformed

    private void btnFindName_teaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindName_teaActionPerformed

        String sql = String.format("select * from teacher where name like '%s%s%s' ",
                "%", tfieldFindName_tea.getText(), "%");
        //使用資料庫指令  改成可以搜尋片段中所有這個字的
        try {
            rs_teacher = stat_tea.executeQuery(sql); //將這邊的語句發送到SQL
            if (rs_teacher.next() == false) {
                //如果找不到資料  就跳出視窗
                JOptionPane.showMessageDialog(rootPane, "查無資料!", "錯誤", JOptionPane.ERROR_MESSAGE);  //找不到的話跳出視窗
                //參數1.Component parent:父容器元件，例如JFrame、JApplet、JDialog等  ,
                //參數2 訊息內容 
                //參數3 標題:預設為[訊息]  ,
                //參數4 設定要顯示的訊息類型 , 其預設為INFORMATION

                rs_teacher = stat_tea.executeQuery("select * from teacher");
                rs_teacher.last();
                numRows_tea = rs_teacher.getRow();
                rs_teacher.first();
                showRecord_tea(); //呼叫方法顯示目前所有資料有多少筆
            } else {
                //更新目前資料庫數目
                rs_teacher.last();
                numRows_tea = rs_teacher.getRow();
                rs_teacher.first();
                showRecord_tea();  //呼叫方法顯示目前所有資料有多少筆
            }
        } catch (SQLException ex) {
            System.out.println("資料庫操作出問題:" + ex.toString());
        }

    }//GEN-LAST:event_btnFindName_teaActionPerformed

    private void btnFindId_teaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindId_teaActionPerformed

        String sql = String.format("select * from teacher where teacher_id like '%s%%'", tfieldFindTeaId.getText());
        //找資料
        try {
            rs_teacher = stat_tea.executeQuery(sql); //將這邊的語句發送到SQL
            if (rs_teacher.next() == false) {
                //如果找不到資料  就跳出視窗
                JOptionPane.showMessageDialog(rootPane, "查無資料!", "錯誤", JOptionPane.ERROR_MESSAGE);  //找不到的話跳出視窗
                //參數1.Component parent:父容器元件，例如JFrame、JApplet、JDialog等  ,
                //參數2 訊息內容 
                //參數3 標題:預設為[訊息]  ,
                //參數4 設定要顯示的訊息類型 , 其預設為INFORMATION

                rs_teacher = stat_tea.executeQuery("select * from teacher");
                rs_teacher.last();
                numRows_tea = rs_teacher.getRow();
                rs_teacher.first();
                showRecord_tea();
            } else {
                rs_teacher.last();
                numRows_tea = rs_teacher.getRow();
                rs_teacher.first();
                showRecord_tea();
            }
        } catch (SQLException ex) {
            System.out.println("資料庫操作出問題:" + ex.toString());
        }

    }//GEN-LAST:event_btnFindId_teaActionPerformed

    private void btnPrevious_teaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevious_teaActionPerformed

        try {
            if (rs_teacher.previous()) {
                //如果有上一筆，就可以做這個條件式
                showRecord_tea();
            } else {
                //沒有上一筆的話，就回到最後一筆，這樣可以有一個循環
                rs_teacher.last();
                showRecord_tea();
            }
        } catch (SQLException ex) {
            System.out.println("資料庫操作出問題:" + ex.toString());
        }

    }//GEN-LAST:event_btnPrevious_teaActionPerformed

    private void btnPrevious_StuClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevious_StuClassActionPerformed

        try {
            if (rs_StuClass.previous()) {
                //如果有上一筆，就可以做這個條件式
                showRecord_StuClass();
            } else {
                //沒有上一筆的話，就回到最後一筆，這樣可以有一個循環
                rs_StuClass.last();
                showRecord_StuClass();
            }
        } catch (SQLException ex) {
            System.out.println("資料庫操作出問題:" + ex.toString());
        }

    }//GEN-LAST:event_btnPrevious_StuClassActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed

        String sql = String.format("update student_class set score='%s' where student_id='%s' AND class_id='%s' ",
                //更新資料庫
                tfieldStClassScore.getText(), //分數
                tfieldStuClassStudentID.getText(), //學號
                tfieldStClassCourse.getText());         //課號
        try {
            stat_StuClass.executeUpdate(sql); //將這邊的語句發送到SQL
            labelStatus.setText("更新成功!");
            rs_StuClass = stat_StuClass.executeQuery("select * from student_class");
            rs_StuClass.first();
            showRecord_StuClass();
        } catch (SQLException e) {
            System.out.println("資料庫操作出問題:" + e.toString());
        }

    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnNext_StuClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext_StuClassActionPerformed

        try {
            if (rs_StuClass.next()) {
                //rsult.next()會把紀錄指標指到下一筆紀錄若成功 則回傳true否則回傳false
                showRecord_StuClass();
            } else {
                rs_StuClass.first();
                //沒有下一筆的話，就回到第一筆，這樣會成一個循環
                showRecord_StuClass();
            }
        } catch (SQLException ex) {
            System.out.println("資料庫操作出問題:" + ex.toString());
        }

    }//GEN-LAST:event_btnNext_StuClassActionPerformed

    private void btnInsert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsert1ActionPerformed

        String sql = String.format("Insert into student_class(student_id , class_id , score ) "
                + "values ('%s','%s','%s')",
                //資料庫新增
                tfieldStuClassStudentID.getText(), //學號
                tfieldStClassCourse.getText(), //課號
                tfieldStClassScore.getText());            //分數
        try {
            stat_StuClass.executeUpdate(sql);  //將這邊的語句發送到SQL
            labelStatus.setText("新增成功!");
            rs_StuClass = stat_StuClass.executeQuery("select * from student_class");
            rs_StuClass.last();
            numRows_StuClass = rs_StuClass.getRow();
            rs_StuClass.first();
            showRecord_StuClass();
        } catch (SQLException e) {
            System.out.println("資料庫操作出問題:" + e.toString());
        }

    }//GEN-LAST:event_btnInsert1ActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed

        String sql = String.format("Delete from student_class where student_id='%s' AND class_id='%s' ",
                tfieldStuClassStudentID.getText(),
                tfieldStClassCourse.getText());
        try {
            stat_StuClass.execute(sql);  //將這邊的語句發送到SQL
            labelStatus.setText("刪除成功!");
            rs_StuClass = stat_StuClass.executeQuery("select * from student_class");
            rs_StuClass.last();
            numRows_StuClass = rs_StuClass.getRow();
            rs_StuClass.first();
            showRecord_StuClass();
        } catch (SQLException e) {
            System.out.println("資料庫操作出問題:" + e.toString());
        }

    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnBlank1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlank1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBlank1ActionPerformed

    private void btnFindAll_StuClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindAll_StuClassActionPerformed

        try {
            rs_StuClass = stat_StuClass.executeQuery("select * from student_class");
            rs_StuClass.last(); //從最後一筆開始
            numRows_StuClass = rs_StuClass.getRow();  //抓到總筆數
            rs_StuClass.first();  //再回到第一筆
            showRecord_StuClass();
        } catch (SQLException ex) {
            System.out.println("資料庫操作出問題!");
        }

    }//GEN-LAST:event_btnFindAll_StuClassActionPerformed

    private void btnFindName_StuClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindName_StuClassActionPerformed

        String sql = String.format("select * from student_class where student_id like '%s%%' ",
                tfieldStuClassFindName.getText());
        // "輸入值" 開頭的所有學號
        try {
            rs_StuClass = stat_StuClass.executeQuery(sql); //將這邊的語句發送到SQL
            if (rs_StuClass.next() == false) {
                //如果找不到資料  就跳出視窗
                JOptionPane.showMessageDialog(rootPane, "查無資料!", "錯誤", JOptionPane.ERROR_MESSAGE);  //找不到的話跳出視窗
                //參數1.Component parent:父容器元件，例如JFrame、JApplet、JDialog等  ,
                //參數2 訊息內容 
                //參數3 標題:預設為[訊息]  ,
                //參數4 設定要顯示的訊息類型 , 其預設為INFORMATION

                rs_StuClass = stat_StuClass.executeQuery("select * from student_class");
                rs_StuClass.last();
                numRows_StuClass = rs_StuClass.getRow();
                rs_StuClass.first();
                showRecord_StuClass();
            } else {
                rs_StuClass.last();
                numRows_StuClass = rs_StuClass.getRow();
                rs_StuClass.first();
                showRecord_StuClass();
            }
        } catch (SQLException ex) {
            System.out.println("資料庫操作出問題:" + ex.toString());
        }

    }//GEN-LAST:event_btnFindName_StuClassActionPerformed

    private void btnFindId_StuCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindId_StuCourseActionPerformed

        String sql = String.format("select * from student_class where class_id like '%s%%' ",
                tfieldStuClassFindStId.getText());
        // "輸入值" 開頭的所有課號
        try {
            rs_StuClass = stat_StuClass.executeQuery(sql); //將這邊的語句發送到SQL
            if (rs_StuClass.next() == false) {
                //如果找不到資料  就跳出視窗
                JOptionPane.showMessageDialog(rootPane, "查無資料!", "錯誤", JOptionPane.ERROR_MESSAGE);  //找不到的話跳出視窗
                //參數1.Component parent:父容器元件，例如JFrame、JApplet、JDialog等  ,
                //參數2 訊息內容 
                //參數3 標題:預設為[訊息]  ,
                //參數4 設定要顯示的訊息類型 , 其預設為INFORMATION

                rs_StuClass = stat_StuClass.executeQuery("select * from student_class");
                rs_StuClass.last();
                numRows_StuClass = rs_StuClass.getRow();
                rs_StuClass.first();
                showRecord_StuClass();
            } else {
                rs_StuClass.last();
                numRows_StuClass = rs_StuClass.getRow();
                rs_StuClass.first();
                showRecord_StuClass();
            }
        } catch (SQLException ex) {
            System.out.println("資料庫操作出問題:" + ex.toString());
        }

    }//GEN-LAST:event_btnFindId_StuCourseActionPerformed

    private void btnPrevious_StuTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevious_StuTeaActionPerformed
        
        try {
            if (rs_StuTea.previous()) {
                //如果有上一筆，就可以做這個條件式
                showRecord_StuTea();
            } else {
                //沒有上一筆的話，就回到最後一筆，這樣可以有一個循環
                rs_StuTea.last();
                showRecord_StuTea();
            }
        } catch (SQLException ex) {
            System.out.println("資料庫操作出問題:" + ex.toString());
        }
        
    }//GEN-LAST:event_btnPrevious_StuTeaActionPerformed

    private void btnNext_StuTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext_StuTeaActionPerformed
       
        try {
            if (rs_StuTea.next() ) {
                //rsult.next()會把紀錄指標指到下一筆紀錄若成功 則回傳true否則回傳false
                showRecord_StuTea();
            } else {
                rs_StuTea.first();
                //沒有下一筆的話，就回到第一筆，這樣會成一個循環
                showRecord_StuTea();
            }
        } catch (SQLException ex) {
            System.out.println("資料庫操作出問題:" + ex.toString());
        }
        
    }//GEN-LAST:event_btnNext_StuTeaActionPerformed

    private void btnInsertStuTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertStuTeaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsertStuTeaActionPerformed

    private void btnBlank_StuTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlank_StuTeaActionPerformed
        //清空全部
        tfieldStuTeaID_Stu.setText("");
        tfieldStuTeaID_Tea.setText("");
        tfieldFindName_StuTea.setText("");
        tfieldFindStId__StuTea.setText("");
        
    }//GEN-LAST:event_btnBlank_StuTeaActionPerformed

    private void btnFindAll1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindAll1ActionPerformed
        
        try {
            rs_StuTea = stat_StuTea.executeQuery("select * from student_advisor");
            rs_StuTea.last(); //從最後一筆開始
            numRows_StuTea = rs_StuTea.getRow();  //抓到總筆數
            rs_StuTea.first();  //再回到第一筆
            showRecord_StuTea();
        } catch (SQLException ex) {
            System.out.println("資料庫操作出問題!");
        }
        
    }//GEN-LAST:event_btnFindAll1ActionPerformed

    private void btnFindName_StuTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindName_StuTeaActionPerformed
         
        String sql = String.format("select * from student_advisor where Student_id like '%s%%'", 
                tfieldFindName_StuTea.getText() );
        //找資料
        try {
            rs_StuTea = stat_StuTea.executeQuery(sql); //將這邊的語句發送到SQL
            if (rs_StuTea.next() == false) {
                JOptionPane.showMessageDialog(rootPane, "查無資料!" , "錯誤", JOptionPane.ERROR_MESSAGE );
                //參數1.Component parent:父容器元件，例如JFrame、JApplet、JDialog等  ,
                //參數2 訊息內容 
                //參數3 標題:預設為[訊息]  ,
                //參數4 設定要顯示的訊息類型 , 其預設為INFORMATION
                
                rs_StuTea = stat_StuTea.executeQuery("select * from student_advisor");
                rs_StuTea.last();
                numRows_StuTea = rs_StuTea.getRow();
                rs_StuTea.first();
                showRecord_StuTea();
            } else {
                rs_StuTea.last();
                numRows_StuTea = rs_StuTea.getRow();
                rs_StuTea.first();
                showRecord_StuTea();
            }
        } catch (SQLException ex) {
            System.out.println("資料庫操作出問題:" + ex.toString());
        }
        
    }//GEN-LAST:event_btnFindName_StuTeaActionPerformed

    private void btnFindId_StuTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindId_StuTeaActionPerformed
        
        String sql = String.format("select * from student_advisor where Teacher_id like '%s%%'", 
                tfieldFindStId__StuTea.getText() );
        //找資料
        try {
            rs_StuTea = stat_StuTea.executeQuery(sql); //將這邊的語句發送到SQL
            if (rs_StuTea.next() == false) {
                JOptionPane.showMessageDialog(rootPane, "查無資料!" , "錯誤", JOptionPane.ERROR_MESSAGE );
                //參數1.Component parent:父容器元件，例如JFrame、JApplet、JDialog等  ,
                //參數2 訊息內容 
                //參數3 標題:預設為[訊息]  ,
                //參數4 設定要顯示的訊息類型 , 其預設為INFORMATION
                
                rs_StuTea = stat_StuTea.executeQuery("select * from student_advisor");
                rs_StuTea.last();
                numRows_StuTea = rs_StuTea.getRow();
                rs_StuTea.first();
                showRecord_StuTea();
            } else {
                rs_StuTea.last();
                numRows_StuTea = rs_StuTea.getRow();
                rs_StuTea.first();
                showRecord_StuTea();
            }
        } catch (SQLException ex) {
            System.out.println("資料庫操作出問題:" + ex.toString());
        }
        
    }//GEN-LAST:event_btnFindId_StuTeaActionPerformed

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
            java.util.logging.Logger.getLogger(StudentDB_20_StudentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDB_20_StudentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDB_20_StudentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDB_20_StudentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentDB_20_StudentManagement().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBlank;
    private javax.swing.JButton btnBlank1;
    private javax.swing.JButton btnBlank_StuTea;
    private javax.swing.JButton btnBlank_tea;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnDelete_tea;
    private javax.swing.JButton btnFindAll;
    private javax.swing.JButton btnFindAll1;
    private javax.swing.JButton btnFindAll_StuClass;
    private javax.swing.JButton btnFindAll_tea;
    private javax.swing.JButton btnFindId;
    private javax.swing.JButton btnFindId_StuCourse;
    private javax.swing.JButton btnFindId_StuTea;
    private javax.swing.JButton btnFindId_tea;
    private javax.swing.JButton btnFindName;
    private javax.swing.JButton btnFindName_StuClass;
    private javax.swing.JButton btnFindName_StuTea;
    private javax.swing.JButton btnFindName_tea;
    private javax.swing.JButton btnFindStClass;
    private javax.swing.JButton btnFindStTeacher;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnInsert1;
    private javax.swing.JButton btnInsertStuTea;
    private javax.swing.JButton btnInsert_tea;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNext_StuClass;
    private javax.swing.JButton btnNext_StuTea;
    private javax.swing.JButton btnNext_tea;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnPrevious_StuClass;
    private javax.swing.JButton btnPrevious_StuTea;
    private javax.swing.JButton btnPrevious_tea;
    private javax.swing.JButton btnStuAdvisor;
    private javax.swing.JButton btnStuCourse;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JButton btnUpdate_tea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldRecNo;
    private javax.swing.JTextField jTextFieldRecNo_StuTea;
    private javax.swing.JTextField jTextFieldRecNo_tea;
    private javax.swing.JTextField jTextFieldRecStuClass;
    private javax.swing.JLabel jlabel_TeacherName;
    private javax.swing.JLabel jlabel_TeacherRoom;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JTextField tfieldFindName;
    private javax.swing.JTextField tfieldFindName_StuTea;
    private javax.swing.JTextField tfieldFindName_tea;
    private javax.swing.JTextField tfieldFindStId;
    private javax.swing.JTextField tfieldFindStId__StuTea;
    private javax.swing.JTextField tfieldFindTeaId;
    private javax.swing.JTextField tfieldStClassCourse;
    private javax.swing.JTextField tfieldStClassScore;
    private javax.swing.JTextField tfieldStId;
    private javax.swing.JTextField tfieldStId1;
    private javax.swing.JTextField tfieldStName;
    private javax.swing.JTextField tfieldStPhone;
    private javax.swing.JTextField tfieldStuClassFindName;
    private javax.swing.JTextField tfieldStuClassFindStId;
    private javax.swing.JTextField tfieldStuClassStudentID;
    private javax.swing.JTextField tfieldStuTeaID_Stu;
    private javax.swing.JTextField tfieldStuTeaID_Tea;
    private javax.swing.JTextField tfieldStudentID;
    private javax.swing.JTextField tfieldTeaDept;
    private javax.swing.JTextField tfieldTeaName;
    private javax.swing.JTextField tfieldTeaRoom;
    private javax.swing.JTextField tfieldTeacherID;
    private javax.swing.JTextArea txtAreaStClassDisplay;
    // End of variables declaration//GEN-END:variables
}
