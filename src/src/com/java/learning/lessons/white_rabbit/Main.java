
        //lesson18
//        StaticVariablesAndMethods staticVariablesAndMethods = new StaticVariablesAndMethods();
//        StaticVariablesAndMethods staticVariablesAndMethods1 = new StaticVariablesAndMethods();
//        StaticVariablesAndMethods staticVariablesAndMethods2 = new StaticVariablesAndMethods();
//
//        staticVariablesAndMethods.variable = 5;
//        staticVariablesAndMethods1.variable = 7;
//
//        System.out.println(staticVariablesAndMethods.variable);
//        System.out.println(staticVariablesAndMethods1.variable);
//        System.out.println(staticVariablesAndMethods2.variable);
//        // будет три 7 так как static означает что данное поле является полем класса и оно одинаково для всех объектов
//        // сначала мы присвоили 5 потом присвоили 7 и осталось 7
//        // такое обращение к переменным некорректно
//        // если есть static переменная или методы необходимо к ним обращаться через сам класс
//        StaticVariablesAndMethods.variable = 5; // правильное
//        //
//        StaticVariablesAndMethods.foo();

        //lesson19
//        Encapsulation encapsulation = new Encapsulation();
//        encapsulation.a = 10; // если переменные ядро никакого доступа к ним не должно быть
//        System.out.println( encapsulation.showResult());
////////////////////////////////////////////////////////////////////
//        // если нам надо установить нашу переменную
//        encapsulation.setA(10); // присваиваем и выводим
//        System.out.println(encapsulation.getA());
//        ///////////////////////////////////////
//        encapsulation.maxCat = 2; // что бы не поменяли число делаем след
//        System.out.println(encapsulation.maxCat);
//        encapsulation.getMaxCat2(); // можем к ним обратиться и получить его значение
//        encapsulation.setMaxCat2(15); // присваиваем новое число
//        encapsulation.getMaxDog2();
//        int animals = encapsulation.getMaxCat2() + encapsulation.getMaxDog2(); // сложить
//        System.out.println("Animals = " + animals);

        //lesson20
//        Music music = Music.CLASSIC;
//        for (Music element : Music.values()) { //возвращает массив элементов
//            System.out.println(element);
//        }
//        Music music1 = Music.valueOf(Music.class, "ROCK"); // еще один способ создания объекта данного класса
//        System.out.println(music1);
//        System.out.println(music1.ordinal()); // возвращение позиции элемента (ответ(1)))
//        switch (music){
//            case CLASSIC:
//                System.out.println("Classic");
//                break;
//            case POP:
//                System.out.println("Pop");
//                break;
//            case ROCK:
//                System.out.println("Rock");
//                break;
//        }
//        Books books = Books.FANTASY;
//        System.out.println(books.getI() + " " + books.getName());
        // or
//        for (Books element : Books.values()) {
//            System.out.println(element.getI() + " " + "books" + " " + element.getName());
//        }
//        books.foo();
//        books.foo1(); // Работа с методом и его переменными

        //lesson21
//        Ostrich ostrich = new Ostrich();
//        Crow crow = new Crow();
//
//        ostrich.setName("Os");

        // создаем страуса другим способом
//        Birds ostrich1 = new Ostrich();
        //метод в классе Ostrich в данном объекте отсутствует тк ссылка на birds (обрезаем возможности страусу)

        //Используя конструктор в супер классе
//        Ostrich ostrich = new Ostrich("Os");

        //lesson22
//        Sheepdog sheepdog = new Sheepdog();
//        sheepdog.walk();
//        sheepdog.walk("OH"); // первая версия полиморфизма который называется статический полиморфизм
//        System.out.println(" ");
//        sheepdog.walk(); // второй динамический
//        System.out.println(" ");
//        Dog sheepdog2 = new Sheepdog(); // третий
//        Dog sharpey2 = new Sharpey();
//
//        Test test = new Test();
//        test.foo(sheepdog2);
//        test.foo(sharpey2);
        //с помощью одного метода обращаемся действию

        //lesson23
//        AK47 ak47 = new AK47();
//        ak47.shoot();

        //lesson24
//        Mi8 mi8 = new Mi8();
//        Boeing737 boeing737 = new Boeing737();
//
//        Test1 test = new Test1();
//        test.foo(mi8);

        //lesson25
//        DollySheet dollySheet = new DollySheet();
//        DollySheet dollySheet2 = CloneDollySheet.foo(dollySheet);
//
//        dollySheet.setName("Dolly");
//        dollySheet2.setName("Rick");
//
//        System.out.println(dollySheet.getName());
//        System.out.println(" ");
//        System.out.println(dollySheet2.getName());

        //lesson26
//        Line line = new Line();
//        line.foo();

        //lesson27
//        LineBuilderAndBuffer lineBuilderAndBuffer = new LineBuilderAndBuffer();
//        lineBuilderAndBuffer.foo();

        //lesson28
//        Body body = new Body();
//
//        SmallHead smallHead = new SmallHead();
//        MediumHead mediumHead = new MediumHead();
//        BigHead bigHead = new BigHead();
//        Leg leg = new Leg();
//
//        Robot<SmallHead> robot = new Robot<SmallHead>(body, smallHead);
//        Robot<MediumHead> robot1 = new Robot<MediumHead>(body, mediumHead);
//        robot.getHead().burn();
//        robot1.getHead().say();
////        Не можем присвоить данной ссылке robot=robot1 потому что фактически они разные они созданы на основе одного класса
//        Robot robot2 = new Robot(body, bigHead); // Так как мы не указываем параметризацию
//        robot2 = robot1; // когда мы не указываем параметризацию
//
//        Robot robot3 = new Robot(body,mediumHead); // Когда стоит чистая параметризация мы можем поставить все что угодном (leg)
//        //   и получается когда мы делаем робота вместо головы мы ему пихаем ногу и получается плохо и чтобы ограничить
//        //   набор принимаемых объектов используют <T extends Head>, для того чтобы ограничить
//
//        Robot<SmallHead> robot4 = new Robot(body,smallHead);
//        Robot<MediumHead> robot5 = new Robot<MediumHead>(body,mediumHead);
//
//        robot4.foo1(robot5);

        //lesson29
//        ErrorExample errorExample = new ErrorExample();
//        errorExample.foo();
//
//        try {
//            errorExample.foo1();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        errorExample.foo2();

        //lesson30
//        PerimeterSquare perimeterSquare = new PerimeterSquare();
//        try {
//            perimeterSquare.getPerimeter("g");
//        } catch (PerimeterException e) {
//            e.printStackTrace();
//        }

        //lesson31
//        Cat cat = new Cat();
//        cat.setName("Tom");
//
//        Serializator serializator = new Serializator();
//        serializator.serialization(cat);
//        System.out.println(serializator.serialization(cat));
//
//        System.out.println(" ");
//
//        try {
//            Cat cat1 = serializator.deserialization();
//            System.out.println(cat1.getName());
//        } catch (InvalidObjectException e) {
//            e.printStackTrace();
//        }

        //lesson32
//        StreamsInputOutputIO streamsInputOutputIO = new StreamsInputOutputIO();
//        streamsInputOutputIO.foo();
//        System.out.println();
//        streamsInputOutputIO.foo1();
//        System.out.println();
//        streamsInputOutputIO.foo2();
//        System.out.println();
//        streamsInputOutputIO.foo3();

        //lesson33

        //lesson34
//        AAndL aAndL = new AAndL();
//        aAndL.AL();
//        aAndL.LL();
//    }
//}
