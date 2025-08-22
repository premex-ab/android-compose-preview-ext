package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MEDIACOM device specifications for Android Compose previews.
 *
 * This extension provides MEDIACOM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MEDIACOM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MEDIACOM: Any
  get() = object {
      /** MEDIACOM AZIMUT_4 */
      val AZIMUT_4 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** MEDIACOM M-SP10KID */
      val M_SP10KID = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MEDIACOM M-SP1AZ2TW */
      val M_SP1AZ2TW = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** MEDIACOM M-SP1AZ3 */
      val M_SP1AZ3 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** MEDIACOM M-SP1AZ3L */
      val M_SP1AZ3L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MEDIACOM M-SP1AZ3L2 */
      val M_SP1AZ3L2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MEDIACOM M-SP1AZ3P */
      val M_SP1AZ3P = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** MEDIACOM M-SP1EY_EEA */
      val M_SP1EY_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MEDIACOM M-SP1X10 */
      val M_SP1X10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MEDIACOM M-SP8DY_EEA */
      val M_SP8DY_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MEDIACOM M-SP8EY */
      val M_SP8EY = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MEDIACOM M-SP8GY */
      val M_SP8GY = "spec:width=800,height=1280,unit=px,dpi=240"

      /** MEDIACOM M-SP8KID */
      val M_SP8KID = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MEDIACOM SP1AZ4_L */
      val SP1AZ4_L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MEDIACOM SP1AZ4_P */
      val SP1AZ4_P = "spec:width=1200,height=2000,unit=px,dpi=280"

  }
