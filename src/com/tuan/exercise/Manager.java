package com.tuan.exercise;

public class Manager {
    private static Student[] listStudent;
    public Manager(){
        System.out.println("I'm Manager");
        listStudent = new Student[1000];
    }
    public Student[] addStudentToList(Student student){
        listStudent[Manager.getIndexVariable()] = student;
        return listStudent;
    }

    public void removeStudentFromList(Student student){
        if(Manager.isStudentExistInList(student)){
            for(int i = Manager.getIndexRemove(student); i <= Manager.getIndexVariable() - 1; i++){
                listStudent[i] = listStudent[i+1];
            }
        }
    }

    public static int getIndexVariable(){
        int indexVariable = 0;
        for(int i = 0; i< listStudent.length; i++){
            if(listStudent[i] == null){
                indexVariable = i;
                break;
            }
        }
        return indexVariable;
    }
    public static int getIndexRemove(Student student){
        int indexRemove = 0;
        for(int i = 0; i < Manager.getIndexVariable(); i++){
            if(listStudent[i] == student){
                indexRemove = i;
            }
        }
        return indexRemove;
    }

    public static boolean isStudentExistInList(Student student){
        boolean isExist = false;
        for(int i = 0; i <= Manager.getIndexVariable();i++){
            if(listStudent[i] == student){
                isExist = true;
            }
        }
        return isExist;
    }
    public void printListStudent(){
        for (int i = 0; i < Manager.getIndexVariable(); i++){
            System.out.println("Student " + (i + 1) + " is: " + listStudent[i].getName());
        }
    }
    public double getAvgMark(){
        double sumMark = 0;
        for (int i = 0; i < Manager.getIndexVariable(); i++){
            sumMark += listStudent[i].getMark();
        }
        return sumMark/Manager.getIndexVariable();
    }
}
