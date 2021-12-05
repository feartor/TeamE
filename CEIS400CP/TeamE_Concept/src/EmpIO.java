
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author TheMonster
 */
public class EmpIO {

    //attributes
    private String fileName;

    //constructors
    public EmpIO() {
        fileName = "Stocks.txt";
    }

    public EmpIO(String fileName) {
        setFileName(fileName);
    }

    //behaviors
    public ArrayList<Emp> getData() throws FileNotFoundException {
        //create ArrayList
        ArrayList<Emp> data = new ArrayList<Emp>();

        try {
            //load the arraylist with the data from the file
            BufferedReader inFile = new BufferedReader(new FileReader(fileName));
            String inputLine = "";
            StringTokenizer tokens;
            
            //get the first line
            inputLine = inFile.readLine();
            
            //read line by line
            while(inputLine != null)
            {
                // break the line into parts --
                tokens = new StringTokenizer ( inputLine, ",");
                String company = tokens.nextToken();
                double shares = Double.parseDouble(tokens.nextToken());
                double pPrice = Double.parseDouble (tokens.nextToken());
                double cPrice = Double.parseDouble(tokens.nextToken());
                
                //create a stock Object and add to ArrayList
                Emp stk = new Emp(company,shares,pPrice,cPrice);
                data.add(stk);
                
                //read the next line
                inputLine = inFile.readLine();
                
            }
            
            //Close the file
            inFile.close();
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error. Unable to write to the file: "
                    + ex.getMessage(), fileName, JOptionPane.ERROR_MESSAGE);
        }
        //return the ArrayList
        return data;
    }

    public void saveData(ArrayList<Emp> data) {
        try {
            //create a pipe a buffered writer
            BufferedWriter outFile = new BufferedWriter(new FileWriter(fileName));
            //write the stocks by cycling through the data
            for (int i = 0; i < data.size(); i++) {
                Emp stk = data.get(i);
                outFile.write(stk.getCompanyName() + ',');
                outFile.write("" + stk.getNumberOfShares() + ',');
                outFile.write("" + stk.getPurchasePrice() + ',');
                outFile.write("" + stk.getCurrentPrice());
                outFile.newLine(); //Enter key to drop to next line
            }

            //close the file
            outFile.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error. Unable to write to the file: " + ex.getMessage(), fileName, JOptionPane.ERROR_MESSAGE);
        }
    }

    //getters and setters
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        if (fileName.length() > 0) {
            this.fileName = fileName;
        } else {
            this.fileName = "Stocks.txt";
        }
    }

}
