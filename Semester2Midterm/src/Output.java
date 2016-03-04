

	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;

	public class Output {
		public Output(String tulipHeight, String daisyHeight){
			try {

				String content = tulipHeight;

				File file = new File("C:\\Users\\ColeHasa\\Documents\\cole\\Carroll\\Classes\\Computer Science\\log.txt");

				// if file doesnt exists, then create it
				if (!file.exists()) {
					file.createNewFile();
				}

				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(content);
				bw.close();

				System.out.println("Done");

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
       
       
