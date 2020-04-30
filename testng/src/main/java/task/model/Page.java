package task.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Page {
    private Integer page;
    @SerializedName("per_page")
    private Integer perPage;
    private Integer total;
    @SerializedName("total_pages")
    private Integer totalPages;
    @SerializedName("data")
    private List<User> users;

    public Integer getPage() {
        return page;
    }

    public Integer getPerPage() {
        return perPage;
    }

    public Integer getTotal() {
        return total;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public List<User> getUsers() {
        return users;
    }
}
