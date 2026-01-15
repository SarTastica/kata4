package software.ulpgc.kata4.io;

import software.ulpgc.kata4.model.Title;

public class TsvTitleDeserializer implements TitleDeserializer {
    @Override
    public Title deserialize(String line) {
        String[] fields = line.split("\t");
        if (fields.length > 2) {
            // Columna 0: id, Columna 1: type, Columna 2: title
            return new Title(fields[0], fields[1], fields[2]);
        }
        return null;
    }
}

