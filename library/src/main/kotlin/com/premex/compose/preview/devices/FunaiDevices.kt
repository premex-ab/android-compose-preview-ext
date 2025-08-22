package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FUNAI device specifications for Android Compose previews.
 *
 * This extension provides FUNAI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Funai.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Funai: Any
  get() = object {
      /** FUNAI daitou */
      val DAITOU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** FUNAI FAS_K2150 */
      val FAS_K2150 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
