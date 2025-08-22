package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * F150 device specifications for Android Compose previews.
 *
 * This extension provides F150 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.F150.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.F150: Any
  get() = object {
      /** F150 Air1 */
      val AIR1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** F150 Air1_Pro */
      val AIR1_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** F150 B1 */
      val B1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** F150 B1_Pro */
      val B1_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** F150 B2021 */
      val B2021 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** F150 Bison2021 */
      val BISON2021 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** F150 H2022 */
      val H2022 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** F150 R2022 */
      val R2022 = "spec:width=1080,height=2460,unit=px,dpi=480"

  }
