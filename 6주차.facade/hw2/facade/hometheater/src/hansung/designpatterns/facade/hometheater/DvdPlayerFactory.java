package hansung.designpatterns.facade.hometheater;

public class DvdPlayerFactory {
    private static DvdPlayerFactory instance;
    private DvdPlayerFactory() {}
    public static DvdPlayerFactory getInstance() {
        if(instance ==null)
            instance = new DvdPlayerFactory();
        return instance;
    }
    public DvdPlayer createDvdPlayer(String description, Amplifier amplifier) {

        return new DvdAdapter(description, amplifier);
    }
}
