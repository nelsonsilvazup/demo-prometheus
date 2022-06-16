package com.example.demo.configuration;

import io.micrometer.core.instrument.Meter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.config.MeterFilter;
import io.micrometer.core.instrument.distribution.DistributionStatisticConfig;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;


//@Configuration
public class MicrometerConfig {
//    @Bean
//    public MeterRegistryCustomizer<MeterRegistry> metricsCommonTags() {
//        return registry -> registry.config()
//                .meterFilter(new MeterFilter() {
//
//                    @Override
//                    public DistributionStatisticConfig configure(Meter.Id id,
//                                                                 DistributionStatisticConfig config) {
//                        if (id.getName().startsWith("http.server.requests")) {
//                            return config.merge(DistributionStatisticConfig.builder()
//                                    .percentilesHistogram(true)
//                                    .percentiles(0.05, 0.1, 0.2, 0.5, 1)
//                                    .percentilePrecision(1)
//                                    .minimumExpectedValue(1L)
//                                    .maximumExpectedValue(Long.MAX_VALUE)
//                                    .expiry(Duration.ofMinutes(1))
//                                    .bufferLength(2)
//                                    .build());
//                        }
//                        return config;
//                    }
//                });
//    }
}
