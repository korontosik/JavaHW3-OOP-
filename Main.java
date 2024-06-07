import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        StudentGroup studentGroup1 = new StudentGroup("Програмист");
        StudentGroup studentGroup2 = new StudentGroup("Тестировщик");
        StudentGroup studentGroup3 = new StudentGroup("Аналитик");
        StudentGroup studentGroup4 = new StudentGroup("Проджект менеджер");
        StudentGroup studentGroup5 = new StudentGroup("Продакт менеджер");

        Stream stream1 = new Stream("Stream №1");
        stream1.addStudentGroupInStream(studentGroup3);
        stream1.addStudentGroupInStream(studentGroup2);
        stream1.addStudentGroupInStream(studentGroup2);
        stream1.addStudentGroupInStream(studentGroup3);

        printStream(stream1);

        Stream stream2 = new Stream("Stream №2");
        stream2.addStudentGroupInStream(studentGroup1);
        stream2.addStudentGroupInStream(studentGroup5);
        stream2.addStudentGroupInStream(studentGroup1);

        printStream(stream2);

        Stream stream3 = new Stream("Stream №3");
        stream3.addStudentGroupInStream(studentGroup1);
        stream3.addStudentGroupInStream(studentGroup4);
        stream3.addStudentGroupInStream(studentGroup4);
        stream3.addStudentGroupInStream(studentGroup1);
        stream3.addStudentGroupInStream(studentGroup5);

        printStream(stream3);

        //Список потоков и выводим его
        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        streams.add(stream3);

        System.out.println("Список потоков:");
        printListOfStreams(streams);

        //Сортируем Список потоков и выводим его
        StreamService streamService = new StreamService();
        streamService.getSortedStreams(streams);
        System.out.println("Отсортированный список потоков:");
        printListOfStreams(streams);

    }
    //Метод для вывода списка учебных групп в потоке
    static void printStream(Stream stream){
        System.out.printf(stream.getStreamName() + ": \n");
        for(StudentGroup studentGroup: stream){
            System.out.println(studentGroup);
        }
        System.out.println(" ");
    }
    //Метод для вывода потоков в списке потоков
    static void printListOfStreams(List<Stream> streams){
        for(Stream stream: streams){
            System.out.println(stream);
            System.out.printf("%s: %d\n", "Количество групп в потоке", stream.getStream().size());
        }
        System.out.println(" ");
    }
}
