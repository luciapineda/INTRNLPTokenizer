/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regextokenizer;

import java.util.ArrayList;

/**
 *
 * @author Lucia Pineda
 */
public class Tokenizer {
    
    private String input;
    private String[] inputArr;
    private ArrayList<String> repeats; //array list of words that occur more than once
    
    public Tokenizer (String input){
        this.input = input;
        repeats = new ArrayList<String>();
    }
    
    public int countWords(String input){
        if(input == null || input.isEmpty()){
            return 0;
        }
        
        inputArr = input.split("\\s+");
        return inputArr.length;
    }
    
    public int getFrequency(String match){ //as of now, match means the word u wanna get the frequency of
        int ctr = 0;
        for(int i = 0; i < inputArr.length; i++){
            if(match.equals(inputArr[i])){
                ctr++;
            }
        }
        
        return ctr;
    }
    
    public void getOutput(){
        boolean found = false;
        System.out.println("Total words: " + countWords(input));
        for(int i = 0; i < inputArr.length; i++){
            if(!(repeats.isEmpty())){
                for(int j = 0; j < repeats.size(); j++){
                    if(inputArr[i].equals(repeats.get(j))){ //if the word has already been read
                        found = true;
                    }  
                }
            }
            
            if(found == false){
                if(getFrequency(inputArr[i]) > 1){ //if the word occurs more than once
                    repeats.add(inputArr[i]);
                    System.out.println(inputArr[i] + ": " + getFrequency(inputArr[i]));
                }
                else{
                    System.out.println(inputArr[i] + ": " + getFrequency(inputArr[i]));
                }
            }
            
            found = false;
        }
    }
    
}
