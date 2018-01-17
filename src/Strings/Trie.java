package Strings;

public class Trie {

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("arpit");
        trie.search("a");
    }

    TrieNode root ;
    public void insert(String str){
        char arr[] = str.toCharArray();

        root = new TrieNode();
        TrieNode temp = root;

        for (int i =0;i<arr.length;i++){
            int pos = arr[i]-'a';

            if (temp.trieNode[pos] == null){
                TrieNode newNode = new TrieNode(arr[i]);
                temp.trieNode[pos] = newNode;
                temp = newNode;
            }


        }
        temp.setLeaf(true);

    }

    public boolean search(String str){
        char arr[] = str.toCharArray();
        TrieNode temp = root;
        for (int i=0;i<arr.length;i++){
            int pos = arr[i]-'a';
            if (temp.trieNode[pos] != null && temp.trieNode[pos].isLeaf){
                return true;
            }else if (temp.trieNode[pos] != null){
                temp = temp.trieNode[pos];
            }else {
                return false;
            }
        }
        return false;

    }


    private class TrieNode{
        char data;
        TrieNode trieNode[] = new TrieNode[26];
        boolean isLeaf;

        public TrieNode(){
            isLeaf = false;
        }

        public TrieNode(char ch) {
           data = ch;
           isLeaf=false;
        }

        public boolean isLeaf() {
            return isLeaf;
        }

        public void setLeaf(boolean leaf) {
            isLeaf = leaf;
        }
    }
}
