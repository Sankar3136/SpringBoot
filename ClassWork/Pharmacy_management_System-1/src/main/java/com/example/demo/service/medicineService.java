package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.medicineRepo;
import com.example.demo.model.medicineEntity;
@Service
public class medicineService {
	@Autowired
	 medicineRepo mr;
		
	 public medicineEntity saveinfo(medicineEntity ss)
	 {
	  return mr.save(ss);
	 }
		
	 public List<medicineEntity>showinfo()
	 {
	  return mr.findAll();
	 }
		
	 public medicineEntity changeinfo(medicineEntity ss)
	 {
	  return mr.saveAndFlush(ss);
	 }
		
	 public void deleteinfo(medicineEntity ss)
	 {
	  mr.delete(ss);
	 }
		
	 public void deleteid(int id)
	 {
	  mr.deleteById(id);
	 }

	 public String updateinfobyid(int id,medicineEntity ss)
	 {
	  mr.saveAndFlush(ss);
	  if(mr.existsById(id))
	    {
	 return"updated";
	     }
	    else
	    {
	    return "enter valid id" ;
	    }
	 
	}


}
