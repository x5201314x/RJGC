package �������;
	import java.util.*;
	 public class Tarray {
	     static Scanner scanner = new Scanner(System.in);
	     public static void main(String args[]){
	        int m,n;
	        int b;
	        Scanner scanner = new Scanner(System.in);
	       
	      System.out.println("��ά�����������");
		   n = scanner.nextInt();
	      System.out.println("��ά�����������");
	       m = scanner.nextInt();
	      int arr[][] = new int[n][m];
	      System.out.println("�������ά���飺");
	      for(int i = 0;i<n;i++)
	      for(int j=0;j<m;j++)
	       {
	           arr[i][j] = scanner.nextInt();
	       }
	       System.out.println("\n");
	       b = maxArrSum(arr);
	        System.out.println("�����ͨ���������Ϊ"+b);
	    }
	 
	   public static int[][] arrSum(int arr[][]){
	        int m = arr.length;
	         int n = arr[0].length;
	        int p[][] = new int[m+1][n+1];
	        p[0][0] = arr[0][0];
	        for(int i=0; i<=m; i++) p[i][0] = 0;
	        for(int i=0; i<=n; i++) p[0][i] = 0;
	         for(int i=1; i<=m; i++){
	             for(int j=1; j<=n; j++){
	                 p[i][j] = p[i-1][j] + p[i][j-1] + arr[i-1][j-1] - p[i-1][j-1];
	             }
	         }
	         return p;
	     }
	     //�������ж�ά����ľ�������
	    
	    static int  maxArrSum(int arr[][]){
	        int m = arr.length;
	        int n = arr[0].length;
	         int p[][] = arrSum(arr);
	         int ans = Integer.MIN_VALUE;
	         for(int i=1; i<=m; i++){
	            for(int j=1; j<=n; j++){
	                for(int endi=i; endi <=m; endi++){
	                for(int endj=j; endj<=n; endj++){   
	                        int sum = p[endi][endj] - p[i-1][endj] - p[endi][j-1] + p[i-1][j-1];
	                         if(ans < sum) ans = sum;   
	                    }
	                }   
	             }   
	         }   
	         return ans;   
	     }
	    
	    
	 
	 }

