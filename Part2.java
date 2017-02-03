
/**
 * Write a description of Part1 here.
 * 
 * @author (Manasi Sukthankar) 
 * @version (02/02/2017)
 */


import edu.duke.*;
import java.io.*;

public class Part2 {

    
    public String findSimpleGene(String dna, String startCodon, String stopCodon)
    {
    
      String result = "";
      
      String dna1 = dna.toLowerCase();
      
     // System.out.println(dna1);
      
      boolean output = dna1.equals(dna);
     //  System.out.println(output);
      
      if (output == true)
      {
        startCodon = startCodon.toLowerCase();
        stopCodon = stopCodon.toLowerCase();
        
        }
        
     else {
        startCodon = startCodon.toUpperCase();
        stopCodon = stopCodon.toUpperCase();
        
        }
      int startIndex = dna.indexOf(startCodon);
      
      if(startIndex == -1) 
      {
        return "no ATG found";
       
      }
      int stopIndex = dna.indexOf(stopCodon,startIndex + 3);
     
      if(stopIndex == -1)
      {
        return "no TAA found";
        
        }
        
        String LengthOFGene = dna.substring(startIndex + 3,stopIndex);
        result = dna.substring(startIndex,stopIndex + 3);
        
        if (((LengthOFGene.length()) %3 == 0) && output == true)
        {
       
          return result.toLowerCase();
        
        }
        else if (((LengthOFGene.length()) %3 == 0) && output == false)
        {
          
          return result.toUpperCase();
        }
       
        
   return result;
   
        
    }
    
    public void testFindGeneSimple() {
        //ATG and TAA multiple of 3
        String dna = "ATGGGTTAAGTC";
        System.out.println("DNA strand is " + dna);
        String gene = findSimpleGene(dna,"ATG","TAA");
        System.out.println("Gene is " + gene);
        
        //ATG and TAA multiples of 3
        dna = "atghsgshdtaa";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna,"ATG","TAA");
        System.out.println("Gene is " + gene);//no ATG
        
        
       /* dna = "atgcaskdhaksdhTAA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna,"ATG","TAA");
        System.out.println("Gene is " + gene);
        
        //no TAA
        dna = "ATGAKJSAJHSA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna,"ATG","TAA");
        System.out.println("Gene is " + gene);
        
        
        //ATG and TAA not multiples of 3
        dna = "ATGRFGRGTHTAA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna,"ATG","TAA");
        System.out.println("Gene is " + gene);*/
    }
}

