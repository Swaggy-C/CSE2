//Carter Prevost
//September 22, 2015
//CSE 002, Section 110
 
/* This program generates 5 random cards (from 5 different decks) and determines whether these cards contain
a pair, two-pair, three of a kind, or high card. */

//Define class
public class PokerHandCheck{
    //add main method
    public static void main(String[] args) {
        //define 5 random cards
        int card1= (int) (Math.random()*52)+1;
        int card2= (int) (Math.random()*52)+1;
        int card3= (int) (Math.random()*52)+1;
        int card4= (int) (Math.random()*52)+1;
        int card5= (int) (Math.random()*52)+1;
        
        //Define suit variable
        String suit=""; 
        
        //Define a new card number variable for each card
        int newCard1=card1;
        int newCard2=card2;
        int newCard3=card3;
        int newCard4=card4;
        int newCard5=card5; 
        
        
        
        
        
        //Change cases where the card number is greater than 13 to a number between 1 and 13
        
        if (newCard1<=13) {
            newCard1=card1;
        }
        else {
            newCard1=card1%13;
        }
        
            if (newCard2<=13) {
                newCard2=card2;
            }
            else {
                newCard2=card2%13;
            }
        
                if (newCard3<=13) {
                    newCard3=card3;
                }
                else {
                    newCard3=card3%13;
                }
        
                    if (newCard4<=13) {
                        newCard4=card4;
                    }
                    else {
                        newCard4=card4%13;
                    }
        
                        if (newCard5<=13) {
                            newCard5=card5;
                        }
                        else {
                            newCard5=card5%13;
                        }
                        
    //define card name as a number in scenarios where they are jacks, queens, etc. 
        String cardName1=Integer.toString(newCard1);
        String cardName2=Integer.toString(newCard2);
        String cardName3=Integer.toString(newCard3);
        String cardName4=Integer.toString(newCard4);
        String cardName5=Integer.toString(newCard5);
        
        
        //Give suit name to each card1
            if (card1<=13 & card1>=1) {
                suit="Diamonds";
            }
                else if (card1>=14 & card1<=26) {
                    suit="Clubs";
                }
                    else if (card1>=27 & card1<=39) {
                        suit="Hearts";
                    }
                        else if (card1>=40 & card1<=52) {
                            suit="Spades";
                        }
                        
            //Give suit name to each card2
            if (card2<=13 & card2>=1) {
                suit="Diamonds";
            }
                else if (card2>=14 & card2<=26) {
                    suit="Clubs";
                }
                    else if (card2>=27 & card2<=39) {
                        suit="Hearts";
                    }
                        else if (card2>=40 & card2<=52) {
                            suit="Spades";
                        }
        //Give suit name to each card3
            if (card3<=13 & card3>=1) {
                suit="Diamonds";
            }
                else if (card3>=14 & card3<=26) {
                    suit="Clubs";
                }
                    else if (card3>=27 & card3<=39) {
                        suit="Hearts";
                    }
                        else if (card3>=40 & card3<=52) {
                            suit="Spades";
                        }
            //Give suit name to each card4
            if (card4<=13 & card4>=1) {
                suit="Diamonds";
            }
                else if (card4>=14 & card4<=26) {
                    suit="Clubs";
                }
                    else if (card4>=27 & card4<=39) {
                        suit="Hearts";
                    }
                        else if (card4>=40 & card4<=52) {
                            suit="Spades";
                        }
            //Give suit name to each card5
            if (card5<=13 & card5>=1) {
                suit="Diamonds";
            }
                else if (card5>=14 & card5<=26) {
                    suit="Clubs";
                }
                    else if (card5>=27 & card5<=39) {
                        suit="Hearts";
                    }
                        else if (card5>=40 & card5<=52) {
                            suit="Spades";
                        }
            //Use switch to give card1 its rank
             switch (newCard1) {
                //Aces
                
                case 1:
                cardName1="Ace";
                break;
                
                case 14:
                cardName1="Ace";
                break;
                
                case 27:
                cardName1="Ace";
                break;
                
                case 40:
                cardName1="Ace";
                break;
                
                
                //jacks
                
                case 11:
                cardName1="Jack";
                break;
                
                case 24:
                cardName1="Jack";
                break;
                
                case 37:
                cardName1="Jack";
                break;
                
                case 50:
                cardName1="Jack";
                break;
                
                //queen
                
                case 12:
                cardName1="Queen";
                break;
                
                case 25:
                cardName1="Queen";
                break;
                
                case 38:
                cardName1="Queen";
                break;
                
                case 51:
                cardName1="Queen";
                break;
                
                
                //king
                
                case 0:
                cardName1="King";
                break;
                
                case 26:
                cardName1="King";
                break;
                
                case 39:
                cardName1="King";
                break;
                
                case 52:
                cardName1="King";
                break;
             }   
                //Use switch to give card2 its rank
             switch (newCard2) {
                //Aces
                
                case 1:
                cardName2="Ace";
                break;
                
                case 14:
                cardName2="Ace";
                break;
                
                case 27:
                cardName2="Ace";
                break;
                
                case 40:
                cardName2="Ace";
                break;
                
                
                //jacks
                
                case 11:
                cardName2="Jack";
                break;
                
                case 24:
                cardName2="Jack";
                break;
                
                case 37:
                cardName2="Jack";
                break;
                
                case 50:
                cardName2="Jack";
                break;
                
                //queen
                
                case 12:
                cardName2="Queen";
                break;
                
                case 25:
                cardName2="Queen";
                break;
                
                case 38:
                cardName2="Queen";
                break;
                
                case 51:
                cardName2="Queen";
                break;
                
                
                //king
                
                case 0:
                cardName2="King";
                break;
                
                case 26:
                cardName2="King";
                break;
                
                case 39:
                cardName2="King";
                break;
                
                case 52:
                cardName2="King";
                break;
             }    
                //Use switch to give card3 its rank
             switch (newCard3) {
                //Aces
                
                case 1:
                cardName3="Ace";
                break;
                
                case 14:
                cardName3="Ace";
                break;
                
                case 27:
                cardName3="Ace";
                break;
                
                case 40:
                cardName3="Ace";
                break;
                
                
                //jacks
                
                case 11:
                cardName3="Jack";
                break;
                
                case 24:
                cardName3="Jack";
                break;
                
                case 37:
                cardName3="Jack";
                break;
                
                case 50:
                cardName3="Jack";
                break;
                
                //queen
                
                case 12:
                cardName3="Queen";
                break;
                
                case 25:
                cardName3="Queen";
                break;
                
                case 38:
                cardName3="Queen";
                break;
                
                case 51:
                cardName3="Queen";
                break;
                
                
                //king
                
                case 0:
                cardName3="King";
                break;
                
                case 26:
                cardName3="King";
                break;
                
                case 39:
                cardName3="King";
                break;
                
                case 52:
                cardName3="King";
                break;
             }    
                //Use switch to give card4 its rank
             switch (newCard4) {
                //Aces
                
                case 1:
                cardName4="Ace";
                break;
                
                case 14:
                cardName4="Ace";
                break;
                
                case 27:
                cardName4="Ace";
                break;
                
                case 40:
                cardName4="Ace";
                break;
                
                
                //jacks
                
                case 11:
                cardName4="Jack";
                break;
                
                case 24:
                cardName4="Jack";
                break;
                
                case 37:
                cardName4="Jack";
                break;
                
                case 50:
                cardName4="Jack";
                break;
                
                //queen
                
                case 12:
                cardName4="Queen";
                break;
                
                case 25:
                cardName4="Queen";
                break;
                
                case 38:
                cardName4="Queen";
                break;
                
                case 51:
                cardName4="Queen";
                break;
                
                
                //king
                
                case 0:
                cardName4="King";
                break;
                
                case 26:
                cardName4="King";
                break;
                
                case 39:
                cardName4="King";
                break;
                
                case 52:
                cardName4="King";
                break;
             }    
                //Use switch to give card5 its rank
             switch (newCard5) {
                //Aces
                
                case 1:
                cardName5="Ace";
                break;
                
                case 14:
                cardName5="Ace";
                break;
                
                case 27:
                cardName5="Ace";
                break;
                
                case 40:
                cardName5="Ace";
                break;
                
                
                //jacks
                
                case 11:
                cardName5="Jack";
                break;
                
                case 24:
                cardName5="Jack";
                break;
                
                case 37:
                cardName5="Jack";
                break;
                
                case 50:
                cardName5="Jack";
                break;
                
                //queen
                
                case 12:
                cardName5="Queen";
                break;
                
                case 25:
                cardName5="Queen";
                break;
                
                case 38:
                cardName5="Queen";
                break;
                
                case 51:
                cardName5="Queen";
                break;
                
                
                //king
                
                case 0:
                cardName5="King";
                break;
                
                case 26:
                cardName5="King";
                break;
                
                case 39:
                cardName5="King";
                break;
                
                case 52:
                cardName5="King";
                break;
                
             }    
             
             //Use an if statement to convert numbers>13 to a number between 1 and 13. 
         /*     
             if (cardName1<=13) {
                 cardName1=cardName1;
             } 
                else if (cardName1>13) {
                    cardName1=cardName1%13;
                }
            
            if (cardName2<=13) {
                 cardName2=cardName2;
             } 
                else if (cardName2>13) {
                    cardName2=cardName2%13;
                }
                
            if (cardName3<=13) {
                 cardName3=cardName3;
             } 
                else if (cardName3>13) {
                    cardName3=cardName3%13;
                }
             
             if (cardName4<=13) {
                 cardName4=cardName4;
             } 
                else if (cardName4>13) {
                    cardName4=cardName4%13;
                }      
            if (cardName5<=13) {
                 cardName5=cardName5;
             } 
                else if (cardName5>13) {
                    cardName5=cardName5%13;
                }
             */    
             //define hand variable as a string
             String hand=""; 
             
        //Use if statements to determine when the hand has a pair 
        
    
       //Create variable that adds 1 for every pair so that a two-pair can be calculated 
       //Define pairCounter 
       int pair=0; 
       /* 
       if (cardName1==cardName2 || cardName1==cardName3 || cardName1==cardName4 || cardName1==cardName5) {
            pairCounter=pairCounter+1;
        } 
            else if (cardName2==cardName3 || cardName2==cardName4 || cardName2==cardName5) {
                pairCounter=pairCounter+1;
            }
                else if (cardName3==cardName4 || cardName3==cardName5) {
                    pairCounter=pairCounter+1; 
                }
                    else if (cardName4==cardName5) {
                        pairCounter=pairCounter+1; 
                    }
        */ 
              
             
        //Seperate the if statements so the pair counter goes through each instance
        if (cardName1.equals(cardName2)) {
            pair+=1; 
        }
        if (cardName1.equals(cardName3)) {
            pair+=1;
        }
        if(cardName1.equals(cardName4)) {
            pair+=1; 
        }
        if(cardName1.equals(cardName5)) {
            pair+=1;
        }
            if (cardName2.equals(cardName3)) {
                pair+=1;
            }
            if (cardName2.equals(cardName4)) {
                pair+=1;
            }
            if (cardName2.equals(cardName5)) {
                pair+=1;
                }
                if (cardName3.equals(cardName4)) {
                    pair+=1;
                }
                if (cardName3.equals(cardName5)) {
                    pair+=1;
                }
                    if (cardName4.equals(cardName5)) {
                        pair+=1; 
                    }
                    
        //Define variable to hold when the hand has different kinds of pairs
        String typePair=""; 
        //Use an if statements to print out when the hand has a pair, two-pair, three of a kind, or high card based on the pair counter
        
        if (pair==0) {
            typePair="high card hand!";
        } 
            else if (pair==1) {
                typePair="pair!";
            }
                else if (pair==2) {
                    typePair="two-pair!";
                }
                    else if (pair==3) {
                        typePair="three of a kind!"; 
                    }
        //Print out the 5-card hand including the type of hand (such as pair, two-pair; etc.)  
        
        System.out.println("Your random cards were:");
        System.out.println("the "+cardName1+" of "+suit); 
        System.out.println("the "+cardName2+" of "+suit);
        System.out.println("the "+cardName3+" of "+suit);
        System.out.println("the "+cardName4+" of "+suit);
        System.out.println("the "+cardName5+" of "+suit); 
        System.out.println("");
        System.out.println("You have a "+typePair); 
        
    } //end main method
} //end of class 


/*I apologize for the abundance of redundant code in this program. I switched my strategy multiple times
after realizing certain methods would not work. */ 
