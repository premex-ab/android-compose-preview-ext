package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TECNO-Mobile device specifications for Android Compose previews.
 *
 * This extension provides TECNO-Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TECNOMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TECNOMobile: Any
  get() = object {
      /** TECNO-Mobile TECNO-Mobile-BF7n */
      val TECNO_MOBILE_BF7N = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO-Mobile TECNO-Mobile-BG6 */
      val TECNO_MOBILE_BG6 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO-Mobile TECNO-Mobile-BG7n */
      val TECNO_MOBILE_BG7N = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO-Mobile TECNO-Mobile-CH6i */
      val TECNO_MOBILE_CH6I = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO-Mobile TECNO-Mobile-CH6n */
      val TECNO_MOBILE_CH6N = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO-Mobile TECNO-Mobile-CI6n */
      val TECNO_MOBILE_CI6N = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO-Mobile TECNO-Mobile-KG5k */
      val TECNO_MOBILE_KG5K = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO-Mobile TECNO-Mobile-KG6k */
      val TECNO_MOBILE_KG6K = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO-Mobile TECNO-Mobile-KG6p */
      val TECNO_MOBILE_KG6P = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** TECNO-Mobile TECNO-Mobile-KG8 */
      val TECNO_MOBILE_KG8 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO-Mobile TECNO-Mobile-KI5q */
      val TECNO_MOBILE_KI5Q = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO-Mobile TECNO-Mobile-KJ5n */
      val TECNO_MOBILE_KJ5N = "spec:width=1080,height=2248,unit=px,dpi=480"

      /** TECNO-Mobile TECNO-Mobile-KJ6 */
      val TECNO_MOBILE_KJ6 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO-Mobile TECNO-Mobile-KJ7 */
      val TECNO_MOBILE_KJ7 = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** TECNO-Mobile TECNO-Mobile-KL5n */
      val TECNO_MOBILE_KL5N = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO-Mobile TECNO-Mobile-LG6n */
      val TECNO_MOBILE_LG6N = "spec:width=720,height=1640,unit=px,dpi=320"

      /** TECNO-Mobile TECNO-Mobile-LH8n */
      val TECNO_MOBILE_LH8N = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO-Mobile TECNO-Mobile-LI6 */
      val TECNO_MOBILE_LI6 = "spec:width=1080,height=2460,unit=px,dpi=480"

  }
