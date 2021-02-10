package TriesHuffmanCoding;

class TrieNode{
    char data;
    boolean isTerminating;
    TrieNode children[];
    int childCount;

    public TrieNode(char data){
        this.data = data;
        isTerminating = false;
        children = new TrieNode[26];
        childCount = 0;
    }
}

public class Trie {

    private TrieNode root;
    private int numWords;

    public Trie(){
        root = new TrieNode('\0');
        numWords = 0;
    }

    public void add(String word){
//        add(root, word);
        if(add(root, word)) {
            numWords++;
        }
    }

    private boolean add(TrieNode root, String word){

        if(word.length() == 0){
//            root.isTerminating = true;
//            return false;
            if(root.isTerminating) {
                return false;
            }
            else {
                root.isTerminating = true;
                return true;
            }
        }

        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null){
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }
        return add(child, word.substring(1));
    }

    public boolean search(String word){
        return search(root, word);
    }

    public boolean search(TrieNode root, String word){

        if(word.length() == 0){
            return root.isTerminating;
        }

        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null){
            return false;
        }
        return search(child, word.substring(1));
    }

    public void remove(String word){
        remove(root, word);
    }

    public void remove(TrieNode root, String word){
        if(word.length() == 0){
            root.isTerminating = false;
            return;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null){
            return;
        }
        remove(child, word.substring(1));
        // We can remove child node if it is non terminating and its number of children are 0
        if(!child.isTerminating && child.childCount == 0){
            root.children[childIndex] = null;
            child = null;
            root.childCount--;
        }

        // OR

//        if(!child.isTerminating){
//            int numChild = 0;
//            for(int i = 0; i < 26; i++){
//               if(child.children[i] != null){
//                   numChild++;
//               }
//            }
//            if(numChild == 0){
//                // We can delete child
//                root.children[childIndex] = null;
//                child = null;
//                root.childCount--;
//            }
//        }
    }

    public int countWords() {

        return countWords(root) ;
    }

    public int countWords(TrieNode root) {
        // Write your code here
        int result = 0;
        if(root.isTerminating){
            result++;
        }

        for(int i = 0; i < 26; i++){
            if(root.children[i] != null){
                result += countWords(root.children[i]);
            }
        }
        return result;
    }


}
