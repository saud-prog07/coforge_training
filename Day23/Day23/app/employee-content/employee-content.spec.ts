import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeContent } from './employee-content';

describe('EmployeeContent', () => {
  let component: EmployeeContent;
  let fixture: ComponentFixture<EmployeeContent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [EmployeeContent],
    }).compileComponents();

    fixture = TestBed.createComponent(EmployeeContent);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
