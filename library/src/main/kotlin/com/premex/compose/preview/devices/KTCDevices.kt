package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KTC device specifications for Android Compose previews.
 *
 * This extension provides KTC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KTC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KTC: Any
  get() = object {
      /** KTC BLISS503 */
      val BLISS503 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** KTC Capricorn */
      val CAPRICORN = "spec:width=2160,height=3840,unit=px,dpi=560"

      /** KTC hongkong */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KTC lavender */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KTC Leo */
      val LEO = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** KTC mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** KTC Sagittarius */
      val SAGITTARIUS = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** KTC stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** KTC W83B-F2-RK3576 */
      val W83B_F2_RK3576 = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** KTC zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
