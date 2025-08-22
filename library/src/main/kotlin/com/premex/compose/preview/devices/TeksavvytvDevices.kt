package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TekSavvyTV device specifications for Android Compose previews.
 *
 * This extension provides TekSavvyTV device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Teksavvytv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Teksavvytv: Any
  get() = object {
      /** TekSavvyTV DV8219 */
      val DV8219 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
