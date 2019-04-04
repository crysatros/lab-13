public class CDecode {
    String ABC;
    int strlen;
    CDecode(String ABC){
        this.ABC = ABC;
        strlen = ABC.length();
    }
    String decode(String str, int shift){
        char[] bufstr = str.toCharArray();
        String newstr = "";
        for(char buf: bufstr){
            char bufbuf = buf;
            int ABCpos = ABC.indexOf(buf);
            if(ABCpos >= 0){
                if(ABCpos + shift < 0){
                    bufbuf = ABC.charAt(ABCpos + shift + strlen);
                }
                else if (ABCpos + shift >= strlen){
                    bufbuf = ABC.charAt(ABCpos + shift - strlen);
                }
                else{
                    bufbuf = ABC.charAt(ABCpos + shift);
                }

            }
            newstr += bufbuf;
        }
        return newstr;
    }
}