
public class Iterations {

	public static void main(String[] args) {
		
		int num = 7;
		int i = 100;
		
		/*System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));*/
		
		System.out.println("====while====");
		
		// Entry Check
		while(i<=10){
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;
		}
		
		System.out.println("====do while====");
		
		num = 9;
		i = 100;
		
		do{
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;
		}while(i<=10); // Exit Check : At least once it will run
		
		System.out.println("====for====");
		
		/*for(num=11,i=1;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}*/
		
		/*num = 11;
		i = 1;
		
		for(;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}*/
		
		// Memory Optimization
		for(int n=13, j=1;j<=10;j++){
			System.out.println(n+" "+j+"'s are "+(n*j));
		}
		System.out.println("====Nested Loops====");
		// Nested Loops
		for(int x=1;x<=5;x++){ // 1, 2, 3, 4, 5
			System.out.println("X is: "+x);
			for(int y=1;y<=3;y++){
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		System.out.println("====Nested Loops Predict Output====");

		for(int x=1;x<=5;++x){ 
			
			System.out.println("X is: "+x);
			
			for(int y=1;y<=x;++y){
				System.out.print(y+" ");
			}
			
			System.out.println();
		}
		

	}

}
