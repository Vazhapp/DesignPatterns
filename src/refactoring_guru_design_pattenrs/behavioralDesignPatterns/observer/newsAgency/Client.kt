package refactoring_guru_design_pattenrs.behavioralDesignPatterns.observer.newsAgency

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.observer.newsAgency.observer.NewsOutlet
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.observer.newsAgency.subject.NewsAgency

fun main() {
    val newsAgency = NewsAgency()

    val outlet1 = NewsOutlet("BBC")
    val outlet2 = NewsOutlet("CNN")
    val outlet3 = NewsOutlet("FOX")

    newsAgency.addObserver(outlet1)
    newsAgency.addObserver(outlet2)

    newsAgency.publishArticle("Lorem Ipsum is simply dummy text.")

    newsAgency.removeObserver(outlet2)
    newsAgency.removeObserver(outlet1)

    newsAgency.publishArticle("Lorem Ipsum is simply dummy text.")

    newsAgency.addObserver(outlet3)
    newsAgency.publishArticle("Lorem Ipsum is simply dummy text.")
}