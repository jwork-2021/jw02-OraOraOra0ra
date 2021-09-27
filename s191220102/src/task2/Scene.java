package task2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Scene {

    public static void main(String[] args) throws IOException {

        Line line = new  Line(64);

        Snake theSnake = Snake.getTheSnake();

        Create create = new Create(line,64);

        theSnake.setCreate(create);

        Sorter sorter = new QuickSorter();

        theSnake.setSorter(sorter);

        String log = theSnake.lineUp(line);

        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("s191220102/task02_result.txt"));
        writer.write(log);
        writer.flush();
        writer.close();

    }

}
