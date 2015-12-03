package serverPack;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.opencsv.CSVReader;

@RestController
@RequestMapping(value = "/myservice")
public class MyRestService {

//	private BufferedImage queryImage = null;
//	private BufferedImage trainImage = null;
	private LinkedList<URL> posterUrls = null;
	private LinkedList<String> posterNames = null;
	private int counter;

	@RequestMapping(value = "/upload")
	public @ResponseBody ResponseModel uploadFile(/*
												 * @RequestParam("uploadedFile")
												 * MultipartFile uploadedFileRef
												 */) {

		Loader.init();
		posterUrls = new LinkedList<URL>();
		posterNames = new LinkedList<String>();
		counter = 0;

		try {
			// InputStream inS = uploadedFileRef.getInputStream();
			// queryImage = ImageIO.read(inS);
			CSVHandler();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return new ResponseModel(posterNames, posterUrls);
	}

	private void CSVHandler() throws IOException {
<<<<<<< HEAD

		CSVReader reader = new CSVReader(
				new FileReader("movieFile/movies.csv"), ',', '\'', 1);
=======
	    
	    String moviesCsv = getClass().getClassLoader().getResource("movies.csv").getFile();
		CSVReader reader = new CSVReader(new FileReader(moviesCsv));
>>>>>>> 1ca2591a66737fd014db6c839580b07e837e2287

		String[] nextLine;

		// nextLine = reader.readNext()) != null) {
		// try {
		// String imageUrl = (String.valueOf(nextLine[1].charAt(0))
		// .equals("\"") ? nextLine[1].substring(1,
		// nextLine[1].length() - 1) : nextLine[1]);
		//
		// URL url = new URL(imageUrl);
		// trainImage = ImageIO.read(url);
		//
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// }

		while ((nextLine = reader.readNext()) != null) {
			// nextLine[] is an array of values from the line
			if (counter != 5) {
				String imageUrl = (String.valueOf(nextLine[1].charAt(0))
						.equals("\"") ? nextLine[1].substring(1,
						nextLine[1].length() - 1) : nextLine[1]);

				String imageName = (String.valueOf(nextLine[0].charAt(0))
						.equals("\"") ? nextLine[0].substring(1,
						nextLine[0].length() - 1) : nextLine[0]);

				posterUrls.add(counter, new URL(imageUrl));
				posterNames.add(counter, imageName);

			} else {
				reader.close();
				break;

			}

			++counter;
		}
	}

}
