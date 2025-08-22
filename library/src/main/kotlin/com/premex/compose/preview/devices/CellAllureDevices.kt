package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CellAllure device specifications for Android Compose previews.
 *
 * This extension provides CellAllure device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CellAllure.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CellAllure: Any
  get() = object {
      /** CellAllure BIENESTAR_SMART */
      val BIENESTAR_SMART = "spec:width=480,height=960,unit=px,dpi=240"

      /** CellAllure Fashion_C */
      val FASHION_C = "spec:width=480,height=960,unit=px,dpi=240"

      /** CellAllure Miracle_Y */
      val MIRACLE_Y = "spec:width=720,height=1520,unit=px,dpi=320"

  }
