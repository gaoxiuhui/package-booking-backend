package tws.entity;

public class Packages {
    private String  waybillNum;   // 运单号
    private String  recipients;  //收件人
    private String  phoneNum;  //电话
    private String  status;  //状态
    private String  appointTime;  //预约时间
    private double weight;  // 重量
    public Packages() {
    }

    public Packages(String waybillNum, String recipients, String phoneNum, double weight) {
        this.waybillNum = waybillNum;
        this.recipients = recipients;
        this.phoneNum = phoneNum;
        this.weight = weight;
    }

    public Packages(String waybillNum, String recipients, String phoneNum, String status, String appointTime) {
        this.waybillNum = waybillNum;
        this.recipients = recipients;
        this.phoneNum = phoneNum;
        this.status = status;
        this.appointTime = appointTime;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWaybillNum() {
        return waybillNum;
    }

    public void setWaybillNum(String waybillNum) {
        this.waybillNum = waybillNum;
    }

    public String getRecipients() {
        return recipients;
    }

    public void setRecipients(String recipients) {
        this.recipients = recipients;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(String appointTime) {
        this.appointTime = appointTime;
    }
}
