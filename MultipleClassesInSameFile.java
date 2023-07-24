public class MultipleClassesInSameFile {
    public static void main(String[] args) {
        System.out.println( GenerateMessage.generateMessage() );
        System.out.println( AnotherMessage.genertaAnotherMessage() );
    }
}

class GenerateMessage {
    static String generateMessage() {
        return "Here is one message";
    }
}

class AnotherMessage {
    static String genertaAnotherMessage() {
        return "Here is another message";
    }
}
