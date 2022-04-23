
/*A protein has the following qualities:
 *It begins with a “start codon”: ATG.
 *It ends with a “stop codon”: TGA.
 *In between, each additional codon is a sequence of three nucleotides.
 */

//This is a String program that determines whether there is a protein in a strand of DNA

public class DNA{
 public static void main(String[] args){
   String dna1 = "ATGCGATACGCTTGA";
   String dna2 = "ATGCGATACGTGA";
   String dna3 = "ATTAATATGTACTGA";
   String dna = dna3;

   //Find the length;
   int length = dna.length();
   System.out.println("Length: " + length);

   // Find start codon: 
   int start = dna.indexOf("ATG");
   System.out.println("Start: " + start);

   // Find stop codon:
   int stop = dna.indexOf("TGA");
   System.out.println("Stop: " + stop);

   if(start != -1 && stop != -1 && (stop - start) % 3 == 0){
  String protein = dna.substring(start, stop+3); 
  System.out.println(protein + " is a Protein.");
 
   }else{
     System.out.println(dna + " is not a protein.");
   }
 }

}