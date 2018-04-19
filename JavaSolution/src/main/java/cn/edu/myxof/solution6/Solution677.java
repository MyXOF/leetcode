package cn.edu.myxof.solution6;

import java.util.HashMap;
import java.util.Map;

/**
 * Your MapSum object will be instantiated and called as such: 
 * MapSum obj = new MapSum(); 
 * obj.insert(key,val); 
 * int param_2 = obj.sum(prefix);
 */
public class Solution677 {
	private TrieNode root;
	private Map<String, Integer> map;
	
    /** Initialize your data structure here. */
    public Solution677() {
        root = new TrieNode(0);
        map = new HashMap<>();
    }
    
    public void insert(String key, int val) {
    	int delta = val - map.getOrDefault(key, 0);
        map.put(key, val);
        TrieNode node = root;
    	for(Character character : key.toCharArray()) {
    		node.children.putIfAbsent(character, new TrieNode(0));
    		node = node.children.get(character);
    		node.score += delta;
    	}
    }
    
    public int sum(String prefix) {
    	TrieNode node = root;
    	for(Character character : prefix.toCharArray()) {
    		if(!node.children.containsKey(character)) {
    			return 0;
    		}
    		node = node.children.get(character);
    	}
    	return node.score;
    }
    
	class TrieNode {
		public Map<Character, TrieNode> children;
		public int score;
		
		public TrieNode(int score) {
			this.score = score;
			this.children = new HashMap<>();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
