package refactoring_guru_design_pattenrs.behavioralDesignPatterns.observer.newsAgency.observer

interface NewsObserver {
    fun onNewsUpdate(article: String)
}