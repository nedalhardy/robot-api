package test.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import test.example.demo.model.Robot;

public interface RobotRepository extends CrudRepository<Robot, Long>{

}
