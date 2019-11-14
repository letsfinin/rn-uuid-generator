# rn-uuid-generator

A react native based native module for generating Unique User IDentity (UUID). This module is MIT Licensed and is meant for anyone who wants to get 

## Getting started

`$ npm install rn-uuid-generator --save`

### Expo Managed Application

Sorry, this module does not support Expo, you might like to check any other ways of generating UUIDs inside your application.

### Self Managed React Native Application

`$ react-native link rn-uuid-generator`

-> If this does not seem to work, you can try the following approaches for iOS & Android respectively.

#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `rn-uuid-generator` and add `uuidGenerator.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNuuidGenerator.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainApplication.java`
  - Add `import io.github.traviskn.rnuuidgenerator.uuidGeneratorPackage;` to the imports at the top of the file
  - Add `new uuidGeneratorPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  ```
    include ':rn-uuid-generator'
    project(':rn-uuid-generator').projectDir = new File(rootProject.projectDir,   '../node_modules/rn-uuid-generator/android')
  ```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  ```
    compile project(':rn-uuid-generator')
  ```

## Usage

```javascript
import uuidGenerator from 'rn-uuid-generator';

// Callback interface
uuidGenerator.getUUID((uuid) => {
  console.log(uuid);
});

// Promise interface
uuidGenerator.getUUID()
  .then((uuid) => {
    console.log(uuid);
    });
```
