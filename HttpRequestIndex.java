public class HttpRequestIndex extends HttpRequest {
    public String requestURL;
    public HttpRequestIndex(){
        super("https://thunderbird-index-sp22.azurewebsites.net/index-w0a6zk195d");
        requestURL = "https://thunderbird-index-sp22.azurewebsites.net/index-w0a6zk195d";
    }
    public void readURLIndex(){
        Boolean run = readURL(requestURL);
        System.out.print(requestURL.toString());
        
    }
    
}