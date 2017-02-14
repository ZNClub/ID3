/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        List<Attribute> attributes = new LinkedList<Attribute>();
        
            // INPUT READING START  
        
        String csvFile = "C:\\Users\\universe\\Documents\\NetBeansProjects\\ID3\\src\\id3\\id3.csv";
        BufferedReader br = new BufferedReader(new FileReader(csvFile));
        String line="";
        int line_num = 0;
        while ((line = br.readLine()) != null) {
            String[] columns = line.split(",");
            System.out.println("attributes="+columns.length+"\nvalues="+Arrays.toString(columns));
            //  INSTANTIATE
            if(line_num==0){
                for(String i:columns){
                    Attribute a = new Attribute(i,new HashSet<String>(),new LinkedList<String>(),0.0f,0.0f);                    
                    attributes.add(a);
                }
            }
            else{
                for(int i=0; i<columns.length; i++){
                    attributes.get(i).getRecords().add(columns[i]);
                }
            }
        }
        
        for(Attribute a : attributes){
            System.out.println(a.toString());
        }
        
            // PERSIST 
        
            // INPUT READING END        
    }
    
}
