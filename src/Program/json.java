package Program;

import java.awt.EventQueue;

import javax.swing.JFrame;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class json {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					json window = new json();
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
	public json() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 812, 615);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JSONParser parser = new JSONParser();
				JSONArray a = null;
				try {
					a = (JSONArray) parser.parse(new FileReader("src/jsontype.json"));
				} catch (IOException | ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				  for (Object o : a)
				  {
				    JSONObject person = (JSONObject) o;

				    String name = (String) person.get("name");
				    System.out.println(name);

				    String city = (String) person.get("city");
				    System.out.println(city);

				    String job = (String) person.get("job");
				    System.out.println(job);

				    JSONArray cars = (JSONArray) person.get("cars");

				    /*for (Object c : cars)
				    {
				      System.out.print(c+",");
				    }*/
				    
				    for (int i = 0; i < cars.size(); i++) {
				        Object c = cars.get(i);
				        System.out.print(c);
				        if (i < cars.size() - 1) {
				            System.out.print(", ");
				        } else {
				            System.out.print(".");
				        }
				    }
				    System.out.println();
				    System.out.println();
				  }
				  
			}
		});
		btnNewButton.setBounds(308, 205, 175, 107);
		frame.getContentPane().add(btnNewButton);
	}
}
