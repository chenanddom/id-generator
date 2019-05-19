package com.generator.client;

import com.generator.api.service.GeneratorRemoteService;
import feign.hystrix.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@FeignClient(name = "" ,fallback = Object.class)
public interface GeneratorClient extends GeneratorRemoteService {

@Component
public class GeneratorClientFallback implements FallbackFactory<GeneratorClient>{

    @Override
    public GeneratorClient create(Throwable throwable) {
        return new GeneratorClient() {
            @Override
            public String getId() {
                return null;
            }
        };
    }
}


}
