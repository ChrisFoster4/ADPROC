/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adproc_coursework;

import java.text.DecimalFormat;
import javax.swing.table.*;

/**
 * Diameter and length are text fields Grade , colours and quantity are combo
 * boxes Insulation , reinforcement and chemical resistance are radio buttons
 * The submit button is a Button
 */
public class newPipeForm extends javax.swing.JFrame {

	/**
	 * Creates new form newPipeForm
	 */
	public newPipeForm() {
		initComponents();
		//Makes the error labels invisible to the user at the start without having to deal with .setVisible
		DiameterErrorReportingLabel.setText(" ");
		QuantityErrorReportingLabel.setText(" ");
		LengthErrorReportingLabel.setText(" ");
		DeleteButtonErrorReportingLabel.setText(" ");
		//Initialising value of TotalDisplayLabel allows for the value of new pipe to be added too it
		TotalDisplayLabel.setText("0");
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jScrollPane2 = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable();
                DiameterLabel = new javax.swing.JLabel();
                LengthLabel = new javax.swing.JLabel();
                DiameterTextField = new javax.swing.JTextField();
                LengthTextField = new javax.swing.JTextField();
                GradeLabel = new javax.swing.JLabel();
                ColoursLabel = new javax.swing.JLabel();
                GradeComboBox = new javax.swing.JComboBox<>();
                ColoursComboBox = new javax.swing.JComboBox<>();
                QuantityLabel = new javax.swing.JLabel();
                SubmitButton = new javax.swing.JButton();
                InsulationCheckBox = new javax.swing.JCheckBox();
                ReinforcementCheckBox = new javax.swing.JCheckBox();
                ChemicalResistanceCheckBox = new javax.swing.JCheckBox();
                LengthErrorReportingLabel = new javax.swing.JLabel();
                QuantityTextField = new javax.swing.JTextField();
                QuantityErrorReportingLabel = new javax.swing.JLabel();
                DiameterErrorReportingLabel = new javax.swing.JLabel();
                SubmitFailiureLabel = new javax.swing.JLabel();
                BasketTextBoxLabel = new javax.swing.JLabel();
                jScrollPane3 = new javax.swing.JScrollPane();
                BasketTable = new javax.swing.JTable();
                TotalNameLabel = new javax.swing.JLabel();
                TotalDisplayLabel = new javax.swing.JLabel();
                DeletePipeButton = new javax.swing.JButton();
                DeleteButtonErrorReportingLabel = new javax.swing.JLabel();
                EmptyBasketButton = new javax.swing.JButton();

                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null}
                        },
                        new String [] {
                                "Title 1", "Title 2", "Title 3", "Title 4"
                        }
                ));
                jScrollPane2.setViewportView(jTable1);

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                DiameterLabel.setText("Diameter(inches)");

                LengthLabel.setText("Length(m)");

                DiameterTextField.setText("Enter Diameter");
                DiameterTextField.setMinimumSize(new java.awt.Dimension(99, 19));
                DiameterTextField.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                DiameterTextFieldMouseClicked(evt);
                        }
                });
                DiameterTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                DiameterTextFieldKeyReleased(evt);
                        }
                });

                LengthTextField.setText("Enter Length");
                LengthTextField.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                LengthTextFieldMouseClicked(evt);
                        }
                });
                LengthTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                LengthTextFieldKeyReleased(evt);
                        }
                });

                GradeLabel.setText("Grade");

                ColoursLabel.setText("Colours");

                GradeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

                ColoursComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Colours", "One Colour", "Two Colours" }));

                QuantityLabel.setText("Quantity");

                SubmitButton.setText("Submit");
                SubmitButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                SubmitButtonActionPerformed(evt);
                        }
                });

                InsulationCheckBox.setText("Insulation");

                ReinforcementCheckBox.setText("Reinforcement");

                ChemicalResistanceCheckBox.setText("Chemical Resistance");

                LengthErrorReportingLabel.setText("LengthErrorReportingLabel");

                QuantityTextField.setText("Quantity Wanted");
                QuantityTextField.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                QuantityTextFieldMouseClicked(evt);
                        }
                });
                QuantityTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                QuantityTextFieldKeyReleased(evt);
                        }
                });

                QuantityErrorReportingLabel.setText("QuantityErrorReportingLabel");

                DiameterErrorReportingLabel.setText("DiameterErrorReportingLabel");

                BasketTextBoxLabel.setText("Your basket");

                BasketTable.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "Grade of plastic", "Length of pipe(m)", "Diameter(inches)", "Number of colours", "Insultation", "Reinforcement", "Quantity", "Price"
                        }
                ) {
                        Class[] types = new Class [] {
                                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
                        };
                        boolean[] canEdit = new boolean [] {
                                false, false, false, true, true, false, true, false
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types [columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                jScrollPane3.setViewportView(BasketTable);
                if (BasketTable.getColumnModel().getColumnCount() > 0) {
                        BasketTable.getColumnModel().getColumn(0).setResizable(false);
                        BasketTable.getColumnModel().getColumn(1).setResizable(false);
                        BasketTable.getColumnModel().getColumn(2).setResizable(false);
                        BasketTable.getColumnModel().getColumn(3).setResizable(false);
                        BasketTable.getColumnModel().getColumn(4).setResizable(false);
                        BasketTable.getColumnModel().getColumn(5).setResizable(false);
                        BasketTable.getColumnModel().getColumn(6).setResizable(false);
                        BasketTable.getColumnModel().getColumn(7).setResizable(false);
                }

                TotalNameLabel.setText("Total");

                TotalDisplayLabel.setText("TotalDisplayLabel");

                DeletePipeButton.setText("Delete Pipe");
                DeletePipeButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                DeletePipeButtonActionPerformed(evt);
                        }
                });

                DeleteButtonErrorReportingLabel.setText("DeletePipeErrorReportingLabel");

                EmptyBasketButton.setText("Empty Basket");
                EmptyBasketButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                EmptyBasketButtonActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jScrollPane3)
                                                .addContainerGap())
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(GradeLabel)
                                                        .addComponent(DiameterLabel)
                                                        .addComponent(DiameterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(GradeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(273, 397, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(LengthLabel)
                                                        .addComponent(ColoursLabel)
                                                        .addComponent(ColoursComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(LengthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(54, 54, 54))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(DiameterErrorReportingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(LengthErrorReportingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(QuantityLabel)
                                                                        .addComponent(BasketTextBoxLabel)
                                                                        .addComponent(QuantityErrorReportingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(QuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(InsulationCheckBox)
                                                                                        .addComponent(ReinforcementCheckBox)
                                                                                        .addComponent(ChemicalResistanceCheckBox))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(SubmitFailiureLabel)
                                                                                .addGap(141, 141, 141)))
                                                                .addComponent(SubmitButton)))
                                                .addContainerGap())))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(EmptyBasketButton)
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(TotalDisplayLabel))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(DeletePipeButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(TotalNameLabel)))
                                .addGap(30, 30, 30))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addComponent(DeleteButtonErrorReportingLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(DiameterLabel)
                                        .addComponent(LengthLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(DiameterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LengthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(DiameterErrorReportingLabel))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(LengthErrorReportingLabel)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(GradeLabel)
                                        .addComponent(ColoursLabel))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(GradeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ColoursComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(InsulationCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ReinforcementCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(QuantityLabel)
                                        .addComponent(ChemicalResistanceCheckBox))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(QuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(17, 17, 17)
                                                                .addComponent(SubmitButton))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(SubmitFailiureLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(QuantityErrorReportingLabel)
                                                                .addGap(19, 19, 19)
                                                                .addComponent(BasketTextBoxLabel)))
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(TotalNameLabel))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(DeletePipeButton)
                                                        .addComponent(EmptyBasketButton))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TotalDisplayLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DeleteButtonErrorReportingLabel)
                                .addContainerGap())
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed

		DeleteButtonErrorReportingLabel.setText(" "); //Stops pipe deletion error message staying around too long
		//If there are no reported errors with the users input
		if ((!LengthErrorReportingLabel.getText().equals("")) || (!DiameterErrorReportingLabel.getText().equals("")) || (!QuantityErrorReportingLabel.getText().equals(""))) {
			SubmitFailiureLabel.setText("New pipe not created.Please fix errors with input first");

			//If they have entered input in all of the text fields
		} else if ((LengthTextField.getText().equals("")) || (DiameterTextField.getText().equals("")) || (QuantityTextField.getText().equals(""))) {
			SubmitFailiureLabel.setText("New pipe not created.Requireed input is missing");
		} else {

			int gradeSelected = Integer.parseInt((String) GradeComboBox.getSelectedItem());// "(int)" converts from an object to a int
			String colourSelectedString = (String) ColoursComboBox.getSelectedItem();// "(int)" converts from an object to a int
			int colourSelected = 0;
			if (colourSelectedString.equals("One Colour")) {
				colourSelected = 1;
			} else if (colourSelectedString.equals("Two Colours")) {
				colourSelected = 2;
			}

			boolean insulationSelected = InsulationCheckBox.isSelected();
			boolean reinforcementSelected = ReinforcementCheckBox.isSelected();
			int pipeToCreate = choosePipe(gradeSelected, colourSelected, insulationSelected, reinforcementSelected);
			if (pipeToCreate == 0) {
				SubmitFailiureLabel.setText("Sorry we do not offer a pipe with the criteria you have selected");
			} else {
				SubmitFailiureLabel.setText("New pipe successfully created!");
				//Creating the new pipe object
				float Length = Float.parseFloat(LengthTextField.getText());
				float Diameter = Float.parseFloat(DiameterTextField.getText());
				int Quantity = Integer.parseInt(QuantityTextField.getText());
				boolean ChemicalResistance = ChemicalResistanceCheckBox.isSelected();
				DefaultTableModel BasketTableModel = (DefaultTableModel) BasketTable.getModel();
				switch (pipeToCreate) {
					case 1:
						PipeTypeI pipe1 = new PipeTypeI(gradeSelected, Length, Diameter, colourSelected, Quantity, ChemicalResistance, insulationSelected, reinforcementSelected);
//						BasketTextBox.setText(BasketTextBox.getText() + pipe1.getPipeData() + "\n");//Putting the newly created pipe in the basket
						String[] pipeData = pipe1.getPipeData();
						double price = (roundToTwoPlaces(Double.parseDouble(pipeData[7])));
						System.out.println("price" + price);
						pipeData[7] = "Price: £" + (price);
						BasketTableModel.addRow(pipeData);
						addToTotal(price);
						break;
					case 2:
						PipeTypeII pipe2 = new PipeTypeII(gradeSelected, Length, Diameter, colourSelected, Quantity, ChemicalResistance, insulationSelected, reinforcementSelected);
						//TODO code like in pipe 1 here
						break;
					case 3:
						PipeTypeIII pipe3 = new PipeTypeIII(gradeSelected, Length, Diameter, colourSelected, Quantity, ChemicalResistance, insulationSelected, reinforcementSelected);
						//TODO code like in pipe 1 here
						break;
					case 4:
						PipeTypeIV pipe4 = new PipeTypeIV(gradeSelected, Length, Diameter, colourSelected, Quantity, ChemicalResistance, insulationSelected, reinforcementSelected);
						//TODO code like in pipe 1 here
						break;
					case 5:
						PipeTypeV pipe5 = new PipeTypeV(gradeSelected, Length, Diameter, colourSelected, Quantity, ChemicalResistance, insulationSelected, reinforcementSelected);
						//TODO code like in pipe 1 here
						break;

				}
				resetInputs(); //Sets all the input fields back to how they are at the start of the program
			}
		}
	}

	private void resetInputs() {
		//Resetting text boxes
		DiameterTextField.setText("Enter Diameter");
		LengthTextField.setText("Enter Length");
		QuantityTextField.setText("Quantity Wanted");
		//Resetting comboboxes
		GradeComboBox.setSelectedIndex(0);
		ColoursComboBox.setSelectedIndex(0);
		//Reseting radio buttons
		InsulationCheckBox.setSelected(false);
		ReinforcementCheckBox.setSelected(false);
		ChemicalResistanceCheckBox.setSelected(false);

	}

	private void addToTotal(double amount) {
		//A negative number can be passed  
		String currentContents = TotalDisplayLabel.getText();
		String newContents = Double.toString(roundToTwoPlaces(Double.parseDouble(currentContents) + amount));


		//Avoiding a tiny negative number being occasionally shown when all pipes removed
		if (Double.parseDouble(newContents) <= 0) {
			newContents = "0";
		}
		TotalDisplayLabel.setText(newContents);
	}
	private double roundToTwoPlaces(double number){
		DecimalFormat rounder = new DecimalFormat("#.##");
		return Double.valueOf(rounder.format(number)); //TODO Is this allowed?
	}

	private int choosePipe(int grade, int colour, boolean insulation, boolean reinforcement) { //TODO further test this logic
		if (grade <= 3 && grade > 0 && colour == 0 && insulation == false && reinforcement == false) {
			return 1;
		} else if (grade <= 4 && grade > 1 && colour == 1 && insulation == false && reinforcement == false) {
			//create a object of pipe II
			return 2;
		} else if (grade <= 5 && grade > 1 && colour == 2 && insulation == false && reinforcement == false) {
			//create a object of pipe III
			return 3;
		} else if (grade <= 5 && grade > 1 && colour == 2 && insulation == true && reinforcement == false) {
			//create a object of pipe IV
			return 4;
		} else if (grade <= 5 && grade > 2 && colour == 2 && insulation == true && reinforcement == true) {
			//create a object of pipe V
			return 5;
		} else {
			return 0;
		}
        }//GEN-LAST:event_SubmitButtonActionPerformed

//3 methods below remove initial text from text boxes when they are clicked on
        private void DiameterTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiameterTextFieldMouseClicked
		//When user clicks to edit the text in the text field
		DiameterTextField.setText("");
        }//GEN-LAST:event_DiameterTextFieldMouseClicked

        private void LengthTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LengthTextFieldMouseClicked
		//When user clicks to edit the text in the text field
		LengthTextField.setText("");
        }//GEN-LAST:event_LengthTextFieldMouseClicked

        private void QuantityTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuantityTextFieldMouseClicked
		//When user clicks to edit the text in the text field
		QuantityTextField.setText("");
        }//GEN-LAST:event_QuantityTextFieldMouseClicked

        private void LengthTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LengthTextFieldKeyReleased
		//Checks if it is a valid int or float and is less than 6m long
		Boolean ValidInt = TextBoxValidatorMethods.isValidInt(LengthTextField.getText());
		Boolean ValidFloat = TextBoxValidatorMethods.isValidFloat(LengthTextField.getText());
		if (!(ValidInt || ValidFloat)) {
			LengthErrorReportingLabel.setText("Invalid input in length");
		} else if (Float.parseFloat(LengthTextField.getText()) <= 6) {
			LengthErrorReportingLabel.setText("");
		} else {
			LengthErrorReportingLabel.setText("Length cannot be more than 6");
		}
        }//GEN-LAST:event_LengthTextFieldKeyReleased

        private void DiameterTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DiameterTextFieldKeyReleased
		Boolean ValidInt = TextBoxValidatorMethods.isValidInt(DiameterTextField.getText());
		Boolean ValidFloat = TextBoxValidatorMethods.isValidFloat(DiameterTextField.getText());
		if (!(ValidInt || ValidFloat)) {
			DiameterErrorReportingLabel.setText("Invalid input in diameter");
        }//GEN-LAST:event_DiameterTextFieldKeyReleased
		else {
			DiameterErrorReportingLabel.setText("");
		}
	}

        private void QuantityTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuantityTextFieldKeyReleased
		//Only allow integers.You can't order 5.5 pipes
		Boolean ValidInt = TextBoxValidatorMethods.isValidInt(QuantityTextField.getText());
		if (!ValidInt) {
			QuantityErrorReportingLabel.setText("Invalid input in quantity");
		} else {
			QuantityErrorReportingLabel.setText("");
		}
        }//GEN-LAST:event_QuantityTextFieldKeyReleased

        private void DeletePipeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletePipeButtonActionPerformed
		SubmitFailiureLabel.setText("");//Removing residual messages
		try {
			int currentlySelectedRow = BasketTable.getSelectedRow();
			String contentsOfPriceColumn = (String) (BasketTable.getModel().getValueAt(currentlySelectedRow, 7));
			double valueToSubtract = Double.parseDouble(contentsOfPriceColumn.replaceAll(".*£", "")); //Remove formatting text for the price column. "Price: £123" -> 123
			addToTotal(-valueToSubtract);

			((DefaultTableModel) BasketTable.getModel()).removeRow(currentlySelectedRow);
			DeleteButtonErrorReportingLabel.setText("");
			//Subtracting the price of the deleted pipe from the total

		} catch (ArrayIndexOutOfBoundsException e) {
			//If no pipe is selected the index value will be -1
			DeleteButtonErrorReportingLabel.setText("No pipe deleted.Have you selected one?");
		}
        }//GEN-LAST:event_DeletePipeButtonActionPerformed

        private void EmptyBasketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmptyBasketButtonActionPerformed
		SubmitFailiureLabel.setText("");//Removing residual messages
		((DefaultTableModel) BasketTable.getModel()).setRowCount(0);
		addToTotal(-Double.parseDouble(TotalDisplayLabel.getText().replaceAll(".*£", "")));


        }//GEN-LAST:event_EmptyBasketButtonActionPerformed
	/**
	 * @param args the command line arguments
	 */
	public static void main() {
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
			java.util.logging.Logger.getLogger(newPipeForm.class
				.getName()).log(java.util.logging.Level.SEVERE, null, ex);

		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(newPipeForm.class
				.getName()).log(java.util.logging.Level.SEVERE, null, ex);

		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(newPipeForm.class
				.getName()).log(java.util.logging.Level.SEVERE, null, ex);

		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(newPipeForm.class
				.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new newPipeForm().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JTable BasketTable;
        private javax.swing.JLabel BasketTextBoxLabel;
        private javax.swing.JCheckBox ChemicalResistanceCheckBox;
        private javax.swing.JComboBox<String> ColoursComboBox;
        private javax.swing.JLabel ColoursLabel;
        private javax.swing.JLabel DeleteButtonErrorReportingLabel;
        private javax.swing.JButton DeletePipeButton;
        private javax.swing.JLabel DiameterErrorReportingLabel;
        private javax.swing.JLabel DiameterLabel;
        private javax.swing.JTextField DiameterTextField;
        private javax.swing.JButton EmptyBasketButton;
        private javax.swing.JComboBox<String> GradeComboBox;
        private javax.swing.JLabel GradeLabel;
        private javax.swing.JCheckBox InsulationCheckBox;
        private javax.swing.JLabel LengthErrorReportingLabel;
        private javax.swing.JLabel LengthLabel;
        private javax.swing.JTextField LengthTextField;
        private javax.swing.JLabel QuantityErrorReportingLabel;
        private javax.swing.JLabel QuantityLabel;
        private javax.swing.JTextField QuantityTextField;
        private javax.swing.JCheckBox ReinforcementCheckBox;
        private javax.swing.JButton SubmitButton;
        private javax.swing.JLabel SubmitFailiureLabel;
        private javax.swing.JLabel TotalDisplayLabel;
        private javax.swing.JLabel TotalNameLabel;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPane3;
        private javax.swing.JTable jTable1;
        // End of variables declaration//GEN-END:variables
}
