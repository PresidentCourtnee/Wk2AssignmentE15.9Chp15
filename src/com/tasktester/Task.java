package com.tasktester;

public class Task
{
        private String task;

        private int priority;

        static boolean order;

        public Task() {

            task = "none";

            priority = 1;

            order = true;

        }



        public Task(String task, int priority) {

            this.task = task;

            this.priority = priority;

            order = true;

        }

        public String getTask() {

            return task;

        }

        public void setTask(String task) {

            this.task = task;

        }

        public int getPriority() {

            return priority;

        }

        public void setPriority(int priority) {

            this.priority = priority;

        }

        public static boolean isOrder() {

            return order;

        }

        public static void setOrder(boolean order) {

            Task.order = order;

        }



        @Override

        public String toString() {

            return "Task " + task + " : " + priority;

        }

        public boolean equals(Task obj) {

            if (obj == null) {

                return false;

            }

            if ( ((getTask()).equalsIgnoreCase(obj.getTask())) && (getPriority() == obj.getPriority()) ) {

                return false;

            }

            return false;

        }

    }

    class TaskTester {

        public static void main(String[] args) {

            Task t1 = new Task("Printing", 4);

            Task t2 = new Task("Debug", 1);



            System.out.println(t1);

            System.out.println(t2);

        }

    }





