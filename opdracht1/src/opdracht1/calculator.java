/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opdracht1;

/**
 *
 * @author webde
 */
public class calculator {

    static Integer Bereken(String text) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //Integer ingevoerdeText = Integer.parseInt(text); 
        Integer answer=0;
        
        if(text.contains("*")){
            String[] exploded = text.split("\\*"); 
            for (int i = 0; i < exploded.length; i++) { 
                int intValue = Integer.parseInt(exploded[i]); 
                if(answer==0){answer=1;}
                answer = answer * intValue; //add the current item to the answer
                //System.out.println(answer + "  new answer");
            }
        }
        if(text.contains("/")){
            String[] exploded = text.split("/"); 
            for (int i = 0; i < exploded.length; i++) { 
                int intValue = Integer.parseInt(exploded[i]); 
                if(answer==0){answer=intValue;}
                else{answer = answer / intValue;} //add the current item to the answer
                //System.out.println(intValue + " subtracted from the answer");
            }
        }
        
        if (text.contains("+")) { //1+2+3
            String[] exploded = text.split("\\+"); // find all the +'s
            for (int i = 0; i < exploded.length; i++) { //loop through the items between the +'s
                int intValue = Integer.parseInt(exploded[i]); //1 item
                answer += intValue; //add the current item to the answer
                //System.out.println(intValue + " added to the answer");
            }
        }
        if(text.contains("-")){
            String[] exploded = text.split("\\-"); 
            for (int i = 0; i < exploded.length; i++) { 
                int intValue = Integer.parseInt(exploded[i]); 
                answer -= intValue; //add the current item to the answer
                //System.out.println(intValue + " subtracted from the answer");
            }
        }
        //System.out.println("final answer " + answer);
        return answer;
    }
    
}
