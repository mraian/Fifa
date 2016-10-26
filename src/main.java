/**
 * @author mohammedraian
 * 
 * 
 * This program will serve the purpose of a fair distribution of teams in a Fifa tournament
 * Depending on how many players are playing it will be modified itself
 * So user doesn't have to worry about how many players are playing
 * 
 * 
 * 
 * 
 */

import java.lang.Math;
import java.util.ArrayList;
import javax.swing.*;


public class main {
	public static void main(String[] args){
		
		//ArrayList<String> teamNames = new ArrayList<String>();
		
		
		int totalPlayer =Integer.parseInt(JOptionPane.showInputDialog(null,"Welcome to the draw for Fifa tournament.\n So how many players do you have?"));
		
		ArrayList<String> teamNames = new ArrayList<String>();
		
		JOptionPane.showMessageDialog(null,"Now add "+totalPlayer+" teams one by one in the suffle box");
		
		
		
		
		for(int i=1; i<=totalPlayer; i++){
		String name =	JOptionPane.showInputDialog(null,"Team "+i+" :");
		
		teamNames.add(name);
			
		}
		
		for (int p = 0; p < teamNames.size(); p++) {
            System.out.println(teamNames.get(p));
            
        }
		
		//Lottery starts here
		
		JOptionPane.showMessageDialog(null,"Now let the lottery begin...Muhahahaa " );
		
		int count=1;
		String finalResult="";
		
		ArrayList<Integer> keepTrack = new ArrayList<Integer>();
		
		while(count<=totalPlayer){
			String yourName = JOptionPane.showInputDialog(null,"What's your name : ");
			int validRandom = 0;
			
			
			while(validRandom==0){
			
				int random = (int )(Math.random() * 12+ 1); 
				System.out.println(random + "tag 1");
				
				
				
				if (random<=totalPlayer){
					
					if(keepTrack.size()==0)  //initially the size of KeepTrack would be 0 and so first random number would be valid
						validRandom=1;
				
					else{
						validRandom=1;
						for(int j=0;j<keepTrack.size();j++){
							if(keepTrack.get(j)==random){
								validRandom=0;
								break;
							}
						}
					}	
	
					
			
					
					if (validRandom==1){
						keepTrack.add(random);
						JOptionPane.showMessageDialog(null, "Mr. "+yourName+" Your team will be : "+teamNames.get(random-1) );
						finalResult=finalResult+ "\n " + yourName+ "-------"+teamNames.get(random-1);
					}	
				
					for (int k = 0; k < keepTrack.size(); k++) {
						System.out.println(keepTrack.get(k)+"Tag 2");
		            
					}
				}
				
			}//end of inside while loop
			
			count++;
			
		}//end of outside while loop
		
		JOptionPane.showMessageDialog(null, finalResult );
	} //end of void main

}//end of main
