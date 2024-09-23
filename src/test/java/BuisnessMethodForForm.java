public class BuisnessMethodForForm {
    public static void createBuisnessMethod(){
    PageForm pageForm = new PageForm();

            pageForm.addFirstName()
                    .addLastName()
                .addEmail()
                .addGender()
                .addPhoneNumber()
                .addBirthDay()
                .addMonth()
                .addYear()
                .addDay()
                .addSubject()
                .addHobbie()
                .addPicture()
                .addCurrentAddress()
                .makeScroll()
                .clickState()
                .addState()
                .clickCity()
                .addCity()
                .clickSubmitButton();

}
}
