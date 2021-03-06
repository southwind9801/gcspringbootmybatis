package com.southwind.repository;

import com.southwind.entity.Student;

import java.util.List;

public interface StudentRepository {
    public List<Student> findAll();
    public Student findById(Long id);
    public int save(Student student);
    public int update(Student student);
    public int deleteById(Long id);
}
