package com.epam.mjc;


public class StudentManager extends IllegalArgumentException {

    private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public Student find(long studentID) {
        return Student.getValueOf(studentID);
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        for (int i = 0; i < IDs.length; i++) {
            try {
                Student student = manager.find(1);
                if (IDs[i] <= 10) {
                    student = manager.find(IDs[i]);
                } else student = null;

                if (student != null) {
                    System.out.println("Student name " + student.getName());
                } else {
                    System.out.println("Could not find student with ID " + IDs[i]);
                }

            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
    }
}