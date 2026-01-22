class Solution {
    public boolean isValidSudoku(char[][] board) {



        for(int row=0;row<9;row++){
            HashSet<Character> set=new HashSet<>();
            for(int col=0;col<9;col++){
                char current = board[row][col];
                if(current!= '.'){
                    if(set.contains(current)){
                        return false;
                    }
                    set.add(current);
                }
            }   
        }
        for(int col=0;col<9;col++){
            HashSet<Character> set=new HashSet<>();
            for(int row=0;row<9;row++){
                char current = board[row][col];
                if(current!= '.'){
                    if(set.contains(current)){
                        return false;
                    }
                    set.add(current);
                }
            }   
        }


        for(int boxrow=0;boxrow<9;boxrow +=3){
            for(int boxcol=0;boxcol<9;boxcol +=3){ 
                HashSet<Character> set=new HashSet<>(); 
                for(int row=0;row<3;row++){ 
                    for(int col=0;col<3;col++){ 
                        char current = board[boxrow+row][boxcol+col]; 
                        if(current!= '.'){ 
                            if(set.contains(current)){ 
                                return false; 
                            } 
                            set.add(current); 
                        } 
                    } 
                } 
            }
        }
    return true;
    }
}