import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class FirstConnect {
    public static void main(String[] args) throws IOException {
        ConnectURI koneksisaya = new ConnectURI();
        URL myAddress = koneksisaya.buildURL // request dari build url
                ("https://harber.mimoapps.xyz/api/getaccess.php");//alamat ip
        String response = koneksisaya.getResponseFromHttpUrl(myAddress); // respon dari yang kita request
        System.out.println(response);
        assert response !=null;
        JSONArray responseJSON =new JSONArray(response);
        ArrayList<ResponseModel> responseModel =
                new ArrayList<>();
        for(int i=0;i< responseJSON.length();i++) {
            ResponseModel resModel = new ResponseModel();
            JSONObject myJSONObject =
                    responseJSON.getJSONObject(i);
            resModel.setMsg(myJSONObject.getString("message"));//pointer tipe data res model
            resModel.setStatus(myJSONObject.getString("status"));
            resModel.setComments(myJSONObject.getString("comment"));
            responseModel.add(resModel);
        }
        System.out.println("Response are:");
        for(int index=0; index<responseModel.size();index++){
            System.out.println("MESSAGE :" + responseModel.get(index).getMsg());
            System.out.println("STATUS :" + responseModel.get(index).getStatus());
            System.out.println("COMMENTS :"+ responseModel.get(index).getComments());



        }
    }
}




