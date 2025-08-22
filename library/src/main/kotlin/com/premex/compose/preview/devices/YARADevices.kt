package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * YARA device specifications for Android Compose previews.
 *
 * This extension provides YARA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.YARA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.YARA: Any
  get() = object {
      /** YARA hongkong */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
