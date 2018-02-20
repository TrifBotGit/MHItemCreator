package window;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.CardLayout;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import java.awt.Color;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private JTextField nameText;
	private JTextField zoneText;
	private JTextField percentText;
	private JTextField conditionText;
	private JTextField precentTextDrop;
	private JTextField firstItemText;
	private JTextField secondItemText;
	private JTextField successText;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 398);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu itemMenu = new JMenu("Item");
		menuBar.add(itemMenu);
		
		JMenuItem newItem = new JMenuItem("New");
		itemMenu.add(newItem);
		
		JMenuItem resetitem = new JMenuItem("Reset");
		itemMenu.add(resetitem);
		
		JMenuItem exitApp = new JMenuItem("Exit");
		itemMenu.add(exitApp);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel cardPanel = new JPanel();
		cardPanel.setBounds(10, 103, 220, 190);
		contentPane.add(cardPanel);
		cardPanel.setLayout(new CardLayout(0, 0));
		
		JPanel regularItemCard = new JPanel();
		regularItemCard.setBorder(new TitledBorder(null, "Item location", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		cardPanel.add(regularItemCard, "name_20851162599188");
		regularItemCard.setLayout(null);
		
		JLabel mapLocation = new JLabel("Map:");
		mapLocation.setBounds(10, 25, 34, 14);
		regularItemCard.add(mapLocation);
		
		JComboBox mapCombo = new JComboBox();
		mapCombo.setBounds(61, 22, 86, 20);
		regularItemCard.add(mapCombo);
		
		JLabel zoneLocation = new JLabel("Zone:");
		zoneLocation.setBounds(10, 56, 34, 14);
		regularItemCard.add(zoneLocation);
		
		zoneText = new JTextField();
		zoneText.setBounds(61, 53, 86, 20);
		regularItemCard.add(zoneText);
		zoneText.setColumns(10);
		
		JLabel percentLabelLocation = new JLabel("Percent:");
		percentLabelLocation.setBounds(10, 118, 47, 14);
		regularItemCard.add(percentLabelLocation);
		
		percentText = new JTextField();
		percentText.setBounds(61, 115, 44, 20);
		regularItemCard.add(percentText);
		percentText.setColumns(10);
		
		JButton addLocationButton = new JButton("Add Location");
		addLocationButton.setBounds(10, 156, 95, 23);
		regularItemCard.add(addLocationButton);
		
		JLabel rankLocation = new JLabel("Rank:");
		rankLocation.setBounds(10, 87, 39, 14);
		regularItemCard.add(rankLocation);
		
		JComboBox rankComboLocation = new JComboBox();
		rankComboLocation.setBounds(61, 84, 86, 20);
		regularItemCard.add(rankComboLocation);
		
		JPanel monsterPartCard = new JPanel();
		monsterPartCard.setBorder(new TitledBorder(null, "Monster Drop", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		cardPanel.add(monsterPartCard, "name_20853767158940");
		monsterPartCard.setLayout(null);
		
		JLabel monsterLabel = new JLabel("Monster:");
		monsterLabel.setBounds(6, 27, 55, 14);
		monsterPartCard.add(monsterLabel);
		
		JComboBox monsterCombo = new JComboBox();
		monsterCombo.setBounds(71, 24, 94, 20);
		monsterPartCard.add(monsterCombo);
		
		conditionText = new JTextField();
		conditionText.setBounds(71, 55, 94, 20);
		monsterPartCard.add(conditionText);
		conditionText.setColumns(10);
		
		JLabel conditionLabel = new JLabel("Condition:");
		conditionLabel.setBounds(6, 58, 55, 14);
		monsterPartCard.add(conditionLabel);
		
		JComboBox rankComboDrop = new JComboBox();
		rankComboDrop.setBounds(71, 86, 94, 20);
		monsterPartCard.add(rankComboDrop);
		
		JLabel rankLabelDrop = new JLabel("Rank:");
		rankLabelDrop.setBounds(6, 89, 46, 14);
		monsterPartCard.add(rankLabelDrop);
		
		precentTextDrop = new JTextField();
		precentTextDrop.setBounds(71, 117, 46, 20);
		monsterPartCard.add(precentTextDrop);
		precentTextDrop.setColumns(10);
		
		JLabel precentLabelDrop = new JLabel("Percent:");
		precentLabelDrop.setBounds(6, 120, 55, 14);
		monsterPartCard.add(precentLabelDrop);
		
		JButton addDropButton = new JButton("Add Drop");
		addDropButton.setBounds(6, 156, 89, 23);
		monsterPartCard.add(addDropButton);
		
		JPanel combinationItemCard = new JPanel();
		combinationItemCard.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Combination", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		cardPanel.add(combinationItemCard, "name_20855479587860");
		combinationItemCard.setLayout(null);
		
		firstItemText = new JTextField();
		firstItemText.setBounds(66, 25, 93, 20);
		combinationItemCard.add(firstItemText);
		firstItemText.setColumns(10);
		
		JLabel firstItemLabel = new JLabel("Item 1:");
		firstItemLabel.setBounds(10, 28, 46, 14);
		combinationItemCard.add(firstItemLabel);
		
		secondItemText = new JTextField();
		secondItemText.setBounds(66, 56, 93, 20);
		combinationItemCard.add(secondItemText);
		secondItemText.setColumns(10);
		
		JLabel secondItemLabel = new JLabel("Item 2:");
		secondItemLabel.setBounds(10, 59, 46, 14);
		combinationItemCard.add(secondItemLabel);
		
		successText = new JTextField();
		successText.setBounds(106, 87, 53, 20);
		combinationItemCard.add(successText);
		successText.setColumns(10);
		
		JLabel successLabel = new JLabel("Success Percent:");
		successLabel.setBounds(10, 90, 86, 14);
		combinationItemCard.add(successLabel);
		
		JButton btnAddCombination = new JButton("Add Combination");
		btnAddCombination.setBounds(10, 156, 113, 23);
		combinationItemCard.add(btnAddCombination);
		
		JLabel typeLabel = new JLabel("Item type:");
		typeLabel.setBounds(10, 11, 65, 14);
		contentPane.add(typeLabel);
		
		JLabel nameLabel = new JLabel("Item name:");
		nameLabel.setBounds(10, 42, 65, 14);
		contentPane.add(nameLabel);
		
		nameText = new JTextField();
		nameText.setBounds(85, 39, 94, 20);
		contentPane.add(nameText);
		nameText.setColumns(10);
		
		JComboBox typeCombo = new JComboBox();
		typeCombo.setBounds(85, 8, 94, 20);
		contentPane.add(typeCombo);
		
		JLabel rarityLabel = new JLabel("Rarity:");
		rarityLabel.setBounds(10, 73, 54, 14);
		contentPane.add(rarityLabel);
		
		JTextPane previewPane = new JTextPane();
		previewPane.setEditable(false);
		previewPane.setBounds(300, 11, 265, 282);
		contentPane.add(previewPane);
		
		JButton previewButton = new JButton("Preview");
		previewButton.setBounds(377, 304, 89, 23);
		contentPane.add(previewButton);
		
		JButton saveButton = new JButton("Save Item");
		saveButton.setBounds(476, 304, 89, 23);
		contentPane.add(saveButton);
		
		JButton itemButton = new JButton("Create Item");
		itemButton.setBounds(132, 70, 98, 23);
		contentPane.add(itemButton);
		
		JComboBox rarityCombo = new JComboBox();
		rarityCombo.setBounds(85, 70, 37, 20);
		contentPane.add(rarityCombo);
	}
}
