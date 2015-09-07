//Carter Prevost
//CSE2, Section 110 
//September 8, 2015
//This program computes the price of items purchased at Walmart, including the 6% PA sales tax. 


//Define a class
public class Arithmetic{
//Add main method
    public static void main(String[] args) {
        
        int nSocks=3; //Define number of pairs of socks
        double sockCost$=2.58; //Define the price per pair of socks
        int nGlasses=6; //Define the number of drinking glasses
        double glassCost$=2.29; //Define the price of each drinking glass
        int nEnvelopes=1; //Define the number of boxes of envelopes 
        double envelopeCost$=3.25; //Define the price of each box of envelopes
        double taxPercent=0.06; //Define the PA sales tax as 6%
        double totalCostSock$, totalCostGlasses$, totalCostEnvelopes$; 
        //Define total costs of each item purchased 
        double totalCostBeforeTax$, totalSalesTax$, totalCostAfterTax$; 
        //Define costs before and after tax
        
        totalCostSock$=nSocks*sockCost$; 
        //Total cost of socks is the number of socks multiplied by the cost of each pair of socks
        totalCostGlasses$=nGlasses*glassCost$; 
        //Total cost of glasses is the number of glasses multiplied by the cost of each glass
        totalCostEnvelopes$=nEnvelopes*envelopeCost$;
        //Total cost of envelopes is the number of envelopes multiplied by the cost of each box of envelopes
        totalCostBeforeTax$=(totalCostSock$+totalCostGlasses$+totalCostEnvelopes$);
        //Total cost before tax is the cost of each item added together
        totalSalesTax$=totalCostBeforeTax$*taxPercent;
        //Total sales tax is the total cost before tax multiplied by the tax percent 
        totalCostAfterTax$=totalCostBeforeTax$+totalSalesTax$;
        //Total cost of the transaction is the cost before tax added to the total sales tax
        
        double salesTaxSock$=totalCostSock$*taxPercent;
        double salesTaxGlasses$=totalCostGlasses$*taxPercent;
        double salesTaxEnvelopes$=totalCostEnvelopes$*taxPercent;
        //Sales tax for each item is the cost of the item multiplied by the tax percent
        
        //Convert values to dollar values with two decimal places
            double newTotalSalesTax$=totalSalesTax$*100;
            int intermediate1;
            intermediate1= (int) newTotalSalesTax$;
            double dollarTotalSalesTax$=intermediate1/100.0; 
            
            double newTotalCostAfterTax$=totalCostAfterTax$*100;
            int intermediate2;
            intermediate2= (int) newTotalCostAfterTax$;
            double dollarTotalCostAfterTax$=intermediate2/100.0; 
            
            double newSalesTaxSock$=salesTaxSock$*100;
            int intermediate3;
            intermediate3= (int) newSalesTaxSock$;
            double dollarSalesTaxSock$=intermediate3/100.0;
            
            double newSalesTaxGlasses$=salesTaxGlasses$*100;
            int intermediate4;
            intermediate4= (int) newSalesTaxGlasses$;
            double dollarSalesTaxGlasses$=intermediate4/100.0;
            
            double newSalesTaxEnvelopes$=salesTaxEnvelopes$*100;
            int intermediate5;
            intermediate5= (int) newSalesTaxEnvelopes$;
            double dollarSalesTaxEnvelopes$=intermediate5/100.0;
            
        //Print the item being purchased, how many of each item, and the price of the items. 
        
        System.out.println("The first item being purchased is socks.");
        System.out.println("The number of pairs of socks is "+nSocks+".");
        System.out.println("The cost for each pair of socks is "+sockCost$+" dollars.");
        
        System.out.println("");
        
        System.out.println("The second item being purchased is drinking glasses.");
        System.out.println("The number of drinking glasses is "+nGlasses+".");
        System.out.println("The cost for each pair of socks is "+glassCost$+" dollars.");
        
        System.out.println("");
        
        System.out.println("The third item being purchased is envelopes.");
        System.out.println("The number of boxes of envelopes is "+nEnvelopes+".");
        System.out.println("The cost for each box of envelopes is "+envelopeCost$+" dollars."); 
        
        System.out.println("");
        
        //Print out 
        
        System.out.println("The total cost of the socks before tax is "+totalCostSock$+" dollars.");
        System.out.println("The sales tax on this purchase is "+dollarSalesTaxSock$+" dollars.");
        
        System.out.println("");
        
        System.out.println("The total cost of the drinking glasses before tax is "+totalCostGlasses$+" dollars.");
        System.out.println("The sales tax on this purchase is "+dollarSalesTaxGlasses$+" dollars.");
        
        System.out.println("");
        
        System.out.println("The total cost of the envelopes before tax is "+totalCostEnvelopes$+" dollars.");
        System.out.println("The sales tax on this purchase is "+dollarSalesTaxEnvelopes$+" dollars.");
        
        System.out.println("");
        
        //Print out total costs of the transaction before and after tax 
        
        System.out.println("The total cost of the purchases before sales tax is "+totalCostBeforeTax$+" dollars.");
        System.out.println("The total sales tax is "+dollarTotalSalesTax$+" dollars.");
        System.out.println("The total cost of the transaction including sales tax is "+dollarTotalCostAfterTax$+" dollars.");
        
        
        
        
    } //end main method
} //end of class