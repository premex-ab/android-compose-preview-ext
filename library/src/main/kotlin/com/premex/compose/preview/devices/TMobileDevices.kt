package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * T-Mobile device specifications for Android Compose previews.
 *
 * This extension provides T-Mobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TMobile: Any
  get() = object {
      /** T-Mobile Augusta */
      val AUGUSTA = "spec:width=720,height=1640,unit=px,dpi=280"

      /** T-Mobile Bethpage */
      val BETHPAGE = "spec:width=720,height=1600,unit=px,dpi=280"

      /** T-Mobile CypressPoint */
      val CYPRESSPOINT = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** T-Mobile Newcastle */
      val NEWCASTLE = "spec:width=720,height=1600,unit=px,dpi=280"

      /** T-Mobile Pinehurst */
      val PINEHURST = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** T-Mobile Porto */
      val PORTO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** T-Mobile Seattle_5G */
      val SEATTLE_5G = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** T-Mobile SouthernDunes */
      val SOUTHERNDUNES = "spec:width=720,height=1640,unit=px,dpi=280"

      /** T-Mobile Sprout */
      val SPROUT = "spec:width=720,height=1640,unit=px,dpi=320"

      /** T-Mobile Tokyo_Lite_4G */
      val TOKYO_LITE_4G = "spec:width=720,height=1520,unit=px,dpi=280"

      /** T-Mobile TorreyPines */
      val TORREYPINES = "spec:width=720,height=1600,unit=px,dpi=280"

      /** T-Mobile T-Tab */
      val T_TAB = "spec:width=800,height=1280,unit=px,dpi=213"

  }
