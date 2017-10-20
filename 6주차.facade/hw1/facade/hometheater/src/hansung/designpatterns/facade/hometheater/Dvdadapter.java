package hansung.designpatterns.facade.hometheater;

public class Dvdadapter implements DvdPlayer {

    LGDvdPlayer LG ;
    public Dvdadapter(LGDvdPlayer LG) {
                this.LG =LG;
    }

    @Override
    public void on() {
        LG.on();
    }

    @Override
    public void off() {
        LG.off();
    }

    @Override
    public void eject() {
        LG.eject();
    }

    @Override
    public void play(int arg) {
        for(int i=0 ;i<arg ; i++)
        {
            LG.next();
        }
        LG.play();

    }

    @Override
    public void play(String arg) {
        LG.play();
    }


    @Override
    public void stop() {
        LG.play();
    }

    @Override
    public void pause() {
        LG.pause();
    }

    @Override
    public void setTwoChannelAudio() {
        LG.setTwoChannelAudio();
    }

    @Override
    public void setSurroundAudio() {
        throw new UnsupportedOperationException();
    }
}
