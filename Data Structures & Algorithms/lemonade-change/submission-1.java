class Solution {
    public boolean lemonadeChange(int[] bills) {
        int countFives = 0;
        int countTens = 0;
        int i=0;
        for(i=0;i<bills.length;i++){
            if(bills[i]==5){
                countFives++;
            }
            else if(bills[i]==10){
                if(countFives>0){
                    countFives--;
                }
                else{
                    return false;
                }
                countTens++;
            }
            else if(bills[i]==20){
                if(countTens>0 && countFives>0){
                    countTens--;
                    countFives--;
                    
                }
                else if(countFives>=3){
                    countFives-=3;
                }
                else{
                    return false;
                }
            }
        }
        if(i==bills.length){
            return true;
        }
        return false;
    }
}