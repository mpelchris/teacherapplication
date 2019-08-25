/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teacherapplication.teacherapplication.controllers;

import com.teacherapplication.teacherapplication.dao.TrainerDao;
import com.teacherapplication.teacherapplication.entities.Trainer;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author christy
 */
@Controller
public class TrainerController {
    
@Autowired
TrainerDao trainerDao;


@GetMapping("inserttothetrainersapplication")
public String insertTrainerApplication(ModelMap mm){
Trainer trainer=new Trainer();
mm.addAttribute("newtrainer",trainer);
mm.addAttribute("trainerlist",trainerDao.fetchAllTheTrainers());
return "trainerform";
}


@GetMapping("exittrainerapplication")
public String exitFromTheApplication(ModelMap mm){

return "redirect:/";
}




@PostMapping("insertthetrainer")
public String doInsertTrainnerToDatabase(ModelMap mm,
                                         @ModelAttribute("newtrainer") @Valid Trainer t,
                                         BindingResult br){
    if(br.hasErrors()){
        return "trainerform";
    }else{
        trainerDao.insertTrainer(t);
        mm.addAttribute("firstname", t);
        return "redirect:inserttothetrainersapplication";
    }
}
 


@GetMapping(value="/delete/{id1}")
public String deletePerson(ModelMap mm,
                            @PathVariable("id1") int id){
    Trainer t  = trainerDao.fetchOneTrainer(id);
    trainerDao.deleteTrainer(t);
  
    return "redirect:/inserttothetrainersapplication";
  }  


@GetMapping(value="/update/{id1}")
public String updatePerson(ModelMap mm,
                             @PathVariable("id1") int id){
    Trainer t  = trainerDao.fetchOneTrainer(id);
   
    mm.addAttribute("trainer",t);
   
    
     return "updateform";
  }  


  
@PostMapping("/update/updatethetrainer")
public String doUpdateTrainnerToDatabase(ModelMap mm,
                                         @ModelAttribute("trainer") @Valid Trainer t,
                                         BindingResult br){
      if(br.hasErrors()){
        return "updateform";
    }else{
    trainerDao.insertTrainer(t);

    mm.addAttribute("firstname", t);
    return "redirect:/inserttothetrainersapplication";
      }
}
    

}
