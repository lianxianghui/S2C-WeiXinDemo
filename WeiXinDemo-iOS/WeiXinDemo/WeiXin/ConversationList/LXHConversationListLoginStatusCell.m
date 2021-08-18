// LXHConversationListLoginStatusCell.m
// WeiXinDemo
//
//  Created by lianxianghui on 21-08-18
//  Generated by Sketch2Code
//  Copyright © 2021年 lianxianghui. All rights reserved.


#import "LXHConversationListLoginStatusCell.h"
#import "Masonry.h"

#define UIColorFromRGBA(rgbaValue) \
[UIColor colorWithRed:((rgbaValue & 0xFF000000) >> 24)/255.0 \
        green:((rgbaValue & 0x00FF0000) >>  16)/255.0 \
        blue:((rgbaValue & 0x0000FF00) >>  8)/255.0 \
        alpha:(rgbaValue & 0x000000FF)/255.0]

@interface LXHConversationListLoginStatusCell()
@end

@implementation LXHConversationListLoginStatusCell

- (instancetype)initWithFrame:(CGRect)frame {
    self = [super initWithFrame:frame];
    if (self) {
        self.backgroundColor = UIColorFromRGBA(0xFFFFFF00);
        self.alpha = 1;
        [self addSubviews];
        [self makeConstraints];
    }
    return self;
}

- (void)addSubviews {
    [self addSubview:self.statusImage];
    [self addSubview:self.statusLabel];
}

- (void)makeConstraints {
    [self.statusImage mas_makeConstraints:^(MASConstraintMaker *make) {
        make.left.equalTo(self.mas_left).offset(10);
        make.centerY.equalTo(self.mas_centerY);
        make.width.mas_equalTo(35);
        make.height.mas_equalTo(28);
    }];
    [self.statusLabel mas_makeConstraints:^(MASConstraintMaker *make) {
        make.right.equalTo(self.mas_right).offset(-10);
        make.centerY.equalTo(self.mas_centerY);
        make.left.equalTo(self.statusImage.mas_right).offset(17);
    }];
}

//Getters
- (UIImageView *)statusImage {
    if (!_statusImage) {
        _statusImage = [[UIImageView alloc] init];
        _statusImage.alpha = 1;
        _statusImage.image = [UIImage imageNamed:@"weixin_conversation_list_login_status_cell_status_image"];
    }
    return _statusImage;
}

- (UILabel *)statusLabel {
    if (!_statusLabel) {
        _statusLabel = [[UILabel alloc] init];
        _statusLabel.backgroundColor = UIColorFromRGBA(0xFFFFFF00);
        _statusLabel.alpha = 1;

        _statusLabel.numberOfLines = 0;
        NSMutableAttributedString *attributedText = [NSMutableAttributedString new];
        UIFont *font = nil;
        NSMutableParagraphStyle *paragraphStyle = nil;
        NSMutableDictionary *textAttributes = nil;
        NSAttributedString *text = nil;

        font = [UIFont fontWithName:@".SFUIText-Regular" size:12];
        if (!font) font = [UIFont systemFontOfSize:12];
        paragraphStyle = [[NSMutableParagraphStyle alloc] init];
        paragraphStyle.alignment = NSTextAlignmentNatural;
        paragraphStyle.maximumLineHeight = 0;
        paragraphStyle.minimumLineHeight = 0;
        paragraphStyle.paragraphSpacing = 0;
        textAttributes = [NSMutableDictionary dictionary];
        [textAttributes setObject:UIColorFromRGBA(0x939396FF) forKey:NSForegroundColorAttributeName];
        [textAttributes setObject:font forKey:NSFontAttributeName];
        [textAttributes setObject:@(-0.534) forKey:NSKernAttributeName];
        [textAttributes setObject:paragraphStyle forKey:NSParagraphStyleAttributeName];
        text = [[NSAttributedString alloc] initWithString:NSLocalizedString(@"Mac", nil) attributes:textAttributes];
        [attributedText appendAttributedString:text];

        font = [UIFont fontWithName:@"PingFangSC-Regular" size:12];
        if (!font) font = [UIFont systemFontOfSize:12];
        paragraphStyle = [[NSMutableParagraphStyle alloc] init];
        paragraphStyle.alignment = NSTextAlignmentNatural;
        paragraphStyle.maximumLineHeight = 0;
        paragraphStyle.minimumLineHeight = 0;
        paragraphStyle.paragraphSpacing = 0;
        textAttributes = [NSMutableDictionary dictionary];
        [textAttributes setObject:UIColorFromRGBA(0x939396FF) forKey:NSForegroundColorAttributeName];
        [textAttributes setObject:font forKey:NSFontAttributeName];
        [textAttributes setObject:@(-0.534) forKey:NSKernAttributeName];
        [textAttributes setObject:paragraphStyle forKey:NSParagraphStyleAttributeName];
        text = [[NSAttributedString alloc] initWithString:NSLocalizedString(@"微信已登录，手机通知已关闭", nil) attributes:textAttributes];
        [attributedText appendAttributedString:text];

        _statusLabel.attributedText = attributedText;
    }
    return _statusLabel;
}


@end

