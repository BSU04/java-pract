import java.io.*;
import java.util.Scanner;


class F_Handling{
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		String source,destination,name,location,state;
		System.out.print("Enter the source file path: ");
		source = sc.nextLine();
		try{
			File src = new File(source);
			if(!(src.exists())){
				src.createNewFile();
				System.out.println("Source File Created Successfully!");
			}
			System.out.print("Enter the Destination File Path: ");
			destination = sc.nextLine();
			File dest = new File(destination);
			if(!(dest.exists())){
				dest.createNewFile();
				System.out.println("Destination File Created Successfully");
			}
		
			System.out.println("-------------------------------------");
			FileOutputStream src_out = new FileOutputStream(src);
			FileOutputStream dest_out = new FileOutputStream(dest);
			
			System.out.println("Enter the Contents of Source File");
			String m;
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Location: ");
			location = sc.nextLine();
			System.out.print("State: ");
			state = sc.nextLine();
			
			String sb = "Name: "+name+"\nLocation: "+location+"\nState: "+state;
			src_out.write(sb.getBytes());
	
			src_out.close();
			System.out.println("--------------------------");
			System.out.println("Source File Written Successfully!");
			
			System.out.println();
			
			System.out.println("Enter the Contents of Destination File");
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Location: ");
			location = sc.nextLine();
			System.out.print("State: ");
			state = sc.nextLine();
			
			sb = "Name: "+name+"\nLocation: "+location+"\nState: "+state;
			dest_out.write(sb.getBytes());
			
			dest_out.close();
			System.out.println("--------------------------");
			
			System.out.println("Destination File Written Successfully!");
			
			FileInputStream dest_in = new FileInputStream(dest);
			FileInputStream src_in = new FileInputStream(src);
		
			System.out.println("Source File "+src.getAbsolutePath());
			String src_data = new String(src_in.readAllBytes());
			System.out.println("Contents of Source File:");
			System.out.println("");
			System.out.print(src_data);	
			System.out.println();
			
			System.out.println("-------------------------------------");
			
			System.out.println("Destination File "+dest.getAbsolutePath());
			String dest_data = new String(dest_in.readAllBytes());
			System.out.println("Contents of Destination File:");
			System.out.println("");
			System.out.print(dest_data);	
			
			System.out.println();
			System.out.println("Copying the Contents of Source File to Dest File...");
			
			dest_out = new FileOutputStream(dest);
			dest_out.write(src_data.getBytes());
			System.out.println();
			System.out.println();
			System.out.println("-------------------------------------");
			System.out.println("File Updated Successfully!");
			
			System.out.println("The Updated File Contents");
			dest_in = new FileInputStream(dest);
			System.out.println("-------------------------------------");
			
			System.out.println("Destination File "+dest.getAbsolutePath());
			dest_data = new String(dest_in.readAllBytes());
			System.out.println("Contents of Destination File:");
			System.out.println("");
			System.out.print(dest_data);	
			System.out.println("");
			System.out.println("-------------------------------------");
			System.out.println("");
			
			src_in.close();
			dest_out.close();
			dest_in.close();
			
		}catch (FileNotFoundException fe){
			System.out.println("File Not Found");
			System.out.println(fe.getMessage());
		}catch(Exception e){
			System.out.println("Something went Wrong!");
			System.out.println(e.getMessage());
		}
		
	}
}