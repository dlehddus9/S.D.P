package hansung.designpatterns.templatemethod.barista;

public class DutchCoffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("찬물을 사용하여 장시간에 걸쳐 커피액 추출");
    }

    @Override
    void addCondiments() {
        System.out.println("첨가물을 추가합니까?");

    }
}
