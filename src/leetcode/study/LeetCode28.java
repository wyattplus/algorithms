package leetcode.study;

public class LeetCode28 {

    private TrieNode root;

    /**
     * Initialize your data structure here.
     */
    public LeetCode28() {
        root = new TrieNode();
        root.val = ' ';
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        if (word == null || word.length() == 0) return;
        TrieNode tn = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (tn.children[c - 'a'] == null) {
                tn.children[c - 'a'] = new TrieNode(c);
            }
            tn = tn.children[c - 'a'];
        }
        tn.isWord = true;
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        if (word == null || word.length() == 0) return true;
        TrieNode tn = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (tn.children[c - 'a'] == null) return false;
            tn = tn.children[c - 'a'];

        }
        return tn.isWord;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        if (prefix == null || prefix.length() == 0) return true;
        TrieNode tn = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if (tn.children[c - 'a'] == null) return false;
            tn = tn.children[c - 'a'];

        }
        return true;

    }

    class TrieNode {
        public char val;
        public boolean isWord;
        public TrieNode[] children = new TrieNode[26];

        public TrieNode() {
        }


        TrieNode(char c) {
            TrieNode node = new TrieNode();
            node.val = c;
        }
    }
}

