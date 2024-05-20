package iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception {
		String originalFileName = "C:/TEMP/1.png";
		String targetFileName = "C:/TEMP/2.png";

		InputStream is = new FileInputStream(originalFileName);
		OutputStream os = new FileOutputStream(targetFileName);

		byte[] data = new byte[1024];
		while (true) {
			int num = is.read(data);
			if (num == -1)
				break;
			os.write(data, 0, num);
		}

		os.flush();
		os.close();
		is.close();

		System.out.println("복사 되었습니다.");
	}
}
