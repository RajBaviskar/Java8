public class HelloWorldAnonymousClasses {

    /**
     * this is interface
     */
    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }

    /**
     * this is method of HelloWorldAnonymousClasses
     */
    public void sayHello() {

        /**
         * Local class
         */
        class EnglishGreeting implements HelloWorld {
            String name = "world";
            public void greet() {
                greetSomeone("world");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }
        HelloWorld englishGreeting = new EnglishGreeting();

        /**
         * Anonymous class
         * unlike above local class we don't have to create object
         * this class will directly get invoked
         */
        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";
            public void greet() {
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };

        /**
         * Anonymous class
         * unlike above local class we don't have to create object
         * this class will directly get invoked
         */
        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";
            public void greet() {
                greetSomeone("mundo");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        };
        // This object is created before because its local class
        englishGreeting.greet();

        // This is directly invoking, it can be done because this is antonymous class
        frenchGreeting.greetSomeone("Fred");

        // This is directly invoking, it can be done because this is antonymous class
        spanishGreeting.greet();
    }

    public static void main(String... args) {
        HelloWorldAnonymousClasses myApp =
                new HelloWorldAnonymousClasses();
        myApp.sayHello();
    }
}