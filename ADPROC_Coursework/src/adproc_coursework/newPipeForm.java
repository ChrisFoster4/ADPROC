/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adproc_coursework;

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
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

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
                jScrollPane1 = new javax.swing.JScrollPane();
                BasketTextBox = new javax.swing.JTextArea();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                DiameterLabel.setText("Diameter(inches)");

                LengthLabel.setText("Length(m)");

                DiameterTextField.setText("Enter Diameter");
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

                GradeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "3", "4", "5" }));

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

                BasketTextBox.setColumns(20);
                BasketTextBox.setRows(5);
                jScrollPane1.setViewportView(BasketTextBox);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1)
                                                .addContainerGap())
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(GradeLabel)
                                                        .addComponent(DiameterLabel)
                                                        .addComponent(DiameterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(GradeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(QuantityLabel)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 442, Short.MAX_VALUE)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(InsulationCheckBox)
                                                                                        .addComponent(ReinforcementCheckBox)
                                                                                        .addComponent(ChemicalResistanceCheckBox))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(BasketTextBoxLabel)
                                                                                .addGap(380, 591, Short.MAX_VALUE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(QuantityErrorReportingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addGap(185, 185, 185)
                                                                                .addComponent(SubmitFailiureLabel)
                                                                                .addGap(141, 141, 141)))
                                                                .addComponent(SubmitButton))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(QuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addContainerGap())))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed

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
			System.out.println("pipeToCreate = " + pipeToCreate); //TODO remove only for debugging
			if (pipeToCreate == 0) {
				SubmitFailiureLabel.setText("Sorry we do not offer a pipe with the criteria you have selected");
			} else {
				SubmitFailiureLabel.setText("New pipe successfully created!");
				//Creating the new pipe object
				int Length = Integer.parseInt(LengthTextField.getText());
				int Diameter = Integer.parseInt(DiameterTextField.getText());
				int Quantity = Integer.parseInt(QuantityTextField.getText());
				boolean ChemicalResistance = ChemicalResistanceCheckBox.isSelected();
				PipeTypeI TestPipe = new PipeTypeI(gradeSelected, Length, Diameter, colourSelected, Quantity, ChemicalResistance, insulationSelected, reinforcementSelected);

				addNewPipeToBasket(getPipeData(TestPipe));//Putting the newly created pipe in the basket
//				ADPROC_Coursework.addPipeToList(TestPie);
				//TODO now clear the form interface of input
			}
		}
	}

	private double priceOfGradePlastic(int gradeOfPlastic) {
		switch (gradeOfPlastic) {
			case 1:
				return 0.4;
			case 2:
				return 0.6;
			case 3:
				return 0.75;
			case 4:
				return 0.8;
			case 5:
				return 0.95;
			default://This code should never be reached.
				return 0;
		}

	}

	private String getPipeData(LongPipe pipe) {
		//Return a string displaying the pipes attributes to be put into the text box on the user interface
		String pipeGrade = String.valueOf(pipe.getGrade());
		String pipeLength = String.valueOf(pipe.getLength());
		String pipeDiameter = String.valueOf(pipe.getDiameter());
		String pipeColour = String.valueOf(pipe.getNumOfColour());
		String insulation;
		if (pipe.getInsulation()) { //If the pipe is insulated
			insulation = "\tInsulated";
		} else {
			insulation = "\tNot insulated";
		}
		String reinforcement;
		if (pipe.getReinforcement()) {//Pipe is reinforced
			reinforcement = "\tReinforced";
		} else {
			reinforcement = "\tNot reinforced";
		}
		String chemicalResistance;
		if (pipe.getChemicalResistance()) {
			chemicalResistance = "\tResistance to chemical resistance";
		} else {
			chemicalResistance = "\tNot resistance to chemicals";
		}

		//volume() wants length and diameter 
		//cost() Wants volume price and chemical resistance
		double volume = pipe.calculateVolume(pipe.getLength(), pipe.getDiameter());
		double price = priceOfGradePlastic(pipe.getGrade()); //Price of the grade of plastic being used
		double costOfPipe = pipe.cost(volume, price, pipe.getChemicalResistance());//TODO //Calculate the cost
		String pipeQuantity = String.valueOf(pipe.getNumOfPipes());
//		return ("Grade Of Plastic: " + pipeGrade + "\tLength of pipe: " + pipeLength + "\tDiameter of pipe: " + pipeDiameter + pipeColour + insulation + reinforcement + "\tQuantity: " + pipeQuantity + "Price: "+"TODO cost of pipe. Line 311 in newPipeForm");//costOfPipe);//TODO calculate and output price
		return ("Grade Of Plastic: " + pipeGrade + "\tLength of pipe: " + pipeLength + "\tDiameter of pipe: " + pipeDiameter + pipeColour + insulation + reinforcement + "\tQuantity: " + pipeQuantity + "Price: " + costOfPipe);//TODO calculate and output price
	}

	private void addNewPipeToBasket(String textToAdd) {
		BasketTextBox.setText(BasketTextBox.getText() + "\n" + textToAdd); //Might be possible to see an append method look at TextBox.add
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
			//create o object of pipe IV
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
        private javax.swing.JTextArea BasketTextBox;
        private javax.swing.JLabel BasketTextBoxLabel;
        private javax.swing.JCheckBox ChemicalResistanceCheckBox;
        private javax.swing.JComboBox<String> ColoursComboBox;
        private javax.swing.JLabel ColoursLabel;
        private javax.swing.JLabel DiameterErrorReportingLabel;
        private javax.swing.JLabel DiameterLabel;
        private javax.swing.JTextField DiameterTextField;
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
        private javax.swing.JScrollPane jScrollPane1;
        // End of variables declaration//GEN-END:variables
}
