package DS.Trie;
import java.util.*;
// Also known as prefix tree
public class MyTrie {
    static class TrieNode{
        boolean end;
        TrieNode[] trieNodes = new TrieNode[26];
        TrieNode(){
            end = false;
            for(int i = 0; i < 26; i++){
                trieNodes[i] = null;
            }
        }
    }

    static class Trie{

        TrieNode root;
        Trie(){
            root = new TrieNode();
        }

        void insert(String word){
            int i = 0;
            TrieNode current = root;
            while(i < word.length()){
                // if character is not present, then create it
                if(current.trieNodes[word.charAt(i) - 'a'] == null) // 'a' - 'a' = 0,  'c' - 'a' = 2
                    current.trieNodes[word.charAt(i) - 'a'] = new TrieNode();

                current = current.trieNodes[word.charAt(i) - 'a'];
                i++;
            }
            current.end = true; // setting the last character of any word to true to mark end of a word.
        }
        boolean search(String word){
            int i = 0;
            TrieNode current = root;
            while(i < word.length()) {
                if(current.trieNodes[word.charAt(i) - 'a'] == null)
                    return false;
                else{
                    current = current.trieNodes[word.charAt(i) - 'a'];
                    i++;
                }
            }
            return current.end; // if it is the ending of a word then it will return true, else false
        }
        void delete(String word) throws Exception {
            TrieNode current = root;
            int i = 0;
            while(i < word.length()){
                if(current.trieNodes[word.charAt(i) - 'a'] == null)
                    throw new Exception("No such Word is present !");

                current = current.trieNodes[word.charAt(i) - 'a'];
                i++;
            }
            if(!current.end)
                throw new Exception("No such word was present");
            else
                current.end = false;
        }
        public void update(String old, String newString) throws Exception {
            delete(old);
            insert(newString);
        }
    }

    public static void main(String[] args) {

        Trie dic = new Trie();

        dic.insert("pqrs");
        dic.insert("psst");
        dic.insert("pptw");
        dic.insert("qqrt");
        dic.insert("pqrs");

    }
}
