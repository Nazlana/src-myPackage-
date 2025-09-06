package myPackage;

import javax.swing.*; 
import java.awt.*; 
import java.util.*;

class Member { //class holding member info.
    private int id;
    private String name;
    private int age;
    private double salary;

    public Member(int id, String name, int age, double salary) { //constructor 
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
 //getter functions to access member information from external classes
    public int getId() { 
    	return id; 
    	}
    public String getName() {
    	return name; 
    	}
    public int getAge() { 
    	return age; 
    	}
    public double getSalary() {
    	return salary; 
    	} 
}

public class nazlan_afsar {
	  private static ArrayList<Member> memberList = new ArrayList<>(); //Hold member objects
	  private static JPanel centerPanel; 
	    
	 public static void main(String[] args) {
		 memberList.add(new Member(1, "Alice Smith", 30, 4500.0)); //Member1
	     memberList.add(new Member(2, "Bob Johnson", 40, 5200.0));//Member2
	        
		JFrame frame = new JFrame(); //create main frame
		frame.setTitle("Member Management System");
		frame.setSize(700, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);//Frame in the center of the screen

		frame.setLayout(new BorderLayout());

		
		JLabel title = new JLabel("Welcome to the Member Management System", JLabel.CENTER); //create title label amd centering 
		title.setBackground(Color.LIGHT_GRAY);
		title.setForeground(Color.BLACK);
		frame.add(title, BorderLayout.NORTH);

		// create leftPanel for buttons
		JPanel leftPanel = new JPanel();
		leftPanel.setLayout(new GridLayout(3, 1, 10, 10));
		leftPanel.setBackground(Color.BLUE);
		leftPanel.setPreferredSize(new Dimension(100, 400)); 

		leftPanel.setLayout(null); 
		JButton addButton = new JButton("Add"); //add button
		addButton.setBounds(10, 30, 80, 30);
		addButton.setBackground(Color.WHITE);
		
		JButton showButton = new JButton("Show"); //shoe button
		showButton.setBounds(10, 80, 80, 30);
		showButton.setBackground(Color.WHITE);
		
		JButton searchButton = new JButton("Search"); //search button
		searchButton.setBounds(10, 130, 80, 30);
		searchButton.setBackground(Color.WHITE);
		
		//Adding buttons to the left panel
		leftPanel.add(addButton);
		leftPanel.add(showButton);
		leftPanel.add(searchButton);

		frame.add(leftPanel, BorderLayout.WEST); // Adding the leftPanel to the left of the main frame

		centerPanel = new JPanel(new BorderLayout());
		centerPanel.setBackground(Color.WHITE);
		frame.add(centerPanel, BorderLayout.CENTER);
		
		showButton.addActionListener(e -> showMembers()); // When showButton is clicked,showMembers() function is called
	    addButton.addActionListener(e -> addMembers()); //when addButton is clicked, addMembers() function is called
	    searchButton.addActionListener(e -> searchMembers());//when searchButton is clicked, searchMembers() function is called

	    frame.setVisible(true); //making visible
	 }
	 private static void showMembers() {
	        JTextArea textArea = new JTextArea(); //new text area for member info.
	        textArea.setEditable(false); // the user can't modify this area
	        StringBuilder sb = new StringBuilder(); // To combine texts

	        for (int i = 0; i < memberList.size(); i++) {
	            Member m = memberList.get(i); //for i. member
	            sb.append("ID: ").append(m.getId()).append("\n"); //I'm doing append operations with 'append'
	            sb.append("Name: ").append(m.getName()).append("\n");
	            sb.append("Age: ").append(m.getAge()).append("\n");
	            sb.append("Salary: ").append(m.getSalary()).append("\n");
	            sb.append("[index: ").append(i).append("]\n\n");  // I use 2 \n so that there is space between members
	        }

	        textArea.setText(sb.toString()); //All merged texts are imported into textArea

	        centerPanel.removeAll(); //clearing previous content
	        centerPanel.add(new JScrollPane(textArea), BorderLayout.CENTER); // textArea is wrapped in a scroll bar and added in the center of centerPanel
	        centerPanel.revalidate();  //Updates layout (because I added new things)
	        centerPanel.repaint(); //Refreshes screen (visually redrawing)
	    }
	 private static void addMembers() {
         JFrame addFrame = new JFrame("Add Member"); //new frame
         addFrame.setSize(300, 250);
         addFrame.setLayout(new GridLayout(5, 2, 5, 5));//5 row 2 column 5px space 
         addFrame.setLocationRelativeTo(null); 

        
         JLabel idLabel = new JLabel("ID:"); //ID label 
         JTextField idField = new JTextField(); //Writable field for ID

         JLabel nameLabel = new JLabel("Name:"); //Name label
         JTextField nameField = new JTextField(); //Writable field for Name

         JLabel ageLabel = new JLabel("Age:"); //Age label
         JTextField ageField = new JTextField(); //Writable field for Age

         JLabel salaryLabel = new JLabel("Salary:"); //Salary label
         JTextField salaryField = new JTextField(); //Writable field for Salary

         JButton addMemberButton = new JButton("Add"); //add button 

         
         addMemberButton.addActionListener(e -> { //what to do when the button is clicked
             try {
                 String idText = idField.getText().trim(); //erasing spaces
                 String nameText = nameField.getText().trim();
                 String ageText = ageField.getText().trim();
                 String salaryText = salaryField.getText().trim();

                 if (idText.isEmpty() || nameText.isEmpty() || ageText.isEmpty() || salaryText.isEmpty()) {
                     throw new NumberFormatException();  //throwing an error if any of them are empty
                 }
                 
                 // id, age and salary converting to number
                 int id = Integer.parseInt(idText);
                 int age = Integer.parseInt(ageText);
                 double salary = Double.parseDouble(salaryText);

                 //check if ID already exists
                 for (Member m : memberList) {
                     if (m.getId() == id) {
                         JOptionPane.showMessageDialog(addFrame, "You entered existing id", "Message", JOptionPane.INFORMATION_MESSAGE);
                         return;
                     }
                 }

                 //if all checks are passed, the new member is added to the list
                 memberList.add(new Member(id, nameText, age, salary));
                 JOptionPane.showMessageDialog(addFrame, "Member added successfully!", "Message", JOptionPane.INFORMATION_MESSAGE);
                 addFrame.dispose(); // Closing addFrame

             } catch (NumberFormatException ex) { //gives this error message if id, salary and age are not converted to numbers or if there is a blank entry
                 JOptionPane.showMessageDialog(addFrame, "Invalid input format.", "Message", JOptionPane.INFORMATION_MESSAGE);
             }
         });

         //adding elements to addFrame
         addFrame.add(idLabel);    
         addFrame.add(idField);
         
         addFrame.add(nameLabel);  
         addFrame.add(nameField);
         
         addFrame.add(ageLabel);   
         addFrame.add(ageField);
         
         addFrame.add(salaryLabel); 
         addFrame.add(salaryField);
         
         addFrame.add(new JLabel()); //space label for button alignment
         
         addFrame.add(addMemberButton); 

         addFrame.setVisible(true); //making visible addFrame
     }
	 private static void searchMembers() {
	        JFrame searchFrame = new JFrame("Search Member"); //new frame
	        searchFrame.setSize(400, 120);
	        searchFrame.setLayout(new FlowLayout());//components will be arranged from left to right
	        searchFrame.setLocationRelativeTo(null);

	        JLabel searchLabel = new JLabel("Search by:"); //user chooses from a drop down menu
	        String[] items = {"ID", "Name", "Age", "Salary"};
	        JComboBox<String> comboBox = new JComboBox<>(items);
	        
	        JTextField searchField = new JTextField(15); //writes the member to be called
	        
	        JButton searchButton = new JButton("Search"); //search button

	        searchButton.addActionListener(e -> { //what to do when the 'Search' button is clicked
	            
	        	String selected = (String) comboBox.getSelectedItem();  //user selected item
	        	
	            String input = searchField.getText().trim();//retrieving the value typed in the text field

	            if (input.isEmpty()) { //user is warned if empty
	                JOptionPane.showMessageDialog(searchFrame, "Please enter a value to search.");
	                return;
	            }

	            JFrame resultFrame = new JFrame("Search Member"); //search results will be shown in a separate frame
	            resultFrame.setSize(500, 300);
	            resultFrame.setLayout(new BorderLayout());

	            JTextArea resultArea = new JTextArea(); //result field
	            resultArea.setEditable(false); //user can't modify
	            
	            StringBuilder sb = new StringBuilder(); // To combine the results

	            for (int i = 0; i < memberList.size(); i++) {
	                Member m = memberList.get(i);
	                boolean match = false; //initially, no match is assumed. true if the search item matches the member

	                switch (selected) { //Comparison according to selected items
	               //if the text entered by the user is contained in this item, match = true
	                    case "ID": match = String.valueOf(m.getId()).contains(input); //ID is converted to String because it is int. 
	                    break;
	                    case "Name": match = m.getName().toLowerCase().contains(input.toLowerCase()); 
	                    break;
	                    case "Age": match = String.valueOf(m.getAge()).contains(input); 
	                    break;
	                    case "Salary": match = String.valueOf(m.getSalary()).contains(input);
	                    break;
	                }

	                if (match) { //result is added to the text
	                    sb.append("ID: ").append(m.getId())
	                    .append(" | Name: ").append(m.getName())
	                    .append(" | Age: ").append(m.getAge())
	                    .append(" | Salary: ").append(m.getSalary()) 
	                    .append(" [index: ").append(i).append("]\n");
	                }
	            }

	            resultArea.setText(sb.toString()); //Results are written to textArea
	            
	            resultFrame.add(new JScrollPane(resultArea), BorderLayout.CENTER);//TextArea is added to the frame with scroll bar

	            
	            JButton editDeleteButton = new JButton("Edit/Delete"); //Edit/Delete button is added under the result frame
	            resultFrame.add(editDeleteButton, BorderLayout.SOUTH);

	            editDeleteButton.addActionListener(ev -> EditDeleteMembers()); //Clicking Edit/Delete button starts the edit/delete process with another method

	            resultFrame.setVisible(true); //makin visible
	        });

	        searchFrame.add(searchLabel); //add label to frame
	        searchFrame.add(comboBox); //add drop down menu to frame	
	        searchFrame.add(searchField); //add search field(text) to frame
	        searchFrame.add(searchButton); //add search button to frame
	        
	        searchFrame.setVisible(true);
	    }
	 private static void EditDeleteMembers() {
	        JFrame editFrame = new JFrame("Edit/Delete Member"); //new frame for edit/delete operations
	        editFrame.setSize(400, 100);
	        editFrame.setLayout(new FlowLayout());
	        editFrame.setLocationRelativeTo(null);

	        JLabel indexLabel = new JLabel("Enter index from search result:"); //request index from the user
	        JTextField indexField = new JTextField(5);
	        JButton editButton = new JButton("Edit"); //edit button
	        JButton deleteButton = new JButton("Delete");//delete button

	        //components are added to the frame
	        editFrame.add(indexLabel);
	        editFrame.add(indexField);
	        editFrame.add(editButton);
	        editFrame.add(deleteButton);

	        deleteButton.addActionListener(e -> { ////what to do when the 'Delete' button is clicked
	            try {
	                int index = Integer.parseInt(indexField.getText()); //converted to integer
	                if (index >= 0 && index < memberList.size()) {
	                    memberList.remove(index); //member is deleted from the list
	                    JOptionPane.showMessageDialog(editFrame, "Member deleted successfully.");
	                    editFrame.dispose(); //frame closes
	                } else {
	                    JOptionPane.showMessageDialog(editFrame, "Invalid index."); //incorrect index
	                }
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(editFrame, "Please enter a valid number.");//if it can't be converted to integer
	            }
	        });

	        editButton.addActionListener(e -> { //what to do when the 'Edit' button is clicked
	            try {
	                int index = Integer.parseInt(indexField.getText()); //converted to integer
	                if (index >= 0 && index < memberList.size()) {
	                    EditMembers(index); //Edit frame opens
	                    editFrame.dispose(); //frame closes
	                } else {
	                    JOptionPane.showMessageDialog(editFrame, "Invalid index.");
	                }
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(editFrame, "Please enter a valid number.");
	            }
	        });

	        editFrame.setVisible(true);
	    }

	    private static void EditMembers(int index) { //To edit a member in a specific index
	        Member member = memberList.get(index); //recruit members from the list
	        JFrame editMemberFrame = new JFrame("Edit Member");
	        editMemberFrame.setSize(300, 250);
	        editMemberFrame.setLayout(new GridLayout(5, 2, 5, 5));
	        editMemberFrame.setLocationRelativeTo(null);

	     // Create text fields filled with default values
	        JTextField nameField = new JTextField(member.getName());
	        JTextField ageField = new JTextField(String.valueOf(member.getAge()));
	        JTextField salaryField = new JTextField(String.valueOf(member.getSalary()));
	       
	        JButton saveButton = new JButton("Save");

	        saveButton.addActionListener(e -> { //what to do when the 'Save' button is clicked
	            
	            try {
	                String newName = nameField.getText().trim(); //new name
	                int newAge = Integer.parseInt(ageField.getText().trim()); //new age
	                double newSalary = Double.parseDouble(salaryField.getText().trim()); //new salary

	                if (newName.isEmpty()) //if name is empty, throw exception 
	                	throw new NumberFormatException();
                      //updates member info.
	                memberList.set(index, new Member(member.getId(), newName, newAge, newSalary));
	                
	                JOptionPane.showMessageDialog(editMemberFrame, "Member updated successfully!");
	                editMemberFrame.dispose(); //frame closes
	                
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(editMemberFrame, "Invalid input format.");
	            }
	        });

	      //adding elements to editMemberFrame
	        editMemberFrame.add(new JLabel("Name:"));   
	        editMemberFrame.add(nameField);
	        
	        editMemberFrame.add(new JLabel("Age:"));  
	        editMemberFrame.add(ageField);
	        
	        editMemberFrame.add(new JLabel("Salary:"));
	        editMemberFrame.add(salaryField);
	        
	        editMemberFrame.add(new JLabel()); //space label for button alignment  
	        
	        editMemberFrame.add(saveButton);

	        editMemberFrame.setVisible(true); 
	    }
	
}
