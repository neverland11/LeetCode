import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Created by Ge on 2016/11/30.
 * 210. Course Schedule II
 */
public class Q210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[]res = new int[numCourses];

        if(prerequisites == null){
            return res;
        }
        //count how many prerequisties that the course need
        int[] coursecount = new int[numCourses];
        //[1, 0] means 0 before 1, pre[i] means which line.
        for(int i = 0; i < prerequisites.length; i++){
            coursecount[prerequisites[i][0]]++;
        }

        LinkedList<Integer> que = new LinkedList<>();
        int counter = 0;
        for(int i = 0; i < coursecount.length; i++) {
            if (coursecount[i] == 0) {
                que.add(i);
            }
        }


        while(!que.isEmpty()){
            int cur = que.remove();
            res[counter] = cur;
            counter++;
            for(int i = 0; i < prerequisites.length; i++){
                //i should be the out, check and minus
                if(prerequisites[i][1] == cur){
                    coursecount[prerequisites[i][0]]--;
                    if(coursecount[prerequisites[i][0]] == 0){
                        que.add(prerequisites[i][0]);
                    }
                }
            }
        }
        int[]newres = new int[0];
        if(counter != numCourses){ //must have cycle
            return newres;
        }
        return res;



    }
}
