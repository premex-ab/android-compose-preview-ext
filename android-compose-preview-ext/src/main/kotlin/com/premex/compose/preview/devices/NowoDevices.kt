package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NOWO device specifications for Android Compose previews.
 *
 * This extension provides NOWO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nowo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nowo: Any
  get() = object {
      /** NOWO DV8535-KPN */
      val DV8535_KPN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** NOWO DV8935-KPN */
      val DV8935_KPN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
