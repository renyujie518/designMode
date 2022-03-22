/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName SchoolMasterApprover.java
 * @Description >=30000  校长审批
 * @createTime 2022年03月22日 15:21:00
 */
public class SchoolMasterApprover extends Approver {
    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() > 30000) {
            System.out.println(" 请求编号 id= " + purchaseRequest.getId() + " 被 " + this.name + " 处理");
        }else {
            approver.processRequest(purchaseRequest);
        }
    }
}
