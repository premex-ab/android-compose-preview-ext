package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EBOX device specifications for Android Compose previews.
 *
 * This extension provides EBOX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EBOX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EBOX: Any
  get() = object {
      /** EBOX sti6280d391 */
      val STI6280D391 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
