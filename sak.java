public class sak {
public static void main(String[] args){
    if(args.length < 1){
        System.out.println("This application requires at least one argument. For help(java sak -help)");
			Help.printHelp();
    }
    if(args[0].equalsIgnoreCase("-HttpRequest")){
       String URL = args[1];
       HttpRequest request = new HttpRequest(URL);
       Boolean run = request.readURL(URL);
       request.toString();
       System.out.print(request.toString());
        
    }
    if(args[0].equalsIgnoreCase("-Help")){
        Help.printHelp();
    }
    if(args[0].equalsIgnoreCase("-HttpRequestIndex")){
        HttpRequestIndex indexRequest = new HttpRequestIndex();
        
        if (indexRequest.readURL());
            System.out.print(indexRequest);
    }   
        else if (args[0].equalsIgnoreCase("-RequestContacts")) {
			ThunderbirdModel model = new ThunderbirdModel();
			model.LoadIndex();
			model.LoadContacts();
			System.out.println(model);
		}

	    
      
       
    }
}   

