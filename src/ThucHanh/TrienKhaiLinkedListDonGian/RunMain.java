package ThucHanh.TrienKhaiLinkedListDonGian;

public class RunMain {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        TrienKhaiLinkedListDonGian ll = new TrienKhaiLinkedListDonGian(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4,9);
        ll.add(4,9);
        ll.printList();
    }
}
