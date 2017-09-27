package test.example.demo.service;

import java.util.List;

import test.example.demo.model.Robot;

public interface RobotService {

	/**
	 * create
	 * return type: Robot
	 */
	public Robot create(Robot robot);

	/**
	 * findOne
	 * return type: Robot
	 */
	public Robot findOne(Long id);

	/**
	 * findAll
	 * return type: List<Robot>
	 */
	public List<Robot> findAll();

	/**
	 * delete
	 * return type: void
	 */
	public void delete(Long id);

}