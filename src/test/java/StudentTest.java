
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
/**
 * Created by jpratt on 6/13/2017.
 */
public class StudentTest {

    @Test
    public void a_new_student_has_a_name() {
        final String JANE = "Jane Doe";
        Student student = new Student(JANE);
        assertThat(student.getName()).isEqualTo(JANE);

        final String JOHN = "John Doe";
        student = new Student(JOHN);
        assertThat(student.getName()).isEqualTo(JOHN);
    }
}
