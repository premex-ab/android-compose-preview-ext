package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CUSTOM device specifications for Android Compose previews.
 *
 * This extension provides CUSTOM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Custom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Custom: Any
  get() = object {
      /** CUSTOM P_Ranger */
      val P_RANGER = "spec:width=720,height=1280,unit=px,dpi=320"

  }
