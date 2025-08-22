package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AXIOO device specifications for Android Compose previews.
 *
 * This extension provides AXIOO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AXIOO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AXIOO: Any
  get() = object {
      /** AXIOO PICOpad-7H */
      val PICOPAD_7H = "spec:width=800,height=1280,unit=px,dpi=240"

      /** AXIOO PICOpad_7H_JL */
      val PICOPAD_7H_JL = "spec:width=800,height=1280,unit=px,dpi=213"

  }
