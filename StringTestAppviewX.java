package test;
public class StringTestAppviewX {
    

    public static  boolean isValidText(String str){

        int len = str.length();
        if(len >10000 || len ==0)
        return false;
        if( len == 1){
            return true;
        }
        //if first letter is lowercase 
        if(str.charAt(0) >='a' && str.charAt(0) <='z'){
            for(int i=1;i<len;i++){
                if(!(str.charAt(i)>'a' && str.charAt(i)<'z'))
                     return false;  
            }
        }
        //if First letter is Uppercase
        else if(str.charAt(0) >='A' && str.charAt(0) <='Z'){
            boolean isCapsFound=false;
            boolean isSmallFound=false;
                for(int i=1;i<len;i++){
                    if(str.charAt(i) >='A' && str.charAt(i) <='Z' && !isSmallFound ){
                        isCapsFound=true;       
                    }  
                    else if(str.charAt(i) >='a' && str.charAt(i) <='z' && !isCapsFound){
                        isSmallFound=true;
                    }
                    else{
                        return false;
                    }
                }              
        }
        return true;

        
    }



    public static void main(String[] args) {
        
     boolean  isValid=  isValidText("vignesh");
     if(isValid){
         System.out.println("Valid string");
     }
     else {
        System.out.println("Invalid string");
     }

    }
}
