package com.company.dudar;

public class Computer {
    class Proccessor {
        private boolean isStart = false;

        public void star() {
            isStart = true;
            System.out.println("Start is " + isStart);
        }

        public void shutDown() {
            isStart = false;
            System.out.println("Start is " + isStart);
        }
    }

    class Ram {
        private boolean isStart = false;

        public void star() {
            isStart = true;
            System.out.println("Start is " + isStart);
        }

        public void shutDown() {
            isStart = false;
            System.out.println("Start is " + isStart);
        }

    }

    Proccessor i7 = new Proccessor();
    Ram transfer = new Ram();
}