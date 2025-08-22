package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KEMPLER_STRAUSS device specifications for Android Compose previews.
 *
 * This extension provides KEMPLER_STRAUSS device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KEMPLERSTRAUSS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KEMPLERSTRAUSS: Any
  get() = object {
      /** KEMPLER_STRAUSS KEMPLER_9 */
      val KEMPLER_9 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KEMPLER_STRAUSS KEMPLER_P1 */
      val KEMPLER_P1 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** KEMPLER_STRAUSS KEMPLER_P1_AMATEUR_PLUS */
      val KEMPLER_P1_AMATEUR_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** KEMPLER_STRAUSS KEMPLER_P3 */
      val KEMPLER_P3 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** KEMPLER_STRAUSS KEMPLER_X */
      val KEMPLER_X = "spec:width=720,height=1440,unit=px,dpi=320"

      /** KEMPLER_STRAUSS P1pro */
      val P1PRO = "spec:width=720,height=1520,unit=px,dpi=320"

      /** KEMPLER_STRAUSS P1_Amateur */
      val P1_AMATEUR = "spec:width=480,height=854,unit=px,dpi=240"

      /** KEMPLER_STRAUSS ZKEMPLER */
      val ZKEMPLER = "spec:width=600,height=1024,unit=px,dpi=160"

      /** KEMPLER_STRAUSS ZKEMPLER11 */
      val ZKEMPLER11 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** KEMPLER_STRAUSS ZKEMPLER11PRO */
      val ZKEMPLER11PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** KEMPLER_STRAUSS ZKEMPLER_11PRO */
      val ZKEMPLER_11PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** KEMPLER_STRAUSS ZKEMPLER_MAX */
      val ZKEMPLER_MAX = "spec:width=600,height=1024,unit=px,dpi=160"

      /** KEMPLER_STRAUSS ZKEMPLER_PLUS */
      val ZKEMPLER_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** KEMPLER_STRAUSS ZKEMPLER_PRO */
      val ZKEMPLER_PRO = "spec:width=600,height=1024,unit=px,dpi=160"

  }
