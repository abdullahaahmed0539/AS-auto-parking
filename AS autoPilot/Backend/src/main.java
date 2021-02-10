import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
public class main {
    //check if you need to re adjust in the end
        static int angle_rotated=0;

        //initial starting co-ordinates of car
        static Point oA = new Point(450, 300);
        static Point oB = new Point(300, 300);
        static Point oC = new Point(300, 200);
        static Point oD = new Point(450, 200);

        //curent points car
        static Point A = new Point(450, 300);
        static Point B = new Point(300, 300);
        static Point C = new Point(300, 200);
        static Point D = new Point(450, 200);

        static LinkedList l30= new LinkedList(); // saves path which is at 30 degrees from x-axis
        static LinkedList l40= new LinkedList(); // saves path which is at 40 degrees from x-axis
        static LinkedList l50= new LinkedList(); // saves path which is at 50 degrees from x-axis
        static LinkedList l60= new LinkedList(); // saves path which is at 60 degrees from x-axis
        static LinkedList l70= new LinkedList(); // saves path which is at 70 degrees from x-axis
        static LinkedList l80= new LinkedList(); // saves path which is at 80 degrees from x-axis
        static LinkedList l90= new LinkedList(); // saves path which is at 90 degrees from x-axis
        static LinkedList path= new LinkedList();


        public static void main(String[] args) {

            boolean a=false; int j=3; int k=7; int i;
            float sub;
            Node temp;
            boolean end_process=false;




            rotate((30*3.142)/180);
            l30.insert(A,B,C,D);
            re_initialize_points();

            rotate((40*3.142)/180);
            l40.insert(A,B,C,D);
            re_initialize_points();

            rotate((50*3.142)/180);
            l50.insert(A,B,C,D);
            re_initialize_points();

            rotate((60*3.142)/180);
            l60.insert(A,B,C,D);
            re_initialize_points();

            i=j;
            while(end_process==false) {
                while (j < k) {

                    if (j == 3) {
                        rotate(((j * 10) * 3.142) / 180);
                        while (a == false) {
                            a = translate(((j * 10) * 3.142) / 180, 20);
                            l30.insert(A, B, C, D);
                        }

                    }

                    if (j == 4) {
                        rotate(((j * 10) * 3.142) / 180);
                        while (a == false) {
                            a = translate(((j * 10) * 3.142) / 180, 20);
                            l40.insert(A, B, C, D);
                        }

                    }

                    if (j == 5) {
                        rotate(((j * 10) * 3.142) / 180);
                        while (a == false) {
                            a = translate(((j * 10) * 3.142) / 180, 20);
                            l50.insert(A, B, C, D);
                        }

                    }

                    if (j == 6) {
                        rotate(((j * 10) * 3.142) / 180);
                        while (a == false) {
                            a = translate(((j * 10) * 3.142) / 180, 20);
                            l60.insert(A, B, C, D);
                        }

                    }

                    if (j == 7) {
                        rotate(((j * 10) * 3.142) / 180);
                        while (a == false) {
                            a = translate(((j * 10) * 3.142) / 180, 20);
                            l70.insert(A, B, C, D);
                        }

                    }

                    if (j == 8) {
                        rotate(((j * 10) * 3.142) / 180);
                        while (a == false) {
                            a = translate(((j * 10) * 3.142) / 180, 20);
                            l80.insert(A, B, C, D);
                        }

                    }

                    if (j == 9) {
                        rotate(((j * 10) * 3.142) / 180);
                        while (a == false) {
                            a = translate(((j * 10) * 3.142) / 180, 20);
                            l90.insert(A, B, C, D);
                        }

                    }
                    j++;
                    a = false;
                    re_initialize_points();
                }

                // if(k==9){i = clustering1(i, k);end_process=true;}else{
                i = clustering(i, k);end_process=true;//}
                j = i;
                k = 9;



                if (i == 3) {
                    temp=l30.head;
                    while(temp!=null){
                        A.x=temp.ax; A.y=temp.ay; B.x=temp.bx; B.y=temp.by; C.x=temp.cx; C.y=temp.cy; D.x=temp.dx; D.y=temp.dy;
                        path.insert(A,B,C,D);
                        temp=temp.next;
                    }

                } else if (i == 4) {
                    temp=l40.head;
                    while(temp!=null){
                        A.x=temp.ax; A.y=temp.ay; B.x=temp.bx; B.y=temp.by; C.x=temp.cx; C.y=temp.cy; D.x=temp.dx; D.y=temp.dy;
                        path.insert(A,B,C,D);
                        temp=temp.next;
                    }

                } else if (i == 5) {
                    temp=l50.head;
                    while(temp!=null){
                        A.x=temp.ax; A.y=temp.ay; B.x=temp.bx; B.y=temp.by; C.x=temp.cx; C.y=temp.cy; D.x=temp.dx; D.y=temp.dy;
                        path.insert(A,B,C,D);
                        temp=temp.next;
                    }

                } else if (i == 6) {
                    temp=l60.head;
                    while(temp!=null){
                        A.x=temp.ax; A.y=temp.ay; B.x=temp.bx; B.y=temp.by; C.x=temp.cx; C.y=temp.cy; D.x=temp.dx; D.y=temp.dy;
                        path.insert(A,B,C,D);
                        temp=temp.next;
                    }

                } else if (i == 7) {
                    temp=l70.head;
                    while(temp!=null){
                        A.x=temp.ax; A.y=temp.ay; B.x=temp.bx; B.y=temp.by; C.x=temp.cx; C.y=temp.cy; D.x=temp.dx; D.y=temp.dy;
                        path.insert(A,B,C,D);
                        temp=temp.next;
                    }

                } else if (i == 8) {
                    temp=l80.head;
                    while(temp!=null){
                        A.x=temp.ax; A.y=temp.ay; B.x=temp.bx; B.y=temp.by; C.x=temp.cx; C.y=temp.cy; D.x=temp.dx; D.y=temp.dy;
                        path.insert(A,B,C,D);
                        temp=temp.next;
                    }

                } else if (i == 9) {
                    temp=l90.head;
                    while(temp!=null){
                        A.x=temp.ax; A.y=temp.ay; B.x=temp.bx; B.y=temp.by; C.x=temp.cx; C.y=temp.cy; D.x=temp.dx; D.y=temp.dy;
                        path.insert(A,B,C,D);
                        temp=temp.next;
                    }

                }
                try{ PrintStream console = new PrintStream(new File("C:\\Users\\User\\IdeaProjects\\AI Project\\path.txt"));

                    temp = l30.head;
                    l30.display();
                    while(temp != null){
                        console.println(temp.dx);
                        console.println(temp.dy);
                        console.println(temp.cx);
                        console.println(temp.cy);
                        console.println(temp.bx);
                        console.println(temp.by);
                        console.println(temp.ax);
                        console.println(temp.ay);

                        temp = temp.next;
                    }
                    temp = l40.head;
                    l40.display();
                    while(temp != null){
                        console.println(temp.dx);
                        console.println(temp.dy);
                        console.println(temp.cx);
                        console.println(temp.cy);
                        console.println(temp.bx);
                        console.println(temp.by);
                        console.println(temp.ax);
                        console.println(temp.ay);

                        temp = temp.next;
                    }
                    temp = l50.head;
                    l50.display();
                    while(temp != null){
                        console.println(temp.dx);
                        console.println(temp.dy);
                        console.println(temp.cx);
                        console.println(temp.cy);
                        console.println(temp.bx);
                        console.println(temp.by);
                        console.println(temp.ax);
                        console.println(temp.ay);

                        temp = temp.next;
                    }
                    temp = l60.head;
                    l60.display();
                    while(temp != null){
                        console.println(temp.dx);
                        console.println(temp.dy);
                        console.println(temp.cx);
                        console.println(temp.cy);
                        console.println(temp.bx);
                        console.println(temp.by);
                        console.println(temp.ax);
                        console.println(temp.ay);

                        temp = temp.next;
                    }
                    temp = l70.head;
                    l70.display();
                    while(temp != null){
                        console.println(temp.dx);
                        console.println(temp.dy);
                        console.println(temp.cx);
                        console.println(temp.cy);
                        console.println(temp.bx);
                        console.println(temp.by);
                        console.println(temp.ax);
                        console.println(temp.ay);

                        temp = temp.next;
                    }
                }
                catch (FileNotFoundException fx){
                    System.out.println(fx);
                }
                //---------------------
                l30.head=null; l40.head = null; l50.head = null; l60.head = null; l70.head = null; l80.head = null; l90.head = null;

            }




            int p=90-(i*10);
            while(A.x!=B.x){
                rotate1_around_b((p*3.142)/180);
                path.insert(B,A,D,C);
                p-=10;
            }
            try{ PrintStream console = new PrintStream(new File("C:\\Users\\User\\IdeaProjects\\AI Project\\AI.txt"));

                temp = path.head;
                while(temp != null){
                    console.println(temp.dx);
                    console.println(temp.dy);
                    console.println(temp.cx);
                    console.println(temp.cy);
                    console.println(temp.bx);
                    console.println(temp.by);
                    console.println(temp.ax);
                    console.println(temp.ay);

                    temp = temp.next;
                }
            }
            catch (FileNotFoundException fx){
                System.out.println(fx);
            }
            //--------------------------
        //    path.display();

        }



        public static int clustering(int index,int k){
            LinkedList k_accept=new LinkedList();
            LinkedList k_reject=new LinkedList();

            float sum_of_point_B[]= new float[2];
            sum_of_point_B[0]=0; sum_of_point_B[1]=0;

            float mean_accept_b[]= new float[2];
            mean_accept_b[0]=560; mean_accept_b[1]=475;

            float o_accept_b[]= new float[2];
            o_accept_b[0]=560; o_accept_b[1]=475;

            float mean_reject_b[]= new float[2];
            mean_reject_b[0]=660;  mean_reject_b[1]=475;

            float mean_new[]= new float[2];
            mean_new[0]=mean_accept_b[0];  mean_new[1]=mean_accept_b[1];

            float mean_old[]= new float[2];
            mean_old[0]=0;  mean_old[1]=0;

            float distance1=0; float distance2=0;


            Point A =new Point(0,0);
            Point B =new Point(0,0);
            Point C =new Point(0,0);
            Point D =new Point(0,0);

            int n=0;
            Node temp,temp2;
            Node temp1=null;
            int i=3;
            boolean found=false;

            //creates two linked lists for accept and reject
            while (index<k){

                if (index==3) {
                    temp=l30.head;
                    while(temp!=null){
                        distance1= (float) Math.sqrt(Math.pow((mean_accept_b[0]-temp.bx),2)+Math.pow((mean_accept_b[1]-temp.by),2));
                        distance2= (float) Math.sqrt(Math.pow((mean_reject_b[0]-temp.bx),2)+Math.pow((mean_reject_b[1]-temp.by),2));
                        A.x=temp.ax;  A.y=temp.ay;
                        B.x=temp.bx;  B.y=temp.by;
                        C.x=temp.cx;  C.y=temp.cy;
                        D.x=temp.dx;  D.y=temp.dy;
                        if(distance1<distance2){
                            k_accept.insert(A,B,C,D);
                        }else{
                            k_reject.insert(A,B,C,D);
                        }
                        temp=temp.next;
                    }
                }


                if (index==4) {
                    temp=l40.head;
                    while(temp!=null){
                        distance1= (float) Math.sqrt(Math.pow((mean_accept_b[0]-temp.bx),2)+Math.pow((mean_accept_b[1]-temp.by),2));
                        distance2= (float) Math.sqrt(Math.pow((mean_reject_b[0]-temp.bx),2)+Math.pow((mean_reject_b[1]-temp.by),2));
                        A.x=temp.ax;  A.y=temp.ay;
                        B.x=temp.bx;  B.y=temp.by;
                        C.x=temp.cx;  C.y=temp.cy;
                        D.x=temp.dx;  D.y=temp.dy;
                        if(distance1<distance2){
                            k_accept.insert(A,B,C,D);
                        }else{
                            k_reject.insert(A,B,C,D);
                        }
                        temp=temp.next;
                    }
                }

                if (index==5) {
                    temp=l50.head;
                    while(temp!=null){
                        distance1= (float) Math.sqrt(Math.pow((mean_accept_b[0]-temp.bx),2)+Math.pow((mean_accept_b[1]-temp.by),2));
                        distance2= (float) Math.sqrt(Math.pow((mean_reject_b[0]-temp.bx),2)+Math.pow((mean_reject_b[1]-temp.by),2));
                        A.x=temp.ax;  A.y=temp.ay;
                        B.x=temp.bx;  B.y=temp.by;
                        C.x=temp.cx;  C.y=temp.cy;
                        D.x=temp.dx;  D.y=temp.dy;
                        if(distance1<distance2){
                            k_accept.insert(A,B,C,D);
                        }else{
                            k_reject.insert(A,B,C,D);
                        }
                        temp=temp.next;
                    }
                }

                if (index==6) {
                    temp=l60.head;
                    while(temp!=null){
                        distance1= (float) Math.sqrt(Math.pow((mean_accept_b[0]-temp.bx),2)+Math.pow((mean_accept_b[1]-temp.by),2));
                        distance2= (float) Math.sqrt(Math.pow((mean_reject_b[0]-temp.bx),2)+Math.pow((mean_reject_b[1]-temp.by),2));
                        A.x=temp.ax;  A.y=temp.ay;
                        B.x=temp.bx;  B.y=temp.by;
                        C.x=temp.cx;  C.y=temp.cy;
                        D.x=temp.dx;  D.y=temp.dy;
                        if(distance1<distance2){
                            k_accept.insert(A,B,C,D);
                        }else{
                            k_reject.insert(A,B,C,D);
                        }
                        temp=temp.next;
                    }
                }

                if (index==7) {
                    temp=l70.head;
                    while(temp!=null){
                        distance1= (float) Math.sqrt(Math.pow((mean_accept_b[0]-temp.bx),2)+Math.pow((mean_accept_b[1]-temp.by),2));
                        distance2= (float) Math.sqrt(Math.pow((mean_reject_b[0]-temp.bx),2)+Math.pow((mean_reject_b[1]-temp.by),2));
                        A.x=temp.ax;  A.y=temp.ay;
                        B.x=temp.bx;  B.y=temp.by;
                        C.x=temp.cx;  C.y=temp.cy;
                        D.x=temp.dx;  D.y=temp.dy;
                        if(distance1<distance2){
                            k_accept.insert(A,B,C,D);
                        }else{
                            k_reject.insert(A,B,C,D);
                        }
                        temp=temp.next;
                    }
                }

                if (index==8) {
                    temp=l80.head;
                    while(temp!=null){
                        distance1= (float) Math.sqrt(Math.pow((mean_accept_b[0]-temp.bx),2)+Math.pow((mean_accept_b[1]-temp.by),2));
                        distance2= (float) Math.sqrt(Math.pow((mean_reject_b[0]-temp.bx),2)+Math.pow((mean_reject_b[1]-temp.by),2));
                        A.x=temp.ax;  A.y=temp.ay;
                        B.x=temp.bx;  B.y=temp.by;
                        C.x=temp.cx;  C.y=temp.cy;
                        D.x=temp.dx;  D.y=temp.dy;
                        if(distance1<distance2){
                            k_accept.insert(A,B,C,D);
                        }else{
                            k_reject.insert(A,B,C,D);
                        }
                        temp=temp.next;
                    }
                }

                if (index==9) {
                    temp=l90.head;
                    while(temp!=null){
                        distance1= (float) Math.sqrt(Math.pow((mean_accept_b[0]-temp.bx),2)+Math.pow((mean_accept_b[1]-temp.by),2));
                        distance2= (float) Math.sqrt(Math.pow((mean_reject_b[0]-temp.bx),2)+Math.pow((mean_reject_b[1]-temp.by),2));
                        A.x=temp.ax;  A.y=temp.ay;
                        B.x=temp.bx;  B.y=temp.by;
                        C.x=temp.cx;  C.y=temp.cy;
                        D.x=temp.dx;  D.y=temp.dy;
                        if(distance1<distance2){
                            k_accept.insert(A,B,C,D);
                        }else{
                            k_reject.insert(A,B,C,D);
                        }
                        temp=temp.next;
                    }

                }

                index++;

            }

            //performs cluster analsis
            while (mean_new[0]-mean_old[0]>0.1){
                mean_old[0]=mean_new[0];  mean_old[1]=mean_new[1];
                mean_new=mean_accept(k_accept);
                mean_accept_b=mean_new;  mean_reject_b=mean_reject(k_reject);

                temp1=k_accept.head;
                temp2=k_reject.head;

                while(temp1!=null){
                    distance1=Distance(mean_accept_b,temp1.bx,temp1.by);
                    distance2=Distance(mean_reject_b,temp1.bx,temp1.by);

                    if (distance1>distance2){
                        A.x=temp1.ax; A.y=temp1.ay; B.x=temp1.bx; B.y=temp1.by; C.x=temp1.cx; C.y=temp1.cy; D.x=temp1.dx; D.y=temp1.dy;
                        k_accept.delete_forb(temp1.bx,temp1.by);
                        k_reject.insert(A,B,C,D);
                    }
                    temp1=temp1.next;
                }

                while(temp2!=null){
                    distance1=Distance(mean_accept_b,temp2.bx,temp2.by);
                    distance2=Distance(mean_reject_b,temp2.bx,temp2.by);

                    if (distance1<distance2){
                        A.x=temp2.ax; A.y=temp2.ay; B.x=temp2.bx; B.y=temp2.by; C.x=temp2.cx; C.y=temp2.cy; D.x=temp2.dx; D.y=temp2.dy;
                        k_reject.delete_forb(temp2.bx,temp2.by);
                        k_accept.insert(A,B,C,D);
                    }
                    temp2=temp2.next;
                }
            }

            //finds the closest co-ordinate to our accept state
            float min=1000000;
            temp=k_accept.head;
            while(temp!=null){
                distance1=Distance(temp.bx,o_accept_b[0],temp.by,o_accept_b[1]);
                if(distance1<min){
                    min=distance1;
                    temp1=temp;
                }
                temp=temp.next;
            }

            //finds the linklist which has the closest co-ordinates
            while (i<10){
                if (i==3) {
                    temp=l30.head;
                    while(temp!=null){
                        if(temp.bx==temp1.bx && temp.by==temp1.by){
                            found=true;
                            break;
                        }
                        temp=temp.next;
                    }
                }

                if (i==4) {
                    temp=l40.head;
                    while(temp!=null){
                        if(temp.bx==temp1.bx && temp.by==temp1.by){
                            found=true;
                            break;
                        }
                        temp=temp.next;
                    }
                }

                if (i==5) {
                    temp=l50.head;
                    while(temp!=null){
                        if(temp.bx==temp1.bx && temp.by==temp1.by){
                            found=true;
                            break;
                        }
                        temp=temp.next;
                    }
                }

                if (i==6) {
                    temp=l60.head;
                    while(temp!=null){
                        if(temp.bx==temp1.bx && temp.by==temp1.by){
                            found=true;
                            break;
                        }
                        temp=temp.next;
                    }
                }

                if (i==7) {
                    temp=l70.head;
                    while(temp!=null){
                        if(temp.bx==temp1.bx && temp.by==temp1.by){
                            found=true;
                            break;
                        }
                        temp=temp.next;
                    }
                }

                if (i==8) {
                    temp=l80.head;
                    while(temp!=null){
                        if(temp.bx==temp1.bx && temp.by==temp1.by){
                            found=true;
                            break;
                        }
                        temp=temp.next;
                    }
                }

                if (i==9) {
                    temp=l90.head;
                    while(temp!=null){
                        if(temp.bx==temp1.bx && temp.by==temp1.by){
                            found=true;
                            break;
                        }
                        temp=temp.next;
                    }
                }
                if (found==true){ break;}
                i++;

            }

            temp.next=null;
            return i;


        }


        public static float[] mean_accept(LinkedList l1){
            Node temp=l1.head;
            float sum []= new float[2];
            float mean []= new float[2];
            int n=0;

            while(temp!=null){
                sum[0]+=temp.bx;
                sum[1]+=temp.by;
                n++;
                temp=temp.next;
            }

            mean[0]=sum[0]/n;
            mean[1]=sum[1]/n;

            return mean;
        }


        public static float[] mean_reject(LinkedList l2){
            Node temp=l2.head;
            float sum []= new float[2];
            float mean []= new float[2];
            int n=0;

            while(temp!=null){
                sum[0]+=temp.bx;
                sum[1]+=temp.by;
                n++;
                temp=temp.next;
            }

            mean[0]=sum[0]/n;
            mean[1]=sum[1]/n;

            return mean;
        }


        public static float Distance(float [] arr, float x, float y){
            float distance;
            distance= (float) Math.sqrt(Math.pow((arr[0]-x),2)+Math.pow((arr[1]-y),2));
            return distance;
        }


        public static float Distance(float x1, float x2 , float y1, float y2){
            float distance;
            distance= (float) Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
            return distance;
        }


        public static void rotate(double q){
            double angle= q;

            //new co-ordinates for B
            B.x= (float) (A.x-((Math.cos(angle))*150));
            B.y= (float) (A.y-(150*(Math.sin(angle))));

            //new co-ordinates for C
            C.x= (float) (B.x+((Math.sin(angle))*100));
            C.y= (float) (B.y-((Math.cos(angle))*100));

            //new co-ordinates for D
            D.x= (float) (C.x+((Math.cos(angle))*150));
            D.y= (float) (C.y+(150*(Math.sin(angle))));
        } //rotates around A


        public static void rotate1_around_b(double q){
            double angle= q;

            //new co-ordinates for A
            A.x= (float) (B.x+((Math.sin(angle))*150));
            A.y= (float) (B.y+(150*(Math.cos(angle))));

            //new co-ordinates for C
            C.x= (float) (B.x+((Math.cos(angle))*100));
            C.y= (float) (B.y-((Math.sin(angle))*100));

            //new co-ordinates for D
            D.x= (float) (C.x+((Math.sin(angle))*150));
            D.y= (float) (C.y+(150*(Math.cos(angle))));
        }


        public static boolean translate(double q, int steps){
            boolean crashed = false;

            //new co-ordinates for A
            A.x += steps*(Math.cos(q));
            A.y += steps*(Math.sin(q));

            //new co-ordinates for B
            B.x += steps*(Math.cos(q));
            B.y += steps*(Math.sin(q));

            //new co-ordinates for C
            C.x += steps*(Math.cos(q));
            C.y += steps*(Math.sin(q));

            //new co-ordinates for D
            D.x += steps*(Math.cos(q));
            D.y += steps*(Math.sin(q));


            crashed=crash();
            if(crashed==true){return true;}
            return false;
        }


        public static boolean crash(){

            if ((A.x<712 && D.x>=712) && (A.y >400 || D.y >400)){  //to check if car crosses right lane
                //System.out.println("crash as car crossed right lane");
                return true;}
            if (((B.x<508 && C.x>=508) && (B.y >400 || C.y >400)) || ((A.x<508 && D.x>=508) && (A.y >400 || D.y >400))){ //to check if car crosses left lane
                //System.out.println("crash as car crossed left lane");
                return true;}
            if (A.y>=700 || D.y>=700){  //to check if car crosses footpath
                //System.out.println("crash as car crossed footpath");
                return true;}

            return false;
        }


        public static void re_initialize_points(){

            A.x = oA.x;
            B.x = oB.x;
            C.x = oC.x;
            D.x = oD.x;

            A.y = oA.y;
            B.y = oB.y;
            C.y = oC.y;
            D.y = oD.y;

        }


        public static void output(){
            System.out.println("A("+A.x+","+A.y+")");
            System.out.println("B("+B.x+","+B.y+")");
            System.out.println("C("+C.x+","+C.y+")");
            System.out.println("D("+D.x+","+D.y+")");
            System.out.println();

        }
}


