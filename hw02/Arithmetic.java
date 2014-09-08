/*
Jordan Hess
hw02 - arithmetic
9/9/14

This is a program to calcualte costs from a trip to Walmart

Goals:
Total cost of each kind of item; sales tax for that total cost
Total cost of purchases (before tax)
Total actually paid for this transaction, including sales tax. 

*/

public class Arithmetic{
    
    public static void main(String args[]){
        
        //socks
        int nSocks=3;//number of socks
        double sockCost$=2.58;//price per sock
    
        //glasses
        int nGlasses=6;// number of glasses
        double glassCost$=2.29;// price per glass
        
        //envelopes
        int nEnvelopes=1;//number of envelopes
        double envelopeCost$=3.25;//cost per envelope
        
        //tax rate
        double taxPercent=0.06;
        
        //individual costs
        double totalSockCost$;//total cost of socks
        double totalGlassesCost$;//total cost of glasses
        double totalEnvelopeCost$;//total cost of envelopes
        
        //individual taxes
        double totalSockTax$;//total cost of socks tax
        double totalGlassesTax$;//total cost of glasses tax
        double totalEnvelopeTax$;//total cost of envelopes tax
        
        //individual costs with taxes
        double totalGlassesCostWithTaxes$;//total cost of glasses with tax
        double totalSockCostWithTaxes$;//total cost of socks with tax
        double totalEnvelopeCostWithTaxes$;//total cost of socks with tax
       
        //total costs
        double totalCostBeforeTax$;   //total cost of everything without taxes
        double totalTaxes$; // total cost of taxes
        double totalCost$;   //total cost of everytinhg
        

        
        //calculating costs
        
        //socks
        totalSockCost$ = nSocks*sockCost$; //total cost
        totalSockTax$ = totalSockCost$*taxPercent; // total tax
        totalSockCostWithTaxes$ = totalSockCost$+totalSockTax$; //total cost with tax
        
        //glasses
        totalGlassesCost$ = nGlasses*glassCost$; //total cost
        totalGlassesTax$ = totalGlassesCost$*taxPercent; // total tax
        totalGlassesCostWithTaxes$ = totalGlassesCost$+totalGlassesTax$; //total cost with tax
        
        //envelopes 
        totalEnvelopeCost$ = nEnvelopes*envelopeCost$; //total cost
        totalEnvelopeTax$ = totalEnvelopeCost$*taxPercent; // total tax
        totalEnvelopeCostWithTaxes$ = totalEnvelopeCost$+totalEnvelopeTax$; //total cost with tax
        
        //total costs
        totalCostBeforeTax$ = totalSockCost$ + totalGlassesCost$ + totalEnvelopeCost$; // adding up costs without tax
        totalTaxes$ = totalSockTax$ + totalGlassesTax$ + totalEnvelopeTax$; // adding up taxes
        totalCost$ = totalTaxes$ + totalCostBeforeTax$; // adding up costs with taxes
        
        //print everything
        
        //socks 
        System.out.println("number of socks purchased " + nSocks);    
        System.out.println("at a price of " + sockCost$);
        System.out.println("the total cost is " + totalSockCost$);
        System.out.println("the taxes are " + totalSockTax$);
        System.out.println("the total cost with tax is " +totalSockCostWithTaxes$);
        
         //glasses
        System.out.println("number of glasses purchased " + nGlasses);    
        System.out.println("at a price of " + glassCost$);
        System.out.println("the total cost is " + totalGlassesCost$);
        System.out.println("the taxes are " + totalGlassesTax$);
        System.out.println("the total cost with tax is " +totalGlassesCostWithTaxes$);
        
        //envelopes
        System.out.println("number of envelopes purchased " + nEnvelopes);    
        System.out.println("at a price of " + envelopeCost$);
        System.out.println("the total cost is " + totalEnvelopeCost$);
        System.out.println("the taxes are " + totalEnvelopeTax$);
        System.out.println("the total cost with tax is " +totalEnvelopeCostWithTaxes$);
        
       
        
        //total costs
        System.out.println("The total cost before taxes is " + totalCostBeforeTax$ + ", the total taxes are " + totalTaxes$ + ", the total cost including taxes is " + totalCost$);

        
    }
    
    
}