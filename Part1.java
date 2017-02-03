
/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


import edu.duke.*;
import java.io.*;

public class Part1 {

    
    public String findSimpleGene(String dna)
    {
    
      String result = "";
      
      int startIndex = dna.indexOf("ATG");
      
      if(startIndex == -1) 
      {
        return "no ATG found";
       
      }
      int stopIndex = dna.indexOf("TAA",startIndex + 3);
     
      if(stopIndex == -1)
      {
        return "no TAA found";
        
        }
        
        String LengthOFGene = dna.substring(startIndex + 3,stopIndex);
        
       
        if ((LengthOFGene.length()) %3 == 0)
        {
        
           return dna.substring(startIndex,stopIndex + 3);
        
        }
      
   return result;
   
        
    }
    
    public void testFindGeneSimple() {
        //ATG and TAA multiple of 3
        String dna = "ATGGAFSTATAA";
        System.out.println("DNA strand is " + dna);
        String gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
        //ATG and TAA multiples of 3
        dna = "ATGTAA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
     //no ATG
        dna = "TAAGAHSTASA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
        //no TAA
        dna = "ATGAKJSAJHSA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
        
        //ATG and TAA not multiples of 3
        dna = "ATGRFGRGTHTAA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
    }
}

