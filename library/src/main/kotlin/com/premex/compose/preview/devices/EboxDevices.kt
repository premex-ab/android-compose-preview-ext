package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ebox device specifications for Android Compose previews.
 *
 * This extension provides ebox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ebox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ebox: Any
  get() = object {
      /** ebox diw387eb */
      val DIW387EB = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
