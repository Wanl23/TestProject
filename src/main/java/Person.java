

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    Person(String firstName, String lastName, String middleName, String country, String address, String phone, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.country = country;
        this.address = address;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getCountry() {
        return this.country;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhone() {
        return this.phone;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Person)) {
            return false;
        } else {
            Person other = (Person) o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$firstName = this.getFirstName();
                Object other$firstName = other.getFirstName();
                if (this$firstName == null) {
                    if (other$firstName != null) {
                        return false;
                    }
                } else if (!this$firstName.equals(other$firstName)) {
                    return false;
                }

                Object this$lastName = this.getLastName();
                Object other$lastName = other.getLastName();
                if (this$lastName == null) {
                    if (other$lastName != null) {
                        return false;
                    }
                } else if (!this$lastName.equals(other$lastName)) {
                    return false;
                }

                Object this$middleName = this.getMiddleName();
                Object other$middleName = other.getMiddleName();
                if (this$middleName == null) {
                    if (other$middleName != null) {
                        return false;
                    }
                } else if (!this$middleName.equals(other$middleName)) {
                    return false;
                }

                label78:
                {
                    Object this$country = this.getCountry();
                    Object other$country = other.getCountry();
                    if (this$country == null) {
                        if (other$country == null) {
                            break label78;
                        }
                    } else if (this$country.equals(other$country)) {
                        break label78;
                    }

                    return false;
                }

                label71:
                {
                    Object this$address = this.getAddress();
                    Object other$address = other.getAddress();
                    if (this$address == null) {
                        if (other$address == null) {
                            break label71;
                        }
                    } else if (this$address.equals(other$address)) {
                        break label71;
                    }

                    return false;
                }

                Object this$phone = this.getPhone();
                Object other$phone = other.getPhone();
                if (this$phone == null) {
                    if (other$phone != null) {
                        return false;
                    }
                } else if (!this$phone.equals(other$phone)) {
                    return false;
                }

                if (this.getAge() != other.getAge()) {
                    return false;
                } else {
                    Object this$gender = this.getGender();
                    Object other$gender = other.getGender();
                    if (this$gender == null) {
                        if (other$gender != null) {
                            return false;
                        }
                    } else if (!this$gender.equals(other$gender)) {
                        return false;
                    }

                    return true;
                }
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Person;
    }

    public String toString() {
        return "Person(firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", middleName=" + this.getMiddleName() + ", country=" + this.getCountry() + ", address=" + this.getAddress() + ", phone=" + this.getPhone() + ", age=" + this.getAge() + ", gender=" + this.getGender() + ")";
    }

    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private String middleName;
        private String country;
        private String address;
        private String phone;
        private int age;
        private String gender;

        PersonBuilder() {
        }

        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder country(String country) {
            this.country = country;
            return this;
        }

        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Person build() {
            return new Person(this.firstName, this.lastName, this.middleName, this.country, this.address, this.phone, this.age, this.gender);
        }

        public String toString() {
            return "Person.PersonBuilder(firstName=" + this.firstName + ", lastName=" + this.lastName + ", middleName=" + this.middleName + ", country=" + this.country + ", address=" + this.address + ", phone=" + this.phone + ", age=" + this.age + ", gender=" + this.gender + ")";
        }
    }
}
