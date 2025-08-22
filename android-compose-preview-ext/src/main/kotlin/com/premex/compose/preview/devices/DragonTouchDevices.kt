package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Dragon-Touch device specifications for Android Compose previews.
 *
 * This extension provides Dragon-Touch device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DragonTouch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DragonTouch: Any
  get() = object {
      /** Dragon-Touch X10A */
      val X10A = "spec:width=768,height=1366,unit=px,dpi=160"

  }
