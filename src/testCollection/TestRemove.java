package testCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestRemove {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();
        list.add("1");list2.add("1");list3.add("1");list4.add("1");
        list.add("2");list2.add("2");list3.add("2");list4.add("2");
        list.add("3");list2.add("3");list3.add("3");list4.add("3");
        list.add("3");list2.add("3");list3.add("3");list4.add("3");
        list.add("5");list2.add("5");list3.add("5");list4.add("5");

        for (int i = 0; i < list.size(); i++) {//1,2,3,5，采用正向普通for循环，未能删除掉两个3
            if (list.get(i).equals("3"))
            list.remove(i);
        }
        for (int i = list2.size() - 1; i >= 0; i--) {//1,2,5，采用倒序普通for循环，正确删除两个3
            if (list2.get(i).equals("3"))
                list2.remove(i);
        }
//        for (String s : list3) {//在增强for循环中使用集合的remove方法删除，抛出ConcurrentModificationException
//            if (s.equals("3"))
//                list3.remove(s);
//        }
        Iterator<String> it = list3.iterator();
        while (it.hasNext()){//1,2,5，使用迭代器中的remove方法正确删除元素
            if(it.next().equals("3"))
            it.remove();
        }

        list4.removeIf(e->e.equals("3"));//1,2,5，使用removeif方法（底层迭代器），正确删除两个3


        list.stream().forEach(e-> System.out.print(e));
        System.out.println();
        list2.stream().forEach(e-> System.out.print(e));
        System.out.println();
        list3.stream().forEach(e-> System.out.print(e));
        System.out.println();
        list4.stream().forEach(System.out::print);
    }
}
