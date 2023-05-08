package app.kudzy.service;

public class ReverseStringServiceImpl implements ReverseStringService{
    public  String reverseString(String myStr) {
        String str="";
        if (!myStr.isEmpty()){
            str=reverseString(myStr.substring(1)) + myStr.charAt(0);
        }
        return str;
    }
}
