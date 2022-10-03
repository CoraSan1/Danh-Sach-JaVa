package BaiTap.PhuongThucArrayList;

public class RunMain {
    public static void main(String[] args) {
        PhuongThucArrayList<String> list = new PhuongThucArrayList<>();
        list.add("toàn");
        list.add("không");
        list.add("đẹp");
        list.add(2,"trai");
        print(list.getData());


        System.out.println(list.indexOf("không"));
        System.out.println(list.indexOf("có"));
        list.remove(1);
        list.add(1,"rất");
        print(list.getData());


        PhuongThucArrayList<String> clone = list.clone();
        System.out.println(clone.contains("toàn"));
        System.out.println(clone.contains("không"));
        System.out.println(clone.get(3));
        System.out.println(clone.size());
        clone.clear();
        System.out.println(clone.size());
        print(clone.getData());

    }

    static void print(Object[] list) {
        for (Object x : list) {
            if (!(x == null)) {
                System.out.println((String) x);
            }
        }
        System.out.println("\n");
    }
}
