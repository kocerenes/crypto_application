# Crypto Application



Libraries Used
--------------
* [Architecture][10] - Start with classes for managing your UI component lifecycle and handling data
  persistence.
  * [Repository][18] - Repository modules handle data operations.
  * [ViewModel][17] - Easily schedule asynchronous tasks for optimal execution.
  * [View Binding][11] - a feature that allows you to more easily write code that interacts with views.
  * [Data Binding][13] - The Data Binding Library is a support library that allows you to bind UI components in your layouts to data sources in your app using a declarative format rather than programmatically.
  * [Navigation][50] - Handle everything needed for in-app navigation.
     asynchronous tasks for optimal execution.
  * [Coroutines][51] - A coroutine is a concurrency design pattern that you can use on Android to simplify code that executes asynchronously.
  * [livedata][52] - is an observable data holder class. Unlike a regular observable, LiveData is lifecycle-aware, meaning it respects the lifecycle of other app components, such as activities, fragments, or services.
  
* [UI][30] - Details on why and how to use UI Components in your apps - together or separate
  * [Fragment][34] - A basic unit of composable UI.
  * [Layout][35] - Lay out widgets using different algorithms.
  
* Third party and miscellaneous libraries
  * [Retrofit][90] for turns your HTTP API into a Java interface
  * [Coil][92] for image loading
  * [Dagger-Hilt][93] Hilt is the recommended solution for dependency injection in Android apps, and works seamlessly with Compose.


[11]: https://developer.android.com/topic/libraries/view-binding
[52]: https://developer.android.com/topic/libraries/architecture/livedata
[13]: https://developer.android.com/topic/libraries/data-binding
[51]: https://developer.android.com/kotlin/coroutines
[50]: https://developer.android.com/topic/libraries/architecture/navigation/
[10]: https://developer.android.com/jetpack/compose/architecture
[17]: https://developer.android.com/jetpack/compose/state#viewmodel-state
[18]: https://developer.android.com/jetpack/guide#fetch-data
[90]: https://square.github.io/retrofit/
[92]: https://coil-kt.github.io/coil/compose/
[93]: https://developer.android.com/jetpack/compose/libraries#hilt
[30]: https://developer.android.com/guide/topics/ui
[34]: https://developer.android.com/guide/components/fragments
[35]: https://developer.android.com/guide/topics/ui/declaring-layout
