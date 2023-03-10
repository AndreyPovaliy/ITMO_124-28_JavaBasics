package JavaBasics.Lesson_2.Bicycle;

public enum Type {
    MOUNTAIN_BIKE ("Это самый популярный и распространенный вид велосипеда. Предназначен для езды по бездорожью. "),
    BICYCLE_TWO_SUSPENSION ("По сути это тот же самый горный велосипед, но на таких байках амортизация присутствует как на переднем, так и на заднем колесе. Задняя амортизация гораздо сложнее передней (вилки)."),
    FAT_BIKE ("Фэтбайк — это велосипед с толстыми покрышками. По части геометрии рамы и посадке схож с горным велосипедом. Отличается повышенной проходимостью."),
    CYCLOCROSS_BIKE ("Синонимы: велокроссовый, циклокроссер. Внешне похож на шоссер, но есть отличия. Этот тип велосипеда адаптирован для быстрой езды по бездорожью. Отличается более прочной рамой и слегка измененной посадкой, покрышки зубастые, тормоза кантилеверные или дисковые (встречаются чаще)."),
    BIKE_TRIAL ("Сюда мы отнесли велосипеды типа BMX и триал. Триальные модели легко узнать, у них длинные, низкие и легкие рамы, нет седла, вынос длинный, а руль широкий. Задняя покрышка зачастую толще передней. Все это позволяет отлично держать баланс на заднем колесе и выполнять сложные спортивные трюки."),
    TRACK_BIKE ("Также известен как Track bicycle. Это специальный вид велосипеда, предназначенный для гонок на треке. На нем отсутствует трансмиссия и тормоза. Колесо связано с педалями, поэтому свободного хода нет. Крутятся педали — крутится и колесо. Руль баран — для достижения спортивной посадки."),
    CITY_BIKE ("Синонимы: citybike, ситибайк, дорожный велосипед. Классификация велосипедов городского типа довольно обширна. Если коротко, то это байки для поездок на работу и прогулок по парку"),
    HYBRID_BIKE ("Синонимы: Hybrid, гибрид, кроссовый велосипед. Виды велосипедов настолько богаты своим разнообразием, что понадобилось создать отдельный тип, который перенял в себя свойства горного, шоссейного и городского велосипеда. Формально это упрощенный горный байк, более приспособленный для езды по асфальту."),
    BICYCLE_TOURING("Синонимы: Touring, туристический велосипед. Эти типы велосипедов идеальны для туризма по асфальтовым дорогам. Внешне напоминает шоссейный тип за счет руля барана."),
    FOLDING_BIKE("Также извествен как Folding bike. Отличный вариант для передвижения по городу. За счет небольших колес велосипед легко складывается и его можно взять с собой в офис. Скорость, комфорт и управляемость держатся на среднем уровне из-за компактности.");

    private final String description;

    Type(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
