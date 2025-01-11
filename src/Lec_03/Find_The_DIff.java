package Lec_03;

public class Find_The_DIff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public char findTheDifference(String s, String t) {
        int [] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)-'a']--;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                return (char)(i+'a');
            }
        }
        return 'a';
    }
	public char findTheDifference2(String s, String t) {
        int s1=0;
        int s2=0;
        for(int i=0;i<s.length();i++){
            s1+=s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            s2+=t.charAt(i);
        }
        return (char)(s2-s1);
    }

}
