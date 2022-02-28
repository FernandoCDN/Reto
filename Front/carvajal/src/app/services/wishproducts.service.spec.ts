import { TestBed } from '@angular/core/testing';

import { WishproductsService } from './wishproducts.service';

describe('WishproductsService', () => {
  let service: WishproductsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(WishproductsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
