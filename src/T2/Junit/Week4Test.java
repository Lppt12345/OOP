//import org.junit.Assert;
//import org.junit.Test;
//
//public class Week4Test {
//    @Test
//    public void testMax2Int1() {
//        int a = 20;
//        int b = 20;
//        int max = 20;
//        int result = Week4.max2Int(a, b);
//        Assert.assertEquals(max, result);
//    }
//
//    @Test
//    public void testMax2Int2() {
//        int a = 20;
//        int b = 21;
//        int max = 21;
//        int result = Week4.max2Int(a, b);
//        Assert.assertEquals(max, result);
//    }
//
//    @Test
//    public void testMax2Int3() {
//        int a = 4;
//        int b = 20;
//        int max = 20;
//        int result = Week4.max2Int(a, b);
//        Assert.assertEquals(max, result);
//    }
//
//    @Test
//    public void testMax2Int4() {
//        int a = 6;
//        int b = 21;
//        int max = 21;
//        int result = Week4.max2Int(a, b);
//        Assert.assertEquals(max, result);
//    }
//
//    @Test
//    public void testMax2Int5() {
//        int A[] = {1, 2, 3, 4, 5};
//        int min = 1;
//        int result = Week4.minArray(A);
//        Assert.assertEquals(min, result);
//    }
//
//    @Test
//    public void testMinArray1() {
//        int A[] = {1, -2, -3, 4, 5};
//        int min = -3;
//        int result = Week4.minArray(A);
//        Assert.assertEquals(min, result);
//    }
//
//    @Test
//    public void testMinArray2() {
//        int A[] = {2, 3, 4, 2};
//        int min = 2;
//        int result = Week4.minArray(A);
//        Assert.assertEquals(min, result);
//    }
//
//    @Test
//    public void testMinArray3() {
//        int A[] = {1, 1, 1, 1, 1};
//        int min = 1;
//        int result = Week4.minArray(A);
//        Assert.assertEquals(min, result);
//    }
//
//    @Test
//    public void testMinArray4() {
//        int A[] = {1, 2, 2, 2, 5};
//        int min = 1;
//        int result = Week4.minArray(A);
//        Assert.assertEquals(min, result);
//    }
//
//    @Test
//    public void testMinArray5() {
//        int A[] = {-1, -1, 1, 4, 5};
//        int min = -1;
//        int result = Week4.minArray(A);
//        Assert.assertEquals(min, result);
//    }
//
//    @Test
//    public void testCalculateBMI1() {
//    }
//
//    @Test
//    public void testCalculateBMI2() {
//        double weight = 80;
//        double height = 1.5;
//        String result = Week4.calculateBMI(weight, height);
//        String ketLuan = "Béo phì";
//        Assert.assertEquals(ketLuan, result);
//    }
//
//    @Test
//    public void testCalculateBMI3() {
//        double weight = 40;
//        double height = 1.6;
//        String result = Week4.calculateBMI(weight, height);
//        String ketLuan = "Thiếu cân";
//        Assert.assertEquals(ketLuan, result);
//    }
//
//    @Test
//    public void testCalculateBMI4() {
//        double weight = 60;
//        double height = 1.9;
//        String result = Week4.calculateBMI(weight, height);
//        String ketLuan = "Thiếu cân";
//        Assert.assertEquals(ketLuan, result);
//    }
//
//    @Test
//    public void testCalculateBMI5() {
//        double weight = 70;
//        double height = 1.73;
//        String result = Week4.calculateBMI(weight, height);
//        String ketLuan = "Bình thường";
//        Assert.assertEquals(ketLuan, result);
//    }
//}
