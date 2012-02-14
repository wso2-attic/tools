package org.wso2.maven.registry.handler.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.codehaus.plexus.util.FileUtils;

public class FileManagementUtils extends FileUtils {
	public static String getContentAsString(URL url) throws IOException {
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		InputStream openStream = url.openStream();
		byte[] b = new byte[1024];
		int read = openStream.read(b);
		while (read != -1) {
			stream.write(b, 0, read);
			read = openStream.read(b);
		}
		openStream.close();
		return stream.toString();
	}

	public static String getContentAsString(File file) throws IOException {
		return getContentAsString(file.toURI().toURL());
	}

	public static void writeContent(File destinationFile, String content)
			throws IOException {
		createFile(destinationFile, content);
	}

	public static void createFile(File destinationFile, String content)
			throws IOException {
		// Create parent folder if it doesn't exist
		if (!(destinationFile.getParentFile() == null || destinationFile
				.getParentFile().exists())) {
			destinationFile.getParentFile().mkdirs();
		}

		// Create file
		// FileWriter fstream = new FileWriter(destinationFile);
		// BufferedWriter out = new BufferedWriter(fstream);
		// out.write(content);

		InputStream dataStream = new ByteArrayInputStream(content.getBytes());

		createFile(destinationFile, dataStream);
	}

	public static void createFile(File destinationFile, InputStream dataStream)
			throws FileNotFoundException, IOException {
		FileOutputStream out = new FileOutputStream(destinationFile);
		byte[] data = new byte[1024];
		int readLength;
		while ((readLength = dataStream.read(data)) > 0) {
			out.write(data, 0, readLength);
		}

		// Close input stream
		dataStream.close();

		// Close the output stream
		out.close();
	}
}
