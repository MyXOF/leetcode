package cn.edu.myxof.solution6;

public class Solution657 {
	public boolean judgeCircle(String moves) {
        int h = 0, v = 0;
        for(int i=0; i < moves.length();i++){
            switch (moves.charAt(i)) {
                case 'U':
                    v++;
                    break;
                case 'D':
                    v--;
                    break;
                case 'L':
                    h++;
                    break;
                case 'R':
                    h--;
                    break;
                default:
                    break;
                }
        }
        return h == 0 && v == 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
