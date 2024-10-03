//find indexses sum of two integer equal to target?

public class Indices {
	public static int[] sumnums(int[] nums, int target ) {
		int indi[]=new int[2];
		for(int j=0;j<nums.length;j++) {
			for(int k=j+1;k<nums.length;k++) {
				if(nums[j]+nums[k]==target)
				{
					indi[0]=j;
					indi[1]=k;
				} 
			}
		}
		return indi;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		int target;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		size=sc.nextInt();
		System.out.println("enter target");
		target=sc.nextInt();
		System.out.println("enter array elements");
		int[] nums=new int[size];
		for(int i=0;i<size;i++) 
		{
			nums[i]=sc.nextInt();
		}
		int[] a=sumnums(nums,target);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}