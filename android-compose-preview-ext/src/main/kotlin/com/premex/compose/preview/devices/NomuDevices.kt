package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NOMU device specifications for Android Compose previews.
 *
 * This extension provides NOMU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nomu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nomu: Any
  get() = object {
      /** NOMU G200 */
      val G200 = "spec:width=720,height=1600,unit=px,dpi=240"

      /** NOMU M8 */
      val M8 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** NOMU S10 */
      val S10 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** NOMU S50_Pro */
      val S50_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** NOMU T20 */
      val T20 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** NOMU V31 */
      val V31 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** NOMU V31D */
      val V31D = "spec:width=720,height=1440,unit=px,dpi=320"

      /** NOMU V31E */
      val V31E = "spec:width=720,height=1440,unit=px,dpi=320"

      /** NOMU V58 */
      val V58 = "spec:width=720,height=1520,unit=px,dpi=320"

  }
