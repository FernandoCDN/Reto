import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpParams} from "@angular/common/http";


@Injectable({
  providedIn: 'root'
})
export class WishproductsService {

  constructor(private http: HttpClient) {}


  getAllWishList(): Observable<any>
  {
    let params = new HttpParams();

    return this.http.get("http://localhost:8082/carvajal/productosdeseados/api/rest/wishproducts/get",
    {
      params: params
    });
  }

}
