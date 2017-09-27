package test.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import test.example.demo.model.Robot;
import test.example.demo.repository.RobotRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
@DataJpaTest
public class RobotRepositoryTest {

    /** The scrum role repository. */
    @Autowired
    private RobotRepository robotRepository;

    /**
     * Before.
     */
    @Before
    public void before() {

        Robot robot = new Robot();
        robot.setId(1l);
        robot.setName("Robot1");
        robot.setDescription("Description1");
        robotRepository.save(robot);
    }

    
    @Test
    public void should_return_a_robot_when_get_one_robot() {
        assertEquals(2l, robotRepository.findOne(2l).getId());
    }
    
    @Test
    public void should_return_all_robots_when_get_all_robots() {
        assertNotEquals(0, robotRepository.findAll().spliterator().getExactSizeIfKnown());
    }

}
