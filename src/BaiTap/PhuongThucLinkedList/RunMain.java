package BaiTap.PhuongThucLinkedList;

public class RunMain{
    public static void main(String[] args) {
        PhuongthucLinkedList list = new PhuongthucLinkedList("dinh");
        list.add(1, "Melinda");
        list.add(2, "kk");
        list.add(3, "22");
        list.addLast("an");
        list.remove(3);
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }

    }
}
