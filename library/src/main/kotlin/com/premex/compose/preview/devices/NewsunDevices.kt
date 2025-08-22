package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NEWSUN device specifications for Android Compose previews.
 *
 * This extension provides NEWSUN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Newsun.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Newsun: Any
  get() = object {
      /** NEWSUN S20 */
      val S20 = "spec:width=600,height=1280,unit=px,dpi=240"

  }
