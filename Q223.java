/**
 * Created by Ge on 2016/7/7.
 * 223. Rectangle Area
 *
 * Find the total area covered by two rectilinear rectangles in a 2D plane.
 * Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.
 */
public class Q223 {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area1 = (C - A) * (D - B);
        int area2 = (G - E) * (H - F);
        int cover = 0;
        int v1 = Math.max(B,F);
        int v2 = Math.min(D,H);
        int w1 = Math.max(A,E);
        int w2 = Math.min(C,G);
        if(v2 > v1 && w2 > w1){
            cover = (v2 - v1) * (w2 - w1);
        }
        return area1 + area2 - cover;
    }

    public static void main(String[] args) {
        Q223 que = new Q223();
        que.computeArea(-1500000001,0,-1500000000,1,1500000000,0,1500000001,1);
    }
}
