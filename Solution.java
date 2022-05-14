class Solution {
    public int romanToInt(String s) {
        switch(s.substring(0, 1){
            case "I":
        return I(s);
            case "V":
            return V(s);
            case "X":
                return X(s);
            case "L":
            return L(s);
            case "C":
            return C(s);
            case "D":
            return D(s);
            case "M":
            return M(s);
        }
               
    }
    
    public int I(String s)
               if (s.length() == 1)
               return 1;
               else if (s.substring(1, 2).equals("I"))
               return 1 + I(s.substring(1, s.length() - 1));
               else
               if (s.substring(1, 2).equals("V")){
               if    
               }
               
}
