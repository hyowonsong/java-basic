package java_basic.Chapter6.ex2;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;


    public void addItem(Item item) {
        if (itemCount >= items.length){
            System.out.println("장바구니가 가득 찼습니다.");   // 검증 로직
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for(int i=0; i<itemCount; i++){
            Item item = items[i];
            System.out.println("상품명:" + item.getName() + ", 합계:"+ item.getTotalPrice());
        }
        System.out.println("전체 가격합:" + calculateTotalPrice());
    }
    private int calculateTotalPrice(){
        int toalPrice = 0;
        for(int i=0; i<itemCount; i++){
            Item item = items[i];
            toalPrice += item.getTotalPrice();
        }
        return toalPrice;
    }
}
