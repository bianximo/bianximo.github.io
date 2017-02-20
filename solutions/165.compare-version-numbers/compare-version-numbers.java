public class Solution {
    public int compareVersion(String version1, String version2) {
        if(version1==null||version2==null||version1.equals("")||version2.equals(""))return 0;
        String []s1 = version1.split("\\.");
        String []s2 = version2.split("\\.");
        int[]v1 = new int[s1.length];
        int[]v2 = new int[s2.length];
        for(int i=0;i<s1.length;i++){
            v1[i] = Integer.valueOf(s1[i]);
        }
        for(int i=0;i<s2.length;i++){
            v2[i] = Integer.valueOf(s2[i]);
        }
        int num = s1.length<s2.length?s1.length:s2.length;
        for(int i=0;i<num;i++){
            if(v1[i]<v2[i])return -1;
            if(v1[i]>v2[i])return 1;
            
        }
        if(s1.length==s2.length)return 0;
        else {
            if(s1.length>s2.length){
                for(int i=s2.length;i<s1.length;i++){
                    if(v1[i]!=0)return 1;
                }
                return 0;
            }else{
                for(int i=s1.length;i<s2.length;i++){
                    if(v2[i]!=0)return -1;
                }
                return 0;
            }
        }
    }
}