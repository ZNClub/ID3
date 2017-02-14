/*
 * 
 * @author: ZNevzz
 * 
 */
package id3;

import java.io.*;
import java.util.*;

/**
 *
 * @author universe
 */
public class ID3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
            // INSTANTIATE
        //Reader fileReader = new FileReader(new File("c:\\Users\\universe\\Documents\\NetBeansProjects\\ID3\\src\\id3.csv"));
        
        
            // INPUT READING START  
        List<Attribute> attributes = new LinkedList<Attribute>();        
        String csvFile = "C:\\Users\\universe\\Documents\\NetBeansProjects\\ID3\\src\\id3\\id3.csv";
        BufferedReader br = new BufferedReader(new FileReader(csvFile));
        String line="";
        while ((line = br.readLine()) != null) {
            String[] columns = line.split(",");
            System.out.println("attributes="+columns.length+"\nvalues="+Arrays.toString(columns));

        }
        
            // INPUT READING END        
    }
    
}
