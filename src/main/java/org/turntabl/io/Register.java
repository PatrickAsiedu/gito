package org.turntabl.io;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Register {

    List<Nameable> nameableList ;
    List<Student> students;


//    public Register(List<Nameable> nameableList){
//    this.nameableList=nameableList;
//
//    }

    public Register(List<Student> students){
        this.students= new ArrayList<>(students);

    }

//    public List<Student> getRegister(){
//
//
//        for (Student student : students) {
//            students.add(student);
//        }
//        System.out.println(students);
//        return students;
//
//    }

    public List<String> getRegister(){
        return students.stream().map(student -> student.getName()).collect(Collectors.toList());




    }

//    public List<String> getRegister(){
//        List<String> namesList = new ArrayList<>();
//        for(Nameable entry : nameableList){
//            namesList.add(entry.getName());
//
//        }
//        return namesList;
//
//    }

    public Map<Level,List<Student>> getRegisterByLevel(){
        Map<Level,List<Student>> namesByLevelMap = new HashMap<>();

        for(Student student : students){
            Level level = student.getLevel();
            if(!namesByLevelMap.containsKey(level)){
                namesByLevelMap.put(level,new ArrayList<>());
            }
            namesByLevelMap.get(level).add(student);

        }
        return namesByLevelMap;

        
    }

//    public List<Student> sort (Comparator<Student> comparator){
//        List<Student> sortedStudents = new ArrayList<>(students);
//        sortedStudents.sort(comparator);
//        System.out.println(sortedStudents);
//        return sortedStudents;
//
//    }

    public List<Student> sort (Comparator<Student> comparator){
        return students.stream().sorted(comparator).collect(Collectors.toList());

    }

    public Student getStudentByName(String name) throws StudentNotFoundException {
        return students.stream()
                .filter(student-> student.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new StudentNotFoundException());

    }

//    public Optional<Student> getStudentByName(String name)  {
//        return students.stream()
//                .filter(student-> student.getName().equals(name)).findFirst();
//
//
//    }


//    public List<String> getRegisterByLevel(Level level){
//        List<String> namesByLevelList = new ArrayList<>();
//        for(Nameable entry : nameableList){
//            if(entry instanceof HasLevel){
//                if(((HasLevel) entry).getLevel()==level){
//                    namesByLevelList.add(entry.getName());
//                }
//
//            }
//        }
//        return namesByLevelList;
//
//
//    }

//    public String printReport(){
//
//    }

}
