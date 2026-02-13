public static void main(String[] a) {

    Turtle bob = new Turtle();
    Turtle john = new Turtle();


    john.speed(100);
    int radius = 80;
    john.home();
    john.penColor("black");
    int size = 300; // ขนาดของเส้นดาว

    john.up();
// เลื่อนเต่าไปทางซ้ายและลงล่าง เพื่อให้ตัวดาวครอบคลุมจุดศูนย์กลางพอดี
    john.forward(-size / 2);
    john.left(90);
    john.forward(size / 4);
    john.right(90);
    john.down();

    john.penColor("black");

// ลูปวาดดาว 5 แฉก
    for (int i = 0; i < 5; i++) {
        john.forward(size);
        john.right(144);
    }
    john.left(90);
    john.down();
    bob.home();
    bob.penColor("aqua");
    bob.width(5);
    bob.speed(50);
    bob.down();
    for(int i = 0;i<6;i++)
    {
        bob.left(60);
        bob.forward(20);
    }
    for(int count = 0;count < 6 ;count++)
    {
        bob.right(60);
        bob.forward(10);
        bob.right(60);
        bob.forward(10);
        bob.right(180);
        bob.forward(10);
        bob.right(60);
        bob.forward(10);
        bob.right(180);
        bob.forward(10);
        bob.left(120);
        bob.forward(10);
        bob.right(60);
        bob.forward(10);
        bob.right(180);
        bob.forward(10);
        bob.right(60);
        bob.forward(10);
        bob.right(180);
        bob.forward(10);
        bob.left(120);
        bob.forward(10);
        bob.right(180);
        bob.forward(30);
        bob.right(60);
        bob.forward(20);

    }
    bob.up();
    bob.right(90);
    bob.forward(100);

}

