
import movable.MovableCircle;
import movable.MovableRectangle;
import person.Person;
import person.Staff;
import person.Student;
import point.MovablePoint;
import point.Point;
import point.Point3D;
import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Square;


public class Main {

    public static void main(String[] args) {
        {
            System.out.println("Task 1: ");
            System.out.println("1: ");
            Person Pers = new Person("Ivan", "NN, Rodionova, 192");
            if (Pers != null) System.out.println("//Person created");
            System.out.println(Pers);
            System.out.println("His name is " + Pers.getName());
            System.out.println("His address is " + Pers.getAddress());
            System.out.println("//Change his address");
            Pers.setAddress("Moscow, Kremlin");
            System.out.println("New facts about this person: " + Pers);
            System.out.println("Hash Code: " + Pers.hashCode());
            System.out.println("//Create new person");
            Person NewPers = new Person("Ivan", "NN, Rodionova, 192");
            System.out.println("New person: " + NewPers);
            System.out.println("Pers equals New Pers is " + Pers.equals(NewPers));
            System.out.println();
        }

        {
            System.out.println("2: ");
            Student Stud = new Student("Ivan", "NN, Rodionova, 192", "Mathematics", 2, 3000.0);
            if (Stud != null) System.out.println("//Student created");
            System.out.println(Stud);
            System.out.println("His name is " + Stud.getName());
            System.out.println("His address is " + Stud.getAddress());
            System.out.println("He is a student in " + Stud.getProgram() + " program");
            System.out.println("He is studying " + Stud.getYear()+ " year");
            System.out.println("His fee is " + Stud.getFee());
            System.out.println("//Change his program");
            Stud.setProgram("Economy");
            System.out.println("//Change his year");
            Stud.setYear(3);
            System.out.println("//Change his fee");
            Stud.setFee(0.0);
            System.out.println("New facts about this student: " + Stud);
            System.out.println("Hash Code: " + Stud.hashCode());
            System.out.println("//Create new student");
            Student NewStud = new Student("Ivan", "NN, Rodionova, 192", "Mathematics", 2, 3000.0);
            System.out.println("New student: " + NewStud);
            System.out.println("Stud equals New Stud is " + Stud.equals(NewStud));

            System.out.println();
        }

        //Task 1.3
        {
            System.out.println("3: ");
            Staff St = new Staff("Ivan", "NN, Rodionova, 192", "Liceum 38", 30000.0);
            if(St!=null) System.out.println("//Staff created");
            System.out.println(St);
            System.out.println("His name is " + St.getName());
            System.out.println("His address is " + St.getAddress());
            System.out.println("He works at " + St.getSchool() + " school");
            System.out.println("His pay is " + St.getPay());
            System.out.println("//Change his school");
            St.setSchool("Gymnazium 1");
            System.out.println("//Change his pay");
            St.setPay(32000.0);
            System.out.println("New facts about this staff: " + St);
            System.out.println("Hash Code: " + St.hashCode());
            System.out.println("//Create new staff");
            Staff NewSt = new Staff("Ivan", "NN, Rodionova, 192", "Gymnazium 1", 32000.0);
            System.out.println("New staff: " + NewSt);
            System.out.println("St equals New St is " + St.equals(NewSt));
            System.out.println();
        }
        System.out.println();
        {
            System.out.println("Task 2:");
            System.out.println("1: ");
            Point pt1 = new Point(1, 2);
            Point pt2 = new Point();
            if(pt1 != null) System.out.println("//Point 1 created");
            System.out.println(pt1);
            if(pt2 != null) System.out.println("//Point 2 created");
            System.out.println(pt2);
            System.out.println("//Point 1: ");
            System.out.println("X: " + pt1.getX());
            System.out.println("Y: " + pt1.getY());
            System.out.println("//Point 2: ");
            float[] pt2XY = pt2.getXY();
            System.out.println("X: " + pt2XY[0]);
            System.out.println("Y: " + pt2XY[1]);
            System.out.println("//Change x in Point 1");
            pt1.setX(5);
            System.out.println("//Change y in Point 1");
            pt1.setY(7);
            System.out.println("//Change x and y in Point 2");
            pt2.setXY(4, 7);
            System.out.println("New point 1: " + pt1);
            System.out.println("Hash Code: " + pt1.hashCode());
            System.out.println("New point 2: " + pt2);
            System.out.println("Hash Code: " + pt2.hashCode());
            System.out.println("Point 1 equals Point 2 is " + pt1.equals(pt2));
            System.out.println();
        }

        {
            System.out.println("2: ");
            Point3D pt1 = new Point3D();
            if(pt1 != null) System.out.println("//Point 1 created");
            System.out.println(pt1);
            Point3D pt2 = new Point3D(1, 2,3);
            if(pt2 != null) System.out.println("//Point 2 created");
            System.out.println(pt2);
            System.out.println("//Point 1");
            System.out.println("X: " + pt1.getX());
            System.out.println("Y: " + pt1.getY());
            System.out.println("Z: " + pt1.getZ());
            System.out.println("//Point 2");
            float[] pt2XYZ = pt2.getXYZ();
            System.out.println("X: " + pt2XYZ[0]);
            System.out.println("Y: " + pt2XYZ[1]);
            System.out.println("Z: " + pt2XYZ[2]);
            System.out.println("//Change z in Point 1");
            pt1.setZ(7);
            System.out.println("//Change x, y and z in Point 2");
            pt2.setXYZ(0, 0,  7);
            System.out.println("New point 1: " + pt1);
            System.out.println("Hash Code: " + pt1.hashCode());
            System.out.println("New point 2: " + pt2);
            System.out.println("Hash Code: " + pt2.hashCode());
            System.out.println("Point 1 equals Point 2 is " + pt1.equals(pt2));
            System.out.println();
        }


        {
            System.out.println("Task 3: ");
            System.out.println("2: ");
            MovablePoint mvpt1 = new MovablePoint();
            if(mvpt1 != null) System.out.println("//Point 1 created");
            MovablePoint mvpt2 = new MovablePoint(5, 5);
            if(mvpt2 != null) System.out.println("//Point 2 created");
            MovablePoint mvpt3 = new MovablePoint(4,5, 2,8);
            if(mvpt3 != null) System.out.println("//Point 3 created");
            System.out.println("Point 1: " + mvpt1);
            System.out.println("Point 2: " + mvpt2);
            System.out.println("Point 3: " + mvpt3);
            System.out.println("//Speeds of Point 1");
            System.out.println("on X: " + mvpt1.getxSpeed());
            System.out.println("on Y: " + mvpt1.getySpeed());
            System.out.println("//Speeds of Point 2");
            System.out.println("on X: " + mvpt2.getxSpeed());
            System.out.println("on Y: " + mvpt2.getySpeed());
            System.out.println("//Speeds of Point 3");
            float[] pt3Speeds = mvpt3.getSpeed();
            System.out.println("on X: " + pt3Speeds[0]);
            System.out.println("on Y: " + pt3Speeds[1]);
            System.out.println("//Change xSpeed of Point 1");
            mvpt1.setxSpeed(8);
            System.out.println("//Change ySpeed of Point 1");
            mvpt1.setySpeed(9);
            System.out.println("//Change speeds of Point 2");
            mvpt2.setSpeed(8, 9);
            System.out.println("//Moving of Point 3");
            mvpt3.Move();
            System.out.println("New facts about point 1: " + mvpt1);
            System.out.println("Hash Code: " + mvpt1.hashCode());
            System.out.println("New facts about point 2: " + mvpt2);
            System.out.println("Hash Code: " + mvpt2.hashCode());
            System.out.println("New place of point 3: " + mvpt3);
            System.out.println("Hash Code: " + mvpt3.hashCode());
            System.out.println("Point 1 equals Point 2 is " + mvpt1.equals(mvpt2));
            System.out.println("Point 1 equals Point 3 is " + mvpt1.equals(mvpt3));
            System.out.println("Point 2 equals Point 3 is " + mvpt2.equals(mvpt3));
            System.out.println();
        }
        System.out.println();
        {
            System.out.println("Task 4: ");
            System.out.println("1: ");
            Shape sp1 = new Shape();
            if(sp1 != null) System.out.println("//Shape 1 created");
            Shape sp2 = new Shape("white", false);
            if(sp2 != null) System.out.println("//Shape 2 created");
            System.out.println("Shape 1: " + sp1);
            System.out.println("Shape 2: " + sp2);
            System.out.println("Shape1's color: " + sp1.getColor() + ", filled is " + sp1.isFilled());
            System.out.println("Shape2's color: " + sp1.getColor()+ ", filled is " + sp2.isFilled());
            System.out.println("//Change color of Shape 1");
            sp1.setColor("white");
            System.out.println("//Fill Shape 2");
            sp2.setFilled(true);
            System.out.println("New facts about shape 1: " + sp1);
            System.out.println("Hash Code: " + sp1.hashCode());
            System.out.println("New facts about shape 2: " + sp2);
            System.out.println("Hash Code: " + sp2.hashCode());
            System.out.println("Shape 1 equals Shape 2 is " + sp1.equals(sp2));
            System.out.println();
        }

        {
            System.out.println("2: ");
            Circle crl1 = new Circle();
            if(crl1 != null) System.out.println("//Circle 1 created");
            Circle crl2 = new Circle(12.5);
            if(crl2 != null) System.out.println("//Circle 2 created");
            Circle crl3 = new Circle("green" ,true, 3);
            if(crl3 != null) System.out.println("//Circle 3 created");
            System.out.println("Circle 1: " + crl1);
            System.out.println("Circle 2: " + crl2);
            System.out.println("Circle 3: " + crl3);

            System.out.println("Circle1's color: " + crl1.getColor() + ", filled is " + crl1.isFilled() + " with radius = " + crl1.getRadius());
            System.out.println("Circle2's color: " + crl2.getColor() + ", filled is " + crl2.isFilled() + " with radius = " + crl2.getRadius());
            System.out.println("Circle3's color: " + crl3.getColor() + ", filled is " + crl3.isFilled() + " with radius = " + crl3.getRadius());

            System.out.println("//Change color of Circle 1");
            crl1.setColor("white");
            System.out.println("//Fill Circle 2");
            crl2.setFilled(false);
            System.out.println("//Change radius of Circle 3");
            crl3.setRadius(6.2);
            System.out.println("New facts about Circle 1: " + crl1);
            System.out.println("Hash Code: " + crl1.hashCode());
            System.out.println("New facts about Circle 2: " + crl2);
            System.out.println("Hash Code: " + crl2.hashCode());
            System.out.println("New facts about Circle 3: " + crl3);
            System.out.println("Hash Code: " + crl3.hashCode());
            System.out.println("Circle 1 equals Circle 2 is " + crl1.equals(crl2));
            System.out.println("Circle 1 equals Circle 3 is " + crl1.equals(crl3));
            System.out.println("Circle 2 equals Circle 3 is " + crl2.equals(crl3));
            System.out.println("Areas and perimeters:");
            System.out.println("Circle 1: area = " + crl1.getArea() + ", perimeter = " + crl1.getPerimeter());
            System.out.println("Circle 2: area = " + crl2.getArea() + ", perimeter = " + crl2.getPerimeter());
            System.out.println("Circle 3: area = " + crl3.getArea() + ", perimeter = " + crl3.getPerimeter());
            System.out.println();
        }

        {
            System.out.println("3: ");
            Rectangle rect1 = new Rectangle();
            if(rect1 != null) System.out.println("//Rectangle 1 created");
            Rectangle rect2 = new Rectangle(2.3, 4);
            if(rect2 != null) System.out.println("//Rectangle 2 created");
            Rectangle rect3 = new Rectangle("green" ,true, 5.2 , 3.5);
            if(rect3 != null) System.out.println("//Rectangle 3 created");
            System.out.println("Rectangle 1: " + rect1);
            System.out.println("Rectangle 2: " + rect2);
            System.out.println("Rectangle 3: " + rect3);

            System.out.println("//Change color of Rectangle 1");
            rect1.setColor("white");
            System.out.println("//Fill Rectangle 2");
            rect2.setFilled(false);
            System.out.println("//Change width and length of Rectangle 3");
            rect3.setWidth(6.2);
            rect3.setLength(1.8);
            System.out.println("New facts about Rectangle 1: " + rect1);
            System.out.println("Hash Code: " + rect1.hashCode());
            System.out.println("New facts about Rectangle 2: " + rect2);
            System.out.println("Hash Code: " + rect2.hashCode());
            System.out.println("New facts about Rectangle 3: " + rect3);
            System.out.println("Hash Code: " + rect3.hashCode());
            System.out.println("Rectangle 1 equals Rectangle 2 is " + rect1.equals(rect2));
            System.out.println("Rectangle 1 equals Rectangle 3 is " + rect1.equals(rect3));
            System.out.println("Rectangle 2 equals Rectangle 3 is " + rect2.equals(rect3));
            System.out.println("Areas and perimeters:");
            System.out.println("Rectangle 1: area = " + rect1.getArea() + ", perimeter = " + rect1.getPerimeter());
            System.out.println("Rectangle 2: area = " + rect2.getArea() + ", perimeter = " + rect2.getPerimeter());
            System.out.println("Rectangle 3: area = " + rect3.getArea() + ", perimeter = " + rect3.getPerimeter());

            System.out.println();
        }

        {
            System.out.println("4: ");
            Square sq1 = new Square();
            if(sq1 != null) System.out.println("//Square 1 created");
            Square sq2 = new Square(2.3);
            if(sq2 != null) System.out.println("//Square 2 created");
            Square sq3 = new Square("green" ,true, 5.2);
            if(sq3 != null) System.out.println("//Square 3 created");
            System.out.println("Square 1: " + sq1);
            System.out.println("Square 2: " + sq2);
            System.out.println("Square 3: " + sq3);

            System.out.println("//Change color of Square 1");
            sq1.setColor("white");
            System.out.println("//Fill Square 2");
            sq2.setFilled(false);
            System.out.println("//Change side of Square 3");
            sq3.setSide(6.2);
            System.out.println("New facts about Square 1: " + sq1);
            System.out.println("Hash Code: " + sq1.hashCode());
            System.out.println("New facts about Square 2: " + sq2);
            System.out.println("Hash Code: " + sq2.hashCode());
            System.out.println("New facts about Square 3: " + sq3);
            System.out.println("Hash Code: " + sq3.hashCode());
            System.out.println("Square 1 equals Square 2 is " + sq1.equals(sq2));
            System.out.println("Square 1 equals Square 3 is " + sq1.equals(sq3));
            System.out.println("Square 2 equals Square 3 is " + sq2.equals(sq3));
            System.out.println("Areas and perimeters:");
            System.out.println("Rectangle 1: area = " + sq1.getArea() + ", perimeter = " + sq1.getPerimeter());
            System.out.println("Rectangle 2: area = " + sq2.getArea() + ", perimeter = " + sq2.getPerimeter());
            System.out.println("Rectangle 3: area = " + sq3.getArea() + ", perimeter = " + sq3.getPerimeter());

            System.out.println();
        }
        System.out.println();
        {
            System.out.println("Task 5: ");
            System.out.println("1: ");
            System.out.println("Class Shape is abstract, so we can't create instance of this class");
        }

        {
            System.out.println("2: ");
            abstractShape.Circle crl1 = new abstractShape.Circle();
            if(crl1 != null) System.out.println("//Circle 1 created");
            abstractShape.Circle crl2 = new abstractShape.Circle(12.5);
            if(crl2 != null) System.out.println("//Circle 2 created");
            abstractShape.Circle crl3 = new abstractShape.Circle("green" ,true, 3);
            if(crl3 != null) System.out.println("//Circle 3 created");
            System.out.println("Circle 1: " + crl1);
            System.out.println("Circle 2: " + crl2);
            System.out.println("Circle 3: " + crl3);

            System.out.println("Circle1's color: " + crl1.getColor() + ", filled is " + crl1.isFilled() + " with radius = " + crl1.getRadius());
            System.out.println("Circle2's color: " + crl2.getColor() + ", filled is " + crl2.isFilled() + " with radius = " + crl2.getRadius());
            System.out.println("Circle3's color: " + crl3.getColor() + ", filled is " + crl3.isFilled() + " with radius = " + crl3.getRadius());

            System.out.println("//Change color of Circle 1");
            crl1.setColor("white");
            System.out.println("//Fill Circle 2");
            crl2.setFilled(false);
            System.out.println("//Change radius of Circle 3");
            crl3.setRadius(6.2);
            System.out.println("New facts about Circle 1: " + crl1);
            System.out.println("Hash Code: " + crl1.hashCode());
            System.out.println("New facts about Circle 2: " + crl2);
            System.out.println("Hash Code: " + crl2.hashCode());
            System.out.println("New facts about Circle 3: " + crl3);
            System.out.println("Hash Code: " + crl3.hashCode());
            System.out.println("Circle 1 equals Circle 2 is " + crl1.equals(crl2));
            System.out.println("Circle 1 equals Circle 3 is " + crl1.equals(crl3));
            System.out.println("Circle 2 equals Circle 3 is " + crl2.equals(crl3));
            System.out.println("Areas and perimeters:");
            System.out.println("Circle 1: area = " + crl1.getArea() + ", perimeter = " + crl1.getPerimeter());
            System.out.println("Circle 2: area = " + crl2.getArea() + ", perimeter = " + crl2.getPerimeter());
            System.out.println("Circle 3: area = " + crl3.getArea() + ", perimeter = " + crl3.getPerimeter());
            System.out.println();
        }

        {
            System.out.println("3: ");
            abstractShape.Rectangle rect1 = new abstractShape.Rectangle();
            if(rect1 != null) System.out.println("//Rectangle 1 created");
            abstractShape.Rectangle rect2 = new abstractShape.Rectangle(2.3, 4);
            if(rect2 != null) System.out.println("//Rectangle 2 created");
            abstractShape.Rectangle rect3 = new abstractShape.Rectangle("green" ,true, 5.2 , 3.5);
            if(rect3 != null) System.out.println("//Rectangle 3 created");
            System.out.println("Rectangle 1: " + rect1);
            System.out.println("Rectangle 2: " + rect2);
            System.out.println("Rectangle 3: " + rect3);

            System.out.println("//Change color of Rectangle 1");
            rect1.setColor("white");
            System.out.println("//Fill Rectangle 2");
            rect2.setFilled(false);
            System.out.println("//Change width and length of Rectangle 3");
            rect3.setWidth(6.2);
            rect3.setLength(1.8);
            System.out.println("New facts about Rectangle 1: " + rect1);
            System.out.println("Hash Code: " + rect1.hashCode());
            System.out.println("New facts about Rectangle 2: " + rect2);
            System.out.println("Hash Code: " + rect2.hashCode());
            System.out.println("New facts about Rectangle 3: " + rect3);
            System.out.println("Hash Code: " + rect3.hashCode());
            System.out.println("Rectangle 1 equals Rectangle 2 is " + rect1.equals(rect2));
            System.out.println("Rectangle 1 equals Rectangle 3 is " + rect1.equals(rect3));
            System.out.println("Rectangle 2 equals Rectangle 3 is " + rect2.equals(rect3));
            System.out.println("Areas and perimeters:");
            System.out.println("Rectangle 1: area = " + rect1.getArea() + ", perimeter = " + rect1.getPerimeter());
            System.out.println("Rectangle 2: area = " + rect2.getArea() + ", perimeter = " + rect2.getPerimeter());
            System.out.println("Rectangle 3: area = " + rect3.getArea() + ", perimeter = " + rect3.getPerimeter());

            System.out.println();
        }

        {
            System.out.println("4: ");
            Square sq1 = new Square();
            if(sq1 != null) System.out.println("//Square 1 created");
            Square sq2 = new Square(2.3);
            if(sq2 != null) System.out.println("//Square 2 created");
            Square sq3 = new Square("green" ,true, 5.2);
            if(sq3 != null) System.out.println("//Square 3 created");
            System.out.println("Square 1: " + sq1);
            System.out.println("Square 2: " + sq2);
            System.out.println("Square 3: " + sq3);

            System.out.println("//Change color of Square 1");
            sq1.setColor("white");
            System.out.println("//Fill Square 2");
            sq2.setFilled(false);
            System.out.println("//Change side of Square 3");
            sq3.setSide(6.2);
            System.out.println("New facts about Square 1: " + sq1);
            System.out.println("Hash Code: " + sq1.hashCode());
            System.out.println("New facts about Square 2: " + sq2);
            System.out.println("Hash Code: " + sq2.hashCode());
            System.out.println("New facts about Square 3: " + sq3);
            System.out.println("Hash Code: " + sq3.hashCode());
            System.out.println("Square 1 equals Square 2 is " + sq1.equals(sq2));
            System.out.println("Square 1 equals Square 3 is " + sq1.equals(sq3));
            System.out.println("Square 2 equals Square 3 is " + sq2.equals(sq3));
            System.out.println("Areas and perimeters:");
            System.out.println("Rectangle 1: area = " + sq1.getArea() + ", perimeter = " + sq1.getPerimeter());
            System.out.println("Rectangle 2: area = " + sq2.getArea() + ", perimeter = " + sq2.getPerimeter());
            System.out.println("Rectangle 3: area = " + sq3.getArea() + ", perimeter = " + sq3.getPerimeter());
            System.out.println();
        }
        System.out.println();
        {
            System.out.println("Task 6: ");
            System.out.println("1: ");
            movable.MovablePoint mvp = new movable.MovablePoint(0, 0, 2, 4);
            if(mvp != null) System.out.println("//Movable point created");
            System.out.println("Our movable point: " + mvp);
            System.out.println("//Point moving up");
            System.out.printf("(" + mvp.getX() + ", " + mvp.getY() + ") --> ");
            mvp.moveUp();
            System.out.println("(" + mvp.getX() + ", " + mvp.getY() + ")");
            System.out.println("//Point moving left");
            System.out.printf("(" + mvp.getX() + ", " + mvp.getY() + ") --> ");
            mvp.moveLeft();
            System.out.println("(" + mvp.getX() + ", " + mvp.getY() + ")");
            System.out.println("//Point moving down");
            System.out.printf("(" + mvp.getX() + ", " + mvp.getY() + ") --> ");
            mvp.moveDown();
            System.out.println("(" + mvp.getX() + ", " + mvp.getY() + ")");
            System.out.println("//Point moving right");
            System.out.printf("(" + mvp.getX() + ", " + mvp.getY() + ") --> ");
            mvp.moveRigth();
            System.out.println("(" + mvp.getX() + ", " + mvp.getY() + ")");
            System.out.println("New place of point: " + mvp);
            System.out.println("Hash code: " + mvp.hashCode());
            System.out.println();
        }

        {
            System.out.println("2: ");
            MovableCircle mvc = new MovableCircle(12,0,0,2, 3);
            System.out.println("Our movable circle: " + mvc);
            System.out.println("//Circle moving up");
            mvc.moveUp();
            System.out.println(mvc);
            System.out.println("//Circle moving left");
            mvc.moveLeft();
            System.out.println(mvc);
            System.out.println("//Circle moving down");
            mvc.moveDown();
            System.out.println(mvc);
            System.out.println("//Circle moving right");
            mvc.moveRigth();
            System.out.println(mvc + " - new place of circle");
            System.out.println("Hash code: " + mvc.hashCode());
            System.out.println();
        }
        System.out.println();
        {
            System.out.println("Task 7: ");
            System.out.println("2: ");
            MovableRectangle mvr = new MovableRectangle(1,0,4,2, 3, 6);
            System.out.println("Our movable circle: " + mvr);
            System.out.println("//Rectangle moving up");
            mvr.moveUp();
            System.out.println(mvr);
            System.out.println("//Rectangle moving left");
            mvr.moveLeft();
            System.out.println(mvr);
            System.out.println("//Rectangle moving down");
            mvr.moveDown();
            System.out.println(mvr);
            System.out.println("//Circle moving right");
            mvr.moveRigth();
            System.out.println(mvr + " - new place of circle");
            System.out.println("Hash code: " + mvr.hashCode());
            System.out.println();
        }
        System.out.println();
        {
            System.out.println("Task 8: ");
            System.out.println("1: ");
            geomObj.Circle crl = new geomObj.Circle(12.3);
            System.out.println("Our circle: " + crl);
            System.out.println("Hash code: " + crl.hashCode());
            System.out.println("Area = " + crl.getArea());
            System.out.println("Perimeter = + " + crl.getPerimeter());
            System.out.println();
        }

        {
            System.out.println("2: ");
            geomObj.ResizableCircle crl = new geomObj.ResizableCircle(4.1);
            System.out.println("Our circle: " + crl);
            System.out.println("Hash code: " + crl.hashCode());
            System.out.println("Area = " + crl.getArea());
            System.out.println("Perimeter = + " + crl.getPerimeter());
            System.out.println("//Resize circle");
            crl.resize(15);
            System.out.println("New circle: " + crl);
        }
    }
}
