package task.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class WorkUser extends Entity {
    private String name;
    private String job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkUser workUser = (WorkUser) o;
        return Objects.equals(name, workUser.name) &&
                Objects.equals(job, workUser.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, job);
    }

    public static final class WorkUserBuilder {
        protected Long id;
        private String name;
        private String job;
        private LocalDateTime createdAt;

        private WorkUserBuilder() {
        }

        public static WorkUserBuilder aWorkUser() {
            return new WorkUserBuilder();
        }

        public WorkUserBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public WorkUserBuilder withJob(String job) {
            this.job = job;
            return this;
        }

        public WorkUserBuilder withCreatedAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public WorkUserBuilder withId(Long id) {
            this.id = id;
            return this;
        }

        public WorkUser build() {
            WorkUser workUser = new WorkUser();
            workUser.setName(name);
            workUser.setJob(job);
            workUser.setId(id);
            return workUser;
        }
    }
}
