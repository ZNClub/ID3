/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id3;

import java.util.List;
import java.util.Set;

/**
 *
 * @author universe
 */
public class Attribute {
    private String name;
    private Set<String> domains;
    private List<String> records;
    private double entropy;
    private double gain;
    
    public String getName() {
        return name;
    }

    public Set<String> getDomains() {
        return domains;
    }

    public List<String> getRecords() {
        return records;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDomains(Set<String> domains) {
        this.domains = domains;
    }

    public void setRecords(List<String> records) {
        this.records = records;
    }
    
    
}
