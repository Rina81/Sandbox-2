import org.testng.Assert;
import org.testng.annotations.Test;
public class TestDistance {


         @Test
        public void testPointv1() {
            Point p1 = new Point(3, 9);
            Point p2 = new Point(6,9);

            Assert.assertEquals( p1.distance(p2), 3.0);

        }


        @Test
        public void testPointv2(){
            Point p1 = new Point(8, 12);
            Point p2 = new Point(12,6);

            Assert.assertEquals( p1.distance(p2), 7.211102550927978);
        }

        @Test
        public void testPointv3(){
            Point p1 = new Point(7, 7);
            Point p2 = new Point(7,7);

            Assert.assertEquals( p1.distance(p2), 0.0);
        }


    }

