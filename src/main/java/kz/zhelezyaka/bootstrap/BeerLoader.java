package kz.zhelezyaka.bootstrap;

import kz.zhelezyaka.domain.Beer;
import kz.zhelezyaka.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {
    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count() == 0) {
            beerRepository.save(Beer.builder()
                    .beerName("Hodyzhenskoe")
                    .beerStyle("IPA")
                    .quantityToBrew(200)
                    .minOnHand(14)
                    .upc(125643234L)
                    .price(new BigDecimal("85.00"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Rudnenskoe")
                    .beerStyle("LAGER")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(23451289L)
                    .price(new BigDecimal("90.00"))
                    .build());
        }
    }
}
