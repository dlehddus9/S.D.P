package hansung.designpatterns.facade.hometheater;

public class DvdAdapter extends LGDvdPlayer implements DvdPlayer {

    public DvdAdapter(String description, Amplifier amplifier) {
        super(description, amplifier);
    }

    @Override
    public void play(String movie) {
        super.play();

    }

    @Override
    public void play(int track) {
        for(int i=0; i<track; i++)
        {
            super.next();
        }
        super.play();
    }

    @Override
    public void setSurroundAudio() {
    throw new UnsupportedOperationException();
    }

    @Override
    public void request() {

    }


}
