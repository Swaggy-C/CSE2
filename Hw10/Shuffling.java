/* Carter Prevost
CSE 002, Section 110
HW 10
November 1, 2015

This program takes a deck of 52 cards, shuffles it, and returns a hand of 5 cards from the shuffled deck. */



//add Shuffling class
public class Shuffling 
{
    //add main method
    public static void main(String[] args)
    {
        
        //suits club, heart, spade, or diamond
        
        String[] suitNames = {"C", "H", "S", "D"}; 
        String[] rankNames = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"}; 
        String[] cards = new String[52];
        String[] hand = new String[5]; 
        
        for (int i=0; i<52; i++)
        {
            cards[i] = rankNames[i%13] + suitNames[i/13]; 
            System.out.print(cards[i] + " ");
        }
        
        
        shuffle(cards); //shuffle deck
        System.out.println("Shuffled");
        printArray(cards); //print shuffled deck
        hand = randomizeHand(cards); 
        System.out.println("Randomized Hand!");
        printArray(hand); //print randomized hand 
        
        
        
        
    }//end main method
    
    //add method that randomizes a card hand
    public static String[] randomizeHand(String[] list)
    {
    	int a, b, c, d, e;
    	
    	//create random numbers, making sure no two numbers are equal 
    	a = (int)(Math.random()*52);
    	b = (int)(Math.random()*52);
    	
    	while(a==b)
    	{
    		b = (int)(Math.random()*52); 
    	}
    	
    	c = (int)(Math.random()*52);
    	
    	while(b==c)
    	{
    		c = (int)(Math.random()*52);
    	}
    	
    	d = (int)(Math.random()*52);
    	
    	while(c==d)
    	{
    		d = (int)(Math.random()*52);
    	}
    	
    	e = (int)(Math.random()*52);
    	
    	while(d==e)
    	{
    		e = (int)(Math.random()*52);
    	}
    	
    	//create array to hold 5 cards from the deck 
    	String[] randomHand = new String[5]; 
    	randomHand[0] = list[a];
    	randomHand[1] = list[b];
    	randomHand[2] = list[c];
    	randomHand[3] = list[d];
    	randomHand[4] = list[e]; 
    	
    	return randomHand; 
    	
    } // end randomizeHand method
    
    public static String[] shuffle(String[] list)
    {
    	
    	
    	//swap cards 150 times 
    	
    	for (int i=0; i<150; i++)
    	{
    	    String temp = list[0]; 
    	    int x = (int)(Math.random()*52);
    	    list[0] = list[x];
    	    list[x] = temp; 
    	    
    	}
    	
    	return list; 
    }// end shuffle method 
    
    public static void printArray(String list[])
    {
    	String printer = "";
    	for (int i=0; i<list.length; i++)
    	{
    		printer += (list[i] + " "); // add each item to a single string 
    	}
    	System.out.println(printer); //print single string 
    }//end printArray method
    		
} //end Shuffling class