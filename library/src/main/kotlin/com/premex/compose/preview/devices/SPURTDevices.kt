package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SPURT device specifications for Android Compose previews.
 *
 * This extension provides SPURT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SPURT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SPURT: Any
  get() = object {
      /** SPURT K100 */
      val K100 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** SPURT K200 */
      val K200 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** SPURT SPURT_K300 */
      val SPURT_K300 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** SPURT SPURT_K400 */
      val SPURT_K400 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** SPURT SPURT_K500 */
      val SPURT_K500 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** SPURT SPURT_K600 */
      val SPURT_K600 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** SPURT SPURT_K700 */
      val SPURT_K700 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** SPURT Spurt_K800 */
      val SPURT_K800 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
