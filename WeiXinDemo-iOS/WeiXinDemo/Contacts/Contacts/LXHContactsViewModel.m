// LXHContactsViewModel.m
// WeiXinDemo
//
//  Created by lianxianghui on 21-08-9
//  Generated by Sketch2Code
//  Copyright © 2021年 lianxianghui. All rights reserved.


#import "LXHContactsViewModel.h"

@interface LXHContactsViewModel ()
@property (nonatomic) NSMutableArray *cellDataArrayForListView;
@end

@implementation LXHContactsViewModel

- (instancetype)init {
    self = [super init];
    if (self) {
    }
    return self;
}

- (NSMutableArray *)cellDataArrayForListView {
    if (!_cellDataArrayForListView) {
        _cellDataArrayForListView = [NSMutableArray array];
        NSDictionary *dic = nil;
        dic = @{@"cellId":@"0", @"clickable":@"1", @"name":@"新的朋友", @"cellType":@"LXHContactCell", @"leftImage":@"contacts_contact_cell_left_image"};
        [_cellDataArrayForListView addObject:dic];
        dic = @{@"cellId":@"1", @"clickable":@"1", @"name":@"群聊", @"cellType":@"LXHContactCell", @"leftImage":@"contacts_contact_cell_left_image_9"};
        [_cellDataArrayForListView addObject:dic];
        dic = @{@"cellId":@"2", @"clickable":@"1", @"name":@"标签", @"cellType":@"LXHContactCell", @"leftImage":@"contacts_contact_cell_left_image_8"};
        [_cellDataArrayForListView addObject:dic];
        dic = @{@"cellId":@"3", @"clickable":@"1", @"name":@"公众号", @"cellType":@"LXHContactCell", @"leftImage":@"contacts_contact_cell_left_image_7"};
        [_cellDataArrayForListView addObject:dic];
        dic = @{@"label":@"A", @"cellId":@"0", @"clickable":@"1", @"cellType":@"LXHContactsIndexCell"};
        [_cellDataArrayForListView addObject:dic];
        dic = @{@"cellId":@"4", @"clickable":@"1", @"name":@"阿丁", @"cellType":@"LXHContactCell", @"leftImage":@"contacts_contact_cell_left_image_6"};
        [_cellDataArrayForListView addObject:dic];
        dic = @{@"cellId":@"5", @"clickable":@"1", @"name":@"阿连", @"cellType":@"LXHContactCell", @"leftImage":@"contacts_contact_cell_left_image_5"};
        [_cellDataArrayForListView addObject:dic];
        dic = @{@"cellId":@"6", @"clickable":@"1", @"name":@"阿明", @"cellType":@"LXHContactCell", @"leftImage":@"contacts_contact_cell_left_image_4"};
        [_cellDataArrayForListView addObject:dic];
        dic = @{@"cellId":@"7", @"clickable":@"1", @"name":@"阿连球", @"cellType":@"LXHContactCell", @"leftImage":@"contacts_contact_cell_left_image_3"};
        [_cellDataArrayForListView addObject:dic];
        dic = @{@"label":@"S", @"cellId":@"1", @"clickable":@"1", @"cellType":@"LXHContactsIndexCell"};
        [_cellDataArrayForListView addObject:dic];
        dic = @{@"cellId":@"8", @"clickable":@"1", @"name":@"司马缸砸缸", @"cellType":@"LXHContactCell", @"leftImage":@"contacts_contact_cell_left_image_2"};
        [_cellDataArrayForListView addObject:dic];
        dic = @{@"cellId":@"9", @"clickable":@"1", @"name":@"三趾树懒", @"cellType":@"LXHContactCell", @"leftImage":@"contacts_contact_cell_left_image_1"};
        [_cellDataArrayForListView addObject:dic];
    }
    return _cellDataArrayForListView;
}


@end
