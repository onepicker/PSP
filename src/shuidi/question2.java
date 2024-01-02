package shuidi;

/**
 * @author Picker
 * @date 2023/3/9 20:42
 */
public class question2 {
    int count =0;
    public int calculateHairBlocks (char[][] hairRegion) {
        // write code here
        int len = hairRegion.length;
        int [][] visted =new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j =0; j<len; j++){
                if (hairRegion[i][j]=='H'&&visted[i][j]==0){
                    count++;
                    visted[i][j]=count;
                    bfs(hairRegion,i,j,visted);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <len ; j++) {
                if(visted[i][j]>max){
                    max=visted[i][j];
                }
            }
        }
        return max;


    }
    void bfs(char[][] hairRegion,int i,int j,int[][] visited){
        while(i>1&&j>1&&i<visited.length-1&&j<visited.length-1)
        if(hairRegion[i-1][j]=='H'){
            visited[i-1][j]=count;
            bfs(hairRegion,i-1,j,visited);
        }
        if(hairRegion[i][j-1]=='H'){
            visited[i][j-1]=count;
            bfs(hairRegion,i,j-1,visited);
        }
        if(hairRegion[i+1][j+1]=='H'){
            visited[i][j-1]=count;
            bfs(hairRegion,i+1,j+1,visited);
        }
        if(hairRegion[i-1][j-1]=='H'){
            visited[i][j-1]=count;
            bfs(hairRegion,i-1,j-1,visited);
        }
        if(hairRegion[i+1][j-1]=='H'){
            visited[i][j-1]=count;
            bfs(hairRegion,i+1,j-1,visited);
        }
        if(hairRegion[i-1][j+1]=='H'){
            visited[i][j-1]=count;
            bfs(hairRegion,i-1,j+1,visited);
        }






    }



}
