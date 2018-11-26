/*******************************************************************************
 * Copyright 2016 Sistcoop, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.openfact.client.services.representations.idm;

import java.util.ArrayList;
import java.util.List;

public class SearchCriteriaRepresentation {

    private String filterText;
    private List<SearchCriteriaFilterRepresentation> filters = new ArrayList<>();
    private List<OrderByRepresentation> orders = new ArrayList<>();
    private PagingRepresentation paging;

    public SearchCriteriaRepresentation() {
    }

    public SearchCriteriaRepresentation(Builder builder) {
        this.filterText = builder.filterText;
        this.filters = builder.filters;
        this.orders = builder.orders;
        this.paging = builder.paging;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getFilterText() {
        return filterText;
    }

    public void setFilterText(String filterText) {
        this.filterText = filterText;
    }

    public List<SearchCriteriaFilterRepresentation> getFilters() {
        return filters;
    }

    public void setFilters(List<SearchCriteriaFilterRepresentation> filters) {
        this.filters = filters;
    }

    public List<OrderByRepresentation> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderByRepresentation> orders) {
        this.orders = orders;
    }

    public PagingRepresentation getPaging() {
        return paging;
    }

    public void setPaging(PagingRepresentation paging) {
        this.paging = paging;
    }

    public static class Builder {
        private String filterText;
        private List<SearchCriteriaFilterRepresentation> filters = new ArrayList<>();
        private List<OrderByRepresentation> orders = new ArrayList<>();
        private PagingRepresentation paging;

        public Builder filterText(String filterText) {
            this.filterText = filterText;
            return this;
        }

        private FilterBuilder addFilter() {
            return new FilterBuilder(Builder.this);
        }

        public Builder addFilter_DocumentType(DocumentType value) {
            return new FilterBuilder(Builder.this)
                    .name("documentType")
                    .value(value.toString())
                    .operator(SearchCriteriaFilterOperatorRepresentation.eq)
                    .filterEnd();
        }

        public Builder addFilter_DocumentStatus(DocumentStatus value) {
            return new FilterBuilder(Builder.this)
                    .name("status")
                    .value(value.toString())
                    .operator(SearchCriteriaFilterOperatorRepresentation.eq)
                    .filterEnd();
        }

        public Builder addFilter_DocumentIdStartsWith(String value) {
            return new FilterBuilder(Builder.this)
                    .name("documentId")
                    .value(value + "*")
                    .operator(SearchCriteriaFilterOperatorRepresentation.eq)
                    .filterEnd();
        }

        public OrderByBuilder addOrder() {
            return new OrderByBuilder(Builder.this);
        }

        public Builder paging(int page, int pageSize) {
            paging = new PagingRepresentation();
            paging.setPage(page);
            paging.setPageSize(pageSize);
            return this;
        }

        public SearchCriteriaRepresentation build() {
            return new SearchCriteriaRepresentation(this);
        }

    }

    public static class FilterBuilder {
        private Builder builder;
        private SearchCriteriaFilterRepresentation filter;

        public FilterBuilder(Builder builder) {
            this.builder = builder;
            filter = new SearchCriteriaFilterRepresentation();
        }

        public FilterBuilder name(String name) {
            this.filter.setName(name);
            return this;
        }

        public FilterBuilder value(Object value) {
            this.filter.setValue(value);
            return this;
        }

        public FilterBuilder operator(SearchCriteriaFilterOperatorRepresentation operator) {
            this.filter.setOperator(operator);
            return this;
        }

        public FilterBuilder type(SearchCriteriaFilterRepresentation.FilterValueType type) {
            this.filter.setType(type);
            return this;
        }

        public Builder filterEnd() {
            builder.filters.add(filter);
            return builder;
        }
    }

    public static class OrderByBuilder {
        private Builder builder;
        private OrderByRepresentation orderBy;

        public OrderByBuilder(Builder builder) {
            this.builder = builder;
            orderBy = new OrderByRepresentation();
        }

        public OrderByBuilder name(String name) {
            this.orderBy.setName(name);
            return this;
        }

        public OrderByBuilder ascending(boolean ascemding) {
            this.orderBy.setAscending(ascemding);
            return this;
        }

        public Builder oderByEnd() {
            builder.orders.add(orderBy);
            return builder;
        }
    }
}
