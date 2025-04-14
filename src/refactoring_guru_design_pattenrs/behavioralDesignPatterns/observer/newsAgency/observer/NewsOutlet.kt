package refactoring_guru_design_pattenrs.behavioralDesignPatterns.observer.newsAgency.observer

class NewsOutlet(private val channelName: String) : NewsObserver {
    override fun onNewsUpdate(article: String) {
        println("$channelName: $article")
    }
}