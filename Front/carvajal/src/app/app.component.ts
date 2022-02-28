import { Component } from '@angular/core';
import { WishproductsService } from './services/wishproducts.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'carvajal';

  productos: any;

  constructor(public wishProductsService: WishproductsService){}

  ngOnInit()
  {
    this.wishProductsService.getAllWishList().subscribe(response =>
      {
        this.productos = response;
        
        console.log(this.productos)
      }
    );
  }

}
