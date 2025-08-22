package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CAVION device specifications for Android Compose previews.
 *
 * This extension provides CAVION device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CAVION.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CAVION: Any
  get() = object {
      /** CAVION M1092Q */
      val M1092Q = "spec:width=800,height=1280,unit=px,dpi=160"

  }
