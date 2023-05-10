import java.util.ArrayList;

public class ResponseModel {
    private String msg;
    private String status;
    private String comments;
    ArrayList<String>ResponseModel;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public ArrayList<String> getResponseModel() {
        return ResponseModel;
    }

    public void setResponseModel(ArrayList<String> responseModel) {
        ResponseModel = responseModel;
    }
}
