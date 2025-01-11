package Lec_02;

public class Maximum_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {-2,1,-3,4,-1,2,1,-5,4};
		int sum=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(sum<0) {
				sum=0;
			}
			max=Math.max(max,sum);
		}
		System.out.println(max);
	}

}
