package hansung.designpatterns.templatemethod.barista;
import java.io.*;

public class DutchCoffeeWithHook extends CaffeineBeverageWithHook {

    public void brew() {
        System.out.println("찬물을 사용하여 장시간에 걸쳐 커피액 추출");
    }

    @Override
    protected void boilWater() {
    }

    @Override
    protected void store() {
        System.out.println("1~2일 저온에서 숙성");
    }

    public void addCondiments() {
        System.out.println("첨가물이 추가되었습니다.");
    }

    public boolean customerWantsCondiments() {

        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.print("더치 커피에 첨가물 넣으실건가요? (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
