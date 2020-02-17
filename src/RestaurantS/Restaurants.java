package RestaurantS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;   

public class Restaurants {

	private JFrame frame;
	private JTextField chickenBurgertf;
	private JTextField chickenBurgerMealtf;
	private JTextField cheeseBurgertf;
	private JTextField textField_calculator;
	private JTextField converttf;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurants window = new Restaurants();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Restaurants() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1368, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel.setBounds(21, 86, 668, 247);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Chicken Burger");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(31, 32, 219, 28);
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("Chicken Burger Meal");
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBounds(31, 71, 219, 28);
		panel.add(label);
		
		JLabel lblCheeseBurger = new JLabel("Cheese Burger");
		lblCheeseBurger.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCheeseBurger.setBounds(31, 110, 219, 28);
		panel.add(lblCheeseBurger);
		
		chickenBurgertf = new JTextField();
		chickenBurgertf.setFont(new Font("Tahoma", Font.BOLD, 15));
		chickenBurgertf.setHorizontalAlignment(SwingConstants.CENTER);
		chickenBurgertf.setBounds(332, 36, 252, 28);
		panel.add(chickenBurgertf);
		chickenBurgertf.setColumns(10);
		
		chickenBurgerMealtf = new JTextField();
		chickenBurgerMealtf.setFont(new Font("Tahoma", Font.BOLD, 15));
		chickenBurgerMealtf.setHorizontalAlignment(SwingConstants.CENTER);
		chickenBurgerMealtf.setColumns(10);
		chickenBurgerMealtf.setBounds(332, 75, 252, 28);
		panel.add(chickenBurgerMealtf);
		
		cheeseBurgertf = new JTextField();
		cheeseBurgertf.setFont(new Font("Tahoma", Font.BOLD, 15));
		cheeseBurgertf.setHorizontalAlignment(SwingConstants.CENTER);
		cheeseBurgertf.setColumns(10);
		cheeseBurgertf.setBounds(332, 114, 252, 28);
		panel.add(cheeseBurgertf);
		
		JLabel lblNewLabel_1 = new JLabel("Drink");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(31, 168, 61, 20);
		panel.add(lblNewLabel_1);
		
		JComboBox drink_comboBox = new JComboBox();
		drink_comboBox.setModel(new DefaultComboBoxModel(new String[] {"No drink", "Apple Juice", "Tea", "Cola", "Coke", "Coffee", "Ice Tea", "Ice Coffee", "Orange"}));
		drink_comboBox.setFont(new Font("Tahoma", Font.BOLD, 13));
		drink_comboBox.setBounds(102, 171, 124, 20);
		panel.add(drink_comboBox);
		
		JSpinner qty_Drinks = new JSpinner();
		qty_Drinks.setFont(new Font("Tahoma", Font.BOLD, 15));
		qty_Drinks.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		qty_Drinks.setBounds(390, 166, 61, 29);
		panel.add(qty_Drinks);
		
		JLabel lblTax_1 = new JLabel("Qty");
		lblTax_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTax_1.setBounds(332, 167, 61, 22);
		panel.add(lblTax_1);
		
		JLabel lblHomeDelivery = new JLabel("Home Delivery");
		lblHomeDelivery.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHomeDelivery.setBounds(57, 211, 148, 23);
		panel.add(lblHomeDelivery);
		
		JCheckBox homeDelivery_checkBox = new JCheckBox("");
		homeDelivery_checkBox.setBounds(30, 211, 21, 23);
		panel.add(homeDelivery_checkBox);
		
		JLabel lblTax_2 = new JLabel("Tax");
		lblTax_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTax_2.setBounds(359, 212, 148, 20);
		panel.add(lblTax_2);
		
		JCheckBox tax_checkBox = new JCheckBox("");
		tax_checkBox.setBounds(332, 211, 21, 23);
		panel.add(tax_checkBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel_1.setBounds(721, 86, 317, 244);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox converter_comboBox = new JComboBox();
		converter_comboBox.setModel(new DefaultComboBoxModel(new String[] {"Choose one", "Dollar", "Taka", "Pound", "Euro", "Rupee", "Kuwaiti Dinar"}));
		converter_comboBox.setFont(new Font("Tahoma", Font.BOLD, 13));
		converter_comboBox.setBounds(93, 50, 115, 22);
		panel_1.add(converter_comboBox);
		
		converttf = new JTextField();
		converttf.setFont(new Font("Tahoma", Font.BOLD, 15));
		converttf.setHorizontalAlignment(SwingConstants.CENTER);
		converttf.setColumns(10);
		converttf.setBounds(34, 83, 258, 38);
		panel_1.add(converttf);
		
		JLabel convert_label = new JLabel("");
		convert_label.setHorizontalAlignment(SwingConstants.CENTER);
		convert_label.setFont(new Font("Tahoma", Font.BOLD, 20));
		convert_label.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		convert_label.setBounds(34, 132, 258, 38);
		panel_1.add(convert_label);
		
		//===============================Currency Convert==========================
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// "Choose one", "Dollar", "Taka", "Pound", "Euro", "Rupee", "Kuwaiti Dinar"
				
				double dollarCurrency = Double.parseDouble(converttf.getText());
				double takaCurrency = 84.89*dollarCurrency; 
				double poundCurrency = 0.77*dollarCurrency;
				double euroCurrency = 0.92*dollarCurrency;
				double rupeeCurrency = 71.53*dollarCurrency;
				double dinarCurrency = 0.30*dollarCurrency;
				
				if(converter_comboBox.getSelectedItem().equals("Dollar"))
				{
					String pDollar = String.format("%.2f", dollarCurrency);
					convert_label.setText("$ "+pDollar);
				}
				else if(converter_comboBox.getSelectedItem().equals("Taka"))
				{
					String pTaka = String.format("%.2f", takaCurrency);
					convert_label.setText("৳  "+pTaka);
				}
				else if(converter_comboBox.getSelectedItem().equals("Pound"))
				{
					String pPound = String.format("%.2f", poundCurrency);
					convert_label.setText("£ "+pPound);
				}
				else if(converter_comboBox.getSelectedItem().equals("Euro"))
				{
					String pEuro = String.format("%.2f", euroCurrency);
					convert_label.setText("€ "+pEuro);
				}
				else if(converter_comboBox.getSelectedItem().equals("Rupee"))
				{
					String pRupee = String.format("%.2f", rupeeCurrency);
					convert_label.setText("₹ "+pRupee);
				}
				else if(converter_comboBox.getSelectedItem().equals("Kuwaiti Dinar"))
				{
					String pDinar = String.format("%.2f", dinarCurrency);
					convert_label.setText("K.D. "+pDinar);
				}
				else
				{
					convert_label.setText(null);
				}
			}
		});
		btnConvert.setForeground(Color.WHITE);
		btnConvert.setBackground(Color.BLUE);
		btnConvert.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnConvert.setBounds(34, 195, 101, 38);
		panel_1.add(btnConvert);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				converttf.setText("");
				convert_label.setText(null);
				converter_comboBox.setSelectedIndex(0);
				
			}
		});
		btnClose.setForeground(Color.WHITE);
		btnClose.setBackground(Color.RED);
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnClose.setBounds(210, 195, 82, 38);
		panel_1.add(btnClose);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblCurrencyConverter.setBounds(55, 11, 219, 28);
		panel_1.add(lblCurrencyConverter);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel_2.setBounds(21, 344, 668, 167);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
		lblCostOfDrinks.setBounds(26, 11, 210, 25);
		lblCostOfDrinks.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2.add(lblCostOfDrinks);
		
		JLabel lblCostOfMeals = new JLabel("Cost of Meals");
		lblCostOfMeals.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCostOfMeals.setBounds(26, 62, 210, 25);
		panel_2.add(lblCostOfMeals);
		
		JLabel lblCostOfDelivery = new JLabel("Cost of Delivery");
		lblCostOfDelivery.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCostOfDelivery.setBounds(26, 112, 210, 25);
		panel_2.add(lblCostOfDelivery);
		
		JLabel costOfDrinks_label = new JLabel("");
		costOfDrinks_label.setHorizontalAlignment(SwingConstants.CENTER);
		costOfDrinks_label.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		costOfDrinks_label.setFont(new Font("Tahoma", Font.BOLD, 20));
		costOfDrinks_label.setBounds(334, 20, 255, 25);
		panel_2.add(costOfDrinks_label);
		
		JLabel costOfMeals_label = new JLabel("0.00");
		costOfMeals_label.setHorizontalAlignment(SwingConstants.CENTER);
		costOfMeals_label.setFont(new Font("Tahoma", Font.BOLD, 20));
		costOfMeals_label.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		costOfMeals_label.setBounds(334, 62, 255, 25);
		panel_2.add(costOfMeals_label);
		
		JLabel costOfDelivery_label = new JLabel("");
		costOfDelivery_label.setHorizontalAlignment(SwingConstants.CENTER);
		costOfDelivery_label.setFont(new Font("Tahoma", Font.BOLD, 20));
		costOfDelivery_label.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		costOfDelivery_label.setBounds(334, 112, 255, 25);
		panel_2.add(costOfDelivery_label);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel_3.setBounds(721, 344, 317, 167);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTax.setBounds(10, 11, 149, 25);
		panel_3.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSubTotal.setBounds(10, 62, 149, 25);
		panel_3.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotal.setBounds(10, 112, 169, 25);
		panel_3.add(lblTotal);
		
		JLabel taxLabel = new JLabel("");
		taxLabel.setHorizontalAlignment(SwingConstants.CENTER);
		taxLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		taxLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		taxLabel.setBounds(162, 11, 126, 25);
		panel_3.add(taxLabel);
		
		JLabel subTotalLabel = new JLabel("");
		subTotalLabel.setHorizontalAlignment(SwingConstants.CENTER);
		subTotalLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		subTotalLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		subTotalLabel.setBounds(162, 62, 126, 25);
		panel_3.add(subTotalLabel);
		
		JLabel totalLabel = new JLabel("");
		totalLabel.setHorizontalAlignment(SwingConstants.CENTER);
		totalLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		totalLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		totalLabel.setBounds(162, 112, 126, 25);
		panel_3.add(totalLabel);
		
		
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel_4.setBounds(1048, 85, 283, 426);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(20, 11, 253, 404);
		panel_4.add(tabbedPane);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_7, null);
		panel_7.setLayout(null);
		
		JTextArea receiptta = new JTextArea();
		receiptta.setBounds(10, 11, 228, 354);
		panel_7.add(receiptta);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 228, 354);
		panel_7.add(scrollPane);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_6, null);
		panel_6.setLayout(null);
		
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.setFont(new Font("Wingdings",Font.BOLD,15));
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		btnBackSpace.setBounds(10, 83, 50, 48);
		panel_6.add(btnBackSpace);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnC.setBounds(70, 83, 48, 48);
		panel_6.add(btnC);
		
		JButton btnPercentage = new JButton("%");
		btnPercentage.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPercentage.setBounds(115, 82, 64, 49);
		panel_6.add(btnPercentage);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPlus.setBounds(188, 84, 50, 47);
		panel_6.add(btnPlus);
		
		textField_calculator = new JTextField();
		textField_calculator.setBounds(10, 11, 228, 61);
		panel_6.add(textField_calculator);
		textField_calculator.setColumns(10);
		
		JButton btnSeven = new JButton("7");
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSeven.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSeven.setBounds(10, 142, 50, 48);
		panel_6.add(btnSeven);
		
		JButton btnEight = new JButton("8");
		btnEight.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEight.setBounds(70, 141, 48, 48);
		panel_6.add(btnEight);
		
		JButton btnNine = new JButton("9");
		btnNine.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNine.setBounds(128, 142, 50, 48);
		panel_6.add(btnNine);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMinus.setBounds(188, 143, 50, 47);
		panel_6.add(btnMinus);
		
		JButton btnFour = new JButton("4");
		btnFour.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnFour.setBounds(10, 203, 50, 48);
		panel_6.add(btnFour);
		
		JButton btnFIve = new JButton("5");
		btnFIve.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnFIve.setBounds(70, 202, 48, 48);
		panel_6.add(btnFIve);
		
		JButton btnSix = new JButton("6");
		btnSix.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSix.setBounds(128, 202, 50, 48);
		panel_6.add(btnSix);
		
		JButton btnMul = new JButton("*");
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMul.setBounds(188, 202, 50, 47);
		panel_6.add(btnMul);
		
		JButton btnOne = new JButton("1");
		btnOne.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnOne.setBounds(10, 256, 50, 48);
		panel_6.add(btnOne);
		
		JButton btnTwo = new JButton("2");
		btnTwo.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTwo.setBounds(70, 256, 48, 48);
		panel_6.add(btnTwo);
		
		JButton btnThree = new JButton("3");
		btnThree.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnThree.setBounds(128, 255, 50, 48);
		panel_6.add(btnThree);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDiv.setBounds(188, 256, 50, 47);
		panel_6.add(btnDiv);
		
		JButton btnZero = new JButton("0");
		btnZero.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnZero.setBounds(10, 316, 50, 48);
		panel_6.add(btnZero);
		
		JButton btnPoint = new JButton(".");
		btnPoint.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPoint.setBounds(70, 316, 48, 48);
		panel_6.add(btnPoint);
		
		JButton btnPlusMinus = new JButton("+-");
		btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPlusMinus.setBounds(127, 315, 58, 48);
		panel_6.add(btnPlusMinus);
		
		JButton btnResult = new JButton("=");
		btnResult.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnResult.setBounds(188, 316, 60, 49);
		panel_6.add(btnResult);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel_5.setBounds(21, 522, 1310, 128);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//=================================Set Menu=========================================
				double chickenBurger = Double.parseDouble(chickenBurgertf.getText());
				double chickenBurgerPrice = 2.39;
				String cb = String.format("%.2f", chickenBurger*chickenBurgerPrice);
				costOfMeals_label.setText(cb);
				
				double chickenBurgerMeal = Double.parseDouble(chickenBurgerMealtf.getText());
				double costOfMeals = Double.parseDouble(costOfMeals_label.getText());
				double chickenBurgerMealPrice = 4.19;
				String cbm = String.format("%.2f", chickenBurgerMeal*chickenBurgerMealPrice+costOfMeals);
				costOfMeals_label.setText(cbm);
				
				double cheeseBurger = Double.parseDouble(cheeseBurgertf.getText());
				costOfMeals = Double.parseDouble(costOfMeals_label.getText());
				double cheeseBurgerPrice = 3.29;
				String czb = String.format("%.2f", cheeseBurger*cheeseBurgerPrice+costOfMeals);
				costOfMeals_label.setText(czb);
				
				
				// Home Delivery
				double homeDeliveryPrice = 2.22;
				if(homeDelivery_checkBox.isSelected())
				{
					String pDelivery = String.format("%.2f", homeDeliveryPrice);
					costOfDelivery_label.setText(pDelivery);
				}
				else
				{
					costOfDelivery_label.setText("0");
				}
				
				//=====================================Drinks=========================================
				// "Select a drink", "Apple Juice", "Tea", "Cola", "Coke", "Coffee", "Ice Tea", "Ice Coffee", "Orange"
				int DrinksQty = (int) qty_Drinks.getValue(); 
				double appleJuice = 2.39*DrinksQty; 
				double tea = 0.60*DrinksQty;
				double cola = 1.40*DrinksQty;
				double coke = 1.47*DrinksQty;
				double coffee = 1.52*DrinksQty;
				double iceTea = 1.30*DrinksQty;
				double iceCoffee = 1.99*DrinksQty;
				double orange = 2.10*DrinksQty;
				
				if(drink_comboBox.getSelectedItem().equals("Apple Juice"))
				{
					String pAppleJuice = String.format("%.2f", appleJuice);
					costOfDrinks_label.setText(pAppleJuice);
				}
				else if(drink_comboBox.getSelectedItem().equals("Tea"))
				{
					String pTea = String.format("%.2f", tea);
					costOfDrinks_label.setText(pTea);
				}
				else if(drink_comboBox.getSelectedItem().equals("Cola"))
				{
					String pCola = String.format("%.2f", cola);
					costOfDrinks_label.setText(pCola);
				}
				else if(drink_comboBox.getSelectedItem().equals("Coke"))
				{
					String pCoke = String.format("%.2f", coke);
					costOfDrinks_label.setText(pCoke);
				}
				else if(drink_comboBox.getSelectedItem().equals("Coffee"))
				{
					String pCoffee = String.format("%.2f", coffee);
					costOfDrinks_label.setText(pCoffee);
				}
				else if(drink_comboBox.getSelectedItem().equals("Ice Tea"))
				{
					String pIceTea = String.format("%.2f", iceTea);
					costOfDrinks_label.setText(pIceTea);
				}
				else if(drink_comboBox.getSelectedItem().equals("Ice Coffee"))
				{
					String pIceCoffee = String.format("%.2f", iceCoffee);
					costOfDrinks_label.setText(pIceCoffee);
				}
				else if(drink_comboBox.getSelectedItem().equals("Orange"))
				{
					String pOrange = String.format("%.2f", orange);
					costOfDrinks_label.setText(pOrange);
				}
				else
				{
					costOfDrinks_label.setText("0");
				}
				
				//==========================Tax Rate=======================================
				costOfMeals = Double.parseDouble(costOfMeals_label.getText());
				double costOfDrinks = Double.parseDouble(costOfDrinks_label.getText());
				double costOfDelivery = Double.parseDouble(costOfDelivery_label.getText());
				double allCost = costOfMeals+costOfDrinks+costOfDelivery;
				double taxRate = 0.00;
				if(tax_checkBox.isSelected())
				{
					taxRate = allCost*0.12; //0.12 taxRate
					taxLabel.setText(String.format("$ %.2f", taxRate));
				}
				else
				{
					taxLabel.setText(String.format("$ %.2f", taxRate));
				}
				
				//==========================Total================================
				
				subTotalLabel.setText(String.format("$ %.2f", allCost));
				totalLabel.setText(String.format("$ %.2f", allCost+taxRate));
			}
		});
		btnTotal.setBounds(296, 31, 116, 54);
		btnTotal.setForeground(Color.WHITE);
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTotal.setBackground(Color.GREEN);
		panel_5.add(btnTotal);
		
		
		//====================Receipt======================
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double chickenBurgerr = Double.parseDouble(chickenBurgertf.getText());
				double chickenBurgerPricer = 2.39;
				
				double chickenBurgerMealr = Double.parseDouble(chickenBurgerMealtf.getText());
				double chickenBurgerMealPricer = 4.19;
				
				double cheeseBurgerr = Double.parseDouble(cheeseBurgertf.getText());
				double cheeseBurgerPricer = 3.29;
			
				String drinkItemr = String.format("%s",drink_comboBox.getSelectedItem());
				int DrinksQtyr = (int) qty_Drinks.getValue();
				
				double drinkCostr = Double.parseDouble(costOfDrinks_label.getText());
				double mealCostr = Double.parseDouble(costOfMeals_label.getText());
				double deliveryCostr = Double.parseDouble(costOfDelivery_label.getText());
//				
				String taxr = taxLabel.getText();
				double subTotalr = mealCostr+drinkCostr+deliveryCostr;
				String totalr = totalLabel.getText();
				
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
				LocalDateTime now = LocalDateTime.now();
				
				receiptta.append(" Restaurant Management System\n\nItem\t           Qty \t Price\n");
				receiptta.append("---------------------------------------------------------\n");
				receiptta.append("Chicken Burger\t            "+chickenBurgerr+" \t $"+String.format("%.2f",chickenBurgerr*chickenBurgerPricer));
				receiptta.append("\nChicken Burger Meal    "+chickenBurgerMealr+" \t $"+String.format("%.2f",chickenBurgerMealr*chickenBurgerMealPricer));
				receiptta.append("\nCheese Burger\t            "+cheeseBurgerr+" \t $"+String.format("%.2f",cheeseBurgerr*cheeseBurgerPricer));
				receiptta.append("\n"+drinkItemr+"\t             "+DrinksQtyr+" \t $"+String.format("%.2f",drinkCostr));
				receiptta.append("\nDelivery Cost\t\t $"+String.format("%.2f",deliveryCostr));
				receiptta.append("\n---------------------------------------------------------\n");
				receiptta.append("SubTotal\t\t $"+String.format("%.2f", subTotalr));
				receiptta.append("\n\nTax \t\t "+taxr);
				receiptta.append("\n---------------------------------------------------------\n");
				receiptta.append("Total \t\t "+totalr);
				receiptta.append("\nDelivered on "+dtf.format(now)); 
				receiptta.append("\n---------------------------------------------------------\n");
			}
		});
		btnReceipt.setForeground(Color.WHITE);
		btnReceipt.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnReceipt.setBackground(Color.BLUE);
		btnReceipt.setBounds(470, 31, 107, 54);
		panel_5.add(btnReceipt);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chickenBurgertf.setText(null);
				chickenBurgerMealtf.setText(null);
				cheeseBurgertf.setText(null);
				drink_comboBox.setSelectedItem("Select a drink");
				qty_Drinks.setValue(1);
				homeDelivery_checkBox.setText("");
				tax_checkBox.setText("");
				costOfDrinks_label.setText(null);
				costOfMeals_label.setText(null);
				costOfDelivery_label.setText(null);
				converter_comboBox.setSelectedItem("Choose One");
				converttf.setText("");
				convert_label.setText(null);
				taxLabel.setText(null);
				subTotalLabel.setText(null);
				totalLabel.setText(null);
				textField_calculator.setText("");
				
			}
		});
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnReset.setBackground(Color.ORANGE);
		btnReset.setBounds(634, 31, 116, 54);
		panel_5.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBackground(Color.RED);
		btnExit.setBounds(809, 31, 116, 54);
		panel_5.add(btnExit);
		
		JLabel lblRestaurantMangementSystem = new JLabel("   Restaurant Mangement System");
		lblRestaurantMangementSystem.setForeground(Color.BLUE);
		lblRestaurantMangementSystem.setFont(new Font("Tahoma", Font.BOLD, 65));
		lblRestaurantMangementSystem.setBounds(28, 0, 1205, 75);
		frame.getContentPane().add(lblRestaurantMangementSystem);
	}
}
