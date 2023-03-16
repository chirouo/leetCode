import java.util.LinkedList;
import java.util.List;

public class SpiralOrderSolution {
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            LinkedList<Integer> linkedList = new LinkedList();
            if(matrix.length==0){
                return linkedList;
            }
            int up=0,down=matrix.length-1,left=0,right=matrix[0].length-1;
            while(true){
                //往右边移动
                for(int col=left;col<=right;++col) linkedList.add(matrix[up][col]);
                //往下面移动
                if(++up>down){//重新设定上边界、若上边界大于下边界，则遍历完成
                    break;
                }
                for(int row=up;row<=down;++row)linkedList.add(matrix[row][right]);
                //往左边移动
                if(--right<left){//重新设定右边界
                    break;
                }
                for(int col=right;col>=left;--col)linkedList.add(matrix[down][col]);
                //往上面移动
                if(--down<up){//重新设定下边界
                    break;
                }
                for(int row=down;row>=up;--row)linkedList.add(matrix[row][left]);
                if(++left>right){//重新设定左边界
                    break;
                }
            }
            return linkedList;
        }
    }
}
