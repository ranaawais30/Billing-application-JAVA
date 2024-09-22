package CustomerBilling;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Frame;


public class CustomerBilling extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField martName;
	private JTextField martPhone;
	private JTextField cashierName;
	private JTextField customerName;
	private JTextField customerId;
	private JTextField jtxtRice;
	private JTextField jtxtFlour;
	private JTextField jtxtSugar;
	private JTextField jtxtMilk;
	private JTextField jtxtTotal;
	private JTextField jtxtTax;
	private JTextField jtxtSubTotal;
	private JFrame frame;
	String iTax, iSubTotal, iTotal;
	double [] itemCost = new double[20];
	private JTextField jtxtOil;
	private JTextField jtxtFish;
	private JTextField jtxtBeef;
	private JTextField jtxtChicken;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerBilling frame = new CustomerBilling();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CustomerBilling() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(25, 25, 112));
		contentPane.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(42, 36, 370, 571);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MartName:\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 60, 123, 28);
		panel.add(lblNewLabel);
		
		martName = new JTextField("Rana's Mart");
		martName.setEditable(false);
		martName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		martName.setBounds(141, 68, 219, 20);
		panel.add(martName);
		martName.setColumns(10);
		
		JLabel lblMartaddress = new JLabel("MartAddress:");
		lblMartaddress.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMartaddress.setBounds(10, 119, 123, 28);
		panel.add(lblMartaddress);
		
		JComboBox martAddress = new JComboBox();
		martAddress.setToolTipText("");
		martAddress.setFont(new Font("Tahoma", Font.PLAIN, 16));
		martAddress.setBackground(new Color(255, 255, 255));
		martAddress.setModel(new DefaultComboBoxModel(new String[] {"", "Gulistan-e-Jauhar blk-7", "Gulistan-e-Jauhar blk-8", "Model Colony Street 25", "Gulshan-e-Iqbal blk-10"}));
		martAddress.setBounds(141, 125, 219, 22);
		panel.add(martAddress);
		
		JLabel lblTelephone = new JLabel("Telephone:\r\n");
		lblTelephone.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTelephone.setBounds(10, 176, 123, 28);
		panel.add(lblTelephone);
		
		martPhone = new JTextField("021-0900-78601");
		martPhone.setEditable(false);
		martPhone.setFont(new Font("Tahoma", Font.PLAIN, 16));
		martPhone.setColumns(10);
		martPhone.setBounds(141, 184, 219, 20);
		panel.add(martPhone);
		
		JLabel lblMartaddress_1 = new JLabel("CashierName:");
		lblMartaddress_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMartaddress_1.setBounds(10, 237, 123, 28);
		panel.add(lblMartaddress_1);
		
		cashierName = new JTextField();
		cashierName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cashierName.setColumns(10);
		cashierName.setBounds(141, 245, 219, 20);
		panel.add(cashierName);
		
		JLabel Jlabel = new JLabel("Customer\r\nName:\r\n");
		Jlabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		Jlabel.setBounds(10, 294, 131, 28);
		panel.add(Jlabel);
		
		customerName = new JTextField();
		customerName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		customerName.setColumns(10);
		customerName.setBounds(141, 302, 219, 20);
		panel.add(customerName);
		
		JLabel Jfield2 = new JLabel("CustomerID:\r\n");
		Jfield2.setFont(new Font("Tahoma", Font.BOLD, 16));
		Jfield2.setBounds(10, 357, 123, 28);
		panel.add(Jfield2);
		
		customerId = new JTextField();
		customerId.setEditable(false);
		customerId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		customerId.setColumns(10);
		customerId.setBounds(141, 365, 219, 20);
		panel.add(customerId);
		int refs = 1000 + (int)(Math.random()*17283);
		String cRefs = "";
		cRefs += refs;
		customerId.setText(cRefs);
		
		JLabel lblBillinginfo = new JLabel("Billing-Info\r\n");
		lblBillinginfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblBillinginfo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBillinginfo.setBounds(116, 11, 123, 28);
		panel.add(lblBillinginfo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(435, 36, 502, 714);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblItemslist = new JLabel("Items-List");
		lblItemslist.setHorizontalAlignment(SwingConstants.CENTER);
		lblItemslist.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblItemslist.setBounds(205, 11, 123, 28);
		panel_1.add(lblItemslist);
		
		JLabel lblBillinginfo_1 = new JLabel("Items");
		lblBillinginfo_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblBillinginfo_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBillinginfo_1.setBounds(23, 55, 123, 28);
		panel_1.add(lblBillinginfo_1);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblQuantity.setBounds(369, 55, 123, 28);
		panel_1.add(lblQuantity);
		
		//JTextFields For Items//
		jtxtRice = new JTextField();
		jtxtRice.setBackground(new Color(255, 255, 255));
		jtxtRice.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtRice.setText("0");
		jtxtRice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtxtRice.setColumns(10);
		jtxtRice.setBounds(376, 124, 116, 20);
		panel_1.add(jtxtRice);
		
		jtxtFlour = new JTextField();
		jtxtFlour.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtFlour.setText("0");
		jtxtFlour.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtxtFlour.setColumns(10);
		jtxtFlour.setBounds(376, 180, 116, 20);
		panel_1.add(jtxtFlour);
		
		jtxtSugar = new JTextField();
		jtxtSugar.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtSugar.setText("0");
		jtxtSugar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtxtSugar.setColumns(10);
		jtxtSugar.setBounds(376, 238, 116, 20);
		panel_1.add(jtxtSugar);
		
		jtxtMilk = new JTextField();
		jtxtMilk.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtMilk.setText("0");
		jtxtMilk.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtxtMilk.setColumns(10);
		jtxtMilk.setBounds(376, 293, 116, 20);
		panel_1.add(jtxtMilk);
		//---JTextFields For Items---//
		
		//---JCheckbox Fields For Items---//
		JCheckBox chckbxRice = new JCheckBox("Rice-1kg (Rs. 350.0)");
		chckbxRice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxRice.isSelected()) {
					jtxtRice.setEnabled(true);
					jtxtRice.setText("");
					jtxtRice.requestFocusInWindow();
				}
				else {
					jtxtRice.setText("0");
				}
			}
		});
		chckbxRice.setForeground(new Color(255, 255, 255));
		chckbxRice.setBackground(new Color(46, 139, 87));
		chckbxRice.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxRice.setBounds(10, 121, 225, 23);
		panel_1.add(chckbxRice);
		
		JCheckBox chckbxFlour = new JCheckBox("Flour-1kg (Rs. 450.99)");
		chckbxFlour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxFlour.isSelected()) {
					jtxtFlour.setEnabled(true);
					jtxtFlour.setText("");
					jtxtFlour.requestFocusInWindow();
				}
				else {
					jtxtFlour.setText("0");
				}
			}
		});
		chckbxFlour.setForeground(new Color(255, 255, 255));
		chckbxFlour.setBackground(new Color(46, 139, 87));
		chckbxFlour.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxFlour.setBounds(10, 177, 225, 23);
		panel_1.add(chckbxFlour);
		
		
		JCheckBox chckbxSugar = new JCheckBox("Sugar-1kg (Rs. 320.69)");
		chckbxSugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSugar.isSelected()) {
					jtxtSugar.setEnabled(true);
					jtxtSugar.setText("");
					jtxtSugar.requestFocusInWindow();
				}
				else {
					jtxtSugar.setText("0");
				}
			}
		});
		chckbxSugar.setForeground(new Color(255, 255, 255));
		chckbxSugar.setBackground(new Color(46, 139, 87));
		chckbxSugar.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxSugar.setBounds(10, 235, 225, 23);
		panel_1.add(chckbxSugar);
		
		JCheckBox chckbxMilk = new JCheckBox("Milk-1kg (Rs. 200.0)");
		chckbxMilk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxMilk.isSelected()) {
					jtxtMilk.setEnabled(true);
					jtxtMilk.setText("");
					jtxtMilk.requestFocusInWindow();
				}
				else {
					jtxtMilk.setText("0");
				}
			}
		});
		chckbxMilk.setForeground(new Color(255, 255, 255));
		chckbxMilk.setBackground(new Color(46, 139, 87));
		chckbxMilk.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxMilk.setBounds(10, 292, 225, 23);
		panel_1.add(chckbxMilk);
		//---JCheckbox Fields For Items---//
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 51));
		panel_3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(102, 255, 51)));
		panel_3.setBounds(10, 558, 482, 145);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTelephone_1_1_1 = new JLabel("Total:");
		lblTelephone_1_1_1.setForeground(new Color(255, 255, 255));
		lblTelephone_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelephone_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTelephone_1_1_1.setBounds(57, 78, 123, 28);
		panel_3.add(lblTelephone_1_1_1);
		
		jtxtTotal = new JTextField();
		jtxtTotal.setFont(new Font("Tahoma", Font.PLAIN, 19));
		jtxtTotal.setColumns(10);
		jtxtTotal.setBounds(272, 84, 143, 20);
		panel_3.add(jtxtTotal);
		
		JLabel iblTelephone = new JLabel("Tax:");
		iblTelephone.setForeground(new Color(255, 255, 255));
		iblTelephone.setHorizontalAlignment(SwingConstants.CENTER);
		iblTelephone.setFont(new Font("Tahoma", Font.BOLD, 20));
		iblTelephone.setBounds(57, 27, 123, 28);
		panel_3.add(iblTelephone);
		
		jtxtTax = new JTextField();
		jtxtTax.setFont(new Font("Tahoma", Font.PLAIN, 19));
		jtxtTax.setColumns(10);
		jtxtTax.setBounds(272, 33, 143, 20);
		panel_3.add(jtxtTax);
		
		JLabel lblTelephone_1_1_1_2 = new JLabel("SubTotal");
		lblTelephone_1_1_1_2.setForeground(new Color(255, 255, 255));
		lblTelephone_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelephone_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTelephone_1_1_1_2.setBounds(57, 52, 123, 28);
		panel_3.add(lblTelephone_1_1_1_2);
		
		jtxtSubTotal = new JTextField();
		jtxtSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 19));
		jtxtSubTotal.setColumns(10);
		jtxtSubTotal.setBounds(272, 58, 143, 20);
		panel_3.add(jtxtSubTotal);
		
		//---JCheckbox Fields For Items---//
		JCheckBox chckbxOil = new JCheckBox("Oil-1kg (Rs. 250.45)");
		chckbxOil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxOil.isSelected()) {
					jtxtOil.setEnabled(true);
					jtxtOil.setText("");
					jtxtOil.requestFocusInWindow();
				}
				else {
					jtxtOil.setText("0");
				}
			}
		});
		chckbxOil.setForeground(new Color(255, 255, 255));
		chckbxOil.setBackground(new Color(46, 139, 87));
		chckbxOil.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxOil.setBounds(10, 349, 225, 23);
		panel_1.add(chckbxOil);
		
		JCheckBox chckbxFish = new JCheckBox("Fish-1kg (Rs. 1000.0)");
		chckbxFish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxFish.isSelected()) {
					jtxtFish.setEnabled(true);
					jtxtFish.setText("");
					jtxtFish.requestFocusInWindow();
				}
				else {
					jtxtFish.setText("0");
				}
			}
		});
		chckbxFish.setForeground(new Color(255, 255, 255));
		chckbxFish.setBackground(new Color(46, 139, 87));
		chckbxFish.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxFish.setBounds(10, 401, 225, 23);
		panel_1.add(chckbxFish);
		
		JCheckBox chckbxBeef = new JCheckBox("Beef-1kg (Rs. 1550.9)");
		chckbxBeef.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBeef.isSelected()) {
					jtxtBeef.setEnabled(true);
					jtxtBeef.setText("");
					jtxtBeef.requestFocusInWindow();
				}
				else {
					jtxtBeef.setText("0");
				}
			}
		});
		chckbxBeef.setForeground(new Color(255, 255, 255));
		chckbxBeef.setBackground(new Color(46, 139, 87));
		chckbxBeef.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxBeef.setBounds(10, 457, 225, 23);
		panel_1.add(chckbxBeef);
		
		JCheckBox chckbxChicken = new JCheckBox("Chicken-1kg (Rs. 680.0)");
		chckbxChicken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxChicken.isSelected()) {
					jtxtChicken.setEnabled(true);
					jtxtChicken.setText("");
					jtxtChicken.requestFocusInWindow();
				}
				else {
					jtxtChicken.setText("0");
				}
			}
		});		
		chckbxChicken.setForeground(new Color(255, 255, 255));
		chckbxChicken.setBackground(new Color(46, 139, 87));
		chckbxChicken.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxChicken.setBounds(10, 514, 225, 23);
		panel_1.add(chckbxChicken);
		//---JCheckbox Fields For Items---//
		
		//---JTextFields For Items---//
		jtxtOil = new JTextField();
		jtxtOil.setText("0");
		jtxtOil.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtOil.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtxtOil.setColumns(10);
		jtxtOil.setBounds(376, 352, 116, 20);
		panel_1.add(jtxtOil);
		
		jtxtFish = new JTextField();
		jtxtFish.setText("0");
		jtxtFish.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtFish.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtxtFish.setColumns(10);
		jtxtFish.setBounds(376, 402, 116, 20);
		panel_1.add(jtxtFish);
		
		jtxtBeef = new JTextField();
		jtxtBeef.setText("0");
		jtxtBeef.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtBeef.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtxtBeef.setColumns(10);
		jtxtBeef.setBounds(376, 460, 116, 20);
		panel_1.add(jtxtBeef);
		
		jtxtChicken = new JTextField();
		jtxtChicken.setText("0");
		jtxtChicken.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtChicken.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtxtChicken.setColumns(10);
		jtxtChicken.setBounds(376, 513, 116, 20);
		panel_1.add(jtxtChicken);
		//---JTextFields For Items---//
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(72, 209, 204)));
		panel_2.setBackground(new Color(0, 0, 102));
		panel_2.setBounds(962, 36, 412, 571);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		//TextArea for the text of bill 
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textArea.setBounds(10, 11, 392, 549);
		panel_2.add(textArea);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_5.setBackground(new Color(216, 191, 216));
		panel_5.setBounds(962, 618, 412, 132);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBounds(10, 11, 392, 110);
		panel_5.add(panel_4_1);
		panel_4_1.setLayout(null);
		panel_4_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(102, 255, 51)));
		panel_4_1.setBackground(new Color(0, 0, 51));
		
		//Button to close the Program
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Customer Billing System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnExit.setBounds(10, 11, 372, 40);
		panel_4_1.add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Clears the text in Billing-Info
				
//				martName.setText("");
				martAddress.setSelectedIndex(0);
//				martPhone.setText("");
				cashierName.setText("");
				customerName.setText("");
//				customerId.setText("");
				
				//Clears the check-boxes and item quantity in Item-list
				
				jtxtRice.setText("0");
				jtxtFlour.setText("0");
				jtxtSugar.setText("0");
				jtxtMilk.setText("0");
				jtxtOil.setText("0");
				jtxtFish.setText("0");
				jtxtBeef.setText("0");
				jtxtChicken.setText("0");
				
				chckbxRice.setSelected(false);
				chckbxFlour.setSelected(false);
				chckbxSugar.setSelected(false);
				chckbxMilk.setSelected(false);
				chckbxOil.setSelected(false);
				chckbxFish.setSelected(false);
				chckbxBeef.setSelected(false);
				chckbxChicken.setSelected(false);
				
				//Clears the Total amount of bill
				
				jtxtTax.setText("");
				jtxtSubTotal.setText("");
				jtxtTotal.setText("");
				
				//Clears the text of Receipt
				
				textArea.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnReset.setBounds(10, 64, 372, 35);
		panel_4_1.add(btnReset);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(102, 255, 51)));
		panel_4.setBackground(new Color(0, 0, 51));
		panel_4.setBounds(52, 618, 350, 99);
		contentPane.add(panel_4);
		
		//Button For Printing Receipt
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textArea.print();
				} catch (java.awt.print.PrinterException e1) {
					System.err.format("Error! \nPrinter not found", e1.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnPrint.setBounds(10, 27, 141, 45);
		panel_4.add(btnPrint);
		
		//Button to get the Total
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				itemCost[0] = Double.parseDouble(jtxtRice.getText())*350.0;
				itemCost[1] = Double.parseDouble(jtxtFlour.getText())*450.99;
				itemCost[2] = Double.parseDouble(jtxtSugar.getText())*320.69;
				itemCost[3] = Double.parseDouble(jtxtMilk.getText())*200.0;
				itemCost[4] = Double.parseDouble(jtxtOil.getText())*250.45;
				itemCost[5] = Double.parseDouble(jtxtFish.getText())*1000.0;
				itemCost[6] = Double.parseDouble(jtxtBeef.getText())*1550.9;
				itemCost[7] = Double.parseDouble(jtxtChicken.getText())*680.0;
				
				itemCost[8] = itemCost[0]+itemCost[1]+itemCost[2]+itemCost[3]+itemCost[4]+itemCost[5]+itemCost[6]+itemCost[7];
				if(itemCost[8] == 0) {
					iTax = String.format("Rs. %.2f", itemCost[8]);
					iSubTotal = String.format("Rs. %.2f", itemCost[8]);
					iTotal = String.format("Rs. %.2f", itemCost[8]);
					jtxtTax.setText(iTax);
					jtxtSubTotal.setText(iSubTotal);
					jtxtTotal.setText(iTotal);
				}
				else {
					iTax = String.format("Rs. %.2f", itemCost[8]/100);
					iSubTotal = String.format("Rs. %.2f", itemCost[8]);
					iTotal = String.format("Rs. %.2f", itemCost[8]+(itemCost[8]/100));
					jtxtTax.setText(iTax);
					jtxtSubTotal.setText(iSubTotal);
					jtxtTotal.setText(iTotal);
				}
				
				//To get the current date
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat date = new SimpleDateFormat("dd-MMM-yyyy"); 
				date.format(timer.getTime());
				
				textArea.setEnabled(true);
				//Checkbox-Variables
				String checkboxRice = chckbxRice.isSelected() ? "\nRice: " + "\t\t350.0" + "\t\t" + jtxtRice.getText() : "";
				String checkboxFlour = chckbxFlour.isSelected() ? "\nFlour: " + "\t\t450.99" + "\t\t" + jtxtFlour.getText() : "";
				String checkboxSugar = chckbxSugar.isSelected() ? "\nSugar: " + "\t\t320.69" + "\t\t" + jtxtSugar.getText() : "";
				String checkboxMilk = chckbxMilk.isSelected() ? "\nMilk: " + "\t\t200.0" + "\t\t" + jtxtMilk.getText() : "";
				String checkboxOil = chckbxOil.isSelected() ? "\nOil: " + "\t\t250.45" + "\t\t" + jtxtOil.getText() : "";
				String checkboxFish = chckbxFish.isSelected() ? "\nFish: " + "\t\t1000.0" + "\t\t" + jtxtFish.getText() : "";
				String checkboxBeef = chckbxBeef.isSelected() ? "\nBeef: " + "\t\t1550.9" + "\t\t" + jtxtBeef.getText() : "";
				String checkboxChicken = chckbxChicken.isSelected() ? "\nChicken: " + "\t680.0" + "\t\t" + jtxtChicken.getText() : "";
				
				//Method to generate the Receipt
				textArea.append("\t       Customer-Bill\n"
						+ "===================================================="
						+ "\nMart name: "+"\t" + martName.getText() 
						+ "\nMart address: " + "\t" + martAddress.getSelectedItem()
						+ "\nMart Tele: " + "\t" + martPhone.getText()
						+ "\nCashier name: " + "\t" + cashierName.getText()
						+ "\nCustomer name: " + "\t" + customerName.getText()
						+ "\nCustomerId: " + "\t" + customerId.getText()
						+ "\n===================================================="
						+ "\nItems " + "\t\tPrice" + "\t\tQty"
						+ checkboxRice
						+ checkboxFlour
						+ checkboxSugar
						+ checkboxMilk
						+ checkboxOil
						+ checkboxFish
						+ checkboxBeef
						+ checkboxChicken
						+ "\n===================================================="
						+ "\nSubTotal: " + "\t" + iSubTotal
						+ "\nTax: " + "\t\t" + iTax
						+ "\nTotal: " + "\t\t" + iTotal
						+ "\n\n" + "Date: " + "\t\t\t    " + date.format(timer.getTime())
						+ "\n\n\tThank you for purchasing!"
						+ "\n_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
				
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnTotal.setBounds(199, 27, 141, 45);
		panel_4.add(btnTotal);
	}
}
