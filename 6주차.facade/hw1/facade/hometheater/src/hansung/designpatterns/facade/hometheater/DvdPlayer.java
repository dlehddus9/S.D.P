package hansung.designpatterns.facade.hometheater;

public interface DvdPlayer {

	public void on();
	public void off();
	public void eject();
	public void play(int arg);
	public void play(String arg);
	public void stop();
	public void pause();
	public void setTwoChannelAudio();
	public void setSurroundAudio();
	public String toString();
}

