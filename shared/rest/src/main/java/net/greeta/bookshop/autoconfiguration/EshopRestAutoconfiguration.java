package net.greeta.bookshop.autoconfiguration;

import net.greeta.bookshop.config.GlobalConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(GlobalConfiguration.class)
public class EshopRestAutoconfiguration {
}
