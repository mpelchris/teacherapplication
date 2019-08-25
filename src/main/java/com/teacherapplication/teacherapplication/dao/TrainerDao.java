/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teacherapplication.teacherapplication.dao;

import com.teacherapplication.teacherapplication.entities.Trainer;
import com.teacherapplication.teacherapplication.repo.TrainerRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author christy
 */
@Service
public class TrainerDao {

@Autowired 
TrainerRepo trainerRepo;


public void insertTrainer(Trainer t){
    trainerRepo.save(t);
    
}

public List <Trainer> fetchAllTheTrainers(){
   return     trainerRepo.findAll();
}

public void deleteTrainer(Trainer t){
trainerRepo.delete(t);
}

public Trainer fetchOneTrainer(int id){
    
    return  trainerRepo.getOne(id);
}
    



}
