package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RuggON device specifications for Android Compose previews.
 *
 * This extension provides RuggON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ruggon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ruggon: Any
  get() = object {
      /** RuggON PA501BG */
      val PA501BG = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** RuggON PA501BWR */
      val PA501BWR = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
