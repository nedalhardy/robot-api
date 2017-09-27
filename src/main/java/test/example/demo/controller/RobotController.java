package test.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.example.demo.model.Robot;
import test.example.demo.service.RobotService;


@RestController
@RequestMapping("/robot")
public class RobotController {

	/**
	 * robotService RobotService
	 */
	@Autowired
	private RobotService robotService;

	/**
	 * create
	 * return type: ResponseEntity<Robot>
	 */
	@PostMapping
	public ResponseEntity<Robot> create(@RequestBody Robot robot) {
		return new ResponseEntity<Robot>(robotService.create(robot),HttpStatus.CREATED);
	}

	/**
	 * findOne
	 * return type: Robot
	 */
	@GetMapping(value = "/{id}")
	private Robot findOne(@PathVariable Long id) {
		return robotService.findOne(id);
	}

	/**
	 * findAll
	 * return type: List<Robot>
	 */
	@GetMapping
	private List<Robot> findAll() {
		return robotService.findAll();
	}

	/**
	 * delete
	 * return type: ResponseEntity<Void>
	 */
	@DeleteMapping(value = "/{id}")
	private ResponseEntity<Void> delete(@PathVariable Long id) {
		robotService.delete(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}