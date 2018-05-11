Spring 依赖注入最大的亮点就是你所有的 bean 对spring 容器的存在是没有意识的，你可以将容器替换成其他的容器，例如 Google Guice
此时 Bean 之间的耦合度很低。  

但是有时候，你必须使用 Spring 容器本身的功能，这时候你的 bean 必须意识到 Spring 容器的存在，这就是 Spring Aware ,如果使用了 Spring Aware 你的 bean 就回和 Spring 框架耦合