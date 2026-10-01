package com.example.StudentApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.StudentApp.entity.Student;
import com.example.StudentApp.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public List<Student> getAll() { return repo.findAll(); }

    public Student getById(Long id) { return repo.findById(id).orElse(null); }

    public Student save(Student s) { return repo.save(s); }

    public Student update(Long id, Student s) {
        Student existing = repo.findById(id).orElse(null);
        if (existing == null) return null;
        existing.setName(s.getName());
        existing.setEmail(s.getEmail());
        return repo.save(existing);
    }

    public void delete(Long id) { repo.deleteById(id); }
}
