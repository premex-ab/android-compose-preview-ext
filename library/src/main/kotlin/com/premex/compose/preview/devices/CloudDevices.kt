package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Cloud device specifications for Android Compose previews.
 *
 * This extension provides Cloud device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cloud.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cloud: Any
  get() = object {
      /** Cloud Cyclone_C4 */
      val CYCLONE_C4 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Cloud Storm_C3 */
      val STORM_C3 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Cloud Stratus_C5 */
      val STRATUS_C5 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Cloud Stratus_C5_Elite */
      val STRATUS_C5_ELITE = "spec:width=480,height=960,unit=px,dpi=240"

      /** Cloud Sunshine_T1 */
      val SUNSHINE_T1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Cloud Sunshine_T1_Elite */
      val SUNSHINE_T1_ELITE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Cloud Typhoon_C6 */
      val TYPHOON_C6 = "spec:width=540,height=960,unit=px,dpi=240"

  }
