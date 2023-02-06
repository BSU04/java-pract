import java.net.*;
class URLExample
{
public static void main(String[] args) throws Exception
	{
	URL url=new URL("https://www.bcci.tv/");
	System.out.println("protocal is:"+url.getProtocol());
	System.out.println("host name is:"+url.getHost());
	System.out.println("port number is:"+url.getPort());
	System.out.println("path is:"+url.getPath());
	System.out.println(url);
	}
}