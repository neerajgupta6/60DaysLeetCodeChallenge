class Solution {
    public String intToRoman(int num) {
        int [] Value= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String [] Symbol={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        String result="";

        for(int i=0;i<Value.length;i++){

            while(num>=Value[i]){
                result=result+Symbol[i];
                num=num-Value[i];
            }


        }
        return result;



    }
}
