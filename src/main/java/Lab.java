public class Lab {
    public boolean checkParentheses(String in){
        int parCount = 0;
        for(int i = 0; i < in.length(); i++){
            if(in.charAt(i)=='('){
                parCount++;
            }else{
                parCount--;
            }
            if(parCount <0 ){
                return false;
            }
        }
        if(parCount == 0){
            return true;
        }else{
            return false;
        }
    }
}
