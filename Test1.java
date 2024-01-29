
import org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.example.Main;
import org.junit.jupiter.api.Test;



public class Test1 {
    double notas []= {3.5, 2.8,4.6, 3.3, 5.0, 3.9, 4.2, 1.7, 4.1, 2.4};
    @Test
    public void testearquicksort (){
        double [] solution= {1.7, 2.4, 2.8, 3.3, 3.5, 3.9, 4.1, 4.2, 4.6, 5.0};
        Main.quicksort (notas, 0, notas.length -1);
        assertArrayEquals(solution, notas);

    }
}
