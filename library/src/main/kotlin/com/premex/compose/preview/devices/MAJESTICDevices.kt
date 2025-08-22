package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MAJESTIC device specifications for Android Compose previews.
 *
 * This extension provides MAJESTIC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MAJESTIC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MAJESTIC: Any
  get() = object {
      /** MAJESTIC JACK */
      val JACK = "spec:width=480,height=960,unit=px,dpi=240"

      /** MAJESTIC JOE */
      val JOE = "spec:width=480,height=960,unit=px,dpi=240"

      /** MAJESTIC lasalle */
      val LASALLE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** MAJESTIC TAB_611_3G */
      val TAB_611_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** MAJESTIC TAB_711_4G */
      val TAB_711_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MAJESTIC TAB-714 */
      val TAB_714 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MAJESTIC TAB_720_PLUS */
      val TAB_720_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MAJESTIC TAB-746 */
      val TAB_746 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** MAJESTIC TAB_811_4G */
      val TAB_811_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MAJESTIC TAB_812_4G */
      val TAB_812_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MAJESTIC TAB_814 */
      val TAB_814 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MAJESTIC TAB_847_3G */
      val TAB_847_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** MAJESTIC TAB_911_3G */
      val TAB_911_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** MAJESTIC TAB_912_4G */
      val TAB_912_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MAJESTIC TAB_912_PRO_4G */
      val TAB_912_PRO_4G = "spec:width=800,height=1280,unit=px,dpi=180"

      /** MAJESTIC TAB_914 */
      val TAB_914 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MAJESTIC TAB_915_4G */
      val TAB_915_4G = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** MAJESTIC TAB_916_4G */
      val TAB_916_4G = "spec:width=800,height=1280,unit=px,dpi=180"

      /** MAJESTIC TAB_918_PRO_4G */
      val TAB_918_PRO_4G = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** MAJESTIC TAB_920_PLUS_4G */
      val TAB_920_PLUS_4G = "spec:width=800,height=1280,unit=px,dpi=213"

  }
