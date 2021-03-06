/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditor;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.StyledEditorKit;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

/**
 *
 * @author alexp
 */
public class UI extends javax.swing.JFrame {

    private boolean textChanged;
    private String fileName = "";
    private String progName = "Text Editor";
    private String dir;
    private String fn;

    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();
        initButtons();
        initUndoRedo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        colorDialog = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        jToolBar1 = new javax.swing.JToolBar();
        newButton = new javax.swing.JButton();
        openButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        colorButton = new javax.swing.JButton();
        fonts = new javax.swing.JComboBox<>();
        fontSize = new javax.swing.JComboBox<>();
        boldButton = new javax.swing.JButton();
        italicButton = new javax.swing.JButton();
        underlineButton = new javax.swing.JButton();
        imageButton = new javax.swing.JButton();
        outer = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        textPane = new TextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newFile = new javax.swing.JMenuItem();
        openFile = new javax.swing.JMenuItem();
        saveFile = new javax.swing.JMenuItem();
        saveAs = new javax.swing.JMenuItem();
        quitFIle = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        undo = new javax.swing.JMenuItem();
        redo = new javax.swing.JMenuItem();
        copy = new javax.swing.JMenuItem(new DefaultEditorKit.CopyAction());
        cut = new javax.swing.JMenuItem(new DefaultEditorKit.CutAction());
        paste = new javax.swing.JMenuItem(new DefaultEditorKit.PasteAction());
        selectAll = new javax.swing.JMenuItem();
        clear = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();

        colorDialog.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        javax.swing.GroupLayout colorDialogLayout = new javax.swing.GroupLayout(colorDialog.getContentPane());
        colorDialog.getContentPane().setLayout(colorDialogLayout);
        colorDialogLayout.setHorizontalGroup(
            colorDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jColorChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );
        colorDialogLayout.setVerticalGroup(
            colorDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jColorChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Untitled | Text Editor");
        setAlwaysOnTop(true);
        setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jToolBar1.setRollover(true);
        jToolBar1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        newButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/icons/new.png"))); // NOI18N
        newButton.setToolTipText("New");
        newButton.setFocusable(false);
        newButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(newButton);

        openButton.setFont(getFont());
        openButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/icons/open.png"))); // NOI18N
        openButton.setToolTipText("Open");
        openButton.setFocusable(false);
        openButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        openButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(openButton);

        saveButton.setFont(getFont());
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/icons/save.png"))); // NOI18N
        saveButton.setToolTipText("Save");
        saveButton.setFocusable(false);
        saveButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        saveButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(saveButton);

        clearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/icons/clear.png"))); // NOI18N
        clearButton.setToolTipText("Clear");
        clearButton.setFocusable(false);
        clearButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clearButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(clearButton);

        colorButton.setFont(getFont());
        colorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/icons/color.png"))); // NOI18N
        colorButton.setToolTipText("Color");
        colorButton.setFocusable(false);
        colorButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        colorButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        colorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(colorButton);

        fonts.setFont(getFont());
        fonts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Serif", "Times New Roman", "FreeMono", "Courier 10 Pitch", "Century Schoolbook L" }));
        fonts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontsActionPerformed(evt);
            }
        });
        jToolBar1.add(fonts);

        fontSize.setFont(getFont());
        fontSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "12", "14", "16", "18", "20", "22" }));
        fontSize.setSelectedIndex(2);
        fontSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontSizeActionPerformed(evt);
            }
        });
        jToolBar1.add(fontSize);

        boldButton.setFont(getFont());
        boldButton.setToolTipText("Bold");
        boldButton.setFocusable(false);
        boldButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boldButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(boldButton);

        italicButton.setFont(getFont());
        italicButton.setToolTipText("Italic");
        italicButton.setFocusable(false);
        italicButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        italicButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(italicButton);

        underlineButton.setFont(getFont());
        underlineButton.setToolTipText("Underline");
        underlineButton.setFocusable(false);
        underlineButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        underlineButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(underlineButton);

        imageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/icons/image.png"))); // NOI18N
        imageButton.setFocusable(false);
        imageButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imageButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        imageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(imageButton);

        outer.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        outer.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setFont(getFont());

        textPane.setFont(getFont());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 786, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(textPane, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(textPane, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE))
        );

        outer.setViewportView(jPanel1);

        jMenuBar1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        fileMenu.setText("File");
        fileMenu.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        newFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newFile.setFont(getFont());
        newFile.setText("New");
        newFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileActionPerformed(evt);
            }
        });
        fileMenu.add(newFile);

        openFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openFile.setFont(getFont());
        openFile.setText("Open");
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });
        fileMenu.add(openFile);

        saveFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveFile.setFont(getFont());
        saveFile.setText("Save");
        saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileActionPerformed(evt);
            }
        });
        fileMenu.add(saveFile);

        saveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        saveAs.setText("Save As...");
        saveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsActionPerformed(evt);
            }
        });
        fileMenu.add(saveAs);

        quitFIle.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        quitFIle.setFont(getFont());
        quitFIle.setText("Quit");
        quitFIle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitFIleActionPerformed(evt);
            }
        });
        fileMenu.add(quitFIle);

        jMenuBar1.add(fileMenu);

        editMenu.setText("Edit");
        editMenu.setFont(getFont());

        undo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        undo.setFont(getFont());
        undo.setText("Undo");
        editMenu.add(undo);

        redo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        redo.setFont(getFont());
        redo.setText("Redo");
        editMenu.add(redo);

        copy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copy.setFont(getFont());
        copy.setText("Copy");
        editMenu.add(copy);

        cut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cut.setFont(getFont());
        cut.setText("Cut");
        editMenu.add(cut);

        paste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        paste.setFont(getFont());
        paste.setText("Paste");
        editMenu.add(paste);

        selectAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        selectAll.setFont(getFont());
        selectAll.setText("Select all");
        editMenu.add(selectAll);

        clear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        clear.setFont(getFont());
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        editMenu.add(clear);

        jMenuBar1.add(editMenu);

        helpMenu.setText("Help");
        helpMenu.setFont(getFont());

        about.setFont(getFont());
        about.setText("About project");
        helpMenu.add(about);

        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(outer)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outer))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initButtons() {
        Action action = new StyledEditorKit.BoldAction();
        action.putValue(Action.NAME, "");
        boldButton.setAction(action);
        boldButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/icons/bold.png")));
        
        action = new StyledEditorKit.ItalicAction();
        action.putValue(Action.NAME, "");
        italicButton.setAction(action);
        italicButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/icons/italic.png")));
        
        action = new StyledEditorKit.UnderlineAction();
        action.putValue(Action.NAME, "");
        underlineButton.setAction(action);
        underlineButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/icons/underline.png")));
    }
   
    private void initUndoRedo() {
        UndoManager manager = new UndoManager();
        textPane.getDocument().addUndoableEditListener(manager);

        Action undoAction = new UndoAction(manager);
        Action redoAction = new RedoAction(manager);
        
        undo.addActionListener(undoAction);
        redo.addActionListener(redoAction);
    }
   
    
    private void colorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorButtonActionPerformed
        Color newColor = JColorChooser.showDialog(null,"Choose Color", null);
        Action action = new StyledEditorKit.ForegroundAction(null, newColor);
        action.actionPerformed(evt);
    }//GEN-LAST:event_colorButtonActionPerformed

    private void fontSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontSizeActionPerformed
        JComboBox cb = (JComboBox)evt.getSource();
        String size = (String)cb.getSelectedItem();
        Action action = new StyledEditorKit.FontSizeAction(size, Integer.valueOf(size));
        action.actionPerformed(evt);
    }//GEN-LAST:event_fontSizeActionPerformed

    private void fontsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontsActionPerformed
        JComboBox cb = (JComboBox)evt.getSource();
        String font = (String)cb.getSelectedItem();
        Action action = new StyledEditorKit.FontFamilyAction(font, font);
        action.actionPerformed(evt);
    }//GEN-LAST:event_fontsActionPerformed

    private void newFile() {
        if (textPane.getText().length() > 0) {
            int option = JOptionPane.showConfirmDialog(null, "Do you want to save?",
                                                        progName, JOptionPane.YES_NO_CANCEL_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                saveFileActionPerformed(null);                
            } else if (option == JOptionPane.CANCEL_OPTION){
                return;
            }
        } 
        setTitle("Untitled | " + progName);
        fileName = "";
        textPane.setText("");
        textChanged = false;  
    }
    private void saveAs() {
        JFileChooser fileChoose = new JFileChooser();
        int option = fileChoose.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            try {
                File file = fileChoose.getSelectedFile();
                fileName = file.getPath();
                setTitle(fileName + " | " + progName);
                BufferedWriter out;
                out = new BufferedWriter(new FileWriter(file.getPath()));
                out.write(textPane.getText());
                out.close();               
            } catch (IOException ex) {
                Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
            }      
        }
    }
    
    private void save() {
        try {
            BufferedWriter out;
            out = new BufferedWriter(new FileWriter(fileName));
            out.write(textPane.getText());
            out.close();
        } catch (IOException ex) {
                Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    private void open() {
        int option;
        if (textPane.getText().length() > 0) {
            option = JOptionPane.showConfirmDialog(null, "Do you want to save?",
                                                        progName, JOptionPane.YES_NO_CANCEL_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                saveFileActionPerformed(null);                
            } else if (option == JOptionPane.CANCEL_OPTION){
                return;
            }
        }
        JFileChooser open = new JFileChooser();
        option = open.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            try {
                textPane.setText("");
                fileName = open.getSelectedFile().getPath();
                setTitle(fileName + " | " + progName);
                Scanner scan = new Scanner(new FileReader(fileName));
                StringBuilder string = new StringBuilder();
                while (scan.hasNext()) 
                    string.append(scan.nextLine()).append("\n");
                textPane.setText(string.toString());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void quit() {
        if (textPane.getText().length() > 0) {
            int option = JOptionPane.showConfirmDialog(null, "Do you want to save?",
                                                        progName, JOptionPane.YES_NO_CANCEL_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                saveFileActionPerformed(null);                
            } else if (option == JOptionPane.CANCEL_OPTION){
                return;
            }
        }
        System.exit(0);
    }
    
    
    private void saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileActionPerformed
        if (fileName.equals(""))
            saveAs();
        else 
            save();
    }//GEN-LAST:event_saveFileActionPerformed

    private void saveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsActionPerformed
        saveAs();
    }//GEN-LAST:event_saveAsActionPerformed

    private void newFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileActionPerformed
        newFile();
    }//GEN-LAST:event_newFileActionPerformed

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
        open();
    }//GEN-LAST:event_openFileActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        textPane.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        textPane.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void quitFIleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitFIleActionPerformed
        quit();
    }//GEN-LAST:event_quitFIleActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        quit();
    }//GEN-LAST:event_formWindowClosing

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        newFile();
    }//GEN-LAST:event_newButtonActionPerformed

    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonActionPerformed
        open();
    }//GEN-LAST:event_openButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        saveFileActionPerformed(null);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void imageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageButtonActionPerformed
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter picture = new FileNameExtensionFilter("JPEG files (*.png)", "png");
        fc.setFileFilter(picture);
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        if (fc.showDialog(UI.this, "Insert")!=JFileChooser.APPROVE_OPTION)  return;
        String pictureName = fc.getSelectedFile().getAbsolutePath();

        // If no text is entered for the file name, refresh the dialog box
        if (pictureName==null) return;

        try 
        {
            BufferedImage img = ImageIO.read(new File(pictureName));
            ImageIcon pictureImage = new ImageIcon(img);
            textPane.insertIcon(pictureImage);
        } 

        catch (IOException e) 
        {
            JOptionPane.showMessageDialog(this, "Could not find file");
        }
    }//GEN-LAST:event_imageButtonActionPerformed
    
    public class UndoAction extends AbstractAction {
        
        private UndoManager manager;
        
        public UndoAction(UndoManager manager) {
            this.manager = manager;
            setEnabled(false);
        }

        @Override
        public void actionPerformed(ActionEvent evt) {
            try {
                if (manager.canUndo())
                    manager.undo();
            } catch (CannotUndoException e) {
                e.printStackTrace();
            }
            updateUndoState();
        }
        
        private void updateUndoState() {
            if (manager.canUndo()) {
                setEnabled(true);
            } else {
                setEnabled(false);
            }
        }
    }

    public class RedoAction extends AbstractAction {
        
        private UndoManager manager;
        
        public RedoAction(UndoManager manager) {
            this.manager = manager;
            setEnabled(false);
        }

        @Override
        public void actionPerformed(ActionEvent evt) {
            try {
                if(manager.canRedo())
                    manager.redo();
            } catch (CannotRedoException e) {
                e.printStackTrace();
            }
            updateUndoState();
        }
        
        private void updateUndoState() {
            if (manager.canRedo()) {
                setEnabled(true);
            } else {
                setEnabled(false);
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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem about;
    private javax.swing.JButton boldButton;
    private javax.swing.JMenuItem clear;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton colorButton;
    private javax.swing.JDialog colorDialog;
    private javax.swing.JMenuItem copy;
    private javax.swing.JMenuItem cut;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JComboBox<String> fontSize;
    private javax.swing.JComboBox<String> fonts;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton imageButton;
    private javax.swing.JButton italicButton;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton newButton;
    private javax.swing.JMenuItem newFile;
    private javax.swing.JButton openButton;
    private javax.swing.JMenuItem openFile;
    private javax.swing.JScrollPane outer;
    private javax.swing.JMenuItem paste;
    private javax.swing.JMenuItem quitFIle;
    private javax.swing.JMenuItem redo;
    private javax.swing.JMenuItem saveAs;
    private javax.swing.JButton saveButton;
    private javax.swing.JMenuItem saveFile;
    private javax.swing.JMenuItem selectAll;
    private javax.swing.JTextPane textPane;
    private javax.swing.JButton underlineButton;
    private javax.swing.JMenuItem undo;
    // End of variables declaration//GEN-END:variables

}
