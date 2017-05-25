import java.util.Scanner;


public class TriangleCalculator {


	public static void main (String []args){

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the length 3 sides of the triangle in cm ");
		int side1=sc.nextInt();
		int side2=sc.nextInt();
		int side3=sc.nextInt();

		//find the largest side

		boolean py= false;

		if (side1 ==side2  && side2==side3 ){

			System.out.println("Equilateral triangle!!!");
			py= true;

		}

		else if (side1>side2 && side1>side3){

			if( side1*side1== side2*side2 +side3*side3){

				System.out.println("Pythagorean ");
				py= true;
			}
		}

		else if (side2>side1 && side2>side3){

			if( side2*side2== side1*side1 +side3*side3){

				System.out.println("Pythagorean ");
				py= true;
			}
		}

		else if (side3>side1 && side3>side2) {
			if( side3*side3== side1*side1 +side2*side2){

				System.out.println("Pythagorean ");
				py= true;
			}
		}

		else {
			System.out.println("Nothing ");
		}


		if (!py){
			System.out.println("Nothing ");

		}
	}
}


