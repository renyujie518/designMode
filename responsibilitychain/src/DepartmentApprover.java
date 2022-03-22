/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName DepartmentApprover.java
 * @Description <=5000  教学主任审批
 * @createTime 2022年03月22日 15:18:00
 */
public class DepartmentApprover extends Approver{
    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() <= 5000) {
            System.out.println(" 请求编号 id= " + purchaseRequest.getId() + " 被 " + this.name + " 处理");
        }else {
            //继续传递
            approver.processRequest(purchaseRequest);
        }
    }
}
