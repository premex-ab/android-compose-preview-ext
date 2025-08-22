package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PAITANRY device specifications for Android Compose previews.
 *
 * This extension provides PAITANRY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PAITANRY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PAITANRY: Any
  get() = object {
      /** PAITANRY R16 */
      val R16 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
