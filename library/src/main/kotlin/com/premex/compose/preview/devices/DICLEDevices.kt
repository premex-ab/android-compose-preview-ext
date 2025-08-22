package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DICLE device specifications for Android Compose previews.
 *
 * This extension provides DICLE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DICLE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DICLE: Any
  get() = object {
      /** DICLE DICLE_IPLAY40_PRO */
      val DICLE_IPLAY40_PRO = "spec:width=1200,height=2000,unit=px,dpi=320"

  }
