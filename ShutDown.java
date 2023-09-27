class ShutDown{
    public static void main(String[] args){
        try {
        
        //  for window 
            Process process = Runtime.getRuntime().exec("shutdown -s -t 0");

         //for mac wihtout password
             Process process = Runtime.getRuntime().exec("sudo shutdown -h now");

         //for mac with pass wrod 
            String password = "jaza";
            String command = "echo " + password + " | sudo -S shutdown -h now";
            Process process = Runtime.getRuntime().exec(new String[] {"/bin/bash", "-c", command});
            System.out.println("try block");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("cathc block");
        }
    }
};


// 🚀 # What is process in java;
// In Java, a Process represents an operating system process.
// It allows you to execute commands or run external programs from within your Java application. 

// 🚀 # What is Runtime
// Runtime is a class that represents the current runtime environment of the application. 
// It provides access to the Java Virtual Machine (JVM) and allows you to interact
//  with the underlying system.

// 🚀 #getRuntime():
// This is a static method of the Runtime class. It returns the runtime object associated with the current
//  Java application.

// 🚀 #exec(String command):
// This method is used to execute the specified command in a separate operating system process. It returns a Process object that represents the newly created process.



