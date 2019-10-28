

    public class FunWithStrings
  {
     
  
       /* Method to reverse the string
        * Input parameter: String
        * Return Statement: Reversed String*/
        public String revString(String sen)
      {      
             /* StringBuilder class used to avoid creation of new string 
              * for each iteration of loop and appending
              * This helps in minimal memory overhead*/
              StringBuilder abc = new StringBuilder();
    
             /* Loop iterates through the input string
              * Starts from the last character
              * Stops at the first character
              * Appends each character to new string*/
              for(int i = sen.length()-1; i >=0; i--)
                  abc.append(sen.charAt(i));
    
             /* toString method of Object class 
              * returns string representation*/
              return abc.toString();
       }
  
  
         /* Method to truncate the string to 5 characters
          * Input parameter: String
          * Return Statement: Truncated String*/  
          public String truncToFive(String sen)
        {      
       
               StringBuilder abc = new StringBuilder();
    
               /* Loop iterates through the input string
                * Starts from the first character
                * Stops at the last character
                * Appends each character to new string*/
                for(int i =0; i< 5; i++)
                 abc.append(sen.charAt(i));
    
              return abc.toString();
         }
  
          
  
         /* Method to Uppercase the string
          * Input parameter: String
          * Return Statement: UpperCased String*/
           public String toUpperString(String sen)
         {      
                /* No need of StringBuilder Class
                 * Using relevant method and returning the string*/          
                 return sen.toUpperCase();
         }
  
  
  
         /* Method to check Uppercase characters in the string
          * Input parameter: String
          * Return Statement: Number of uppercase characters*/
          public int checkUpperCase(String sen) 
        {             
                /* Local Variable to store and return
                 * Number of UpperCase Characters in String*/
                 int c = 0;
                 
                 /* Loop iterates through the input string
                  * Starts from the first character
                  * Stops at the fifth character*/                  
                 for(int k = 0; k < 5 && k != sen.length(); k++)
               {
                   if(Character.isUpperCase(sen.charAt(k)))
                     c++;
               }
             return c;
          }
          
          
          
          /* Method to perfom Insertion sorting
           * Input parameter: Array of Integer
           * Return Statement: Sorted Array in  Ascending Order */       
            public int[] sort(int array[]) 
          {         
             
                  /* Loop iterates through the input Array
                   * Starts from the second Integer
                   * Stops at the last Integer*/                   
                   for (int i = 1; i < array.length; i++) 
                 { 
                       /* Local Variable storing each Integer*/
                        int temp = array[i]; 
                      
                       /*Local Variable used as a counter for the following nested loop*/
                       int j = i - 1; 
      
                       /* Move elements of array 
                        * that are greater than temp, 
                        * to one position ahead of their current position */
                        while (j >= 0 && array[j] > temp) 
                      {  
                         array[j + 1] = array[j]; 
                         j = j - 1; 
                      } 
                      
                    array[j + 1] = temp; 
                 } 
                 
               return array;
           } 
            
            
            
          /* Method to Find sum of values in Array
           * Input parameter: Array of Integer
           * Return Statement: Sum of values stored in array */    
            public int sumOfArray (int [] array)
          { 
              /* Local Variable to store sum */
              int sum = 0;
              
              for(int i = 0; i < array.length; i++)
                sum += array[i];
              
              return sum;
           }
            
            
  
             /* Method to modify each string of the Array
              * Input parameter: Array of String
              * Return Statement: None
              * Prints: Modified strings of the Array 
              * Prints: Total Number of Input and Output Characters
              * Prints: Median Lengths of Input and Output Strings */              
              public void modifyString(String element[])
            {                        
                                    
                   /* Array to store Length of Strings of Input Array
                    * Use: To determine the median of length of all strings*/
                    int arrayIStringLength[] = new int[element.length];
                    
                    /* Array to store Length of Modified Strings 
                     * Use: To determine the median of length of all strings*/
                     int arrayOStringLength[] = new int[element.length];
         
                     for(int j = 0; j<element.length; j++)
                   {  
                       /*Local Variable to Store each element of Array*/
                       String temp = element[j];                      
                       
                             
                             if(temp.length() == 0)
                           {                                
                            System.out.println("");
                            System.out.println("////No operation could be performed in the String number: " + (j+1)+ ". No character in String....////");
                           }
                                  
                             else
                           {     
        
                               arrayIStringLength[j] = temp.length();    
                
                               /* Checking of the condition 1
                                * True: Calls method to reverse the string  
                                        and overwrites the initial string
                                * False: Moves on*/
                                if(temp.length() % 4 == 0) 
                                  temp = revString(temp);
                                
        
                               /* Checking of the condition 2
                                * True: Calls method to truncate the string to 5 character 
                                        and overwrites the initial string
                                * False: Moves on*/
                                if(temp.length() % 5 == 0) 
                                  temp = truncToFive(temp);  
                                
                                
                               /* Checking of the condition 3
                                * True: Calls method to convert the string to all Uppercase 
                                        and overwrites the initial string
                                * False: Moves on*/ 
                                if(checkUpperCase(temp) == 3) 
                                 temp = toUpperString(temp);
                               
                                
                                /* Checking of the condition 4
                                 * True: Removes the Hyphen, Appends to adjacent string 
                                        and overwrites the initial string
                                 * False: Moves on*/ 
                                 if (temp.charAt(temp.length()-1) == '-')
                                { 
                                    StringBuilder newSen = new StringBuilder();
                                    
                                    /* Loop to append all characters of string, except Hyphen to new String
                                     * Starts from first character of the existing string
                                     * Ends at the character before Hyphen*/
                                     for(int l = 0; l <= temp.length()-2; l++)
                                        newSen.append(temp.charAt(l));
                                         
                                     /* Condition to check existence of adjacent string
                                      * True: Append the adjacent string to new String
                                      * False: Executes else statement */
                                        if(j+1 != element.length)
                                      {
                                        newSen.append(element[j+1]);                                       
                                        temp = newSen.toString();            
                                      }
                                    
                                        else 
                                      {                                    
                                        System.out.println("////Adjacent string not available. Printing string with removed hyphen/////");
                                        temp = newSen.toString();
                                      }
                                        
                                }
                                   /* Printing Final String after all possible modification */                            
                                   System.out.println(temp);                                   
                                           
                                   /* Length of String stored in array */
                                   arrayOStringLength[j] = temp.length();
                             }
                             
                     }
                     
                    arrayIStringLength = sort(arrayIStringLength);
                    System.out.println("The total number of Input characters = " + sumOfArray(arrayIStringLength));
                      
                    arrayOStringLength = sort(arrayOStringLength);
                    System.out.println("The total number of Output characters = " + sumOfArray(arrayOStringLength));
                    
                    
                    
                    /* Median for 'n' number of obeservations in an organized data: 
                     * if n is odd: Median =  Value at the (n+1)/2th Position 
                     * if n is even: Median = Average of the values at (n/2)th position and (n+1)/2th Position */  
                    
                    /* Calculation and Printing of Median of length Input Strings */
                    if( arrayIStringLength.length % 2 == 0)
                       System.out.println("The median length of the input strings = " + (arrayIStringLength[arrayIStringLength.length/2 - 1] + arrayIStringLength[arrayIStringLength.length/2])/2.0);
                    else
                        System.out.println("The median length of the input strings = " + (arrayIStringLength[arrayIStringLength.length/2]));
    
                    
                    /* Calculation and Printing of Median of length Output Strings */
                    if( arrayOStringLength.length % 2 == 0)
                       System.out.println("The median length of the modified strings = " + (arrayOStringLength[arrayOStringLength.length/2 - 1] + arrayOStringLength[arrayOStringLength.length/2])/2.0);
                   else
                       System.out.println("The median length of the modified strings = " + (arrayOStringLength[arrayOStringLength.length/2]));
            }
              
              
              
              
               public static void main (String [] args)
            {
    
                  String sen[] = {"ABCde","-rsg","ewsr","ty", "qwertyuiop"};
                   FunWithStrings begin = new FunWithStrings();
    
                  begin.modifyString(sen);
            }
  
  
  }



    /* Input Parameters to Check every functionality
     * 
     * String sen [] = {"Nothing is","ImPoSsible","in Life-"};
     * String sen [] = {"-Let","the","LIFe-","Find it's own way"};
     * String sen [] = {"WOrkHardGiveYourBest","!"};
     * String sen [] = {"LET'splay!", "-Yea","FunIs","Everything","in","Life-",""};
     */     
          
          
        
                            
          
        
          
       
     
        
    
    
  
  
  




