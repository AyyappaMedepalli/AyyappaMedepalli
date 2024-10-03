//Remove Duplicates from sorted Array

public class ArrayRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,7,7,9,5,8};
		int temp[]=new int[a.length-1];
		int j=0;
		int t=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				temp[j]=a[i];
				j++;
			}
		}
		temp[j]=a[a.length-1];//2 3 5 7 8 9
		
		for(int i=0;i<temp.length;i++) {
			for(int y=i+1;y<temp.length;y++) {
				if(temp[i]>temp[y]) {
					t=temp[i];
					temp[i]=temp[y];
					temp[y]=t;
					
				}
			}
		}
		for(int n=0;n<temp.length;n++)
		{
			System.out.println(temp[n]+" ");
		}
	}

}
