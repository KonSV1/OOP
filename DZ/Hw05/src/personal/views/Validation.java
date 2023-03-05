package personal.views;

import personal.model.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    Pattern namePattern = Pattern.compile("^\\S+$");
    Pattern phonePattern = Pattern.compile("^((8|\\+7)[\\-]?)?(\\(?\\d{3}\\)?[\\-]?)?[\\d\\-]{7,10}$");
    public void validateUser(User inputUser) throws Exception {
        Matcher matcherFName = namePattern.matcher(inputUser.getFirstName());
        Matcher matcherLName = namePattern.matcher(inputUser.getLastName());
        Matcher matcherPhone = phonePattern.matcher(inputUser.getPhone());
        if(!matcherFName.find()){
            throw new Exception("Имя содержит пробелы");
        }
        if(!matcherLName.find()){
            throw new Exception("Фамилия содержит пробелы");
        }
        if(!matcherPhone.find()){
            throw new Exception("Номер телефона введен неверно");
        }

    }
}
