package com.tx.springboot_thymeleaf.cfg;

import java.util.ArrayList;
import java.util.List;

import com.tx.springboot_thymeleaf.interceptor.MyInterceptor1;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

@Configuration
@ServletComponentScan // 支持自定义web过滤器和servlet
public class WebConfig implements WebMvcConfigurer {

	@Bean
	public HttpMessageConverters httpMessageConverters() {
		FastJsonHttpMessageConverter fjhmc = new FastJsonHttpMessageConverter();
		fjhmc.setCharset(FastJsonHttpMessageConverter.UTF8);
		List<MediaType> types = new ArrayList<MediaType>();
		types.add(MediaType.APPLICATION_JSON_UTF8);
		fjhmc.setSupportedMediaTypes(types);
		fjhmc.setFeatures(SerializerFeature.WriteEnumUsingToString, SerializerFeature.WriteMapNullValue,
				SerializerFeature.QuoteFieldNames, SerializerFeature.PrettyFormat,
				SerializerFeature.WriteDateUseDateFormat, SerializerFeature.WriteNullNumberAsZero,
				SerializerFeature.WriteNullStringAsEmpty, SerializerFeature.DisableCircularReferenceDetect);
		return new HttpMessageConverters(fjhmc);
	}



	// 配置拦截器
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new MyInterceptor1()).addPathPatterns("/api/**").excludePathPatterns("/images/**",
				"/js/**");
	}
}
