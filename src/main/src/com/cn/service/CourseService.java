package com.cn.service;

import com.cn.model.Course;
import org.springframework.stereotype.Service;



@Service
public interface CourseService {
	
	
	Course getCoursebyId(Integer courseId);
	

	
	

}
