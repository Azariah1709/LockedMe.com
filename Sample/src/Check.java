import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Check {
	public static void main(String[] args) throws IOException{
		 Scanner input = new Scanner(System.in);
	        System.out.print("Enter the desired name of your file: ");
	        String fileName = input.nextLine();
	        fileName = fileName + ".txt";
	        String filelocation = "F:\\file\\" + fileName;

	        File file = new File(filelocation);
	        
	        if (file.createNewFile()) {
	            System.out.println("File created.");
	        } else {
	            System.out.println("File already exists.");
	        }
	        input.close();
		
	}

}
