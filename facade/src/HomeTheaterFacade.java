/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName HomeTheaterFacade.java
 * @Description 家庭影院系统
    组建一个家庭影院：
    DVD播放器、投影仪、自动屏幕、环绕立体声、爆米花机,要求
    完成使用家庭影院的功能，其过程为：
    直接用遥控器：统筹各设备开关
    开爆米花机
    放下屏幕
    开投影仪
    开音响
    开DVD，选dvd
    去拿爆米花
    调暗灯光
    播放
    观影结束后，关闭各种设备

 * @createTime 2022年03月18日 22:09:00
 */
public class HomeTheaterFacade {
    // 定义各个子系统对象
    private TheaterLight theaterLight;
    private Popcorn popcorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DVDPlayer dVDPlayer;

    // 构造器
    public HomeTheaterFacade() {
        super();
        this.theaterLight = TheaterLight.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.dVDPlayer = DVDPlayer.getInstanc();
    }

    // 操作分成 4 步

    public void ready() {
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dVDPlayer.on();
        theaterLight.dim();
    }

    public void play() {
        dVDPlayer.play();
    }

    public void pause() {
        dVDPlayer.pause();
    }

    public void end() {
        popcorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dVDPlayer.off();
    }
}
