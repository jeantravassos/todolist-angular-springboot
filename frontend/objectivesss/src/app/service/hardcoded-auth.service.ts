import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HardcodedAuthService {

  constructor() { }

  authenticate(user, password) {
    //console.log('before ' + this.isUserLoggedIn());
    if (user === "jean" && password==="123"){
      sessionStorage.setItem('authenticadedUser', user);

      // console.log('after ' + this.isUserLoggedIn());
      return true;
    }
    return false;
  }

  isUserLoggedIn() {
    let user = sessionStorage.getItem('authenticadedUser');
    return !(user === null); 
  }

  logout() {
    sessionStorage.removeItem("authenticadedUser");
  }

}
