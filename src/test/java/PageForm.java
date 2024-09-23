import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class PageForm {
    public static final SelenideElement FirstName = $("#firstName");
    public static final SelenideElement LastName = $("#lastName");
    public static final SelenideElement Email = $("#userEmail");
    public static final SelenideElement Gender = $("[#gender-radio-1]");
    public static final SelenideElement PhoneNumber = $("[#userNumber]");
    public static final SelenideElement BirthDay = $("[#dateOfBirthInput]");
    public static final SelenideElement Month = $("[.react-datepicker__month-select]");
    public static final SelenideElement Year = $("[.react-datepicker__year-select]");
    public static final SelenideElement Day = $("[.react-datepicker__day.react-datepicker__day--011]");
    public static final SelenideElement Subject = $("[#subjectsInput]");
    public static final SelenideElement Hobbie = $("[#hobbies-checkbox-1]");
    public static final SelenideElement Picture = $("[#uploadPicture]");
    public static final SelenideElement CurrentAddress = $("[#currentAddress]");
    public static final SelenideElement Scroll = $("[#stateCity-wrapper]");
    public static final SelenideElement StateAndCity = $("[#state]");
    public static final SelenideElement State = $("[#react-select-3-input]");
    public static final SelenideElement StateAndCity2 =  $("[id=city]");
    public static final SelenideElement City = $("[#react-select-4-input]");
    public static final SelenideElement SubmitButton = $("[#submit]");


    public PageForm addFirstName() {
        FirstName.setValue("Andrey");
        return this;
    }
    public PageForm addLastName() {
        LastName.setValue("Vtyurin");
        return this;
    }

    public PageForm addEmail() {
        Email.setValue("test@test.ru");
        return this;
    }

    public PageForm addGender() {
        Gender.click();
        return this;
    }
    public PageForm addPhoneNumber() {
        PhoneNumber.setValue("9878237176");
        return this;
    }
    public PageForm addBirthDay() {
        BirthDay.click();
        return this;
    }
    public PageForm addMonth() {
        Month.selectOption("October");
        return this;
    }
    public PageForm addYear() {
        Year.selectOption("1996");
        return this;
    }
    public PageForm addDay() {
        Day.click();
        return this;
    }
    public PageForm addSubject() {
        Subject.setValue("History").pressEnter();
        return this;
    }
    public PageForm addHobbie() {
        Hobbie.click();
        return this;
    }

    public PageForm addPicture() {
        Picture.uploadFromClasspath("src/test/resources/ДляАвтотеста.jpeg");
        return this;
    }

    public PageForm addCurrentAddress() {
        CurrentAddress.click();
        return this;
    }
    public PageForm makeScroll() {
        Scroll.scrollIntoView(true);
        return this;
    }
    public PageForm clickState() {
        StateAndCity.click();
        return this;
    }
    public PageForm addState() {
        State.setValue("NCR").pressEnter();
        return this;
    }
    public PageForm clickCity() {
        StateAndCity2.click();
        return this;
    }
    public PageForm addCity() {
        City.setValue("Dilhi").pressEnter();
        return this;
    }
    public PageForm clickSubmitButton() {
        SubmitButton.click();
        return this;
    }

}
