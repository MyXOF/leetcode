package cn.edu.myxof.solution5;

public class Solution537 {
    public String complexNumberMultiply(String a, String b) {
        String[] values1 = a.split("\\+");
        int a1 = Integer.parseInt(values1[0]);
        int a2 = Integer.parseInt(values1[1].substring(0, values1[1].length()-1));
        
        String[] values2 = b.split("\\+");
        int b1 = Integer.parseInt(values2[0]);
        int b2 = Integer.parseInt(values2[1].substring(0, values2[1].length()-1));
        
        System.out.println(a1*b1-a2*b2);
        System.out.println(a1*b2+a2*b1);
        return String.format("%d+%di", a1*b1-a2*b2, a1*b2+a2*b1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		complexNumberMultiply("1+1i", "1+1i");
	}

}
