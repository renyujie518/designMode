/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Memento.java
 * @Description 备忘录对象, 负责保存好记录，即Originator内部状态
 * @createTime 2022年03月21日 22:17:00
 */
public class Memento {
    //攻击力
    private int vit;
    //防御力
    private int def;
    public Memento(int vit, int def) {
        this.vit = vit;
        this.def = def;
    }
    public int getVit() {
        return vit;
    }
    public void setVit(int vit) {
        this.vit = vit;
    }
    public int getDef() {
        return def;
    }
    public void setDef(int def) {
        this.def = def;
    }

}
