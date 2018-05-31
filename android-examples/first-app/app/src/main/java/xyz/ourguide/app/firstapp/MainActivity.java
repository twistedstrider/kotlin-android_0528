package xyz.ourguide.app.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

// # 기존 안드로이드 프로젝트에 코틀린 지원 추가하기.
// gradle
//    build.gradle(project)
//     - build.gradle(app)

// 1. 프로젝트 수준 build.gradle 파일에 classpath 추가
// classpath 'org.jetbrains.kotlin:kotlin-gradle-plugin:1.2.41'

// 2. 모듈(app) 수준 build.gradle 파일에 코틀린 플러그인 적용
// apply plugin: 'kotlin-android'

// 3. 모듈(app) 수준 build.gradle 파일에 의존성 추가
// implementation 'org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.2.41'

// 4. java 코드와 kotlin 코드를 별도의 디렉토리로 분리해서 사용하는 것이 좋다.
/*
  sourceSets {
        main.java.srcDirs += 'src/main/kotlin'
  }
*/


/*
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
*/