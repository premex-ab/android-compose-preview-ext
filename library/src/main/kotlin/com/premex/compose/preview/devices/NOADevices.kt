package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NOA device specifications for Android Compose previews.
 *
 * This extension provides NOA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NOA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NOA: Any
  get() = object {
      /** NOA Fresh_4G */
      val FRESH_4G = "spec:width=720,height=1440,unit=px,dpi=320"

      /** NOA Hummer_2019_R */
      val HUMMER_2019_R = "spec:width=720,height=1440,unit=px,dpi=320"

      /** NOA N1 */
      val N1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** NOA NOA_N10 */
      val NOA_N10 = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** NOA NOA_N20 */
      val NOA_N20 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** NOA NOA_N7 */
      val NOA_N7 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** NOA NOA_N8 */
      val NOA_N8 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** NOA NOA_P1 */
      val NOA_P1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** NOA SPRINT4G */
      val SPRINT4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** NOA Vivo4G_r */
      val VIVO4G_R = "spec:width=640,height=1280,unit=px,dpi=320"

  }
