

	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;

	public class Output {
		public Output(String tulipHeight, String daisyHeight){
			try {

				String content = tulipHeight; //string items to put into file
				String content2 = daisyHeight;

				File file = new File("C:\\Users\\ColeHasa\\Documents\\cole\\Carroll\\Classes\\Computer Science\\log.txt"); //telling file to write to

				// if file doesnt exists, then create it
				if (!file.exists()) {
					file.createNewFile();
				}

				FileWriter fw = new FileWriter(file.getAbsoluteFile());	//write to file
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(content); //what to write to file
				bw.newLine(); //new line in file
				bw.write(content2); //writing second value to file
				bw.close();

				System.out.println("Done"); //prints to let me know file write was succesful

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
       
       
