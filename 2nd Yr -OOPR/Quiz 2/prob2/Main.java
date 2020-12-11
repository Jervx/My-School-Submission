import java.util.Scanner;

class Main{

    public static void main(String [ ] jervx){
        Scanner in = new Scanner(System.in);

        Rectangle shape = new Rectangle(in.nextInt(),in.nextInt());
        shape.display();

        System.out.println(shape.isSquare()?"SQUARE":"RECTANGLE");
        System.out.printf("AREA: %d\nPERIMETER: %d\nCENTER POINT: %s",shape.area(),shape.perimiter(),shape.centerPoint());


/*

testing lang 


# # # # # # 
#         # 
#         # 
#         # 
#         # 
#         # 
#         # 
#         # 
# # # # # # 

RECTANGLE
AREA: 40
PERIMITER: 26
CENTER POINT: (2.50,4.00)






# # # # # #
#         #
#         #
#         #
#         #
#         #
#         #
#         #
# # # # # #

RECTANGLE
AREA: 40
PERIMETER: 26
CENTER POINT: (2.50,4.00)
*/
    }
}