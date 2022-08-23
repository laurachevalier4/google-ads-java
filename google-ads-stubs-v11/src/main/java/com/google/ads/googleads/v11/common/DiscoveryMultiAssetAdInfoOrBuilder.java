// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/ad_type_infos.proto

package com.google.ads.googleads.v11.common;

public interface DiscoveryMultiAssetAdInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.common.DiscoveryMultiAssetAdInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Marketing image assets to be used in the ad. Valid image types are GIF,
   * JPEG, and PNG. The minimum size is 600x314 and the aspect ratio must
   * be 1.91:1 (+-1%). Required if square_marketing_images is
   * not present. Combined with `square_marketing_images` and
   * `portrait_marketing_images` the maximum is 20.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdImageAsset marketing_images = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v11.common.AdImageAsset> 
      getMarketingImagesList();
  /**
   * <pre>
   * Marketing image assets to be used in the ad. Valid image types are GIF,
   * JPEG, and PNG. The minimum size is 600x314 and the aspect ratio must
   * be 1.91:1 (+-1%). Required if square_marketing_images is
   * not present. Combined with `square_marketing_images` and
   * `portrait_marketing_images` the maximum is 20.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdImageAsset marketing_images = 1;</code>
   */
  com.google.ads.googleads.v11.common.AdImageAsset getMarketingImages(int index);
  /**
   * <pre>
   * Marketing image assets to be used in the ad. Valid image types are GIF,
   * JPEG, and PNG. The minimum size is 600x314 and the aspect ratio must
   * be 1.91:1 (+-1%). Required if square_marketing_images is
   * not present. Combined with `square_marketing_images` and
   * `portrait_marketing_images` the maximum is 20.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdImageAsset marketing_images = 1;</code>
   */
  int getMarketingImagesCount();
  /**
   * <pre>
   * Marketing image assets to be used in the ad. Valid image types are GIF,
   * JPEG, and PNG. The minimum size is 600x314 and the aspect ratio must
   * be 1.91:1 (+-1%). Required if square_marketing_images is
   * not present. Combined with `square_marketing_images` and
   * `portrait_marketing_images` the maximum is 20.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdImageAsset marketing_images = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v11.common.AdImageAssetOrBuilder> 
      getMarketingImagesOrBuilderList();
  /**
   * <pre>
   * Marketing image assets to be used in the ad. Valid image types are GIF,
   * JPEG, and PNG. The minimum size is 600x314 and the aspect ratio must
   * be 1.91:1 (+-1%). Required if square_marketing_images is
   * not present. Combined with `square_marketing_images` and
   * `portrait_marketing_images` the maximum is 20.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdImageAsset marketing_images = 1;</code>
   */
  com.google.ads.googleads.v11.common.AdImageAssetOrBuilder getMarketingImagesOrBuilder(
      int index);

  /**
   * <pre>
   * Square marketing image assets to be used in the ad. Valid image types are
   * GIF, JPEG, and PNG. The minimum size is 300x300 and the aspect ratio must
   * be 1:1 (+-1%). Required if marketing_images is not present.  Combined with
   * `marketing_images` and `portrait_marketing_images` the maximum is 20.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdImageAsset square_marketing_images = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v11.common.AdImageAsset> 
      getSquareMarketingImagesList();
  /**
   * <pre>
   * Square marketing image assets to be used in the ad. Valid image types are
   * GIF, JPEG, and PNG. The minimum size is 300x300 and the aspect ratio must
   * be 1:1 (+-1%). Required if marketing_images is not present.  Combined with
   * `marketing_images` and `portrait_marketing_images` the maximum is 20.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdImageAsset square_marketing_images = 2;</code>
   */
  com.google.ads.googleads.v11.common.AdImageAsset getSquareMarketingImages(int index);
  /**
   * <pre>
   * Square marketing image assets to be used in the ad. Valid image types are
   * GIF, JPEG, and PNG. The minimum size is 300x300 and the aspect ratio must
   * be 1:1 (+-1%). Required if marketing_images is not present.  Combined with
   * `marketing_images` and `portrait_marketing_images` the maximum is 20.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdImageAsset square_marketing_images = 2;</code>
   */
  int getSquareMarketingImagesCount();
  /**
   * <pre>
   * Square marketing image assets to be used in the ad. Valid image types are
   * GIF, JPEG, and PNG. The minimum size is 300x300 and the aspect ratio must
   * be 1:1 (+-1%). Required if marketing_images is not present.  Combined with
   * `marketing_images` and `portrait_marketing_images` the maximum is 20.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdImageAsset square_marketing_images = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v11.common.AdImageAssetOrBuilder> 
      getSquareMarketingImagesOrBuilderList();
  /**
   * <pre>
   * Square marketing image assets to be used in the ad. Valid image types are
   * GIF, JPEG, and PNG. The minimum size is 300x300 and the aspect ratio must
   * be 1:1 (+-1%). Required if marketing_images is not present.  Combined with
   * `marketing_images` and `portrait_marketing_images` the maximum is 20.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdImageAsset square_marketing_images = 2;</code>
   */
  com.google.ads.googleads.v11.common.AdImageAssetOrBuilder getSquareMarketingImagesOrBuilder(
      int index);

  /**
   * <pre>
   * Portrait marketing image assets to be used in the ad. Valid image types are
   * GIF, JPEG, and PNG. The minimum size is 480x600 and the aspect ratio must
   * be 4:5 (+-1%).  Combined with `marketing_images` and
   * `square_marketing_images` the maximum is 20.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdImageAsset portrait_marketing_images = 3;</code>
   */
  java.util.List<com.google.ads.googleads.v11.common.AdImageAsset> 
      getPortraitMarketingImagesList();
  /**
   * <pre>
   * Portrait marketing image assets to be used in the ad. Valid image types are
   * GIF, JPEG, and PNG. The minimum size is 480x600 and the aspect ratio must
   * be 4:5 (+-1%).  Combined with `marketing_images` and
   * `square_marketing_images` the maximum is 20.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdImageAsset portrait_marketing_images = 3;</code>
   */
  com.google.ads.googleads.v11.common.AdImageAsset getPortraitMarketingImages(int index);
  /**
   * <pre>
   * Portrait marketing image assets to be used in the ad. Valid image types are
   * GIF, JPEG, and PNG. The minimum size is 480x600 and the aspect ratio must
   * be 4:5 (+-1%).  Combined with `marketing_images` and
   * `square_marketing_images` the maximum is 20.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdImageAsset portrait_marketing_images = 3;</code>
   */
  int getPortraitMarketingImagesCount();
  /**
   * <pre>
   * Portrait marketing image assets to be used in the ad. Valid image types are
   * GIF, JPEG, and PNG. The minimum size is 480x600 and the aspect ratio must
   * be 4:5 (+-1%).  Combined with `marketing_images` and
   * `square_marketing_images` the maximum is 20.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdImageAsset portrait_marketing_images = 3;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v11.common.AdImageAssetOrBuilder> 
      getPortraitMarketingImagesOrBuilderList();
  /**
   * <pre>
   * Portrait marketing image assets to be used in the ad. Valid image types are
   * GIF, JPEG, and PNG. The minimum size is 480x600 and the aspect ratio must
   * be 4:5 (+-1%).  Combined with `marketing_images` and
   * `square_marketing_images` the maximum is 20.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdImageAsset portrait_marketing_images = 3;</code>
   */
  com.google.ads.googleads.v11.common.AdImageAssetOrBuilder getPortraitMarketingImagesOrBuilder(
      int index);

  /**
   * <pre>
   * Logo image assets to be used in the ad. Valid image types are GIF,
   * JPEG, and PNG. The minimum size is 128x128 and the aspect ratio must be
   * 1:1(+-1%). At least 1 and max 5 logo images can be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdImageAsset logo_images = 4;</code>
   */
  java.util.List<com.google.ads.googleads.v11.common.AdImageAsset> 
      getLogoImagesList();
  /**
   * <pre>
   * Logo image assets to be used in the ad. Valid image types are GIF,
   * JPEG, and PNG. The minimum size is 128x128 and the aspect ratio must be
   * 1:1(+-1%). At least 1 and max 5 logo images can be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdImageAsset logo_images = 4;</code>
   */
  com.google.ads.googleads.v11.common.AdImageAsset getLogoImages(int index);
  /**
   * <pre>
   * Logo image assets to be used in the ad. Valid image types are GIF,
   * JPEG, and PNG. The minimum size is 128x128 and the aspect ratio must be
   * 1:1(+-1%). At least 1 and max 5 logo images can be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdImageAsset logo_images = 4;</code>
   */
  int getLogoImagesCount();
  /**
   * <pre>
   * Logo image assets to be used in the ad. Valid image types are GIF,
   * JPEG, and PNG. The minimum size is 128x128 and the aspect ratio must be
   * 1:1(+-1%). At least 1 and max 5 logo images can be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdImageAsset logo_images = 4;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v11.common.AdImageAssetOrBuilder> 
      getLogoImagesOrBuilderList();
  /**
   * <pre>
   * Logo image assets to be used in the ad. Valid image types are GIF,
   * JPEG, and PNG. The minimum size is 128x128 and the aspect ratio must be
   * 1:1(+-1%). At least 1 and max 5 logo images can be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdImageAsset logo_images = 4;</code>
   */
  com.google.ads.googleads.v11.common.AdImageAssetOrBuilder getLogoImagesOrBuilder(
      int index);

  /**
   * <pre>
   * Headline text asset of the ad. Maximum display width is 30. At least 1 and
   * max 5 headlines can be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdTextAsset headlines = 5;</code>
   */
  java.util.List<com.google.ads.googleads.v11.common.AdTextAsset> 
      getHeadlinesList();
  /**
   * <pre>
   * Headline text asset of the ad. Maximum display width is 30. At least 1 and
   * max 5 headlines can be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdTextAsset headlines = 5;</code>
   */
  com.google.ads.googleads.v11.common.AdTextAsset getHeadlines(int index);
  /**
   * <pre>
   * Headline text asset of the ad. Maximum display width is 30. At least 1 and
   * max 5 headlines can be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdTextAsset headlines = 5;</code>
   */
  int getHeadlinesCount();
  /**
   * <pre>
   * Headline text asset of the ad. Maximum display width is 30. At least 1 and
   * max 5 headlines can be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdTextAsset headlines = 5;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v11.common.AdTextAssetOrBuilder> 
      getHeadlinesOrBuilderList();
  /**
   * <pre>
   * Headline text asset of the ad. Maximum display width is 30. At least 1 and
   * max 5 headlines can be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdTextAsset headlines = 5;</code>
   */
  com.google.ads.googleads.v11.common.AdTextAssetOrBuilder getHeadlinesOrBuilder(
      int index);

  /**
   * <pre>
   * The descriptive text of the ad. Maximum display width is 90. At least 1 and
   * max 5 descriptions can be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdTextAsset descriptions = 6;</code>
   */
  java.util.List<com.google.ads.googleads.v11.common.AdTextAsset> 
      getDescriptionsList();
  /**
   * <pre>
   * The descriptive text of the ad. Maximum display width is 90. At least 1 and
   * max 5 descriptions can be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdTextAsset descriptions = 6;</code>
   */
  com.google.ads.googleads.v11.common.AdTextAsset getDescriptions(int index);
  /**
   * <pre>
   * The descriptive text of the ad. Maximum display width is 90. At least 1 and
   * max 5 descriptions can be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdTextAsset descriptions = 6;</code>
   */
  int getDescriptionsCount();
  /**
   * <pre>
   * The descriptive text of the ad. Maximum display width is 90. At least 1 and
   * max 5 descriptions can be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdTextAsset descriptions = 6;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v11.common.AdTextAssetOrBuilder> 
      getDescriptionsOrBuilderList();
  /**
   * <pre>
   * The descriptive text of the ad. Maximum display width is 90. At least 1 and
   * max 5 descriptions can be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdTextAsset descriptions = 6;</code>
   */
  com.google.ads.googleads.v11.common.AdTextAssetOrBuilder getDescriptionsOrBuilder(
      int index);

  /**
   * <pre>
   * The Advertiser/brand name. Maximum display width is 25. Required.
   * </pre>
   *
   * <code>optional string business_name = 7;</code>
   * @return Whether the businessName field is set.
   */
  boolean hasBusinessName();
  /**
   * <pre>
   * The Advertiser/brand name. Maximum display width is 25. Required.
   * </pre>
   *
   * <code>optional string business_name = 7;</code>
   * @return The businessName.
   */
  java.lang.String getBusinessName();
  /**
   * <pre>
   * The Advertiser/brand name. Maximum display width is 25. Required.
   * </pre>
   *
   * <code>optional string business_name = 7;</code>
   * @return The bytes for businessName.
   */
  com.google.protobuf.ByteString
      getBusinessNameBytes();

  /**
   * <pre>
   * Call to action text.
   * </pre>
   *
   * <code>optional string call_to_action_text = 8;</code>
   * @return Whether the callToActionText field is set.
   */
  boolean hasCallToActionText();
  /**
   * <pre>
   * Call to action text.
   * </pre>
   *
   * <code>optional string call_to_action_text = 8;</code>
   * @return The callToActionText.
   */
  java.lang.String getCallToActionText();
  /**
   * <pre>
   * Call to action text.
   * </pre>
   *
   * <code>optional string call_to_action_text = 8;</code>
   * @return The bytes for callToActionText.
   */
  com.google.protobuf.ByteString
      getCallToActionTextBytes();

  /**
   * <pre>
   * Boolean option that indicates if this ad must be served with lead form.
   * </pre>
   *
   * <code>optional bool lead_form_only = 9;</code>
   * @return Whether the leadFormOnly field is set.
   */
  boolean hasLeadFormOnly();
  /**
   * <pre>
   * Boolean option that indicates if this ad must be served with lead form.
   * </pre>
   *
   * <code>optional bool lead_form_only = 9;</code>
   * @return The leadFormOnly.
   */
  boolean getLeadFormOnly();
}
