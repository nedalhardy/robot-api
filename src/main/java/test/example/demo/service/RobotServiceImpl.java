package test.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.example.demo.model.Robot;
import test.example.demo.repository.RobotRepository;

/**
 * @author Mounir
 *
 */
@Service
public class RobotServiceImpl implements RobotService {

	@Autowired
	private RobotRepository robotRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * test.example.demo.service.RobotService#create(test.example.demo.model.Robot)
	 */
	@Override
	public Robot create(Robot robot) {
		return robotRepository.save(robot);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see test.example.demo.service.RobotService#findOne(java.lang.Long)
	 */
	@Override
	public Robot findOne(Long id) {
		return robotRepository.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see test.example.demo.service.RobotService#findAll()
	 */
	@Override
	public List<Robot> findAll() {
		return (List<Robot>) robotRepository.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see test.example.demo.service.RobotService#delete(java.lang.Long)
	 */
	@Override
	public void delete(Long id) {
		robotRepository.delete(id);
	}
}