package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * mobulaa device specifications for Android Compose previews.
 *
 * This extension provides mobulaa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mobulaa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mobulaa: Any
  get() = object {
      /** mobulaa K6 */
      val K6 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** mobulaa NOTE1 */
      val NOTE1 = "spec:width=720,height=1560,unit=px,dpi=320"

  }
