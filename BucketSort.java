int [] a = {2,1,2,100};
1.便利原数组，
2.创建一个新的数组，使他的长度与原数组里最大的数的数值+1一样。
3.对应新的数组下标，然后与原数组数相同，将此下标的数组内+1；
4.返回新的数组。

      int temp=a[0];
    for(int j=0;j<a.length;j++){
    if(a[i]>temp){
    temp=a[i];
}
    
  int []b = new int [temp+1];
  for(int i=0; i<b.length;i++){
  if(i==a[j]){
    b[i]+=1
  }

}
      System.out.print(b);
 }
