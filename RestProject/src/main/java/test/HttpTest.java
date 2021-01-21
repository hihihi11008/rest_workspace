package test;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/*�ڹ� ���Ĵٵ忡���� Socket(stateful:�������ӵ�)��ŻӸ� �ƴ϶� ���������� HTTP(stateless)��ŵ� �����Ѵ�!!*/
public class HttpTest {
	URL url;
	HttpURLConnection con; //HTTP��Ű�ü
	OutputStream os;
	
	public HttpTest() {
		try {
			url = new URL("http://localhost:8889/rest/member");//��û�ּ�
			con = (HttpURLConnection)url.openConnection();//Ŀ�ؼ� ��ü ����
			con.setRequestMethod("POST");//post ��� 
			con.setRequestProperty("Content-Type", "application/json;utf-8");//http ��Ž� ��� ���� ����
			//�������� ��û����(��½�Ʈ���� ���� ����� �ؾ���) 
			con.setDoOutput(true);
			os = con.getOutputStream();
			
			
			
			os.write(0);
			os.flush();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (os!=null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new HttpTest();
	}

}
