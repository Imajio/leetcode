package medium.minimum_deletions_to_make_string_balanced;

class Solution {
    public int minimumDeletions(String s) {
        //dynamic programming
        int countB = 0;
        int minDeletion = 0;

        for(char c : s.toCharArray()){
            if(c == 'b'){
                countB++;
            }else{
                //if the current chracter is a, we have two options
                //1, keep a, then we need to delete previous bs (countB) to make s balanced
                //2, delete a, then the delete operation takes 1 step
                //everytime we need to choose the min deletion so far
                minDeletion = Math.min(minDeletion + 1, countB);
            }
        }
        return minDeletion;
    }
}