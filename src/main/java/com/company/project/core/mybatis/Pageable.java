package com.company.project.core.mybatis;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 查询分页和排序条件封装，主要用于适配 0序与 1序之间的转换。
 *
 * @author ZhangNima
 */
public class Pageable {
    private static final int DEFAULT_PAGE = 0;
    private static final int DEFAULT_PAGE_SIZE = 0;

    private int page = DEFAULT_PAGE;
    private int size = DEFAULT_PAGE_SIZE;
    private List<String> sort;

    public Pageable() {

    }

    public Pageable(int page, int size) {
        this.page = page;
        this.size = size;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageNumber() {
        return page > 0 ? page - 1 : 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<String> getSort() {
        return sort;
    }

    public void setSort(List<String> sort) {
        this.sort = sort;
    }

    /**
     * 获取当前查询条件中的分页信息。
     *
     * @return 当前查询条件中的分页信息
     */
    public String getOrderBy() {
        if (sort == null || sort.isEmpty()) {
            return null;
        }

        // @formatter:off
        return sort.stream().map(s -> {
            String property = s;
            String direction = "ASC";
            if (s.startsWith("-")) {
                property = s.substring(1);
                direction = "DESC";
            }
            return String.format("%s %s", asUnderscoreString(property), direction);
        }).collect(Collectors.joining(" "));
        // @formatter:on
    }

    private String asUnderscoreString(String input) {
        if (input == null) {
            return null;
        }

        int length = input.length();
        StringBuilder result = new StringBuilder(length * 2);
        int resultLength = 0;
        boolean wasPrevTranslated = false;
        for (int i = 0; i < length; i++) {
            char c = input.charAt(i);
            if (i > 0 || c != '_') {
                if (Character.isUpperCase(c)) {
                    if (!wasPrevTranslated && resultLength > 0 && result.charAt(resultLength - 1) != '_') {
                        result.append('_');
                        resultLength++;
                    }
                    c = Character.toLowerCase(c);
                    wasPrevTranslated = true;
                } else {
                    wasPrevTranslated = false;
                }
                result.append(c);
                resultLength++;
            }
        }
        return resultLength > 0 ? result.toString() : input;
    }

    @Override
    public String toString() {
        return "{\"Pageable\":{" + "\"page\":\"" + page + "\"" + ", \"size\":\"" + size + "\"" + ", \"sort\":" + sort + "}}";
    }

}
