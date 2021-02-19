package presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import businessLogic.MyOfferManager;
import businessLogic.OfferManager;
import domain.Offer;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
<<<<<<< HEAD
import javax.swing.ComboBoxModel;
=======
>>>>>>> b062408e08b32fc361932502665a8a58946a8d3d
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class OfferBooking extends JFrame {

<<<<<<< HEAD
=======
	
>>>>>>> b062408e08b32fc361932502665a8a58946a8d3d
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblCity;
	private JLabel lblYear;
	private JLabel lblMonth;
	private JLabel lblDay;
	private JLabel lblRoomType;
	private JLabel searchResult;
<<<<<<< HEAD

	private JTextField city;

=======
	
	private JTextField city;
	
>>>>>>> b062408e08b32fc361932502665a8a58946a8d3d
	private JTextField day;
	private JComboBox<String> month;
	private DefaultComboBoxModel<String> monthNames = new DefaultComboBoxModel<String>();
	private JTextField year;
<<<<<<< HEAD

	private JRadioButton tripleRooms;
	private JRadioButton doubleRooms;
	private JRadioButton singleRooms;

	private ButtonGroup fareButtonGroup = new ButtonGroup();

	private JButton lookforOffers;
	private DefaultListModel<Offer> offerInfo = new DefaultListModel<Offer>();
	private DefaultComboBoxModel<Offer> offerCInfo = new DefaultComboBoxModel<Offer>();

	private JList<Offer> offerList = null;
	private JButton bookOffer = null;

	private OfferManager businessLogic;

	private Collection<Offer> offerCollection;

	private Offer selectedOffer;
	private JComboBox<Offer> offerCList;
=======
	
	private JRadioButton tripleRooms;
	private JRadioButton doubleRooms;
	private JRadioButton singleRooms;
	
	private ButtonGroup fareButtonGroup = new ButtonGroup();  
	
	private JButton lookforOffers;
	private DefaultListModel<Offer> offerInfo = new DefaultListModel<Offer>();

	private JList<Offer> offerList = null;
	private JButton bookOffer = null;
	
	private OfferManager businessLogic;  

	private Collection<Offer> offerCollection;
	
	private Offer selectedOffer;
>>>>>>> b062408e08b32fc361932502665a8a58946a8d3d

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OfferBooking frame = new OfferBooking();
					frame.setBusinessLogic(new MyOfferManager());
					frame.setVisible(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
<<<<<<< HEAD

	// Custom operations
	public void setBusinessLogic(OfferManager g) {
		businessLogic = g;
	}

	private Date newDate(int year, int month, int day) {

		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month, day, 0, 0, 0);
		calendar.set(Calendar.MILLISECOND, 0);

		return calendar.getTime();
	}

=======
	
	//Custom operations
	public void setBusinessLogic(OfferManager g) {businessLogic = g;}
	
	private Date newDate(int year,int month,int day) {

	     Calendar calendar = Calendar.getInstance();
	     calendar.set(year, month, day,0,0,0);
	     calendar.set(Calendar.MILLISECOND, 0);

	     return calendar.getTime();
	}
	
>>>>>>> b062408e08b32fc361932502665a8a58946a8d3d
	/**
	 * Create the frame.
	 */
	public OfferBooking() {
		setTitle("Rural Houses Offer Book");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
<<<<<<< HEAD

		lblCity = new JLabel("City:");
		lblCity.setBounds(21, 22, 61, 16);
		contentPane.add(lblCity);

=======
		
		lblCity = new JLabel("City:");
		lblCity.setBounds(21, 22, 61, 16);
		contentPane.add(lblCity);
		
>>>>>>> b062408e08b32fc361932502665a8a58946a8d3d
		city = new JTextField();
		city.setText("Donostia");
		city.setBounds(64, 17, 243, 26);
		contentPane.add(city);
		city.setColumns(10);
<<<<<<< HEAD

		lblYear = new JLabel("Year:");
		lblYear.setBounds(21, 55, 33, 16);
		contentPane.add(lblYear);

		lblMonth = new JLabel("Month:");
		lblMonth.setBounds(117, 55, 50, 16);
		contentPane.add(lblMonth);

=======
		
		lblYear = new JLabel("Year:");
		lblYear.setBounds(21, 55, 33, 16);
		contentPane.add(lblYear);
		
		lblMonth = new JLabel("Month:");
		lblMonth.setBounds(117, 55, 50, 16);
		contentPane.add(lblMonth);
	    
>>>>>>> b062408e08b32fc361932502665a8a58946a8d3d
		month = new JComboBox<String>();
		month.setBounds(163, 51, 116, 27);
		contentPane.add(month);
		month.setModel(monthNames);
<<<<<<< HEAD

=======
		
>>>>>>> b062408e08b32fc361932502665a8a58946a8d3d
		monthNames.addElement("January");
		monthNames.addElement("February");
		monthNames.addElement("March");
		monthNames.addElement("April");
		monthNames.addElement("May");
		monthNames.addElement("June");
		monthNames.addElement("July");
		monthNames.addElement("August");
		monthNames.addElement("September");
		monthNames.addElement("October");
		monthNames.addElement("November");
		monthNames.addElement("December");
		month.setSelectedIndex(0);
<<<<<<< HEAD

		lblDay = new JLabel("Day:");
		lblDay.setBounds(291, 55, 38, 16);
		contentPane.add(lblDay);

=======
		
		lblDay = new JLabel("Day:");
		lblDay.setBounds(291, 55, 38, 16);
		contentPane.add(lblDay);
		
>>>>>>> b062408e08b32fc361932502665a8a58946a8d3d
		day = new JTextField();
		day.setText("20");
		day.setBounds(331, 50, 50, 26);
		contentPane.add(day);
		day.setColumns(10);
<<<<<<< HEAD

		lblRoomType = new JLabel("Room Type:");
		lblRoomType.setBounds(21, 83, 84, 16);
		contentPane.add(lblRoomType);

=======
		
		lblRoomType = new JLabel("Room Type:");
		lblRoomType.setBounds(21, 83, 84, 16);
		contentPane.add(lblRoomType);
		
		
		
>>>>>>> b062408e08b32fc361932502665a8a58946a8d3d
		tripleRooms = new JRadioButton("Triple");
		tripleRooms.setSelected(true);
		fareButtonGroup.add(tripleRooms);
		tripleRooms.setBounds(99, 79, 68, 23);
		contentPane.add(tripleRooms);
<<<<<<< HEAD

=======
		
>>>>>>> b062408e08b32fc361932502665a8a58946a8d3d
		doubleRooms = new JRadioButton("Double");
		fareButtonGroup.add(doubleRooms);
		doubleRooms.setBounds(173, 79, 77, 23);
		contentPane.add(doubleRooms);
<<<<<<< HEAD

=======
		
>>>>>>> b062408e08b32fc361932502665a8a58946a8d3d
		singleRooms = new JRadioButton("Single");
		fareButtonGroup.add(singleRooms);
		singleRooms.setBounds(265, 79, 77, 23);
		contentPane.add(singleRooms);
<<<<<<< HEAD

		lookforOffers = new JButton("Look for Concrete Offers");
		lookforOffers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				int year=;
//				int month;
//				int day;
				
				
=======
		
		lookforOffers = new JButton("Look for Concrete Offers");
		lookforOffers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
>>>>>>> b062408e08b32fc361932502665a8a58946a8d3d
				bookOffer.setEnabled(true);
				offerInfo.clear();
				bookOffer.setText("");
				
<<<<<<< HEAD
				java.util.Date date = newDate(Integer.parseInt(year.getText()), month.getSelectedIndex(),
						Integer.parseInt(day.getText()));
				offerCollection = businessLogic.getConcreteOffers(city.getText(), date);
				

				
				for (Offer v : offerCollection)
					offerCInfo.addElement(v);
				if (offerCollection.isEmpty())
					searchResult.setText("No offers in that city in that date");
				else
					searchResult.setText("Choose an available offer in this list:");
			}
		});
		lookforOffers.setBounds(91, 114, 261, 40);
		contentPane.add(lookforOffers);

		searchResult = new JLabel("");
		searchResult.setBounds(109, 180, 243, 16);
		contentPane.add(searchResult);

		bookOffer = new JButton("");
		bookOffer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = 0;
				boolean error = false;
				if (tripleRooms.isSelected()) {
					num = selectedOffer.getTripleNumber();
					selectedOffer.setTripleNumber(num - 1);
					
				} else if (doubleRooms.isSelected()) {
					num = selectedOffer.getDoubleNumber();
					selectedOffer.setDoubleNumber(num - 1);
					
				} else if (singleRooms.isSelected()) {
					num = selectedOffer.getSingleNumber();
					selectedOffer.setSingleNumber(num - 1);
				}
				if (error)
					bookOffer.setText("Error: There were no offers available!");
				else
					bookOffer.setText("Booked. #rooms left: " + (num - 1));
=======
				java.util.Date date =newDate(Integer.parseInt(year.getText()),month.getSelectedIndex(),Integer.parseInt(day.getText()));
				 
				offerCollection=businessLogic.getConcreteOffers(city.getText(),date);
				for (Offer v : offerCollection)  offerInfo.addElement(v); 
				if (offerCollection.isEmpty()) searchResult.setText("No offers in that city in that date");
				else searchResult.setText("Choose an available offer in this list:");
			}
		});
		lookforOffers.setBounds(91, 114, 261, 40);
		contentPane.add(lookforOffers);	
		
		searchResult = new JLabel("");
		searchResult.setBounds(109, 180, 243, 16);
		contentPane.add(searchResult);
		
		offerList = new JList<Offer>();
		offerList.setBounds(64, 199, 336, 71);
		contentPane.add(offerList);
		offerList.setModel(offerInfo);
		offerList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
			public void valueChanged(javax.swing.event.ListSelectionEvent e) {
				if (e.getValueIsAdjusting()) return; // El evento se dispara dos veces: antes de cambiar el valor y una vez cambiado
													 // Interesa s�lo actuar una vez cambiado
				if (!offerList.isSelectionEmpty()){ // A este m�todo se le llama tambi�n cuando se hace un clear del JList, 
													 // por lo que podr�a estar la selecci�n vac�a y dar un error
					selectedOffer = (Offer) offerList.getSelectedValue();
					bookOffer.setEnabled(true);
					bookOffer.setText("Book this offer: "+selectedOffer);  // TODO Auto-generated Event stub valueChanged()
				}
			}
		});
		
		bookOffer = new JButton("");
		bookOffer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=0;
				boolean error=false;
				if (tripleRooms.isSelected()) { 
					num=selectedOffer.getTripleNumber();
					if (num>0) selectedOffer.setTripleNumber(num-1); else error=true; 
				}
				else if (doubleRooms.isSelected()) {
					num=selectedOffer.getDoubleNumber();
					if (num>0) selectedOffer.setDoubleNumber(num-1); else error=true;
				}
				else if (singleRooms.isSelected()) {
					num=selectedOffer.getSingleNumber();
					if (num>0) selectedOffer.setSingleNumber(num-1); else error=true;
				}
				if (error) bookOffer.setText("Error: There were no offers available!");
				else bookOffer.setText("Booked. #rooms left: "+(num-1));
>>>>>>> b062408e08b32fc361932502665a8a58946a8d3d
				bookOffer.setEnabled(false);
			}
		});
		bookOffer.setBounds(21, 282, 399, 40);
		contentPane.add(bookOffer);

		year = new JTextField();
		year.setText("2020");
		year.setBounds(57, 50, 50, 26);
		contentPane.add(year);
		year.setColumns(10);
<<<<<<< HEAD

		offerCList = new JComboBox<Offer>();
		offerCList.setBounds(91, 209, 261, 40);
		contentPane.add(offerCList);
		offerCList.setModel(offerCInfo);
		offerCList.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		if (offerCList.getSelectedItem()!=null) { 
			
				selectedOffer = (Offer) offerCList.getSelectedItem();
				int num;
				if (tripleRooms.isSelected()) {
					num=selectedOffer.getTripleNumber();
					if (num<1) {
						bookOffer.setEnabled(false);
						bookOffer.setText("No rooms available");
					}
					else {
						bookOffer.setEnabled(true);
						bookOffer.setText("Book this offer: " + selectedOffer); 
					}
				}
				if (doubleRooms.isSelected()) {
					num=selectedOffer.getDoubleNumber();
					if (num<1) {
						bookOffer.setEnabled(false);
						bookOffer.setText("No rooms available");
					}
					else {
						bookOffer.setEnabled(true);
						bookOffer.setText("Book this offer: " + selectedOffer); 
					}
				}
				if (singleRooms.isSelected()) {
					num=selectedOffer.getSingleNumber();
					if (num<1) {
						bookOffer.setEnabled(false);
						bookOffer.setText("No rooms available");
					}
					else {
						bookOffer.setEnabled(true);
						bookOffer.setText("Book this offer: " + selectedOffer); 
					}
				}
			}

			}

		});

=======
>>>>>>> b062408e08b32fc361932502665a8a58946a8d3d
	}
}