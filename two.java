class A{
	public static void main(String args[]){
	int n=9;
	for(int i=1;i<=3;i+=1){
	for(int j=1;j<=3;j+=1){
System.out.print(n+"");
n--;

	}if(i!=3){
		System.out.println();
	}
	
	}
	}
	}




/*

 i=1,1<3 true
 j=1, 1<3 true
 "7"
 j++
 n=8
 j=2,2<3 true
 "78"
 J++
 n=9
 j=3 3=3 true
 "789"
 j++
 n=9
 n!=3 true
 newline
 

 i=2,1<3 true
 j=1, 1<3 true
 "4"
 j++
 n=5
 j=2,2<3 true
 "45"
 J++
 n=6
 j=3 3=3 true
 "456"
 j++
 n=6
 n!=3 true
 newline
  i=1,1<3 true
 j=1, 1<3 true
 "1"
 j++
 n=2
 j=2,2<3 true
 "12"
 J++
 n=3
 j=3 3=3 true
 "123"
 j++
 n=4
 n!=3 true
 newline
*/