package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * COGECO device specifications for Android Compose previews.
 *
 * This extension provides COGECO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cogeco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cogeco: Any
  get() = object {
      /** COGECO uiw4020cog */
      val UIW4020COG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
