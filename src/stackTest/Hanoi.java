package stackTest;

public class Hanoi {
    /**
    * 
    * @param n ���ӵ���Ŀ
    * @param origin Դ��
    * @param assist ������
    * @param destination Ŀ����
    */
    public void hanoi(int n, char origin, char assist, char destination) {
        if (n == 1) {
            move(origin, destination);
        } else {
            hanoi(n - 1, origin, destination, assist);
            move(origin, destination);
            hanoi(n - 1, assist, origin, destination);
        }
    }
 
    // Print the route of the movement
    private void move(char origin, char destination) {
        System.out.println("Direction:" + origin + "--->" + destination);
    }
 
    public static void main(String[] args) {
        Hanoi hanoi = new Hanoi();
        hanoi.hanoi(4, 'A', 'B', 'C');
    }
}
