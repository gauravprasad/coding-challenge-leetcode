package com.gprasad.leetcode.algorithms.medium;

public class Trie {
    class TrieNode {
        TrieNode[] nodes = new TrieNode[26];
        Boolean isEnd = false;
    }

    TrieNode root;

    /**
     * Initialize your data structure here.
     */
    public Trie() {
        root = new TrieNode();
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        TrieNode node = root;
        for(int i =0;i<word.length();i++){
            if(node.nodes[word.charAt(i)-'a']==null){
                node.nodes[word.charAt(i)-'a']=new TrieNode();
            }
            node = node.nodes[word.charAt(i)-'a'];
        }
        node.isEnd = true;
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        TrieNode node = root;
        for(int i =0;i<word.length();i++){
            if(node.nodes[word.charAt(i)-'a']==null) return false;
            node = node.nodes[word.charAt(i)-'a'];
        }
        return node.isEnd;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for(int i =0;i<prefix.length();i++){
            if(node.nodes[prefix.charAt(i)-'a']==null) return false;
            node = node.nodes[prefix.charAt(i)-'a'];
        }
        return true;
    }
}
