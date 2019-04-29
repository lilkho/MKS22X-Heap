public class MyHeap {
  private static void pushDown(int[]data,int size,int index) {
    if (index<0 || index>=size-1 || 2*index+1>=size) {

    }
  }

  private static void pushUp(int[]data,int index) {

  }

  public static void heapify(int[]data) {}

  public static void heapsort(int[]data) {}

  public static String toString(int[]data) {
    String s = "[ ";
    for (int i=0;i<data.length;i++) {
      s+=data[i]+" ";
    }
    return s+"]";
  }

  public static void main(String[] args) {
    int[] data = {3,10,8,5,2,4};
    System.out.println(toString(data));
    pushDown(data,data.length,0);
    System.out.println(toString(data));
  }
}
