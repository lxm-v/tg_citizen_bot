package ArCitBot;

import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ArBotStorage {

    Random random = new Random();

    public String getBirthDate() {
        long epochtime = ThreadLocalRandom.current().nextLong(1148476152000L);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        return sdf.format(epochtime);
    }

    public String getCity() {
        String[] cities = {"Майкоп", "Горно-Алтайск", "Уфа", "Улан-Удэ", "Махачкала", "Магас", "Нальчик", "Элиста", "Черкесск", "Петрозаводск", "Сыктывкар", "Йошкар-Ола", "Саранск", "Якутск", "Владикавказ", "Казань", "Кызыл", "Ижевск", "Абакан", "Грозный", "Чебоксары", "Барнаул", "Чита", "Петропавловск-Камчатский", "Краснодар", "Красноярск", "Пермь", "Владивосток", "Ставрополь", "Хабаровск", "Благовещенск", "Архангельск", "Астрахань", "Белгород", "Брянск", "Владимир", "Волгоград", "Вологда", "Воронеж", "Иваново", "Иркутск", "Калининград", "Калуга", "Кемерово", "Киров", "Кострома", "Курган", "Курск", "Липецк", "Магадан", "Москва", "Мурманск", "Нижний Новгород", "Великий Новгород", "Новосибирск", "Омск", "Оренбург", "Орел", "Пенза", "Псков", "Ростов-на-Дону", "Рязань", "Самара", "Саратов", "Южно-Сахалинск", "Екатеринбург", "Смоленск", "Тамбов", "Тверь", "Томск", "Тула", "Тюмень", "Ульяновск", "Челябинск", "Ярославль", "Биробиджан", "Нарьян-Мар", "Ханты-Мансийск", "Анадырь", "Салехард"};

        return cities[random.nextInt(cities.length)];
    }

    public String getMaleName(){
        String[] maleSurnames = {"Алёхин", "Александров", "Андреев", "Арбузов", "Афанасьев", "Балашов", "Баранов", "Белов", "Белозёров", "Беляев", "Болдырев", "Борисов", "Бурмистров", "Буторин", "Вавилов", "Васильев", "Викторов", "Воронин", "Воронцов", "Вышеславцев", "Галкин", "Голубев", "Гордеев", "Громов", "Гусев", "Державин", "Дмитриев", "Емельянов", "Жданов", "Жуков", "Зимин", "Золотарёв", "Иванов", "Ильичёв", "Калашников", "Калинин", "Киселёв", "Козлов", "Комаров", "Кондратьев", "Коршунов", "Крылов", "Кузьмин", "Лебедев", "Малышев", "Марков", "Матвеев", "Медведев", "Михайлов", "Морозов", "Назаров", "Некрасов", "Никитин", "Овчинников", "Орлов", "Павлов", "Попов", "Прохоров", "Пушкин", "Романов", "Рыбаков", "Рябов", "Савельев", "Селезнёв", "Сидоров", "Соколов", "Степанов", "Суворов", "Тимофеев", "Тихонов", "Уткин", "Федосеев", "Фомин", "Харитонов", "Хлебников", "Цветков", "Черкасов", "Чернов", "Шишкин", "Щербаков", "Юдин", "Яковлев"};
        String[] maleNames = {"Александр", "Михаил", "Иван", "Дмитрий", "Артем", "Максим", "Николай", "Андрей", "Сергей", "Кирилл", "Алексей", "Павел", "Владимир", "Егор", "Илья", "Григорий", "Даниил", "Роман", "Виктор", "Юрий", "Олег", "Василий", "Евгений", "Станислав", "Тимофей", "Арсений", "Фёдор", "Владислав", "Леонид", "Анатолий", "Игорь", "Денис", "Константин", "Антон", "Борис", "Георгий", "Валентин", "Степан", "Аркадий", "Никита", "Валерий", "Виталий", "Альберт", "Евграф", "Глеб", "Захар", "Кузьма", "Лев", "Марк", "Наум", "Пётр", "Руслан", "Степан", "Тарас", "Устин", "Филипп", "Харитон", "Цезарь", "Чеслав", "Шамиль", "Эдуард", "Юлиан", "Яков", "Аскольд", "Ефим", "Лука", "Пахом", "Ратмир", "Савва", "Симон", "Спартак", "Фрол", "Эраст", "Юрий", "Яромир", "Агафон", "Елизар", "Лаврентий", "Матвей", "Порфирий", "Ростислав", "Савелий", "Трифон", "Фома", "Ярополк", "Адольф", "Ермак", "Любомир", "Мирон", "Прохор", "Роберт", "Семен", "Тимур", "Фаддей", "Ярослав", "Аким", "Ерофей", "Марк", "Назар", "Радомир", "Роман", "Семён", "Терентий", "Филарет", "Юлий", "Ярослав", "Аксель", "Ефим", "Мартин", "Нестор", "Рудольф", "Самуил", "Серафим", "Тимофей", "Филимон", "Юрий", "Яков"};
        String[] malePatronymics = {"Алексеевич", "Андреевич", "Аркадьевич", "Артемьевич", "Валентинович", "Васильевич", "Витальевич", "Владимирович", "Владиславович", "Геннадьевич", "Георгиевич", "Германович", "Глебович", "Данилович", "Дмитриевич", "Евгеньевич", "Егорович", "Иванович", "Ильич", "Игоревич", "Константинович", "Леонидович", "Михайлович", "Николаевич", "Олегович", "Петрович", "Прокопьевич", "Ростиславович", "Сергеевич", "Станиславович", "Степанович", "Тарасович", "Тимофеевич", "Тихонович", "Федорович", "Филиппович", "Фомич", "Эдуардович", "Юрьевич", "Яковлевич", "Янович", "Абрамович", "Адамович", "Адольфович", "Африканович", "Афанасьевич", "Богданович", "Борисович", "Вадимович", "Валерианович", "Вениаминович", "Виссарионович", "Владленович", "Вячеславович", "Гаврилович", "Георгиевич", "Гордеевич", "Давидович", "Данилович", "Демьянович", "Демидович", "Емельянович", "Еремеевич", "Ермолаевич", "Ефимович", "Зиновиевич", "Игнатьевич", "Илларионович", "Карпович", "Кириллович", "Лаврентьевич", "Леонтьевич", "Лукич", "Львович", "Макарович", "Матвеевич"};
        String maleSurname = maleSurnames[random.nextInt(maleSurnames.length)];
        String maleName = maleNames[random.nextInt(maleNames.length)];
        String malePatronymic = malePatronymics[random.nextInt(malePatronymics.length)];

        return maleSurname + " " + maleName + " " + malePatronymic;
    }

    public String getFemaleName(){
        String[] femaleSurnames = {"Иванова", "Смирнова", "Кузнецова", "Попова", "Васильева", "Петрова", "Соколова", "Михайлова", "Новикова", "Федорова", "Морозова", "Волкова", "Алексеева", "Лебедева", "Семенова", "Егорова", "Павлова", "Козлова", "Степанова", "Николаева", "Орлова", "Андреева", "Макарова", "Никитина", "Захарова", "Зайцева", "Соловьева", "Борисова", "Яковлева", "Григорьева", "Романова", "Воробьева", "Сергеева", "Кузьмина", "Фролова", "Александрова", "Дмитриева", "Королева", "Гусева", "Киселева", "Ильина", "Максимова", "Полякова", "Сорокина", "Виноградова", "Ковалева", "Белова", "Медведева", "Антонова", "Тимофеева", "Никифорова", "Веселова", "Филиппова", "Маркова", "Большакова", "Суханова", "Миронова", "Ширяева", "Анисимова", "Ефимова", "Логинова", "Селиверстова", "Савельева", "Тарасова", "Ушакова", "Баранова", "Комарова", "Добрынина", "Жукова", "Блинова", "Колесникова", "Чернова", "Карпова", "Афанасьева", "Власова", "Маслова", "Исакова", "Тихомирова", "Аксенова", "Гаврилова", "Родионова", "Котова", "Горбунова", "Кудряшова"};
        String[] femaleNames = {"Алёна", "Александра", "Анна", "Виктория", "Екатерина", "Мария", "Ольга", "Татьяна", "Ирина", "Наталья", "Елена", "Светлана", "Дарья", "Ангелина", "Юлия", "Полина", "Ксения", "Маргарита", "Валерия", "Евгения", "Диана", "Ева", "Надежда", "Любовь", "Милана", "София", "Алиса", "Вера", "Арина", "Кристина", "Ульяна", "Дина", "Регина", "Анжелика", "Лидия", "Галина", "Василиса", "Марина", "Лариса", "Яна", "Алина", "Влада", "Эвелина", "Роза", "Элина", "Инга", "Римма", "Агата", "Злата", "Милена", "Руслана", "Эльвира", "Маргарита", "Милана", "Нелли", "Рита", "Эльмира", "Стефания", "Эмма", "Лилия", "Джульетта", "Эльза", "Сабина", "Юлиана", "Регина", "Майя", "Аделина", "Эвелина", "Камилла", "Лейла", "Эмилия", "Самира", "Эльвира", "Зарина", "Лолита", "Карина", "Снежана", "Валентина", "Антонина", "Тамара", "Фаина", "Лилиана", "Гузель", "Регина", "Юна"};
        String[] femalePatronymics = {"Александровна", "Алексеевна", "Анатольевна", "Андреевна", "Антоновна", "Аркадьевна", "Арсеньевна", "Артёмовна", "Борисовна", "Вадимовна", "Валентиновна", "Валерьевна", "Васильевна", "Викторовна", "Владимировна", "Владиславовна", "Вячеславовна", "Геннадьевна", "Георгиевна", "Григорьевна", "Даниловна", "Денисовна", "Дмитриевна", "Евгеньевна", "Егоровна", "Ивановна", "Игнатьевна", "Игоревна", "Ильинична", "Кирилловна", "Константиновна", "Леонидовна", "Максимовна", "Марковна", "Михайловна", "Николаевна", "Олеговна", "Павловна", "Петровна", "Романовна", "Семёновна", "Сергеевна", "Станиславовна", "Степановна", "Тимофеевна", "Фёдоровна", "Юрьевна", "Яковлевна", "Ярославовна"};
        String femaleSurname = femaleSurnames[random.nextInt(femaleSurnames.length)];
        String femaleName = femaleNames[random.nextInt(femaleNames.length)];
        String femalePatronymic = femalePatronymics[random.nextInt(femalePatronymics.length)];

        return femaleSurname + " " + femaleName + " " + femalePatronymic;
    }

    public String maleAnswer() {
        ArBotStorage outcome = new ArBotStorage();
        return outcome.getMaleName() + "\n" + outcome.getBirthDate() + "\n" + outcome.getCity();
    }

    public String femaleAnswer() {
        ArBotStorage outcome = new ArBotStorage();
        return outcome.getFemaleName() + "\n" + outcome.getBirthDate() + "\n" + outcome.getCity();
    }
}