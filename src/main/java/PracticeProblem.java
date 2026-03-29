import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
     Scanner scanner=new Scanner(System.in);

	}
    public static String evenOrOdd(int num){
        if(num % 2 == 0){
            return "Even";}
		 else {
            return "Odd";
        }
    }	 	 
	public static String teacherOrStudent(String word){
		if(word=="Kalisz"){
		  return "Teacher";}
		else{
		  return "Student";
		}}
	public static int fartherFromZero(int num){
    if(num>0){
		return (num+5);
	}
	if (num==0){
		return 0;
	}
	else{
		return num-5;
	}
	}
	}




