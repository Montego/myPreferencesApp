package utils;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.impl.*;

public class RunContext {

    public RunContext(){
        contextCome();
    };
    private static void contextCome() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        AuthorityService authorityService = context.getBean(AuthorityService.class);
        CategoryService categoryService = context.getBean(CategoryService.class);
        CountryService countryService = context.getBean(CountryService.class);
        FriendsService friendsService = context.getBean(FriendsService.class);
        GenreService genreService = context.getBean(GenreService.class);
        ItemService itemService = context.getBean(ItemService.class);
        RateService rateService = context.getBean(RateService.class);
        ScoreService scoreService = context.getBean(ScoreService.class);
        TypeService typeService = context.getBean(TypeService.class);
        UserService userService = context.getBean(UserService.class);
    }
}
