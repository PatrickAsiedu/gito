package org.turntabl.io;

import java.util.ArrayList;
import java.util.List;

public class Register {

    List<Nameable> nameableList ;

    public Register(List<Nameable> nameableList){
    this.nameableList=nameableList;

    }

    public List<String> getRegister(){
        List<String> namesList = new ArrayList<>();
        for(Nameable entry : nameableList){
            namesList.add(entry.getName());

        }
        return namesList;

    }

    public List<String> getRegisterByLevel(Level level){
        List<String> namesByLevelList = new ArrayList<>();
        for(Nameable entry : nameableList){
            if(entry instanceof HasLevel){
                if(((HasLevel) entry).getLevel()==level){
                    namesByLevelList.add(entry.getName());
                }

            }
        }
        return namesByLevelList;

        
    }

//    public String printReport(){
//
//    }

}
