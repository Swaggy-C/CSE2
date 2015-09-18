//Carter Prevost
//CSE 002, Section 110
//Lab 04
/*  DESCRIBE THE PROGRAM
FWEFEF WEFEF
F FREFFWEFFEWFEWFEWFEWFEWFEFEF F WF2F EWF */


//Define class
public class CardGenerator{
    //add main method
    public static void main(String[] args) {
        
        //Generate random numbers on the interval [1,52]
        
        int card= (int) (Math.random()*52)+1; 
        //Define suit and card name for each card
        String suit="doesn't matter";
        int newNum=card; 
        
        //Change cases where the card number is greater than 13 to be within the 1<card<13 change
        
          if (newNum<=13) {
              newNum=card;
          }
          else {
              newNum=card%13;
          }
              
        
        //define card name as a number in scenarios where they are jacks, queens, etc. 
        String cardName=Integer.toString(newNum);
        
        //Give suit name to each family of cards
            if (card<=13 & card>=1) {
                suit="Diamonds";
            }
                else if (card>=14 & card<=26) {
                    suit="Clubs";
                }
                    else if (card>=27 & card<=39) {
                        suit="Hearts";
                    }
                        else if (card>=40 & card<=52) {
                            suit="Spades";
                        }
        //Use switch to give each card its rank
            switch (newNum) {
                //Aces
                
                case 1:
                cardName="Ace";
                break;
                
                
                
                //jacks
                
                case 11:
                cardName="Jack";
                break;
                
                
                
                //queen
                
                case 12:
                cardName="Queen";
                break;
                
                
                
                //king
                
                case 0:
                cardName="King";
                break;
                
                
                
            }
            
            System.out.println("You picked the "+cardName+ " of "+suit); 
    }
}