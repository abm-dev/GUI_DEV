
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Sandmann
 */
public class SimulationSettingsFrame extends javax.swing.JFrame {

    // variables from multigui
    /*
     if TabSettings is a well understood element that controls all the panes in 
     the first page of gui, then what does the Tab Plotting does?
     */
    TabSettings settingContainer;
    TabPlotting plottingContainer;
    ArrayList<String> agentList;

    private JPanel lcRightPanel;
    private JScrollPane listScrollAgentTable;
    private AgentTableModel tabAgentsModel;

    /**
     *
     */
    public static boolean variableRemoved;

    /**
     * Creates new form SimulationSettingsFrame
     */
    public SimulationSettingsFrame() {

        initComponents();

        readSettingsFromFile();
        settingContainer = new TabSettings();
        plottingContainer = new TabPlotting();

        oldFillMenu_FromMultiGUIConstructor();
        jButton4.setEnabled(SimulationSettings.experimentBuilt);
        OldTabExperimentInitialization();
        OldTabPlottingInitialization();
        newDrawAgentTable();

        //new plotting settings page
        addOldTabsInNewTabPlottingPage();
        addOldBottomPanelFunctionalityInNewTabPlottingPage();

        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        singleRunAnalysisCheckboxNew = new javax.swing.JCheckBox();
        batchRunCheckBoxNew = new javax.swing.JCheckBox();
        parameterAnalysisCheckBoxNew = new javax.swing.JCheckBox();
        addLegendCheckboxNew = new javax.swing.JCheckBox();
        coloredPlotsCheckboxNew = new javax.swing.JCheckBox();
        fileTypePlotsComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        transitionPhaseTextFieldNew = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TestLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton3.setText("Build Experiment");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Run Experiment");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Do not run Simulations");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Run Simulations");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton2)
                .addGap(50, 50, 50)
                .addComponent(jRadioButton1)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(40, 40, 40))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Number of batch Runs");

        jLabel2.setText("Number of Iterations");

        jLabel3.setText("Number of Processes");

        jTextField1.setText("10");

        jTextField2.setText("5000");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", " " }));

        jButton1.setText("Change Parameter Setup");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(70, 70, 70)
                .addComponent(jButton1)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addContainerGap(38, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(38, 38, 38))))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setSelected(true);
        jRadioButton3.setText("Run only one Batch");
        jRadioButton3.setToolTipText("");

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("Parameter Variation with one Parameter");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jButton2.setText("Edit Parameter 1");
        jButton2.setEnabled(false);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton4))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup3.add(jRadioButton5);
        jRadioButton5.setText("Do not compress");

        buttonGroup3.add(jRadioButton6);
        jRadioButton6.setText("Compress Databases and remove Original");

        buttonGroup3.add(jRadioButton7);
        jRadioButton7.setText("Compress Databases and keep Original");

        buttonGroup3.add(jRadioButton8);
        jRadioButton8.setText("Remove decompressed Database");

        buttonGroup3.add(jRadioButton9);
        jRadioButton9.setText("Decompress Database");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Agent", "Record", "Period", "Phase"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jRadioButton10.setText("Yes");

        jRadioButton11.setText("No");

        jLabel4.setText("Write all agent variables to Database");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton7))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                .addComponent(jRadioButton10)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton11)
                .addGap(114, 114, 114))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jRadioButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton10)
                    .addComponent(jRadioButton11)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(355, Short.MAX_VALUE)))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(216, Short.MAX_VALUE)))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(230, Short.MAX_VALUE)))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(656, Short.MAX_VALUE)))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(495, Short.MAX_VALUE)))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(282, 282, 282)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(280, Short.MAX_VALUE)))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(481, 481, 481)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("New Simulation Settings", jPanel6);

        singleRunAnalysisCheckboxNew.setText("Single Run Analysis");
        singleRunAnalysisCheckboxNew.setName("SingleRunAnalysisCheckboxNew\n"); // NOI18N
        singleRunAnalysisCheckboxNew.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                singleRunAnalysisCheckboxNewItemStateChanged(evt);
            }
        });
        singleRunAnalysisCheckboxNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleRunAnalysisCheckboxNewActionPerformed(evt);
            }
        });

        batchRunCheckBoxNew.setText("Batch Run Analysis");
        batchRunCheckBoxNew.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                batchRunCheckBoxNewItemStateChanged(evt);
            }
        });

        parameterAnalysisCheckBoxNew.setText("Parameter Analysis");
        parameterAnalysisCheckBoxNew.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                parameterAnalysisCheckBoxNewItemStateChanged(evt);
            }
        });

        addLegendCheckboxNew.setText("Add Legends");
        addLegendCheckboxNew.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                addLegendCheckboxNewItemStateChanged(evt);
            }
        });

        coloredPlotsCheckboxNew.setText("Colored Plots");
        coloredPlotsCheckboxNew.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                coloredPlotsCheckboxNewItemStateChanged(evt);
            }
        });

        fileTypePlotsComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "pdf", "eps", "png" }));
        fileTypePlotsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileTypePlotsComboBoxActionPerformed(evt);
            }
        });

        jLabel5.setText("Transition Phase");

        transitionPhaseTextFieldNew.setText("0");
        transitionPhaseTextFieldNew.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                transitionPhaseTextFieldNewCaretUpdate(evt);
            }
        });
        transitionPhaseTextFieldNew.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                transitionPhaseTextFieldNewCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                transitionPhaseTextFieldNewInputMethodTextChanged(evt);
            }
        });
        transitionPhaseTextFieldNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                transitionPhaseTextFieldNewKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                transitionPhaseTextFieldNewKeyTyped(evt);
            }
        });

        jLabel6.setText("File Type of Plots");

        TestLabel.setText("jLabel7");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(parameterAnalysisCheckBoxNew)
                    .addComponent(batchRunCheckBoxNew)
                    .addComponent(singleRunAnalysisCheckboxNew))
                .addGap(95, 95, 95)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fileTypePlotsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(transitionPhaseTextFieldNew, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addLegendCheckboxNew)
                            .addComponent(coloredPlotsCheckboxNew))
                        .addContainerGap(20, Short.MAX_VALUE))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(TestLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(9, 9, 9))
                            .addComponent(transitionPhaseTextFieldNew, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(singleRunAnalysisCheckboxNew)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(batchRunCheckBoxNew)
                    .addComponent(addLegendCheckboxNew))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parameterAnalysisCheckBoxNew)
                    .addComponent(coloredPlotsCheckboxNew))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileTypePlotsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TestLabel)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("New Plotting Settings", jPanel7);

        jMenu1.setText("Experiment");

        jMenuItem1.setText("New");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Load\n");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Save");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Save as");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Run Batch");
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Exit");
        jMenu1.add(jMenuItem6);

        menuBar.add(jMenu1);

        jMenu2.setText("Settings\n");

        jMenu3.setText("Set Paths");

        jMenuItem7.setText("Set Path to Model.xml file");
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Set Model Executable");
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Set Initial Data File (0.xml)");
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Set path to R scripts");
        jMenu3.add(jMenuItem10);

        jMenu2.add(jMenu3);

        jMenu4.setText("Import/Export");

        jMenu5.setText("Plotting Settings");

        jMenuItem11.setText("Import Plotting Settings");
        jMenu5.add(jMenuItem11);

        jMenuItem12.setText("Export Plotting Settings");
        jMenu5.add(jMenuItem12);

        jMenu4.add(jMenu5);

        jMenu6.setText("Parameter Settings");

        jMenuItem13.setText("Import Parameter Settings");
        jMenu6.add(jMenuItem13);

        jMenuItem14.setText("Export Parameter Settings");
        jMenu6.add(jMenuItem14);

        jMenu4.add(jMenu6);

        jMenu2.add(jMenu4);

        menuBar.add(jMenu2);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jButton3)
                        .addGap(233, 233, 233)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        buildExperimentButtonPressed();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void singleRunAnalysisCheckboxNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleRunAnalysisCheckboxNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_singleRunAnalysisCheckboxNewActionPerformed

    private void singleRunAnalysisCheckboxNewItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_singleRunAnalysisCheckboxNewItemStateChanged
        // TODO add your handling code here:
        PlottingSettings.singleRunAnalyis = singleRunAnalysisCheckboxNew.isSelected();
        //transitionPhaseTextFieldNew.setText(PlottingSettings.singleRunAnalyis+"");
    }//GEN-LAST:event_singleRunAnalysisCheckboxNewItemStateChanged

    private void batchRunCheckBoxNewItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_batchRunCheckBoxNewItemStateChanged
        // TODO add your handling code here:
        PlottingSettings.batchRunAnalyis = batchRunCheckBoxNew.isSelected();
    }//GEN-LAST:event_batchRunCheckBoxNewItemStateChanged

    private void parameterAnalysisCheckBoxNewItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_parameterAnalysisCheckBoxNewItemStateChanged
        // TODO add your handling code here:
        PlottingSettings.parameterAnalyis = parameterAnalysisCheckBoxNew.isSelected();
    }//GEN-LAST:event_parameterAnalysisCheckBoxNewItemStateChanged

    private void transitionPhaseTextFieldNewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_transitionPhaseTextFieldNewKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_transitionPhaseTextFieldNewKeyTyped

    private void transitionPhaseTextFieldNewInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_transitionPhaseTextFieldNewInputMethodTextChanged

    }//GEN-LAST:event_transitionPhaseTextFieldNewInputMethodTextChanged

    private void transitionPhaseTextFieldNewKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_transitionPhaseTextFieldNewKeyPressed
        // TODO add your handling code here:


    }//GEN-LAST:event_transitionPhaseTextFieldNewKeyPressed

    private void transitionPhaseTextFieldNewCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_transitionPhaseTextFieldNewCaretUpdate
        // TODO add your handling code here:
        String input = transitionPhaseTextFieldNew.getText();
        if (input.length() == 0) {
            input = "0";
        }

        try {

            PlottingSettings.transitionPhase = Integer.parseInt(input);
            TestLabel.setText(PlottingSettings.transitionPhase + "");
            //transitionPhaseTextFieldNew.selectAll();

        } catch (NumberFormatException nFE) {
            JOptionPane.showMessageDialog(null, "Not an integer");
        }
    }//GEN-LAST:event_transitionPhaseTextFieldNewCaretUpdate

    private void transitionPhaseTextFieldNewCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_transitionPhaseTextFieldNewCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_transitionPhaseTextFieldNewCaretPositionChanged

    private void addLegendCheckboxNewItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_addLegendCheckboxNewItemStateChanged
        // TODO add your handling code here:
        PlottingSettings.addLegend = addLegendCheckboxNew.isSelected();
        TestLabel.setText(PlottingSettings.addLegend + "");

    }//GEN-LAST:event_addLegendCheckboxNewItemStateChanged

    private void coloredPlotsCheckboxNewItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_coloredPlotsCheckboxNewItemStateChanged
        // TODO add your handling code here:
        PlottingSettings.coloured = coloredPlotsCheckboxNew.isSelected();
        TestLabel.setText(PlottingSettings.coloured + "");

    }//GEN-LAST:event_coloredPlotsCheckboxNewItemStateChanged

    private void fileTypePlotsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileTypePlotsComboBoxActionPerformed
        // TODO add your handling code here:
        PlottingSettings.fileTypePlots = (String) fileTypePlotsComboBox.getSelectedItem();
        TestLabel.setText(PlottingSettings.fileTypePlots + "");
    }//GEN-LAST:event_fileTypePlotsComboBoxActionPerformed

    void readSettingsFromFile() {
        //new SimulationSettings();
        SimulationSettings.WORKING_DIRECTORY = WorkspaceLauncher.workspacePath;
        LoadSettings(SimulationSettings.WORKING_DIRECTORY + "/GlobalSettings.xml");

    }

    /**
     * took out to make possible referencing from inner class in one of the
     * listeners.
     */
    JScrollPane settingScrollPane, plottingScrollPane;

    void addOldTabsInNewTabPlottingPage() {
        TabSingleTimeSeries tabSingleTimeSeries;
        TabMultipleTimeSeries tabMultipleTimeSeries;
        TabDistributions tabDistributions;
        JScrollPane plottingScrollPane, plottingScrollPane2, plottingScrollPane3;

        tabSingleTimeSeries = new TabSingleTimeSeries();
        tabMultipleTimeSeries = new TabMultipleTimeSeries();
        tabDistributions = new TabDistributions();

        plottingScrollPane = new JScrollPane(tabSingleTimeSeries);
        plottingScrollPane.setPreferredSize(new Dimension(700, 600));

        plottingScrollPane2 = new JScrollPane(tabMultipleTimeSeries);
        plottingScrollPane2.setPreferredSize(new Dimension(700, 600));

        plottingScrollPane3 = new JScrollPane(tabDistributions);
        plottingScrollPane3.setPreferredSize(new Dimension(700, 600));

        jTabbedPane3.addTab("Time Series", plottingScrollPane);
        jTabbedPane3.addTab("Multiple Time Series", plottingScrollPane2);
        jTabbedPane3.addTab("Agent Distributions", plottingScrollPane3);

        jTabbedPane3.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {

                int selectedIndex = jTabbedPane3.getSelectedIndex();

                if (selectedIndex == 0) {

                    tabSingleTimeSeries.redrawAllTables();

                } else if (selectedIndex == 2) {

                    tabDistributions.redrawAllTables();

                }

            }
        });
        //add(plottingTabbedPane, BorderLayout.NORTH);

    }

    /**
     * this method duplicates the functionality of original method panel2 from
     * TabPlotting class. The purpose of rewriting it is to concentrate on the
     * functionality (e.g. updating PlottingSettings) and to separate design as
     * much as only possible.
     */
    void addOldBottomPanelFunctionalityInNewTabPlottingPage() {

        /*Default values:*/
        singleRunAnalysisCheckboxNew.setSelected(PlottingSettings.singleRunAnalyis);
        batchRunCheckBoxNew.setSelected(PlottingSettings.batchRunAnalyis);
        parameterAnalysisCheckBoxNew.setSelected(PlottingSettings.parameterAnalyis);

        transitionPhaseTextFieldNew.setText(Integer.toString(PlottingSettings.transitionPhase));
        addLegendCheckboxNew.setSelected(PlottingSettings.addLegend);
        coloredPlotsCheckboxNew.setSelected(PlottingSettings.coloured);

        switch (PlottingSettings.fileTypePlots) {
            case "pdf":
                fileTypePlotsComboBox.setSelectedIndex(0);
                break;
            case "eps":
                fileTypePlotsComboBox.setSelectedIndex(1);
                break;
            default:
                fileTypePlotsComboBox.setSelectedIndex(0);
        }

    }

    void oldFillMenu_FromMultiGUIConstructor() {
        //menuBar = new JMenuBar();
        jMenu1 = new JMenu("Experiment");
        JMenuItem loadExperiment, newExperiment, saveExperiment, saveExperimentAs, exitGUI;
        JMenuItem runBatchExperiments;
        JMenu menuSettings, setPathes;
        JMenuItem setPathModelXML, setExecutable, setZeroXMLFile, setPathRScripts;
        JMenu menuImportExport, menuimportPlottingSections, menuimportParameterSections;
        JMenuItem importPlottingSettings, exportPlottingSettings, importParameterSettings, exportParameterSettings;
        JTabbedPane mainTabPane = null;

        menuBar.add(jMenu1);

        newExperiment = new JMenuItem("New");
        loadExperiment = new JMenuItem("Load");
        saveExperiment = new JMenuItem("Save");
        saveExperimentAs = new JMenuItem("Save as...");

        exitGUI = new JMenuItem("Exit");

        jMenu1.add(newExperiment);

        newExperiment.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {

                FileChooserFromMenuList chooseFile = new FileChooserFromMenuList(SimulationSettings.WORKING_DIRECTORY, true, false, "", false);
                chooseFile.openFileChooser();
                SimulationSettings.WORKING_DIRECTORY = chooseFile.getDirectoryOrFile();

                /*Set up agent list*/
                //AgentSettings.agents = new ArrayList<Agent>();
                SimulationSettings.experimentBuilt = false;
                jButton4.setEnabled(SimulationSettings.experimentBuilt);

            }

        });

        jMenu1.add(loadExperiment);

        loadExperiment.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {

                FileChooserFromMenuList chooseFile = new FileChooserFromMenuList(SimulationSettings.WORKING_DIRECTORY, true, false, "", false);
                chooseFile.openFileChooser();
                SimulationSettings.WORKING_DIRECTORY = chooseFile.getDirectoryOrFile();
                //menuExperiment.add(chooseFile);

                /*Read specific experiment settings*/
                File file = new File(SimulationSettings.WORKING_DIRECTORY + "/GlobalSettings.xml");

                FileReader fr;

                String testString;

                try {

                    fr = new FileReader(file);
                    BufferedReader br = new BufferedReader(fr);

                    testString = br.readLine();
                    System.out.println(testString);

                    boolean isEmpty = false;

                    if (testString == null) {
                        isEmpty = true;
                    }

                    System.out.println(isEmpty + testString);

                    br.close();

                    /*Read Settings*/
                    LoadSettings(SimulationSettings.WORKING_DIRECTORY + "/GlobalSettings.xml");

                    drawAgentTable();
                    settingContainer.drawTableParemters();

                    if (SimulationSettings.DO_COMPRESS_KEEP_ORIGINAL == 1) {
                        settingContainer.doCompressKeepOriginal.setSelected(true);
                        settingContainer.doCompressRemoveOriginal.setSelected(false);
                        settingContainer.doNotCompress.setSelected(false);

                    } else if (SimulationSettings.DO_COMPRESS_REMOVE_ORIGINAL == 1) {

                        settingContainer.doCompressKeepOriginal.setSelected(false);
                        settingContainer.doCompressRemoveOriginal.setSelected(true);
                        settingContainer.doNotCompress.setSelected(false);

                    } else {

                        settingContainer.doCompressKeepOriginal.setSelected(false);
                        settingContainer.doCompressRemoveOriginal.setSelected(false);
                        settingContainer.doNotCompress.setSelected(true);
                    }

                } catch (IOException e1) {

                    JOptionPane.showMessageDialog(null, "XML File with saved settings not found. Please enter the settings manually");
                }
            }

        });

        /*Save Experiment:*/
        jMenu1.add(saveExperiment);

        saveExperiment.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {

                /*Save Settings*/
                SaveSettings();
            }

        });

        /*Save as...Experiment:*/
        jMenu1.add(saveExperimentAs);

        saveExperimentAs.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {

                FileChooserFromMenuList chooseFile = new FileChooserFromMenuList(SimulationSettings.WORKING_DIRECTORY, true, false, "", false);
                chooseFile.openFileChooser();
                SimulationSettings.WORKING_DIRECTORY = chooseFile.getDirectoryOrFile();

                /*Save Settings*/
                SaveSettings();

            }

        });

        runBatchExperiments = new JMenuItem("Run Batch");

        jMenu1.add(runBatchExperiments);

        runBatchExperiments.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {

                new JDialogBatchExperiments();

            }

        });

        jMenu1.add(runBatchExperiments);

        jMenu1.add(exitGUI);
        exitGUI.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {

                Object text = "Do you want to save the settings before quitting? \n";

                int choice = JOptionPane.showConfirmDialog(null, text, "Exit GUI", JOptionPane.YES_NO_CANCEL_OPTION);

                if (choice == 0) {

                    /*Choice is yes*/
                    String PathToFile = new String(SimulationSettings.WORKING_DIRECTORY + "/SimParameter.sh");

                    System.out.println(SimulationSettings.WORKING_DIRECTORY);
                    System.out.println(PathToFile);

                    /*Safe the settings to XML file*/
                    SaveSettings();

                    setVisible(false);
                    dispose();

                    System.exit(-1);

                } else if (choice == 1) {

                    /*Choice is no*/
                    setVisible(false);
                    dispose();

                    System.out.println("agents:   " + AgentSettings.agents.get(0).agentName);

                    System.exit(-1);

                }

            }
        });

        menuSettings = new JMenu("Settings");
        menuBar.add(menuSettings);

        setPathes = new JMenu("Set Pathes");

        setPathModelXML = new JMenuItem("Set Path to Model.xml file");
        setPathModelXML.setToolTipText("Current path: " + SimulationSettings.EURACE_MODEL_XML);
        setExecutable = new JMenuItem("Set Model Executable");
        setExecutable.setToolTipText("Current Executable: " + SimulationSettings.MAIN_EXECUTABLE);
        setZeroXMLFile = new JMenuItem("Set initial Data File (0.xml)");
        setZeroXMLFile.setToolTipText("Current initial Data File: " + SimulationSettings.ZERO_XML_FILE);
        setPathRScripts = new JMenuItem("Set path to R Scripts");
        setPathRScripts.setToolTipText("Current path to R Scripts: " + SimulationSettings.PATH_TO_RSCRIPTS);

        setPathModelXML.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {

                String pathBefore;

                FileChooserFromMenuList chooseFile = new FileChooserFromMenuList(SimulationSettings.EURACE_MODEL_XML, false, true, "xml", false);
                chooseFile.openFileChooser();

                pathBefore = SimulationSettings.EURACE_MODEL_XML;

                SimulationSettings.EURACE_MODEL_XML = chooseFile.getDirectoryOrFile();
                setPathModelXML.setToolTipText("Current path: " + SimulationSettings.EURACE_MODEL_XML);

                if (!pathBefore.equals(SimulationSettings.EURACE_MODEL_XML)) {
                    /*Set agent list*/
                    agentList = ReadAgentListFromModelXML();
                    AgentSettings.agents = new ArrayList<Agent>();

                    PlottingSettings.listOfAgentsVariableInstances = new ArrayList<PlottingSettings.Agent>();

                    /*List of ratio Instances*/
                    PlottingSettings.listOfRatioInstances = new ArrayList<PlottingSettings.RatioInstance>();

                    /*List of time series*/
                    PlottingSettings.listOfSingleTimeSeries = new ArrayList<PlottingSettings.SingleTimeSeries>();
                    PlottingSettings.defaultsSingleTimeSeries = (new PlottingSettings()).new DefaulSingleTimeSeriesSettings();

                    /*List of multiple time series*/
                    PlottingSettings.listOfMultipleTimeSeries = new ArrayList<PlottingSettings.MultipleTimeSeries>();
                    PlottingSettings.defaultsMultipleTimeSeries = (new PlottingSettings()).new DefaulMultipleTimeSeriesSettings();

                    /*List of multiple time series*/
                    PlottingSettings.listOfSingleBandpassFilteredTimeSeries = new ArrayList<PlottingSettings.SingleBandpassFilteredTimeSeries>();
                    PlottingSettings.defaultsSingleBandpassFilteredTimeSeries = (new PlottingSettings()).new DefaultSettingsSingleBandpassFilteredTimeSeries();

                    /*List of multiple time series*/
                    PlottingSettings.listOfMultipleBandpassFilteredTimeSeries = new ArrayList<PlottingSettings.MultipleBandpassFilteredTimeSeries>();
                    PlottingSettings.defaultsMultipleBandpassFilteredTimeSeries = (new PlottingSettings()).new DefaultSettingsMultipleBandpassFilteredTimeSeries();

                    /*List of multiple time series*/
                    PlottingSettings.listOfHistograms = new ArrayList<PlottingSettings.Histogram>();
                    PlottingSettings.defaultsHistogram = (new PlottingSettings()).new DefaultSettingsHistogram();

                    /*List of multiple time series*/
                    PlottingSettings.listOfBoxplots = new ArrayList<PlottingSettings.Boxplots>();
                    PlottingSettings.defaultsBoxplots = (new PlottingSettings()).new DefaultSettingsBoxplots();


                    /*List of multiple time series*/
                    PlottingSettings.listOfHeatmaps = new ArrayList<PlottingSettings.Heatmaps>();
                    PlottingSettings.defaultsHeatmaps = (new PlottingSettings()).new DefaultSettingsHeatmaps();

                    /*List of multiple time series*/
                    PlottingSettings.listOfScatterPlots = new ArrayList<PlottingSettings.ScatterPlots>();
                    PlottingSettings.defaultsScatterPlots = (new PlottingSettings()).new DefaultSettingsScatterPlots();

                    /*List of multiple time series*/
                    PlottingSettings.listOfCrossCorrelation = new ArrayList<PlottingSettings.CrossCorrelation>();
                    PlottingSettings.defaultsCrossCorrelation = (new PlottingSettings()).new DefaultSettingsCrossCorrelation();

                    /*List of multiple time series*/
                    PlottingSettings.listOfCorrelation = new ArrayList<PlottingSettings.Correlation>();
                    PlottingSettings.defaultsCorrelation = (new PlottingSettings()).new DefaultSettingsCorrelation();

                    /*List of multiple time series*/
                    PlottingSettings.listOfHeatmaps2V = new ArrayList<PlottingSettings.Heatmaps2V>();
                    PlottingSettings.defaultsHeatmaps2V = (new PlottingSettings()).new DefaultSettingsHeatmaps2V();

                    for (int i = 0; i < agentList.size(); i++) {

                        AgentSettings.agents.add(new Agent(agentList.get(i)));
                        PlottingSettings.Agent temAgent = (new PlottingSettings()).new Agent(agentList.get(i));
                        PlottingSettings.listOfAgentsVariableInstances.add(temAgent);

                    }

                    /*Read Model parameters*/
                    ReadModelParameter modelXML = new ReadModelParameter();
                    modelXML.getFIleListDirectlyFromEuraceModelXML();
                    ModelParameterSettings.modelParameters = modelXML.GetModelParameterFromModelXMLFiles();

                    plottingContainer = new TabPlotting();
                    settingContainer = new TabSettings();

                    plottingContainer.validate();
                    settingContainer.validate();


                    /*Add GUI container to Scroll pane*/
                    settingScrollPane = new JScrollPane(settingContainer);
                    settingScrollPane.setPreferredSize(new Dimension(800, 1200));

                    plottingScrollPane = new JScrollPane(plottingContainer);
                    plottingScrollPane.setPreferredSize(new Dimension(800, 1200));

                    /*Add Scroll pane to JFrame*/
                    //add(guiScrollPane);
                    mainTabPane.remove(1);

                    mainTabPane.remove(0);

                    mainTabPane.add(settingScrollPane, "Simulation Settings");

                    mainTabPane.add(plottingScrollPane, "Plotting Settings");

                    validate();

                    validate();
                }

            }
        });

        setExecutable.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                FileChooserFromMenuList chooseFile;

                if (SimulationSettings.MAIN_EXECUTABLE.equals(".")) {
                    chooseFile = new FileChooserFromMenuList(SimulationSettings.EURACE_MODEL_XML, false, false, "", false);
                } else {
                    chooseFile = new FileChooserFromMenuList(SimulationSettings.MAIN_EXECUTABLE, false, false, "", false);
                }

                chooseFile.openFileChooser();
                SimulationSettings.MAIN_EXECUTABLE = chooseFile.getDirectoryOrFile();
                setExecutable.setToolTipText("Current Executable: " + SimulationSettings.MAIN_EXECUTABLE);

            }
        });

        setZeroXMLFile.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {

                FileChooserFromMenuList chooseFile;

                if (SimulationSettings.ZERO_XML_FILE.equals("0.xml")) {
                    chooseFile = new FileChooserFromMenuList(SimulationSettings.EURACE_MODEL_XML, false, true, "xml", false);
                } else {
                    chooseFile = new FileChooserFromMenuList(SimulationSettings.ZERO_XML_FILE, false, true, "xml", false);
                }

                chooseFile.openFileChooser();
                SimulationSettings.ZERO_XML_FILE = chooseFile.getDirectoryOrFile();
                setExecutable.setToolTipText("Current Executable: " + SimulationSettings.ZERO_XML_FILE);

            }
        });

        setPathRScripts.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {

                FileChooserFromMenuList chooseFile = new FileChooserFromMenuList(SimulationSettings.PATH_TO_RSCRIPTS, true, false, "", false);
                chooseFile.openFileChooser();
                SimulationSettings.PATH_TO_RSCRIPTS = chooseFile.getDirectoryOrFile();
                setPathRScripts.setToolTipText("Current pat: " + SimulationSettings.PATH_TO_RSCRIPTS);

            }
        });

        setPathes.add(setPathModelXML);
        setPathes.add(setExecutable);
        setPathes.add(setZeroXMLFile);
        setPathes.add(setPathRScripts);

        menuSettings.add(setPathes);

        /*menu to import and export settings: plotting settings and initial parameters*/
        menuImportExport = new JMenu("Import/Export");

        menuimportPlottingSections = new JMenu("Plotting Settings");

        importPlottingSettings = new JMenuItem("Import Plotting Settings");
        exportPlottingSettings = new JMenuItem("Export Plotting Settings");

        importPlottingSettings.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                try {

                    FileChooserFromMenuList chooseFile = new FileChooserFromMenuList(SimulationSettings.WORKING_DIRECTORY, false, true, "xml", false);
                    chooseFile.openFileChooser();

                    String file = chooseFile.getDirectoryOrFile();

                    File settingsFile = new File(chooseFile.getDirectoryOrFile());

                    if (!settingsFile.exists()) {

                        throw new FileNotFoundException();

                    }

                    ReadXMLFile defValues = new ReadXMLFile(file);
                    defValues.new ReadClassFromXML(new PlottingSettings(), "plottingSettings");

                    for (int i = 0; i < PlottingSettings.listOfAgentsVariableInstances.size(); i++) {

                        for (int j = 0; j < AgentSettings.agents.size(); j++) {

                            if (PlottingSettings.listOfAgentsVariableInstances.get(i).agentName.equals(AgentSettings.agents.get(j).agentName)) {

                                /*Check if variable is there:*/
                                for (int k = 0; k < PlottingSettings.listOfAgentsVariableInstances.get(i).listOfVariableInstances.size(); k++) {

                                    if (PlottingSettings.listOfAgentsVariableInstances.get(i).listOfVariableInstances.get(k).isVariable) {

                                        boolean found = false;

                                        for (int l = 0; l < AgentSettings.agents.get(j).variableList.size(); l++) {

                                            AgentSettings.agents.get(j).variableList.get(l).isSelectedForBoxplots = false;

                                            if (PlottingSettings.listOfAgentsVariableInstances.get(i).listOfVariableInstances.get(k).variable.name.equals(AgentSettings.agents.get(j).variableList.get(l).name)) {

                                                AgentSettings.agents.get(j).variableList.get(l).isSelectedForBoxplots = true;
                                                found = true;
                                                break;
                                            }

                                        }

                                        if (!found) {

                                            PlottingSettings.listOfAgentsVariableInstances.get(i).listOfVariableInstances.remove(k);
                                            k--;

                                        }

                                    } else {
                                        /*If agent ratio*/

                                        boolean numeratorFound = false;
                                        boolean denominatorFound = false;

                                        for (int l = 0; l < AgentSettings.agents.get(j).variableList.size(); l++) {

                                            if (PlottingSettings.listOfAgentsVariableInstances.get(i).listOfVariableInstances.get(k).agentRatio.numerator.equals(AgentSettings.agents.get(j).variableList.get(l).name)) {
                                                numeratorFound = true;
                                            } else if (PlottingSettings.listOfAgentsVariableInstances.get(i).listOfVariableInstances.get(k).agentRatio.denominator.equals(AgentSettings.agents.get(j).variableList.get(l).name)) {

                                                denominatorFound = true;

                                            }

                                        }

                                        /*If either numerator or denominator not found remove agent ratio*/
                                        if (!numeratorFound || !denominatorFound) {

                                            PlottingSettings.listOfAgentsVariableInstances.get(i).listOfVariableInstances.remove(k);
                                            k--;

                                        }

                                    }

                                }

                            }

                        }

                    }

                    /*Check histograms*/
                    for (int i = 0; i < PlottingSettings.listOfHistograms.size(); i++) {

                        for (int j = 0; j < AgentSettings.agents.size(); j++) {

                            if (PlottingSettings.listOfHistograms.get(i).histBelongsTo.equals(AgentSettings.agents.get(j).agentName)) {

                                /*Check if variable is there:*/
                                if (PlottingSettings.listOfHistograms.get(i).isVariable) {

                                    boolean found = false;

                                    for (int l = 0; l < AgentSettings.agents.get(j).variableList.size(); l++) {

                                        AgentSettings.agents.get(j).variableList.get(l).isSelectedForHistograms = false;

                                        if (PlottingSettings.listOfHistograms.get(i).variable.name.equals(AgentSettings.agents.get(j).variableList.get(l).name)) {

                                            AgentSettings.agents.get(j).variableList.get(l).isSelectedForHistograms = true;
                                            found = true;
                                            break;
                                        }

                                    }

                                    if (!found) {

                                        PlottingSettings.listOfHistograms.remove(i);
                                        i--;

                                    }

                                } else {
                                    /*If agent ratio*/

                                    boolean numeratorFound = false;
                                    boolean denominatorFound = false;

                                    for (int l = 0; l < AgentSettings.agents.get(j).variableList.size(); l++) {

                                        if (PlottingSettings.listOfHistograms.get(i).agentRatio.numerator.equals(AgentSettings.agents.get(j).variableList.get(l).name)) {
                                            numeratorFound = true;
                                        } else if (PlottingSettings.listOfHistograms.get(i).agentRatio.denominator.equals(AgentSettings.agents.get(j).variableList.get(l).name)) {

                                            denominatorFound = true;

                                        }

                                    }

                                    /*If either numerator or denominator not found remove agent ratio*/
                                    if (!numeratorFound || !denominatorFound) {

                                        PlottingSettings.listOfHistograms.remove(i);
                                        i--;

                                    }

                                }

                            }

                        }

                    }

                    /*Check Boxplots*/
                    for (int i = 0; i < PlottingSettings.listOfBoxplots.size(); i++) {

                        for (int j = 0; j < AgentSettings.agents.size(); j++) {

                            if (PlottingSettings.listOfBoxplots.get(i).histBelongsTo.equals(AgentSettings.agents.get(j).agentName)) {

                                /*Check if variable is there:*/
                                if (PlottingSettings.listOfBoxplots.get(i).isVariable) {

                                    boolean found = false;

                                    for (int l = 0; l < AgentSettings.agents.get(j).variableList.size(); l++) {

                                        AgentSettings.agents.get(j).variableList.get(l).isSelectedForBoxplots = false;

                                        if (PlottingSettings.listOfBoxplots.get(i).variable.name.equals(AgentSettings.agents.get(j).variableList.get(l).name)) {

                                            AgentSettings.agents.get(j).variableList.get(l).isSelectedForBoxplots = true;
                                            found = true;
                                            break;
                                        }

                                    }

                                    if (!found) {

                                        PlottingSettings.listOfBoxplots.remove(i);
                                        i--;

                                    }

                                } else {
                                    /*If agent ratio*/

                                    boolean numeratorFound = false;
                                    boolean denominatorFound = false;

                                    for (int l = 0; l < AgentSettings.agents.get(j).variableList.size(); l++) {

                                        if (PlottingSettings.listOfBoxplots.get(i).agentRatio.numerator.equals(AgentSettings.agents.get(j).variableList.get(l).name)) {
                                            numeratorFound = true;
                                        } else if (PlottingSettings.listOfBoxplots.get(i).agentRatio.denominator.equals(AgentSettings.agents.get(j).variableList.get(l).name)) {

                                            denominatorFound = true;

                                        }

                                    }

                                    /*If either numerator or denominator not found remove agent ratio*/
                                    if (!numeratorFound || !denominatorFound) {

                                        PlottingSettings.listOfBoxplots.remove(i);
                                        i--;

                                    }

                                }

                            }

                        }

                    }

                    /*Check heatmaps*/
                    for (int i = 0; i < PlottingSettings.listOfHeatmaps.size(); i++) {

                        for (int j = 0; j < AgentSettings.agents.size(); j++) {

                            if (PlottingSettings.listOfHeatmaps.get(i).histBelongsTo.equals(AgentSettings.agents.get(j).agentName)) {

                                /*Check if variable is there:*/
                                if (PlottingSettings.listOfHeatmaps.get(i).isVariable) {

                                    boolean found = false;

                                    for (int l = 0; l < AgentSettings.agents.get(j).variableList.size(); l++) {

                                        AgentSettings.agents.get(j).variableList.get(l).isSelectedForHeatmaps = false;

                                        if (PlottingSettings.listOfHeatmaps.get(i).variable.name.equals(AgentSettings.agents.get(j).variableList.get(l).name)) {

                                            AgentSettings.agents.get(j).variableList.get(l).isSelectedForHeatmaps = true;
                                            found = true;
                                            break;
                                        }

                                    }

                                    if (!found) {

                                        PlottingSettings.listOfHeatmaps.remove(i);
                                        i--;

                                    }

                                } else {
                                    /*If agent ratio*/

                                    boolean numeratorFound = false;
                                    boolean denominatorFound = false;

                                    int indFound1, indFound2;

                                    indFound1 = 0;
                                    indFound2 = 0;

                                    for (int l = 0; l < AgentSettings.agents.get(j).variableList.size(); l++) {

                                        if (PlottingSettings.listOfHeatmaps.get(i).agentRatio.numerator.equals(AgentSettings.agents.get(j).variableList.get(l).name)) {
                                            numeratorFound = true;
                                            indFound1 = l;
                                        } else if (PlottingSettings.listOfHeatmaps.get(i).agentRatio.denominator.equals(AgentSettings.agents.get(j).variableList.get(l).name)) {

                                            denominatorFound = true;
                                            indFound2 = l;

                                        }

                                    }

                                    /*If either numerator or denominator not found remove agent ratio*/
                                    if (!numeratorFound || !denominatorFound) {

                                        PlottingSettings.listOfHeatmaps.remove(i);
                                        i--;

                                    } else {

                                        AgentSettings.agents.get(j).variableList.get(indFound1).isSelectedForHeatmaps = true;
                                        AgentSettings.agents.get(j).variableList.get(indFound2).isSelectedForHeatmaps = true;

                                    }

                                }

                            }

                        }

                    }

                    /*Check correlation coeff*/
                    for (int i = 0; i < PlottingSettings.listOfCorrelation.size(); i++) {

                        for (int j = 0; j < AgentSettings.agents.size(); j++) {

                            if (PlottingSettings.listOfCorrelation.get(i).histBelongsTo.equals(AgentSettings.agents.get(j).agentName)) {

                                /*Check if variable is there:*/
                                boolean found1 = false;

                                for (int l = 0; l < AgentSettings.agents.get(j).variableList.size(); l++) {

                                    AgentSettings.agents.get(j).variableList.get(l).isSelectedForBoxplots = false;

                                    if (PlottingSettings.listOfCorrelation.get(i).variable1.name.equals(AgentSettings.agents.get(j).variableList.get(l).name)) {

                                        AgentSettings.agents.get(j).variableList.get(l).isSelectedForCorrelation = true;
                                        found1 = true;
                                        break;
                                    }

                                }

                                boolean found2 = false;

                                for (int l = 0; l < AgentSettings.agents.get(j).variableList.size(); l++) {

                                    AgentSettings.agents.get(j).variableList.get(l).isSelectedForBoxplots = false;

                                    if (PlottingSettings.listOfCorrelation.get(i).variable2.name.equals(AgentSettings.agents.get(j).variableList.get(l).name)) {

                                        AgentSettings.agents.get(j).variableList.get(l).isSelectedForCorrelation = true;
                                        found2 = true;
                                        break;
                                    }

                                    if (!found1 || !found2) {

                                        PlottingSettings.listOfCorrelation.remove(i);
                                        i--;

                                    }

                                }

                            }

                        }

                    }

                    /*Check heatmaps 2V*/
                    for (int i = 0; i < PlottingSettings.listOfHeatmaps2V.size(); i++) {

                        for (int j = 0; j < AgentSettings.agents.size(); j++) {

                            if (PlottingSettings.listOfHeatmaps2V.get(i).histBelongsTo.equals(AgentSettings.agents.get(j).agentName)) {

                                /*Check if variable is there:*/
                                if (PlottingSettings.listOfHeatmaps2V.get(i).isVariable1) {

                                    boolean found = false;

                                    for (int l = 0; l < AgentSettings.agents.get(j).variableList.size(); l++) {

                                        if (PlottingSettings.listOfHeatmaps2V.get(i).variable1.name.equals(AgentSettings.agents.get(j).variableList.get(l).name)) {

                                            found = true;
                                            break;
                                        }

                                    }

                                    if (!found) {

                                        PlottingSettings.listOfHeatmaps2V.remove(i);
                                        i--;
                                        break;

                                    }

                                } else {
                                    /*If agent ratio*/

                                    boolean numeratorFound = false;
                                    boolean denominatorFound = false;

                                    for (int l = 0; l < AgentSettings.agents.get(j).variableList.size(); l++) {

                                        if (PlottingSettings.listOfHeatmaps2V.get(i).agentRatio1.numerator.equals(AgentSettings.agents.get(j).variableList.get(l).name)) {
                                            numeratorFound = true;
                                        } else if (PlottingSettings.listOfHeatmaps2V.get(i).agentRatio1.denominator.equals(AgentSettings.agents.get(j).variableList.get(l).name)) {

                                            denominatorFound = true;

                                        }

                                    }

                                    /*If either numerator or denominator not found remove agent ratio*/
                                    if (!numeratorFound || !denominatorFound) {

                                        PlottingSettings.listOfHeatmaps2V.remove(i);
                                        i--;
                                        break;

                                    }

                                }

                                if (PlottingSettings.listOfHeatmaps2V.get(i).isVariable2) {

                                    boolean found = false;

                                    for (int l = 0; l < AgentSettings.agents.get(j).variableList.size(); l++) {

                                        AgentSettings.agents.get(j).variableList.get(l).isSelectedForHeatmaps2V = false;

                                        if (PlottingSettings.listOfHeatmaps2V.get(i).variable1.name.equals(AgentSettings.agents.get(j).variableList.get(l).name)) {

                                            AgentSettings.agents.get(j).variableList.get(l).isSelectedForHeatmaps2V = true;
                                            found = true;
                                            break;
                                        }

                                    }

                                    if (!found) {

                                        PlottingSettings.listOfHeatmaps2V.remove(i);
                                        i--;
                                        break;

                                    }

                                } else {
                                    /*If agent ratio*/

                                    boolean numeratorFound = false;
                                    boolean denominatorFound = false;

                                    for (int l = 0; l < AgentSettings.agents.get(j).variableList.size(); l++) {

                                        if (PlottingSettings.listOfHeatmaps2V.get(i).agentRatio2.numerator.equals(AgentSettings.agents.get(j).variableList.get(l).name)) {
                                            numeratorFound = true;
                                        } else if (PlottingSettings.listOfHeatmaps2V.get(i).agentRatio2.denominator.equals(AgentSettings.agents.get(j).variableList.get(l).name)) {

                                            denominatorFound = true;

                                        }

                                    }

                                    /*If either numerator or denominator not found remove agent ratio*/
                                    if (!numeratorFound || !denominatorFound) {

                                        PlottingSettings.listOfHeatmaps2V.remove(i);
                                        i--;
                                        break;

                                    }

                                }

                            }

                        }

                    }

                    for (int i = 0; i < AgentSettings.agents.size(); i++) {

                        for (int j = 0; j < AgentSettings.agents.get(i).variableList.size(); j++) {

                            AgentSettings.agents.get(i).variableList.get(j).isSelectedForHeatmaps2V = false;

                        }
                    }

                    for (int i = 0; i < PlottingSettings.listOfHeatmaps2V.size(); i++) {

                        for (int j = 0; j < AgentSettings.agents.size(); j++) {

                            if (PlottingSettings.listOfHeatmaps2V.get(i).histBelongsTo.equals(AgentSettings.agents.get(j).agentName)) {

                                if (PlottingSettings.listOfHeatmaps2V.get(i).isVariable1) {

                                    for (int k = 0; k < AgentSettings.agents.get(j).variableList.size(); k++) {

                                        if (PlottingSettings.listOfHeatmaps2V.get(i).variable1.name.equals(AgentSettings.agents.get(j).variableList.get(k).name)) {

                                            AgentSettings.agents.get(j).variableList.get(k).isSelectedForHeatmaps2V = true;
                                            break;

                                        }

                                    }

                                } else {

                                    for (int k = 0; k < AgentSettings.agents.get(j).variableList.size(); k++) {

                                        if (PlottingSettings.listOfHeatmaps2V.get(i).agentRatio1.numerator.name.equals(AgentSettings.agents.get(j).variableList.get(k).name)) {

                                            AgentSettings.agents.get(j).variableList.get(k).isSelectedForHeatmaps2V = true;
                                            break;

                                        }

                                    }

                                    for (int k = 0; k < AgentSettings.agents.get(j).variableList.size(); k++) {

                                        if (PlottingSettings.listOfHeatmaps2V.get(i).agentRatio1.denominator.name.equals(AgentSettings.agents.get(j).variableList.get(k).name)) {

                                            AgentSettings.agents.get(j).variableList.get(k).isSelectedForHeatmaps2V = true;
                                            break;

                                        }

                                    }
                                }

                                if (PlottingSettings.listOfHeatmaps2V.get(i).isVariable2) {

                                    for (int k = 0; k < AgentSettings.agents.get(j).variableList.size(); k++) {

                                        if (PlottingSettings.listOfHeatmaps2V.get(i).variable2.name.equals(AgentSettings.agents.get(j).variableList.get(k).name)) {

                                            AgentSettings.agents.get(j).variableList.get(k).isSelectedForHeatmaps2V = true;
                                            break;

                                        }

                                    }

                                } else {

                                    for (int k = 0; k < AgentSettings.agents.get(j).variableList.size(); k++) {

                                        if (PlottingSettings.listOfHeatmaps2V.get(i).agentRatio2.numerator.name.equals(AgentSettings.agents.get(j).variableList.get(k).name)) {

                                            AgentSettings.agents.get(j).variableList.get(k).isSelectedForHeatmaps2V = true;
                                            break;

                                        }

                                    }

                                    for (int k = 0; k < AgentSettings.agents.get(j).variableList.size(); k++) {

                                        if (PlottingSettings.listOfHeatmaps2V.get(i).agentRatio2.denominator.name.equals(AgentSettings.agents.get(j).variableList.get(k).name)) {

                                            AgentSettings.agents.get(j).variableList.get(k).isSelectedForHeatmaps2V = true;
                                            break;

                                        }

                                    }
                                }

                            }

                        }
                    }

                } catch (Exception ex) {

                    System.out.println(ex);

                }

            }

        });

        exportPlottingSettings.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                FileChooserFromMenuList chooseFile = new FileChooserFromMenuList(SimulationSettings.WORKING_DIRECTORY, false, true, "xml", true);
                chooseFile.openFileChooser();

                WriteSettingsXMLFile exportPloSettings;

                if (chooseFile.getDirectoryOrFile().endsWith(".xml")) {
                    exportPloSettings = new WriteSettingsXMLFile("", chooseFile.getDirectoryOrFile(), "plottingSettings");
                } else {
                    exportPloSettings = new WriteSettingsXMLFile("", chooseFile.getDirectoryOrFile() + ".xml", "plottingSettings");
                }

                exportPloSettings.createXMLFile();

                exportPloSettings.new WriteClassFromXML(new PlottingSettings(), "plottingSettings", false);

            }

        });

        menuimportPlottingSections.add(importPlottingSettings);
        menuimportPlottingSections.add(exportPlottingSettings);

        menuImportExport.add(menuimportPlottingSections);

        menuimportParameterSections = new JMenu("Parameter Settings");

        importParameterSettings = new JMenuItem("Import Parameter Settings");
        exportParameterSettings = new JMenuItem("Export Parameter Settings");

        importParameterSettings.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                try {

                    FileChooserFromMenuList chooseFile = new FileChooserFromMenuList(SimulationSettings.WORKING_DIRECTORY, false, true, "xml", false);
                    chooseFile.openFileChooser();

                    String file = chooseFile.getDirectoryOrFile();

                    File settingsFile = new File(chooseFile.getDirectoryOrFile());

                    if (!settingsFile.exists()) {

                        throw new FileNotFoundException();

                    }

                    ReadXMLFile defValues = new ReadXMLFile(file);

                    defValues.new ReadClassFromXML(new ModelParameterSettings(), "parameterSettings");

                    new JDialogParameterSetup(ModelParameterSettings.modelParameters);

                } catch (Exception ex) {

                    System.out.println(ex);

                }

            }

        });

        exportParameterSettings.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                FileChooserFromMenuList chooseFile = new FileChooserFromMenuList(SimulationSettings.WORKING_DIRECTORY, false, true, "xml", true);
                chooseFile.openFileChooser();

                WriteSettingsXMLFile exportPloSettings;

                if (chooseFile.getDirectoryOrFile().endsWith(".xml")) {
                    exportPloSettings = new WriteSettingsXMLFile("", chooseFile.getDirectoryOrFile(), "parameterSettings");
                } else {
                    exportPloSettings = new WriteSettingsXMLFile("", chooseFile.getDirectoryOrFile() + ".xml", "parameterSettings");
                }

                exportPloSettings.createXMLFile();

                exportPloSettings.new WriteClassFromXML(new ModelParameterSettings(), "parameterSettings", false);

            }

        });

        menuimportParameterSections.add(importParameterSettings);
        menuimportParameterSections.add(exportParameterSettings);

        menuImportExport.add(menuimportParameterSections);

        menuSettings.add(menuImportExport);

        /*menu plotting selection*/
        setJMenuBar(menuBar);

    }

    /**
     * this is an attempt to reuse the functionality of the TabPlotting class
     * without committing major changes to the structure of code.
     */
    void OldTabExperimentInitialization() {
        settingScrollPane = new JScrollPane(settingContainer);
        settingScrollPane.setPreferredSize(new Dimension(800, 780));
        jTabbedPane2.addTab("Old Experiment Settings", settingScrollPane);
    }

    void OldTabPlottingInitialization() {
//        TabSingleTimeSeries timeSeriesPanel=new TabSingleTimeSeries();
//        timeSeriesPanel.redrawAllTables();
        plottingScrollPane = new JScrollPane(plottingContainer);
        plottingScrollPane.setPreferredSize(new Dimension(800, 780));
        jTabbedPane2.addTab("Old Plotting Settings", plottingScrollPane);

    }

    /**
     * here some changes will be made to the structure of the method compared to
     * the one appearing in the multi gui. In original multi gui there is an
     * instance settingContainer of tabSettings class that corresponds to the
     * subpanels of gui. Here no such additional class is used, all the GUI
     * components are generated automatically. Therefore reference to
     * settingContainer will be replaced by references to interface elements.
     *
     *
     * another change is related to the fact that in the first screen
     * single\batch run is not included. therefore the place in the
     * buildExperiment where it checks if check boxes related to
     * single\batch\parameter will be commented out for the sake of presentation
     * of project at current stage.
     *
     */
    private void buildExperimentButtonPressed() {
        ShadowModelXML shadowFile = new ShadowModelXML();

        shadowFile.setFilterAndWeights();

        ShadowModelXML.agents.clear();

        for (int i = 0; i < AgentSettings.agents.size(); i++) {

            boolean found = false;

            for (int j = 0; j < AgentSettings.agents.get(i).variableList.size(); j++) {

                if (AgentSettings.agents.get(i).variableList.get(j).isSelectedForPlotting) {

                    if (!found) {
                        ShadowModelXML.agents.add((new ShadowModelXML()).new xagent(AgentSettings.agents.get(i).agentName));
                        found = true;
                        System.out.println(ShadowModelXML.agents.size());
                        ShadowModelXML.agents.get(ShadowModelXML.agents.size() - 1).memory.add((new ShadowModelXML()).new variable("id", "int"));
                    }

                    if (!AgentSettings.agents.get(i).variableList.get(j).name.equals("id")) {
                        ShadowModelXML.agents.get(ShadowModelXML.agents.size() - 1).memory.add((new ShadowModelXML()).new variable(AgentSettings.agents.get(i).variableList.get(j).name, AgentSettings.agents.get(i).variableList.get(j).type));
                    }

                } else if (AgentSettings.agents.get(i).variableList.get(j).isSelectedForHistograms) {
                    if (!found) {
                        ShadowModelXML.agents.add((new ShadowModelXML()).new xagent(AgentSettings.agents.get(i).agentName));
                        found = true;
                        ShadowModelXML.agents.get(ShadowModelXML.agents.size() - 1).memory.add((new ShadowModelXML()).new variable("id", "int"));
                    }
                    if (!AgentSettings.agents.get(i).variableList.get(j).name.equals("id")) {
                        ShadowModelXML.agents.get(ShadowModelXML.agents.size() - 1).memory.add((new ShadowModelXML()).new variable(AgentSettings.agents.get(i).variableList.get(j).name, AgentSettings.agents.get(i).variableList.get(j).type));
                    }
                } else if (AgentSettings.agents.get(i).variableList.get(j).isSelectedForBoxplots) {
                    if (!found) {
                        ShadowModelXML.agents.add((new ShadowModelXML()).new xagent(AgentSettings.agents.get(i).agentName));
                        found = true;
                        ShadowModelXML.agents.get(ShadowModelXML.agents.size() - 1).memory.add((new ShadowModelXML()).new variable("id", "int"));
                    }
                    if (!AgentSettings.agents.get(i).variableList.get(j).name.equals("id")) {
                        ShadowModelXML.agents.get(ShadowModelXML.agents.size() - 1).memory.add((new ShadowModelXML()).new variable(AgentSettings.agents.get(i).variableList.get(j).name, AgentSettings.agents.get(i).variableList.get(j).type));
                    }
                } else if (AgentSettings.agents.get(i).variableList.get(j).isSelectedForHeatmaps) {
                    if (!found) {
                        ShadowModelXML.agents.add((new ShadowModelXML()).new xagent(AgentSettings.agents.get(i).agentName));
                        found = true;
                        ShadowModelXML.agents.get(ShadowModelXML.agents.size() - 1).memory.add((new ShadowModelXML()).new variable("id", "int"));
                    }
                    if (!AgentSettings.agents.get(i).variableList.get(j).name.equals("id")) {
                        ShadowModelXML.agents.get(ShadowModelXML.agents.size() - 1).memory.add((new ShadowModelXML()).new variable(AgentSettings.agents.get(i).variableList.get(j).name, AgentSettings.agents.get(i).variableList.get(j).type));
                    }
                } else if (AgentSettings.agents.get(i).variableList.get(j).isSelectedForHeatmaps2V) {
                    if (!found) {
                        ShadowModelXML.agents.add((new ShadowModelXML()).new xagent(AgentSettings.agents.get(i).agentName));
                        found = true;
                        ShadowModelXML.agents.get(ShadowModelXML.agents.size() - 1).memory.add((new ShadowModelXML()).new variable("id", "int"));
                    }
                    if (!AgentSettings.agents.get(i).variableList.get(j).name.equals("id")) {
                        ShadowModelXML.agents.get(ShadowModelXML.agents.size() - 1).memory.add((new ShadowModelXML()).new variable(AgentSettings.agents.get(i).variableList.get(j).name, AgentSettings.agents.get(i).variableList.get(j).type));
                    }
                } else if (AgentSettings.agents.get(i).variableList.get(j).isSelectedForCorrelation) {
                    if (!found) {
                        ShadowModelXML.agents.add((new ShadowModelXML()).new xagent(AgentSettings.agents.get(i).agentName));
                        found = true;
                        ShadowModelXML.agents.get(ShadowModelXML.agents.size() - 1).memory.add((new ShadowModelXML()).new variable("id", "int"));
                    }

                    if (!AgentSettings.agents.get(i).variableList.get(j).name.equals("id")) {
                        ShadowModelXML.agents.get(ShadowModelXML.agents.size() - 1).memory.add((new ShadowModelXML()).new variable(AgentSettings.agents.get(i).variableList.get(j).name, AgentSettings.agents.get(i).variableList.get(j).type));
                    }

                } else if (AgentSettings.agents.get(i).variableList.get(j).isSelectedFilter) {
                    if (!found) {
                        ShadowModelXML.agents.add((new ShadowModelXML()).new xagent(AgentSettings.agents.get(i).agentName));
                        found = true;
                        ShadowModelXML.agents.get(ShadowModelXML.agents.size() - 1).memory.add((new ShadowModelXML()).new variable("id", "int"));
                    }

                    if (!AgentSettings.agents.get(i).variableList.get(j).name.equals("id")) {
                        ShadowModelXML.agents.get(ShadowModelXML.agents.size() - 1).memory.add((new ShadowModelXML()).new variable(AgentSettings.agents.get(i).variableList.get(j).name, AgentSettings.agents.get(i).variableList.get(j).type));
                    }

                } else if (AgentSettings.agents.get(i).variableList.get(j).isSelectedWeighted) {
                    if (!found) {
                        ShadowModelXML.agents.add((new ShadowModelXML()).new xagent(AgentSettings.agents.get(i).agentName));
                        found = true;
                        ShadowModelXML.agents.get(ShadowModelXML.agents.size() - 1).memory.add((new ShadowModelXML()).new variable("id", "int"));
                    }
                    if (!AgentSettings.agents.get(i).variableList.get(j).name.equals("id")) {
                        ShadowModelXML.agents.get(ShadowModelXML.agents.size() - 1).memory.add((new ShadowModelXML()).new variable(AgentSettings.agents.get(i).variableList.get(j).name, AgentSettings.agents.get(i).variableList.get(j).type));
                    }

                }

                /*TODO add further isselected booleans*/
            }
        }

        new CountAgents();

        WriteSettingsXMLFile shadowXMLFile = new WriteSettingsXMLFile("", "shadow_model.xml", "xmodel");
        shadowXMLFile.createXMLFile();
        shadowXMLFile.new WriteClassFromXML(shadowFile, "xmodel", true);

        WriteSettingsXMLFile experiment = new WriteSettingsXMLFile("", "experiment.xml", "experiment");
        experiment.createXMLFile();

        BatchExperiments.Experiment tempExp = (new BatchExperiments()).new Experiment();

        tempExp.path = SimulationSettings.WORKING_DIRECTORY;

        if (SimulationSettings.numParameters == 1) {
            tempExp.parameter1 = SimulationSettings.PARAMETER_1;
        }

        if (SimulationSettings.numParameters == 2) {
            tempExp.parameter1 = SimulationSettings.PARAMETER_1;
            tempExp.parameter2 = SimulationSettings.PARAMETER_2;
        }

        experiment.new WriteClassFromXML(tempExp, "experiment", false);

        WriteRInterface rInterface = new WriteRInterface();
        rInterface.writeVariableTXTFile();
        rInterface.writeRatioTXTFile();
        rInterface.writeGrowthrateTXTFile();
        rInterface.writeSingleTimeSeriesTXTFile();
        rInterface.writeMultipleTimeSeriesTXTFile();
        rInterface.writeHistogramTXTFile();
        rInterface.writeBoxplotsTXTFile();
        rInterface.writeHeatmapsTXTFile();
        rInterface.writeScatterTXTFile();

        rInterface.writeCrossCorrelationTXTFile();
        rInterface.writeCorrelationTXTFile();
        rInterface.writeHeatmaps2VTXTFile();
        rInterface.writeBandpassFilterTXTFile();

        rInterface.writeConfigureFile();

        AuxFunctions.copyfile(SimulationSettings.WORKING_DIRECTORY + "/variables.txt", SimulationSettings.PATH_TO_RSCRIPTS + "/Data_Files/variables.txt");
        AuxFunctions.copyfile(SimulationSettings.WORKING_DIRECTORY + "/time_series_data.txt", SimulationSettings.PATH_TO_RSCRIPTS + "/Data_Files/time_series_data.txt");
        AuxFunctions.copyfile(SimulationSettings.WORKING_DIRECTORY + "/multiple_time_series_data.txt", SimulationSettings.PATH_TO_RSCRIPTS + "/Data_Files/multiple_time_series_data.txt");
        AuxFunctions.copyfile(SimulationSettings.WORKING_DIRECTORY + "/growth_rate_data.txt", SimulationSettings.PATH_TO_RSCRIPTS + "/Data_Files/growth_rate_data.txt");
        AuxFunctions.copyfile(SimulationSettings.WORKING_DIRECTORY + "/ratio_data.txt", SimulationSettings.PATH_TO_RSCRIPTS + "/Data_Files/ratio_data.txt");
        AuxFunctions.copyfile(SimulationSettings.WORKING_DIRECTORY + "/boxplot_data.txt", SimulationSettings.PATH_TO_RSCRIPTS + "/Data_Files/boxplot_data.txt");
        AuxFunctions.copyfile(SimulationSettings.WORKING_DIRECTORY + "/histogram_data.txt", SimulationSettings.PATH_TO_RSCRIPTS + "/Data_Files/histogram_data.txt");
        AuxFunctions.copyfile(SimulationSettings.WORKING_DIRECTORY + "/heat_maps_data.txt", SimulationSettings.PATH_TO_RSCRIPTS + "/Data_Files/heat_maps_data.txt");
        AuxFunctions.copyfile(SimulationSettings.WORKING_DIRECTORY + "/scatter_data.txt", SimulationSettings.PATH_TO_RSCRIPTS + "/Data_Files/scatter_data.txt");
        AuxFunctions.copyfile(SimulationSettings.WORKING_DIRECTORY + "/bandpass_filter_data.txt", SimulationSettings.PATH_TO_RSCRIPTS + "/Data_Files/bandpass_filter_data.txt");
        AuxFunctions.copyfile(SimulationSettings.WORKING_DIRECTORY + "/cross_correlation_function_data.txt", SimulationSettings.PATH_TO_RSCRIPTS + "/Data_Files/cross_correlation_function.txt");
        AuxFunctions.copyfile(SimulationSettings.WORKING_DIRECTORY + "/correlation_distribution_data.txt", SimulationSettings.PATH_TO_RSCRIPTS + "/Data_Files/correlation_distribution_data.txt");
        AuxFunctions.copyfile(SimulationSettings.WORKING_DIRECTORY + "/heat_maps_data_2V.txt", SimulationSettings.PATH_TO_RSCRIPTS + "/Data_Files/heat_maps_data_2V.txt");

        AuxFunctions.copyfile(SimulationSettings.WORKING_DIRECTORY + "/Configure.r", SimulationSettings.PATH_TO_RSCRIPTS + "/Configure.r");

        AuxFunctions.copyfile("./Bash_scripts/exp_script_1_setup.sh", SimulationSettings.WORKING_DIRECTORY + "/exp_script_1_setup.sh");
        AuxFunctions.copyfile("./Bash_scripts/exp_script_2_specific.sh", SimulationSettings.WORKING_DIRECTORY + "/exp_script_2_specific.sh");
        AuxFunctions.copyfile("./Bash_scripts/create_job_list.sh", SimulationSettings.WORKING_DIRECTORY + "/create_job_list.sh");
        AuxFunctions.copyfile("./Bash_scripts/launch_job_list.sh", SimulationSettings.WORKING_DIRECTORY + "/launch_job_list.sh");
        AuxFunctions.copyfile("./Bash_scripts/run.sh", SimulationSettings.WORKING_DIRECTORY + "/run.sh");
        AuxFunctions.copyfile("./Bash_scripts/compress_db.sh", SimulationSettings.WORKING_DIRECTORY + "/compress_db.sh");
        AuxFunctions.copyfile("./Bash_scripts/create_job_list_compress.sh", SimulationSettings.WORKING_DIRECTORY + "/create_job_list_compress.sh");
        AuxFunctions.copyfile("./Bash_scripts/r_serial.sh", SimulationSettings.WORKING_DIRECTORY + "/r_serial.sh");

        if (SimulationSettings.saveAllAgentVariables) {
            AuxFunctions.copyfile("./Bash_scripts/gendb.py", SimulationSettings.WORKING_DIRECTORY + "/gendb.py");
        } else {
            AuxFunctions.copyfile("./Bash_scripts/gendb_special.py", SimulationSettings.WORKING_DIRECTORY + "/gendb.py");
            AuxFunctions.copyfile("shadow_model.xml", SimulationSettings.WORKING_DIRECTORY + "/shadow_model.xml");
        }

        AuxFunctions.copyfile("experiment.xml", SimulationSettings.WORKING_DIRECTORY + "/experiment.xml");

        String PathToFile = new String("launch.sh");

        System.out.println("before updating init");
        HashMap<String, String> dict = new HashMap<>();

//                                                String slash="\\";                                                
        dict.put("<SimulationSettings.WORKING_DIRECTORY>",
                SimulationSettings.WORKING_DIRECTORY.replaceAll("\\\\", "\\\\\\\\"));
//                                                
        System.out.println(SimulationSettings.WORKING_DIRECTORY);
        System.out.println(dict);

        ShellTemplateUpdater updater = new ShellTemplateUpdater(dict);
        updater.update("template_files/launch_template.sh", "launch.sh");

        dict.put("<SimulationSettings.ZERO_XML_FILE>",
                SimulationSettings.ZERO_XML_FILE.replaceAll("\\\\", "\\\\\\\\"));
        dict.put("<SimulationSettings.numIterations>",
                SimulationSettings.numIterations + "");
        dict.put("<SimulationSettings.numProcessors>",
                SimulationSettings.numProcessors + "");

        //If one parameters is selected:
        // here the reference to settingContainer is replaced with reference to jRadioButton4:
        // if (settingContainer.parameterVariationOnePars.isSelected()) {
        if (jRadioButton4.isSelected()) {
            dict.put("<NUM_PARS>", "1");
        } else {
            dict.put("<NUM_PARS>", "0");
        }

        dict.put("<SimulationSettings.numBatchRuns>",
                SimulationSettings.numBatchRuns + "");
        dict.put("<SimulationSettings.MAIN_EXECUTABLE>",
                SimulationSettings.MAIN_EXECUTABLE.replaceAll("\\\\", "\\\\\\\\"));

        if (SimulationSettings.saveAllAgentVariables) {
            dict.put("<MODEL_XML_FILE>",
                    SimulationSettings.EURACE_MODEL_XML.replaceAll("\\\\", "\\\\\\\\"));
        } else {
            dict.put("<MODEL_XML_FILE>",
                    (SimulationSettings.WORKING_DIRECTORY + "/shadow_model.xml'").replaceAll("\\\\", "\\\\\\\\"));
        }

        dict.put("<SimulationSettings.PATH_TO_RSCRIPTS>",
                (SimulationSettings.PATH_TO_RSCRIPTS + "/").replaceAll("\\\\", "\\\\\\\\"));
        dict.put("<SimulationSettings.DO_RUN>",
                SimulationSettings.DO_RUN + "");
        dict.put("<SimulationSettings.DO_COMPRESS_KEEP_ORIGINAL>",
                SimulationSettings.DO_COMPRESS_KEEP_ORIGINAL + "");
        dict.put("<SimulationSettings.DO_COMPRESS_REMOVE_ORIGINAL>",
                SimulationSettings.DO_COMPRESS_REMOVE_ORIGINAL + "");
        dict.put("<SimulationSettings.DO_DECOMPRESS>",
                SimulationSettings.DO_DECOMPRESS + "");
        dict.put("<SimulationSettings.DO_REMOVE_DB>",
                SimulationSettings.DO_REMOVE_DB + "");

        //
        // this is the second modification; after the comment 
        // is applied, r scripts will always be run.
        //if (plottingContainer.singleRunAnalyisCheckBox.isSelected() || plottingContainer.batchRunAnalyisCheckBox.isSelected() || plottingContainer.parameterAnalyisCheckBox.isSelected()) {
        if (true) {
            dict.put("<RUN_R_SCRIPTS>", "bash ./r_serial.sh");
        } else {
            dict.put("<RUN_R_SCRIPTS>", "#Don't run r scripts\\n#bash ./r_serial.sh");
        }

        updater.update("template_files/run_exp_template.sh", "run_exp.sh");

        String experimentSettings = "";
        /*
         similarly, here also reference to settingContainer is replaced
         */

//        if (settingContainer.parameterVariationOnePars.isSelected()) {
        if (jRadioButton4.isSelected()) {
            //If one parameters is selected:	
            //Check if settings are correct, otherwise return warning message/
            try {
                SimulationSettings.PARAMETER_1.name.equals(null);

                SimulationSettings.PARAMETER_1.values.get(0);

                experimentSettings += "\nexport PARAMETER_1='" + SimulationSettings.PARAMETER_1.name + "'";

                String values1 = "";

                for (int i = 0; i < SimulationSettings.PARAMETER_1.values.size(); i++) {
                    values1 = values1 + " " + SimulationSettings.PARAMETER_1.values.get(i).value;
                }
                experimentSettings += "\nexport F1_values='" + values1 + "'"
                        + "\n"
                        + "export F1_values_b=(" + values1 + ")"
                        + "\n"
                        + "for i in ${!F1_values_b[*]};do export F1_values_b_$i='${F1_values_b[$i]}';done";
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Parameter 1 is not selected!");
            }

        } else {
            //If no parameters are selected:
            experimentSettings = "# No parameters selected";
        }
        dict.put("<ExperimentSettings>",
                (experimentSettings).replaceAll("\\\\", "\\\\\\\\"));

        updater.update("template_files/set_exp_template.sh", SimulationSettings.WORKING_DIRECTORY + "/set_exp.sh");

        WriteOutputXMLFile outputXML = new WriteOutputXMLFile(SimulationSettings.WORKING_DIRECTORY);
        outputXML.writeOutputToFile(AgentSettings.agents);
        outputXML.writeImportsToFile(SimulationSettings.ZERO_XML_FILE);

        WriteEnvironmentXMLFile environmentXMLFILE = new WriteEnvironmentXMLFile(SimulationSettings.WORKING_DIRECTORY);
        environmentXMLFILE.writeParametersToFile(ModelParameterSettings.modelParameters);
        SimulationSettings.experimentBuilt = true;
        jButton4.setEnabled(SimulationSettings.experimentBuilt);
    }

    void LoadSettings(String file) {

        /*Return a warning message if the eurace model xml file is not there*/
        try {

            File settingsFile = new File(file);

            if (!settingsFile.exists()) {

                throw new FileNotFoundException();

            }

            ReadXMLFile defValues = new ReadXMLFile(file);

            System.out.println("BP0\n");

            defValues.new ReadClassFromXML(new SimulationSettings(), "SimulationSettings");

            System.out.println("BP1\n");

            File xmlFile = new File(SimulationSettings.EURACE_MODEL_XML);
            if (!xmlFile.exists()) {
                JOptionPane.showMessageDialog(null, "Set the correct path to the model.xml file!");
                FileChooserFromMenuList chooseFile = new FileChooserFromMenuList(SimulationSettings.EURACE_MODEL_XML, false, true, "xml", false);
                chooseFile.openFileChooser();
                SimulationSettings.EURACE_MODEL_XML = chooseFile.getDirectoryOrFile();

            }

            /*Load list of model parameters */
            ReadModelParameter modelXML = new ReadModelParameter();
            modelXML.getFIleListDirectlyFromEuraceModelXML();


            /*Set the parameter values with those from saving file*/
            ArrayList<ModelParameter> tempModelParameter = new ArrayList<ModelParameter>();
            // tempModelParameter = defValues.readModelParameters();

            tempModelParameter = modelXML.GetModelParameterFromModelXMLFiles();

            defValues.new ReadClassFromXML(new ModelParameterSettings(), "modelParameters");

            for (int i = 0; i < ModelParameterSettings.modelParameters.size(); i++) {

                for (int j = 0; j < tempModelParameter.size(); j++) {

                    if (ModelParameterSettings.modelParameters.get(i).name.equals(tempModelParameter.get(j).name)) {

                        if (ModelParameterSettings.modelParameters.get(i).value != null) {

                            tempModelParameter.get(j).value = ModelParameterSettings.modelParameters.get(i).value;

                        }
                    }

                }

            }

            ModelParameterSettings.modelParameters = tempModelParameter;

            /*Set agentList by calling ReadAgentListFromModelXML*/
            agentList = ReadAgentListFromModelXML();

            defValues.new ReadClassFromXML(new AgentSettings(), "agentsSettings");

            /*Search the model.xml files: add variables if there are some new variables which are not contained in the settings; delete those
             *  which are not contained in the model.xml file*/
            /*First: Retrieve the current agent list from the model.xml file*/
            ReadAgentListFromModelXML agentList = new ReadAgentListFromModelXML(SimulationSettings.EURACE_MODEL_XML);
            agentList.GetAgentListModelXMLFiles();

            variableRemoved = false;

            /*Go through the agent list*/
            for (int i = 0; i < agentList.agentList.size(); i++) {

                boolean agentFound = false;

                for (int j = 0; j < AgentSettings.agents.size(); j++) {

                    if (agentList.agentList.get(i).equals(AgentSettings.agents.get(j).agentName)) {

                        agentFound = true;

                        Agent tempAgent = new Agent(agentList.agentList.get(i));

                        for (int k = 0; k < AgentSettings.agents.get(j).variableList.size(); k++) {

                            boolean varFound = false;

                            for (int l = 0; l < tempAgent.variableList.size(); l++) {

                                /*if a variable which is contained in the settings has been found in the var list of the temp agent -> remove it from the temp */
                                if (AgentSettings.agents.get(j).variableList.get(k).name.equals(tempAgent.variableList.get(l).name)) {

                                    varFound = true;
                                    tempAgent.variableList.remove(l);
                                    break;
                                }

                            }

                            /*if variable that is in the settings list has not been found in the current var list o the temp agent -> delete it from the settings list*/
                            if (!varFound) {

                                AgentSettings.agents.get(j).variableList.remove(k);
                                k--;

                                variableRemoved = true;

                            }

                        }

                        /*Add the remaining variables which have not been found in the settings to it*/
                        for (int l = 0; l < tempAgent.variableList.size(); l++) {

                            AgentSettings.agents.get(j).variableList.add(tempAgent.variableList.get(l));

                        }

                    }

                }

                /*if this agent is not found in the agent settings add this agent as a new item to the agent list*/
                if (!agentFound) {

                    AgentSettings.agents.add(new Agent(agentList.agentList.get(i)));

                }

            }

            defValues.new ReadClassFromXML(new PlottingSettings(), "PlottingSettings");

            if (variableRemoved) {

                PlottingSettings.removeDeletedVarsFromVariableInstanceList();

            }

        } catch (Exception e1) {

            JOptionPane.showMessageDialog(null, "No settings found. Select a model.xml File!");

            FileChooserFromMenuList chooseFile = new FileChooserFromMenuList(SimulationSettings.EURACE_MODEL_XML, false, true, "xml", false);
            chooseFile.openFileChooser();
            SimulationSettings.EURACE_MODEL_XML = chooseFile.getDirectoryOrFile();

            JOptionPane.showMessageDialog(null, "Select executable!");

            FileChooserFromMenuList chooseFile2;

            if (SimulationSettings.MAIN_EXECUTABLE.equals(".")) {
                chooseFile2 = new FileChooserFromMenuList(SimulationSettings.EURACE_MODEL_XML, false, false, "", false);
            } else {
                chooseFile2 = new FileChooserFromMenuList(SimulationSettings.MAIN_EXECUTABLE, false, false, "", false);
            }

            chooseFile2.openFileChooser();
            SimulationSettings.MAIN_EXECUTABLE = chooseFile2.getDirectoryOrFile();

            JOptionPane.showMessageDialog(null, "Select 0.xml file!");

            FileChooserFromMenuList chooseFile3;

            if (SimulationSettings.ZERO_XML_FILE.equals("0.xml")) {
                chooseFile3 = new FileChooserFromMenuList(SimulationSettings.EURACE_MODEL_XML, false, true, "xml", false);
            } else {
                chooseFile3 = new FileChooserFromMenuList(SimulationSettings.ZERO_XML_FILE, false, true, "xml", false);
            }

            chooseFile3.openFileChooser();
            SimulationSettings.ZERO_XML_FILE = chooseFile3.getDirectoryOrFile();

            JOptionPane.showMessageDialog(null, "Select path to R scripts!");

            FileChooserFromMenuList chooseFile4 = new FileChooserFromMenuList(SimulationSettings.PATH_TO_RSCRIPTS, true, false, "", false);
            chooseFile4.openFileChooser();
            SimulationSettings.PATH_TO_RSCRIPTS = chooseFile4.getDirectoryOrFile();

            /*Set agent list*/
            agentList = ReadAgentListFromModelXML();
            AgentSettings.agents = new ArrayList<Agent>();
            for (int i = 0; i < agentList.size(); i++) {
                AgentSettings.agents.add(new Agent(agentList.get(i)));
                PlottingSettings.Agent temAgent = (new PlottingSettings()).new Agent(agentList.get(i));
                PlottingSettings.listOfAgentsVariableInstances.add(temAgent);

            }

            /*Read Model parameters*/
            ReadModelParameter modelXML = new ReadModelParameter();
            modelXML.getFIleListDirectlyFromEuraceModelXML();
            ModelParameterSettings.modelParameters = modelXML.GetModelParameterFromModelXMLFiles();

        }

    }

    ArrayList<String> ReadAgentListFromModelXML() {

        ArrayList<String> listOfAgents = new ArrayList<String>();

        try {

            /*Parse the eurace_model.xml*/
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();

            docFactory.setAttribute("http://xml.org/sax/features/namespaces", true);
            docFactory.setAttribute("http://xml.org/sax/features/validation", false);
            docFactory.setAttribute("http://apache.org/xml/features/nonvalidating/load-dtd-grammar", false);
            docFactory.setAttribute("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);

            docFactory.setNamespaceAware(true);
            docFactory.setIgnoringElementContentWhitespace(false);
            docFactory.setIgnoringComments(false);
            docFactory.setValidating(false);

            docFactory.setValidating(false);
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc = docBuilder.parse(new File(SimulationSettings.EURACE_MODEL_XML));

            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("xagent");

            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    listOfAgents.add(getTagValue("name", eElement));

                    //System.out.println("read agent witht name:"+getTagValue("name",eElement));
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return listOfAgents;

    }

    private String getTagValue(String sTag, Element eElement) {
        NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();

        Node nValue = (Node) nlList.item(0);

        //    System.out.println("Check:   "+sTag+"   "+nValue);
        //nValue.equals(null);
        if (nValue == null) {
            return "No description avaiable";
        } else {
            return nValue.getNodeValue();
        }
    }

    void newDrawAgentTable() {

        String[] colHeaders = {"Agent", "Record", "Period", "Phase"};

        //AgentTableModel tabAgentsModel;
        tabAgentsModel = new AgentTableModel(colHeaders, AgentSettings.agents);

        jTable1.setModel(tabAgentsModel);

    }

    void drawAgentTable() {

        try {

            lcRightPanel.remove(listScrollAgentTable);
            lcRightPanel.validate();
        } catch (Exception e) {

            System.out.println();

        }
        String[] colHeaders = {"Agent", "Record", "Period", "Phase"};
        tabAgentsModel = new AgentTableModel(colHeaders, AgentSettings.agents);
        DrawStoreOptionTable tabAgents = new DrawStoreOptionTable(tabAgentsModel, colHeaders);

        listScrollAgentTable = new JScrollPane(tabAgents);
        listScrollAgentTable.setPreferredSize(new Dimension(280, 179));
        settingContainer.g.gridx = 0;
        settingContainer.g.gridy = 0;
        settingContainer.lcRightPanel.add(listScrollAgentTable, settingContainer.g);
        settingContainer.lcRightPanel.validate();

    }

    void SaveSettings() {

        /*Safe the settings to XML file*/
        System.out.println("Print WORKING_DIRECTORY" + SimulationSettings.WORKING_DIRECTORY);
        writeGeneralSettingsToFile wrSet = new writeGeneralSettingsToFile("PathToWorkspace.txt", false);

        wrSet.writeToFile(SimulationSettings.WORKING_DIRECTORY);

        WriteSettingsXMLFile xmlFileWD = new WriteSettingsXMLFile(SimulationSettings.WORKING_DIRECTORY, "GlobalSettings.xml", "StoredSettings");
        xmlFileWD.createXMLFile();

        //xmlFileWD.AddRootElement("PlottingSettings");
        //xmlFileWD.new WriteClassFromXML(new PlottingSettings(),"PlottingSettings");
        xmlFileWD.AddRootElement("PlottingSettings");
        xmlFileWD.new WriteClassFromXML(new PlottingSettings(), "PlottingSettings", false);

        xmlFileWD.AddRootElement("SimulationSettings");
        xmlFileWD.new WriteClassFromXML(new SimulationSettings(), "SimulationSettings", false);

        xmlFileWD.AddRootElement("bashExperiments");
        xmlFileWD.new WriteClassFromXML(new BatchExperiments(), "agentsSettings", false);

        xmlFileWD.AddRootElement("agentsSettings");
        xmlFileWD.new WriteClassFromXML(new AgentSettings(), "agentsSettings", false);

        /*Save the parameters only in the working directory*/
        xmlFileWD.AddRootElement("modelParameters");
        xmlFileWD.new WriteClassFromXML(new ModelParameterSettings(), "modelParameters", false);

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
            java.util.logging.Logger.getLogger(SimulationSettingsFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimulationSettingsFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimulationSettingsFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimulationSettingsFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimulationSettingsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TestLabel;
    private javax.swing.JCheckBox addLegendCheckboxNew;
    private javax.swing.JCheckBox batchRunCheckBoxNew;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox coloredPlotsCheckboxNew;
    private javax.swing.JComboBox fileTypePlotsComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JCheckBox parameterAnalysisCheckBoxNew;
    private javax.swing.JCheckBox singleRunAnalysisCheckboxNew;
    private javax.swing.JTextField transitionPhaseTextFieldNew;
    // End of variables declaration//GEN-END:variables
}
