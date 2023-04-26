package com.StudentAdmission.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentAdmission.entity.Student;
import com.StudentAdmission.repository.StudentRepository;
import com.StudentAdmission.service.StudentService;

@Service
public class StudentServiceimpl implements StudentService{
@Autowired
	private StudentRepository studentRepository;
		
	public StudentServiceimpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	
	}

}
