//package OOP.Hospital;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class HospitalMain {
//    static Scanner input = new Scanner(System.in);
//
//    private static void autoGenerateDctorssAndTestList() {
//        String[] doctors = {"Richard", "Cole", "brown", "Dora", "Felix"};
//        for (int i=0; i < doctors.length; i++) {
//            hospRecords.addDoctor(doctors[i], String.valueOf(i));
//        }
//    }
//
//    public static void doctorList() {
//        ArrayList<Doctor> doctorList = hospRecords.getDoctors();
//        for (Doctor doctor : doctorList) {
//            System.out.println(doctor);
//        }
//    }
//    private static void hospPortal(){
//        int sentinel=0;
//        while (sentinel !=-1){
//            System.out.println("Enter 1 to register a doctor");
//            int response = input.nextInt();
//            switch (response){
//                case 1:
//                    System.out.println("Enter doctors Name: ");
//                        String doctorsName = input.next();
//                    System.out.println("Enter doctors expertise: ");
//                        String expertise = input.next();
//                    hospRecords.addDoctor(doctorsName, expertise);
//            }
//        }
//    }
//
//    private static void patientPortal(){
//        int sentinel=0;
//        while (sentinel !=-1){
//            System.out.println("Enter 1 to view doctors: ");
//            int response = input.nextInt();
//            switch (response){
//                case 1:
//                    doctorList();
//                case 0:
//                    sentinel = -1;
//            }
//        }
//    }
//    static HospRecords hospRecords;
//    static Patient patient;
//    public static void main(String[] args) {
//        hospRecords = new HospRecords();
//        autoGenerateDctorssAndTestList();
//        int sentinel = 0;
//        while (sentinel != -1){
//            System.out.println("Enter 1 for hospital portal");
//            System.out.println("Enter 2 for patients portal");
//            System.out.println("Enter 0 to exit");
//
//            int answer = input.nextInt();
//            switch (answer){
//                case 1:
//                    hospPortal();
//                case 2:
//                    patientPortal();
//                case 0:
//                    sentinel = -1;
//            }
//        }
//    }
//}
