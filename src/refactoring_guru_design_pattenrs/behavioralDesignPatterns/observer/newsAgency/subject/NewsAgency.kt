package refactoring_guru_design_pattenrs.behavioralDesignPatterns.observer.newsAgency.subject

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.observer.newsAgency.observer.NewsObserver

class NewsAgency {
    private val observers = mutableListOf<NewsObserver>()
    private var lastArticle: String? = null

    fun addObserver(observer: NewsObserver) {
        observers.add(observer)
    }

    fun removeObserver(observer: NewsObserver) {
        observers.remove(observer)
    }

    fun publishArticle(article: String) {
        lastArticle = article
        notiftyObservers()
    }

    private fun notiftyObservers() {
        observers.forEach { observer -> observer.onNewsUpdate(lastArticle ?: "No news available") }
    }
}