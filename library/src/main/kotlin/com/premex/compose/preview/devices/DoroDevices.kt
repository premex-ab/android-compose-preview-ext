package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Doro device specifications for Android Compose previews.
 *
 * This extension provides Doro device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Doro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Doro: Any
  get() = object {
      /** Doro Doro_8020x */
      val DORO_8020X = "spec:width=480,height=854,unit=px,dpi=240"

      /** Doro DSB0010 */
      val DSB0010 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Doro DSB0090 */
      val DSB0090 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Doro DSB0170 */
      val DSB0170 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Doro DSB0220 */
      val DSB0220 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Doro DSB0230 */
      val DSB0230 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Doro DSB0400 */
      val DSB0400 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Doro DSB0440 */
      val DSB0440 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Doro DSB0550 */
      val DSB0550 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Doro DSB0560 */
      val DSB0560 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Doro DSC0540 */
      val DSC0540 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Doro DTO0410 */
      val DTO0410 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Doro Liberto820 */
      val LIBERTO820 = "spec:width=540,height=960,unit=px,dpi=240"

      /** Doro 820Mini */
      val _820MINI = "spec:width=480,height=800,unit=px,dpi=240"

      /** Doro 825A */
      val _825A = "spec:width=720,height=1280,unit=px,dpi=320"

  }
