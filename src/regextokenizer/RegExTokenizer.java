/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regextokenizer;

/**
 *
 * @author Lucia Pineda
 */
public class RegExTokenizer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input = "This is an example of a corpus for processing. \n" +
                 "There isn't much to it, but here it is.\n" +
                 "Also, here is a number, 55. Is this a word?";
        Tokenizer tokenizer = new Tokenizer(input);
        tokenizer.getOutput();
    }
    
}
