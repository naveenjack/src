package algorithm.props;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesBuilder {

	public static void main(String[] args) {
		Properties algorithmProps = new Properties();
		FileInputStream propertiesFile = null;
		try {
			propertiesFile = new FileInputStream(
					"src/algorithm/props/grid.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		if (propertiesFile != null) {
			try {
				algorithmProps.load(propertiesFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
