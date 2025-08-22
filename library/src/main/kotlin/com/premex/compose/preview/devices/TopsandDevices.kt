package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Topsand device specifications for Android Compose previews.
 *
 * This extension provides Topsand device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Topsand.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Topsand: Any
  get() = object {
      /** Topsand N10_T */
      val N10_T = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Topsand N8 */
      val N8 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
