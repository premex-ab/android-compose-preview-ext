package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iPlus device specifications for Android Compose previews.
 *
 * This extension provides iPlus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IPlus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IPlus: Any
  get() = object {
      /** iPlus iPlus_P1 */
      val IPLUS_P1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** iPlus iPlus_P3 */
      val IPLUS_P3 = "spec:width=540,height=1200,unit=px,dpi=240"

  }
