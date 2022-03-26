import java.util.Arrays;

public class GenericListClass {
    public static void main(String[] args) {
        myList<Integer> list = new myList<>();
        /*System.out.println("Dizideki Eleman Sayısı : " + list.size());
        System.out.println("Dizinin Kapasitesi : " + list.getCapacity());
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Dizideki Eleman Sayısı : " + list.size());
        System.out.println("Dizinin Kapasitesi : " + list.getCapacity());
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        System.out.println("Dizideki Eleman Sayısı : " + list.size());
        System.out.println("Dizinin Kapasitesi : " + list.getCapacity());*/

        /*list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("2. indisteki değer : " + list.get(2));
        list.remove(2);
        list.add(40);
        list.set(0, 100);
        System.out.println("2. indisteki değer : " + list.get(2));
        System.out.println(list.toString());*/

        System.out.println("Liste Durumu : " + (list.isEmpty() ? "Boş" : "Dolu"));
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println("Liste Durumu : " + (list.isEmpty() ? "Boş" : "Dolu"));

        // Bulduğu ilk indeksi verir
        System.out.println("Indeks : " + list.indexOf(20));

        // Bulamazsa -1 döndürür
        System.out.println("Indeks :" + list.indexOf(100));

        // Bulduğu son indeksi verir
        System.out.println("Indeks : " + list.lastIndexOf(20));

        // Listeyi Object[] dizisi olarak geri verir.
        Object[] dizi = list.toArray();
        System.out.println("Object dizisinin ilk elemanı :" + dizi[0]);

        // Liste veri türünde alt bir liste oluşturdu
        myList<Integer> altListem = list.subList(0, 3);
        System.out.println(altListem.toString());

        // Değerim listedeki olup olmadığını sorguladı
        System.out.println("Listemde 20 değeri : " + list.contains(20));
        System.out.println("Listemde 120 değeri : " + list.contains(120));

        // Listeyi tamamen boşaltır ve varsayılan boyutuna çevirir
        list.clear();
        System.out.println(list.toString());
    }
}

class myList<T> {
    T[] list;
    private int index;

    myList() {
        this.list = (T[]) new Object[10];
    }

    myList(int capacity) {
        this.list = (T[]) new Object[capacity];
    }

    int size() {
        int count = 0;
        for (T element : list) {
            if (element != null) {
                count++;
            }
        }
        return count;
    }

    int getCapacity() {
        return this.list.length;
    }

    void add(T data) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                list[i] = data;
                break;
            } else if (list[i] != null && i == list.length - 1) {
                list = Arrays.copyOf(list, list.length * 2);
                list[list.length / 2] = data;
                break;
            }
        }
    }

    T get(int index) {
        if (list[index] != null) {
            return this.list[index];
        }
        return null;
    }

    T remove(int index) {
        if (list[index] != null) {
            list[index] = null;
            for (int i = index;i < this.index; i++) {
                this.list[i] = this.list[i+1];
                this.index--;
            }
        }
        return null;
    }

    T set(int index,T data) {
        if (list[index] != null) {
            list[index] = data;
        }
        return null;
    }

    @Override
    public String toString() {
        String strlist = "[ ";
        for (int i =0;i < list.length;i++) {
            if (list[i] != null) {
                strlist += list[i] + " ";
            }
        }
        return strlist + "]";
    }

    int indexOf(T data) {
        for (int i =0;i < list.length;i++) {
            if(data == list[i]) {
                return i;
            }
        }
        return -1;
    }

    int lastIndexOf(T data) {
        int index = -1;
        for (int i = size() - 1; i >= 0; i--) {
            if (list[i] == data) {
                index = i;
                break;
            }
        }
        return index;
    }

    boolean isEmpty() {
        return size() == 0;
    }

    T[] toArray() {
        return Arrays.copyOfRange(list, 0, size());
    }

    void clear() {
        this.list = (T[]) new Object[10];
    }

    myList<T> subList(int start, int finish) {
        myList<T> subList = new myList<>(finish - start + 1);
        for(int i = start;i <= finish;i++) {
            subList.add(list[i]);
        }
        return subList;
    }

    boolean contains(T data) {
        boolean check = false;
        for (int i = 0;i < list.length;i++) {
            if(list[i] == data) {
                check = true;
                break;
            }
        }
        return check;
    }
}

