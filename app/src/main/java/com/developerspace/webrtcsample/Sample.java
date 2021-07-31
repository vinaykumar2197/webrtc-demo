package com.developerspace.webrtcsample;

public class Sample  implements Runnable{
    private Thread t;
    private String threadName;

    public Sample(Thread t) {
        this.t = t;
    }


    @Override
    public void run() {
        while(true){
            System.out.println(threadName);
        }
    }

    public void start(){
        if(t ==null){
            t = new Thread(this,threadName);
            t.start();
        }
    }

}


