public class Solution {
    public String convert(String s, int numRows) {
        if(s==null||s.length()==0||numRows==1||s.length()<=numRows)return s;
        StringBuilder[]sbs = new StringBuilder[numRows];
         for(int i=0;i<sbs.length;i++)sbs[i] = new StringBuilder();
        for(int i=0;i<s.length();i++){
            int index = -1,flag = i%((numRows-1)*2);
            for(int j = 0;j<numRows;j++){
                if(flag==j||flag==(numRows-1)*2-j)index = j;
            }
            sbs[index].append(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<sbs.length;i++)sb.append(sbs[i].toString());
        return sb.toString();
    }
}