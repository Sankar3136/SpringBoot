package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.medicineEntity;
import com.example.demo.service.medicineService;
@RestController
public class medicineController {
	 @Autowired
	 medicineService mser;
		
	 @PostMapping("addmedicine")
	 public medicineEntity add(@RequestBody medicineEntity ss)
	 {
	  return mser.saveinfo(ss);
	 }
		
	 @GetMapping("MedicineDetails")
	 public List<medicineEntity>show(){
	  return mser.showinfo();
	 }
		
	 @PutMapping("Medicineupdate")
	 public medicineEntity modify(@RequestBody medicineEntity ss)
	 {
	  return mser.changeinfo(ss);
	 }
		
	 @DeleteMapping("Medicinedelete")
	 public String del(@RequestBody medicineEntity ss)
	 {
	    mser.deleteinfo(ss);
	 return "Deleted successfully"; 
	 }
		
	 @DeleteMapping("delid/{id}")
	 public void deletemyid(@PathVariable int id)
	 {
	  mser.deleteid(id);
	 }
		
	 @PutMapping("updatebyid/{id}")
	 public String modifybyid(@PathVariable int id,@RequestBody medicineEntity ss) {
	  return mser.updateinfobyid(id,ss);
	 }

}
