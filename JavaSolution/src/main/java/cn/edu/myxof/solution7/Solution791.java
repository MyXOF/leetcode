package cn.edu.myxof.solution7;

import java.util.Arrays;

public class Solution791 {
    public String customSortString(String S, String T) {
        int[] info = new int[26];
        for(Character character: T.toCharArray()) {
        	info[character-'a']++;
        }
        StringBuilder builder = new StringBuilder();
        for(Character character: S.toCharArray()) {
        	while (info[character-'a'] > 0) {
        		builder.append(character);
        		info[character-'a']--;
			}
        }
        for(int i = 0;i < 26;i++) {
        	while (info[i] > 0) {
        		builder.append((char) (i+'a'));
				info[i]--;
			}
        }
        return builder.toString();
    }
	
	
    public String customSortString1(String S, String T) {
        int[] info = new int[26];
        for(int i = 0; i < S.length();i++) {
        	info[S.charAt(i)-'a'] = i+1;
        }
        Character[] characters = new Character[T.length()];
        for(int i = 0; i < T.length();i++) {
        	characters[i] = T.charAt(i);
        }
        Arrays.sort(characters, (p1,p2)->{return info[p1-'a']-info[p2-'a'];});
        StringBuilder builder = new StringBuilder();
        for(Character character: characters) {
        	builder.append(character);
        }
        return builder.toString();
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
