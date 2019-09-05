package tws.entity;

public class Packages {
    private String  waybillNum;   // 运单号
    private String  recipients;  //收件人
    private String  phoneNum;  //电话
    private int   status;  //状态
    private String  appointTime;  //预约时间
    private double weight;  // 重量
    public Packages() {
    }

    public Packages(String waybillNum, String recipients, String phoneNum, int status, String appointTime, double weight) {
        this.waybillNum = waybillNum;
        this.recipients = recipients;
        this.phoneNum = phoneNum;
        this.status = status;
        this.appointTime = appointTime;
        this.weight = weight;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(String appointTime) {
        this.appointTime = appointTime;
    }
}
