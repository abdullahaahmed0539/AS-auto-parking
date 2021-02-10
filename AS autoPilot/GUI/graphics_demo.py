from graphics import *
import time
import math

from graphics import Text

win = GraphWin("AS AUTO-PILOT", 1430, 800)
win.setBackground(color_rgb(50,205,50))
angle_rotated=0

#starting/original point A,B,C,D
oD = Point(450, 200)
oC = Point(300, 200)
oB = Point(300, 300)
oA = Point(450, 300)

#current points A,B,C,D
cD = Point(450, 200)
cC = Point(300, 200)
cB = Point(300, 300)
cA = Point(450, 300)


#auto-pilot car creatiom
auto_pilot=Polygon(oD,oC,oB,oA)
auto_pilot.setFill("yellow")


#road creation
road=Rectangle(Point(0,100),Point(1430,700))
road.setFill("grey")
road.draw(win)

#cars parked creation
car1=Rectangle(Point(50,450),Point(200,680))
car1.setFill(color_rgb(0,255,240))
car1.draw(win)

car2=Rectangle(Point(300,450),Point(450,680))
car2.setFill(color_rgb(255,255,240))
car2.draw(win)

car3=Rectangle(Point(750,450),Point(900,680))
car3.setFill(color_rgb(255,0,0))
car3.draw(win)

car4 = Rectangle(Point(970, 450), Point(1120, 680))
car4.setFill(color_rgb(0, 0, 0))
car4.draw(win)

car5 = Rectangle(Point(1200, 450), Point(1350, 680))
car5.setFill(color_rgb(255, 250, 250))
car5.draw(win)


#lane creations
l1=  Line(Point(25 ,400),Point(25,700))
l1.setFill("white")
l1.setWidth(10)
l1.draw(win)

l2 = Line(Point(250,400), Point(250,700))
l2.setFill("white")
l2.setWidth(10)
l2.draw(win)

left_bound_lane = Line(Point(500,400), Point(500,700))
left_bound_lane.setFill("white")
left_bound_lane.setWidth(10)
left_bound_lane.draw(win)

right_bound_lane = Line(Point(720, 400), Point(720, 700))
right_bound_lane.setFill("white")
right_bound_lane.setWidth(10)
right_bound_lane.draw(win)

l3 = Line(Point(920,400), Point(920,700))
l3.setFill("white")
l3.setWidth(10)
l3.draw(win)

l4 = Line(Point(1150,400), Point(1150,700))
l4.setFill("white")
l4.setWidth(10)
l4.draw(win)

l5 = Line(Point(1400, 400), Point(1400, 700))
l5.setFill("white")
l5.setWidth(10)
l5.draw(win)

t=Point(600,650)
T=Text(t,"PARKED")

def main ():


    fname = "path.txt"
    fh = open(fname)

    i = 0
    last=False
    for line in fh:
        line = line.rstrip()

        if i % 8 == 0:
            cD.x = line
            i = i + 1
        elif i % 8 == 1:
            cD.y = line
            i = i + 1
        elif i % 8 == 2:
            cC.x = line
            i = i + 1
        elif i % 8 == 3:
            cC.y = line
            i = i + 1
        elif i % 8 == 4:
            cB.x = line
            i = i + 1
        elif i % 8 == 5:
            cB.y = line
            i = i + 1
        elif i % 8 == 6:
            cA.x = line
            i = i + 1
        elif i % 8 == 7:
            cA.y = line
            i = i + 1
            last=True


        if last==True:
            last=False
            auto_pilot.after_rotate(cD, cC, cB, cA)
            auto_pilot.setFill("yellow")
            auto_pilot.draw(win)
            time.sleep(0.1)
            auto_pilot.undraw()

    fn = "AI.txt"
    fhandle = open(fn)

    y = 0
    last2=False
    for lines in fhandle:
         lines = lines.rstrip()
         if i % 8 == 0:
             cD.x = lines
             i = i + 1
         elif i % 8 == 1:
             cD.y = lines
             i = i + 1
         elif i % 8 == 2:
             cC.x = lines
             i = i + 1
         elif i % 8 == 3:
             cC.y = lines
             i = i + 1
         elif i % 8 == 4:
             cB.x = lines
             i = i + 1
         elif i % 8 == 5:
             cB.y = lines
             i = i + 1
         elif i % 8 == 6:
             cA.x = lines
             i = i + 1
         elif i % 8 == 7:
             cA.y = lines
             i = i + 1
             last2=True

         if last2==True:
                last2=False
                auto_pilot.after_rotate(cD, cC, cB, cA)
                auto_pilot.setFill("yellow")
                auto_pilot.draw(win)
                time.sleep(0.1)
                auto_pilot.undraw()

    auto_pilot.after_rotate(cD, cC, cB, cA)
    auto_pilot.setFill("yellow")
    auto_pilot.draw(win)
    T.draw(win)


    win.getMouse()
    win.close()



def rotate(q):
    angle=angle_rotated+q

    #new co-ordinates for B
    cB.x=cA.x-((math.cos(angle))*150)
    cB.y=cA.y-(150*(math.sin(angle)))

    # new co-ordinates for C
    cC.x=cB.x+((math.sin(angle))*100)
    cC.y=cB.y-((math.cos(angle))*100)

    # new co-ordinates for D
    cD.x=cC.x+((math.cos(angle))*150)
    cD.y=cC.y+(150*(math.sin(angle)))



    auto_pilot.after_rotate(cD, cC, cB, cA)
    auto_pilot.setFill("yellow")


def rotate1(q):
    angle = q;

    cA.x=  (cB.x+((math.sin(angle)) * 150));
    cA.y=  (cB.y+(150 * (math.cos(angle))));


    cC.x=  (cB.x+((math.cos(angle)) * 100));
    cC.y=  (cB.y-((math.sin(angle)) * 100));


    cD.x=  (cC.x+((math.sin(angle)) * 150));
    cD.y= (float) (cC.y+(150 * (math.cos(angle))));


def translate(q,steps):
    # new co-ordinates for A
    cA.x += steps*(math.cos(q))
    cA.y += steps*(math.sin(q))

    # new co-ordinates for B
    cB.x += steps*(math.cos(q))
    cB.y += steps*(math.sin(q))

    # new co-ordinates for C
    cC.x += steps*(math.cos(q))
    cC.y += steps*(math.sin(q))

    # new co-ordinates for D
    cD.x += steps*(math.cos(q))
    cD.y += steps*(math.sin(q))

    auto_pilot.after_rotate(cD, cC, cB ,cA)
    auto_pilot.setFill("yellow")


    crashed=crash()
    if crashed==True:
        return True
    return False

def crash():
    if ((cA.x<712 and cD.x>=712) and (cA.y >400 or cD.y >400)):  #to check if car crosses right lane
        return True
    if ((cB.x<508 and cC.x>=508) and (cB.y >400 or cC.y >400)) or ((cA.x<508 and cD.x>=508) and (cA.y >400 or cD.y >400)):  #to check if car crosses left lane
        return True
    if cA.y>=700 or cD.y>=700:  #to check if car crosses footpath
        return True

    return False

def op():
    print("Ax=",cA.x)
    print("Ay=", cA.y)
    print("Bx=", cB.x)
    print("By=", cB.y)
    print("Cx=", cC.x)
    print("Cy=", cC.y)
    print("Dx=", cD.x)
    print("Dy=", cD.y)

main();









