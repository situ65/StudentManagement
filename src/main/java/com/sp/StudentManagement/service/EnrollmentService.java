package com.sp.StudentManagement.service;

 

import java.util.List;

import org.springframework.data.domain.Page;

import com.sp.StudentManagement.dto.EnrollmentDTO;
import com.sp.StudentManagement.dto.EnrollmentSummaryDTO;

 

public interface EnrollmentService {
	
	void enrollStudentToCourses(EnrollmentDTO enrollmentDTO);
	
	Page<EnrollmentSummaryDTO> getEnrolledStudents(int page, int size);
	
	EnrollmentSummaryDTO findEnrolledStudentCourseDetails(Long studentId);
	
	List<EnrollmentSummaryDTO> getRecentlyEnrolledStudents();

}