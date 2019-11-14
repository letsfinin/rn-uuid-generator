import { NativeModules } from 'react-native';

const { uuidGenerator } = NativeModules;

export default {
  getUUID(callback) {
    if (callback) {
      uuidGenerator.getUUID(callback);
    }
    else {
      return new Promise((resolve, reject) => {
        uuidGenerator.getUUID(resolve);
      });
    }
  }
};
