package com.practice.useakka.pojo;

import com.practice.useakka.models.Additional;
import com.practice.useakka.models.Dish;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.eclipse.collections.api.factory.Lists;
import org.eclipse.collections.api.list.MutableList;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class DishDto {

    private Dish dish;

    private MutableList<Additional> additional;

    public static DishDto of(Dish dish, MutableList<Additional> additional) {
        return new DishDto(dish, additional);
    }

    public static DishDto of(Dish dish, Additional... additional) {
        return new DishDto(dish, Lists.mutable.of(additional));
    }

}