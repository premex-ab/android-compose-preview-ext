package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HUION device specifications for Android Compose previews.
 *
 * This extension provides HUION device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Huion.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Huion: Any
  get() = object {
      /** HUION KT1101 */
      val KT1101 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** HUION KT1201 */
      val KT1201 = "spec:width=1600,height=2176,unit=px,dpi=320"

  }
