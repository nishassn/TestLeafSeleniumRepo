package methofOverloading;

public class APIClient {
	
	void sendRequest(String endPoint)
	{
		System.out.println(endPoint);
	}

	void sendRequest(String endPoint,String requestBody,boolean requestStatus)
	{
		System.out.println(endPoint+" "+requestBody+" "+requestStatus);
	}

	public static void main(String[] args) {
		
		APIClient api=new APIClient();
		
		//@overload
		api.sendRequest("Single Argument");
		api.sendRequest("EndPoint","Request Body", true);

	}

}
