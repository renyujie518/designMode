/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName client.java
 * @Description
 * 编写程序完成学校OA系统的采购审批项目：需求
 * 采购员采购教学器材
 * 如果金额 小于等于5000, 由教学主任审批
 * 如果金额 小于等于10000, 由院长审批
 * 如果金额 小于等于30000, 由副校长审批
 * 如果金额 超过30000以上，有校长审批
 *
 *1) 职责链模式（Chain of Responsibility Pattern）,又叫 责任链模式，为请求创建了一个接收者
 * 对象的链。这种模式对请求的发送者和接收者进行解耦。
 * 2) 职责链模式通常每个接收者都包含对另一个接收者的引用。如果一个对象不能处理该请求，
 * 那么它会把相同的请求传给下一个接收者，依此类推。
 * 3) 这种类型的设计模式属于行为型模式  职责链模式（Chain Of Responsibility），使多个对象都有机会处理请求，从而避
 * 免请求的发送者和接收者之间的耦合关系。将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止.
 *
 *
 * 1) 将请求和处理分开，实现解耦，提高系统的灵活性
 * 2) 简化了对象，使对象不需要知道链的结构
 * 3) 性能会受到影响，特别是在链比较长的时候，因此需控制链中最大节点数量，一般通过在Handler中设置一个最大节点数量，
 *    在setNext()方法中判断是否已经超过阀值，超过则不允许该链建立，避免出现超长链无意识地破坏系统性能
 * 4) 调试不方便。采用了类似递归的方式，调试时逻辑可能比较复杂
 * 5) 最佳应用场景：有多个对象可以处理同一个请求时，比如：多级请求、请假/加薪
 *    等审批流程、Java Web中Tomcat对Encoding的处理、拦截器
 *
 * @createTime 2022年03月22日 15:24:00
 */
public class client {
    public static void main(String[] args) {

        //创建一个请求
        //PurchaseRequest purchaseRequest = new PurchaseRequest(1, 31000, 1);
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 1000, 2);

        //创建相关的审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("李院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("佟校长");


        //需要将各个审批级别的下一个设置好 (处理人构成环形: )
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);

        departmentApprover.processRequest(purchaseRequest);

    }

}
