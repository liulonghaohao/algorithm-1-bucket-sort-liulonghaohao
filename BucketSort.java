int [] a = {2,1,2,100};
1.便利原数组，
2.创建一个新的数组，使他的长度与原数组里最大的数的数值+1一样。
3.对应新的数组下标，然后与原数组数相同，将此下标的数组内+1；
4.返回新的数组。

		int temp=a[0];
	      for(int i=1;i<a.length;i++){
	      if(a[i]>temp){
	      temp=a[i];
	       }
	      }
	      
	    int []b = new int [temp+1];
	    for(int k=0; k<b.length;k++){
	          for(int j=0;j<a.length;j++){
	                if(k==a[j]){
	                    System.out.print(k);
	                 }
               }
	         }
 


