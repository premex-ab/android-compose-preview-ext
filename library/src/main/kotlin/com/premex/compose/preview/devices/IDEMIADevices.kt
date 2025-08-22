package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IDEMIA device specifications for Android Compose previews.
 *
 * This extension provides IDEMIA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IDEMIA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IDEMIA: Any
  get() = object {
      /** IDEMIA ID_Screen */
      val ID_SCREEN = "spec:width=800,height=1280,unit=px,dpi=213"

  }
